import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset0.hasListener(eventListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultStatisticalCategoryDataset0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) (short) 0, (java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) (-1), (double) 1L, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0d);
        java.lang.Comparable comparable13 = null;
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '4', comparable13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) 10, comparable13, (java.lang.Comparable) '#');
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add(97.0d, (double) (short) 100, (java.lang.Comparable) '#', (java.lang.Comparable) Double.NaN);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((double) (-1L), 0.0d, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultStatisticalCategoryDataset0.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        defaultStatisticalCategoryDataset0.add((double) (byte) 1, (double) 1.0f, (java.lang.Comparable) 100L, (java.lang.Comparable) 0.0d);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultStatisticalCategoryDataset0.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 10);
        java.lang.Class<?> wildcardClass22 = defaultStatisticalCategoryDataset15.getClass();
        boolean boolean23 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultStatisticalCategoryDataset0.getValue((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(number29);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.validateObject();
        double double11 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Class<?> wildcardClass12 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass14 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) 10.0d, (java.lang.Comparable) 100.0d, (java.lang.Comparable) "");
        java.lang.Class<?> wildcardClass18 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.hasListener(eventListener8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int21 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) false);
        double double23 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultStatisticalCategoryDataset0.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list13 = defaultStatisticalCategoryDataset12.getRowKeys();
        defaultStatisticalCategoryDataset12.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int19 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number22 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener23);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number28 = defaultStatisticalCategoryDataset25.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int30 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int31 = defaultStatisticalCategoryDataset25.getColumnCount();
        java.lang.Comparable comparable33 = null;
        java.lang.Number number34 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) 1.0d, comparable33);
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset25.hasListener(eventListener35);
        defaultStatisticalCategoryDataset25.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup38);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup38);
        org.jfree.data.Range range42 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(number34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(datasetGroup38);
        org.junit.Assert.assertNull(range42);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '4', (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        double double20 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int22 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(datasetGroup23);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number17 = null;
        defaultStatisticalCategoryDataset0.add(number17, (java.lang.Number) 100.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) Double.NaN);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = null; // flaky: defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) -1, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((int) (short) -1, (int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        java.lang.Comparable comparable21 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0f, (java.lang.Number) 1L, (java.lang.Comparable) (byte) 10, comparable21);
        java.util.List list23 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Class<?> wildcardClass20 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultStatisticalCategoryDataset5.hasListener(eventListener6);
        defaultStatisticalCategoryDataset5.validateObject();
        java.util.List list9 = defaultStatisticalCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset5.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset5.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener14);
        java.lang.Class<?> wildcardClass16 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int18 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset6.getRowCount();
        double double15 = defaultStatisticalCategoryDataset6.getRangeUpperBound(true);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset6.hasListener(eventListener16);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset6.hasListener(eventListener18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup17);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        defaultStatisticalCategoryDataset0.add((double) (byte) 1, (double) 1.0f, (java.lang.Comparable) 100L, (java.lang.Comparable) 0.0d);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int5 = defaultStatisticalCategoryDataset4.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset4.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset4.getColumnKeys();
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        int int11 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset4.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultStatisticalCategoryDataset4.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = null; // flaky: defaultStatisticalCategoryDataset0.getStdDevValue((-1), (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1L, (java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener17);
        java.lang.Class<?> wildcardClass19 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (byte) 100, (double) 100.0f, (java.lang.Comparable) "hi!", (java.lang.Comparable) '#');
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset0.hasListener(eventListener11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list10 = defaultStatisticalCategoryDataset9.getRowKeys();
        defaultStatisticalCategoryDataset9.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number18 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset9.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10L, (java.lang.Number) 0.0d, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = range10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(range10);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int17 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        int int20 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) false);
        double double22 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        defaultStatisticalCategoryDataset9.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset9.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset9.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset9.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset9.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultStatisticalCategoryDataset0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(datasetGroup22);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        java.util.List list6 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset7.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset0.hasListener(eventListener7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) '4');
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        java.util.List list6 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset7.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup11);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup11);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(range8);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset12.getRowCount();
        java.lang.Number number28 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 1L, (java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = defaultStatisticalCategoryDataset12.getStdDevValue(100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(number28);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double21 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultStatisticalCategoryDataset0.getMeanValue((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultStatisticalCategoryDataset0.getStdDevValue(10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(number20);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Class<?> wildcardClass6 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Comparable comparable17 = null;
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex(comparable17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        java.lang.Number number14 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset6.removeChangeListener(datasetChangeListener17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals(obj9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int2 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.lang.Number number9 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset3.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) '#');
        int int14 = defaultStatisticalCategoryDataset3.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener13);
        int int15 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.util.List list16 = defaultStatisticalCategoryDataset12.getColumnKeys();
        java.lang.Number number19 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int21 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 10.0d);
        defaultStatisticalCategoryDataset12.add((double) (short) -1, (double) 10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 'a');
        java.lang.Object obj27 = defaultStatisticalCategoryDataset12.clone();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals(obj27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue(4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener18);
        java.lang.Class<?> wildcardClass20 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset0.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((int) (short) -1, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.lang.Comparable comparable11 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, comparable11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.lang.Object obj23 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 100L);
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(number26);
        org.junit.Assert.assertNull(number29);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (byte) 100, (double) 100.0f, (java.lang.Comparable) "hi!", (java.lang.Comparable) '#');
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        double double9 = defaultStatisticalCategoryDataset6.getRangeUpperBound(false);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset6.hasListener(eventListener10);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset6.hasListener(eventListener12);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) eventListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset0.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int11 = defaultStatisticalCategoryDataset10.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset10.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int15 = defaultStatisticalCategoryDataset10.getColumnCount();
        defaultStatisticalCategoryDataset10.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number23 = defaultStatisticalCategoryDataset10.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int25 = defaultStatisticalCategoryDataset10.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset10.getGroup();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup26);
        java.lang.Class<?> wildcardClass28 = datasetGroup26.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 100.0d + "'", number23, 100.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int15 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int17 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset14.getGroup();
        java.util.List list19 = defaultStatisticalCategoryDataset14.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset14.getRowCount();
        java.lang.Object obj21 = defaultStatisticalCategoryDataset14.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener22);
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultStatisticalCategoryDataset0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        java.lang.Comparable comparable19 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue(comparable19, (java.lang.Comparable) 1);
        int int23 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double25 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue(4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        double double28 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Number number31 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNull(number31);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.validateObject();
        double double11 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        java.lang.Class<?> wildcardClass18 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) -1);
        defaultStatisticalCategoryDataset0.validateObject();
        int int23 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) true, (java.lang.Comparable) 10L);
        defaultStatisticalCategoryDataset0.add(Double.NaN, 97.0d, (java.lang.Comparable) 1, (java.lang.Comparable) (-1.0f));
        java.lang.Number number16 = null;
        defaultStatisticalCategoryDataset0.add(number16, (java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        defaultStatisticalCategoryDataset7.validateObject();
        java.util.List list11 = defaultStatisticalCategoryDataset7.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset7.getGroup();
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset7.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        int int12 = defaultStatisticalCategoryDataset6.getRowIndex((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultStatisticalCategoryDataset0.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number10 = defaultStatisticalCategoryDataset7.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int12 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int13 = defaultStatisticalCategoryDataset7.getColumnCount();
        defaultStatisticalCategoryDataset7.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        java.lang.Number number24 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset19.validateObject();
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset19.getRangeBounds(true);
        int int28 = defaultStatisticalCategoryDataset19.getColumnCount();
        java.lang.Number number31 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int33 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list34 = defaultStatisticalCategoryDataset19.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset7.setGroup(datasetGroup35);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNull(range27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(number31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(datasetGroup35);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup26);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 1, (java.lang.Number) 97.0d, (java.lang.Comparable) Double.NaN, (java.lang.Comparable) (short) 10);
        double double34 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultStatisticalCategoryDataset0.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.util.List list15 = defaultStatisticalCategoryDataset11.getColumnKeys();
        java.lang.Number number18 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int20 = defaultStatisticalCategoryDataset11.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list21 = defaultStatisticalCategoryDataset11.getColumnKeys();
        boolean boolean22 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener9);
        defaultStatisticalCategoryDataset0.add(97.0d, (double) 100, (java.lang.Comparable) "hi!", (java.lang.Comparable) 100L);
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add(Double.NaN, (double) 'a', (java.lang.Comparable) (short) 10, (java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Comparable comparable11 = null;
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex(comparable11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultStatisticalCategoryDataset0.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) "");
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = null; // flaky: defaultStatisticalCategoryDataset0.getValue((int) (short) -1, (int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable20 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, comparable20);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset0.getGroup();
        int int29 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) "");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset6.getRowCount();
        double double15 = defaultStatisticalCategoryDataset6.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset6.getValue(10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number27 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 100);
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset12.hasListener(eventListener28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(number27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass19 = datasetGroup18.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 100);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(number20);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 100, (java.lang.Number) Double.NaN, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 97.0d);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) -1, (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) true, (java.lang.Comparable) 10L);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 4, (java.lang.Number) (short) 100, (java.lang.Comparable) 1.0f, (java.lang.Comparable) 97.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset6.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset6.getMeanValue((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset0.getRowCount();
        int int22 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        int int23 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list24 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultStatisticalCategoryDataset0.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        defaultStatisticalCategoryDataset0.add(0.0d, 0.0d, (java.lang.Comparable) 10.0f, (java.lang.Comparable) Double.NaN);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener17);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 0, (java.lang.Number) 2, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        int int23 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, 100.0d, (java.lang.Comparable) (short) 10, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = defaultStatisticalCategoryDataset0.getStdDevValue((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable20 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, comparable20);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 100, (java.lang.Comparable) 100, (java.lang.Comparable) (-1L));
        java.lang.Class<?> wildcardClass32 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1L));
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0d, (java.lang.Number) (-1), (java.lang.Comparable) 97.0d, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNull(number19);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) ' ', (java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue(3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        defaultStatisticalCategoryDataset0.add((double) '#', (double) 0L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultStatisticalCategoryDataset0.getStdDevValue(3, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) true);
        double double19 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        java.lang.Number number17 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10.0d, number17, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        java.lang.Number number17 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0.0f);
        int int19 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (-1.0f), (double) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) '4');
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Comparable comparable11 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) -1, comparable11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals(obj9);
        org.jfree.data.Range range12 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((int) '4', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(range12);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultStatisticalCategoryDataset5.hasListener(eventListener6);
        defaultStatisticalCategoryDataset5.validateObject();
        java.util.List list9 = defaultStatisticalCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset5.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset5.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener14);
        int int16 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) -1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10.0f, (java.lang.Number) (byte) 1, (java.lang.Comparable) ' ', (java.lang.Comparable) "hi!");
        org.jfree.data.Range range28 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        double double30 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        int int23 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, 100.0d, (java.lang.Comparable) (short) 10, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = defaultStatisticalCategoryDataset0.getValue((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (short) 0);
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = number16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100.0d + "'", number13, 100.0d);
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        int int12 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset6.removeChangeListener(datasetChangeListener13);
        boolean boolean15 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue(0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue(4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) -1, (java.lang.Number) 100L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset0.hasListener(eventListener23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultStatisticalCategoryDataset0.getMeanValue((int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable20 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, comparable20);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset0.getGroup();
        int int29 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number32 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = defaultStatisticalCategoryDataset0.getValue((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(number32);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) -1, (java.lang.Number) 97.0d, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset0.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) 10.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener24);
        java.util.List list26 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset0.hasListener(eventListener27);
        java.lang.Number number31 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0, (java.lang.Comparable) 'a');
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(number31);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable15 = null;
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1, comparable15);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) -1, (java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) '#');
        java.lang.Number number24 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 2);
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNull(number24);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultStatisticalCategoryDataset0.getMeanValue(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertNull(number22);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultStatisticalCategoryDataset0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((double) (-1L), 0.0d, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 'a');
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.add((double) (-1L), 0.0d, (java.lang.Comparable) 3, (java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 1L);
        int int21 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int23 = defaultStatisticalCategoryDataset17.getRowCount();
        double double25 = defaultStatisticalCategoryDataset17.getRangeUpperBound(true);
        java.lang.Object obj26 = defaultStatisticalCategoryDataset17.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener27);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset17);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj4 = defaultStatisticalCategoryDataset0.clone();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) true);
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int19 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 100);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable20 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, comparable20);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) ' ', (java.lang.Comparable) 3, (java.lang.Comparable) 0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset0.hasListener(eventListener23);
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset0.hasListener(eventListener25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) ' ', (java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 100);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        java.lang.Class<?> wildcardClass19 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultStatisticalCategoryDataset0.getStdDevValue(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        int int20 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset0.hasListener(eventListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number number11 = defaultStatisticalCategoryDataset3.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 10L);
        defaultStatisticalCategoryDataset3.add((java.lang.Number) (byte) 100, (java.lang.Number) 97.0d, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.lang.Number number9 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset3.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list12 = defaultStatisticalCategoryDataset11.getRowKeys();
        defaultStatisticalCategoryDataset11.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int18 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset11.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset11.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset11.hasListener(eventListener27);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset3.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(datasetGroup29);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue(4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener14);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 97.0d, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        java.lang.Class<?> wildcardClass16 = defaultStatisticalCategoryDataset6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getColumnKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        double double9 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        org.jfree.data.Range range19 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list6 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        int int19 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        int int21 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 2);
        java.util.List list22 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) 10.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener24);
        defaultStatisticalCategoryDataset0.add((double) (short) 1, (double) 1, (java.lang.Comparable) "", (java.lang.Comparable) 100L);
        java.lang.Class<?> wildcardClass31 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.validateObject();
        double double11 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((-1), (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double22 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener23);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.add((double) '4', (double) 1L, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultStatisticalCategoryDataset0.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list19 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset6.getGroup();
        java.util.List list17 = defaultStatisticalCategoryDataset6.getRowKeys();
        org.jfree.data.Range range19 = defaultStatisticalCategoryDataset6.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(range19);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(range10);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) '4', (java.lang.Comparable) 1L, (java.lang.Comparable) (-1.0d));
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultStatisticalCategoryDataset0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        double double13 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double21 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int22 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1L, (java.lang.Number) Double.NaN, (java.lang.Comparable) 2, (java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultStatisticalCategoryDataset0.getMeanValue(3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Class<?> wildcardClass12 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        int int12 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((double) 100, 10.0d, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 1.0f);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 10.0d + "'", number13, 10.0d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) "");
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = range5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(range5);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener9);
        int int12 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number27 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 100);
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset12.hasListener(eventListener28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultStatisticalCategoryDataset12.getMeanValue((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(number27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) true);
        int int12 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        defaultStatisticalCategoryDataset0.add((double) (short) 0, (double) (short) 100, (java.lang.Comparable) '#', (java.lang.Comparable) 10);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        double double11 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultStatisticalCategoryDataset0.getStdDevValue(10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        double double20 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100.0d + "'", number13, 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.lang.Number number9 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset3.hasListener(eventListener10);
        int int12 = defaultStatisticalCategoryDataset3.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = null; // flaky: defaultStatisticalCategoryDataset3.getColumnKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.hasListener(eventListener9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.add(1.0d, (double) 10.0f, (java.lang.Comparable) 2, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 0.0d);
        org.jfree.data.Range range12 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(range12);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.util.List list15 = defaultStatisticalCategoryDataset11.getColumnKeys();
        java.lang.Number number18 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int20 = defaultStatisticalCategoryDataset11.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list21 = defaultStatisticalCategoryDataset11.getColumnKeys();
        boolean boolean22 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        int int23 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list10 = defaultStatisticalCategoryDataset9.getRowKeys();
        defaultStatisticalCategoryDataset9.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number18 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset9.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable20 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, comparable20);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1, (java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNull(number29);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset6.getRowCount();
        double double15 = defaultStatisticalCategoryDataset6.getRangeUpperBound(true);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset6.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.lang.Class<?> wildcardClass9 = defaultStatisticalCategoryDataset6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj4 = defaultStatisticalCategoryDataset0.clone();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset6.getGroup();
        java.util.List list17 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int18 = defaultStatisticalCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset6.removeChangeListener(datasetChangeListener19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (byte) 100, (double) 100.0f, (java.lang.Comparable) "hi!", (java.lang.Comparable) '#');
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.lang.Comparable comparable14 = null;
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1.0d, comparable14);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int17 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int19 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset16.getGroup();
        java.util.List list21 = defaultStatisticalCategoryDataset16.getColumnKeys();
        int int22 = defaultStatisticalCategoryDataset16.getRowCount();
        defaultStatisticalCategoryDataset16.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Number number30 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 1);
        int int31 = defaultStatisticalCategoryDataset16.getColumnCount();
        boolean boolean32 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(number30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0L, (java.lang.Number) (short) 1, (java.lang.Comparable) 10L, (java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable13 = null;
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0.0d, comparable13);
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) (-1.0f), (java.lang.Comparable) (-1.0f), (java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        int int19 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        java.lang.Comparable comparable22 = null;
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 10L, comparable22, (java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultStatisticalCategoryDataset0.getStdDevValue(3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 100, (java.lang.Number) Double.NaN, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 97.0d);
        java.lang.Comparable comparable15 = defaultStatisticalCategoryDataset0.getRowKey(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup26);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 1, (java.lang.Number) 97.0d, (java.lang.Comparable) Double.NaN, (java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = defaultStatisticalCategoryDataset0.getMeanValue((int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(datasetGroup26);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Comparable comparable13 = null;
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex(comparable13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list16 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 3);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) "hi!");
        java.lang.Object obj23 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 100);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(datasetGroup10);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals(obj9);
        org.jfree.data.Range range12 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        int int14 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset8.hasListener(eventListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener17);
        boolean boolean19 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultStatisticalCategoryDataset0.getMeanValue((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertNull(range21);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (byte) 100, (double) 100.0f, (java.lang.Comparable) "hi!", (java.lang.Comparable) '#');
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener14);
        java.lang.Class<?> wildcardClass16 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) 100);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) (short) -1);
        int int26 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 100);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.add((double) (-1.0f), (double) (byte) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number8);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int18 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset0.hasListener(eventListener19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        double double25 = defaultStatisticalCategoryDataset12.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, (java.lang.Number) (-1L), (java.lang.Comparable) '#', (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Class<?> wildcardClass16 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) -1, (java.lang.Number) 10L, (java.lang.Comparable) 'a', (java.lang.Comparable) 'a');
        double double19 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Comparable comparable12 = null;
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) true, comparable12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1, (java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(number23);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset0.getColumnKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset0.getRowCount();
        int int22 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        int int23 = defaultStatisticalCategoryDataset0.getRowCount();
        int int24 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range26 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(range26);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        java.util.List list27 = defaultStatisticalCategoryDataset13.getColumnKeys();
        java.lang.Object obj28 = defaultStatisticalCategoryDataset13.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset0.hasListener(eventListener15);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset3.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset3.getGroup();
        java.lang.Number number13 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double22 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Class<?> wildcardClass23 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable10 = null;
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '4', comparable10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 97.0d, (java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        double double17 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset0.hasListener(eventListener18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable23 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 2, (java.lang.Number) (-1L), comparable23, (java.lang.Comparable) (short) 0);
        java.lang.Object obj26 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(datasetGroup20);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable13 = null;
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, comparable13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getStdDevValue(2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int15 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int17 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset14.getGroup();
        java.util.List list19 = defaultStatisticalCategoryDataset14.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset14.getRowCount();
        java.lang.Object obj21 = defaultStatisticalCategoryDataset14.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener22);
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset14.hasListener(eventListener25);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0d), (java.lang.Number) (short) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 100);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        double double21 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int22 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset0.getRowCount();
        int int21 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset0.hasListener(eventListener22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset0.getGroup();
        double double25 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertNotNull(datasetGroup23);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable20 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, comparable20);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset0.getGroup();
        int int29 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number32 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        java.lang.Number number35 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (byte) 100);
        java.lang.Number number38 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 100.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(number32);
        org.junit.Assert.assertNull(number35);
        org.junit.Assert.assertNull(number38);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((int) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        defaultStatisticalCategoryDataset12.validateObject();
        org.jfree.data.Range range26 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        defaultStatisticalCategoryDataset12.add((java.lang.Number) (short) 10, (java.lang.Number) 10, (java.lang.Comparable) (-1), (java.lang.Comparable) (-1.0d));
        int int33 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(range26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double16 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int22 = defaultStatisticalCategoryDataset17.getColumnCount();
        defaultStatisticalCategoryDataset17.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.util.List list28 = defaultStatisticalCategoryDataset17.getRowKeys();
        java.lang.Number number31 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) '#', (java.lang.Comparable) true);
        java.util.List list32 = defaultStatisticalCategoryDataset17.getColumnKeys();
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list32);
        int int35 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(number31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.equals(obj8);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getColumnKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.lang.Object obj8 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list10 = defaultStatisticalCategoryDataset9.getRowKeys();
        double double12 = defaultStatisticalCategoryDataset9.getRangeUpperBound(false);
        double double14 = defaultStatisticalCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset9.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset9.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup17);
        java.lang.Class<?> wildcardClass19 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(datasetGroup17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0d);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, (java.lang.Comparable) '4', (java.lang.Comparable) '#');
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) -1, (java.lang.Number) (short) 100, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener18);
        java.lang.Class<?> wildcardClass20 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Class<?> wildcardClass5 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) (-1), (double) 1L, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 4, (java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset0.hasListener(eventListener13);
        java.lang.Class<?> wildcardClass15 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) 1.0f, (double) ' ', (java.lang.Comparable) false, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) 1.0f, (double) '#', (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int10);
        defaultStatisticalCategoryDataset0.add((double) 'a', (double) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 1);
        int int21 = defaultStatisticalCategoryDataset0.getRowCount();
        int int22 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) true, (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset0.hasListener(eventListener18);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset3.hasListener(eventListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultStatisticalCategoryDataset3.getColumnKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.lang.Number number9 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset3.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultStatisticalCategoryDataset3.getMeanValue((int) (short) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(datasetGroup10);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.util.List list20 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) 10, comparable13, (java.lang.Comparable) '#');
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultStatisticalCategoryDataset0.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Comparable comparable11 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) 10.0f, (java.lang.Comparable) 10L, comparable11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener14);
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(range17);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset6.getRowKeys();
        defaultStatisticalCategoryDataset6.add((java.lang.Number) (byte) -1, (java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = number13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj8 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Class<?> wildcardClass15 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        java.lang.Class<?> wildcardClass15 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals(obj9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int15 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Class<?> wildcardClass11 = list10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        java.lang.Class<?> wildcardClass18 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        java.lang.Comparable comparable19 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue(comparable19, (java.lang.Comparable) 1);
        java.lang.Object obj22 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener23);
        java.lang.Class<?> wildcardClass25 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultStatisticalCategoryDataset0.hasListener(eventListener5);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10, (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset6.add((double) 0L, 0.0d, (java.lang.Comparable) 1, (java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(datasetGroup16);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        double double20 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int23 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        double double25 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener9);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Comparable comparable12 = null;
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) true, comparable12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        java.util.List list6 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "", (java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1L, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        int int18 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup8);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list20 = defaultStatisticalCategoryDataset19.getRowKeys();
        defaultStatisticalCategoryDataset19.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int26 = defaultStatisticalCategoryDataset19.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset19.getGroup();
        int int29 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset19.validateObject();
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, comparable8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.util.List list15 = defaultStatisticalCategoryDataset11.getColumnKeys();
        java.lang.Number number18 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int20 = defaultStatisticalCategoryDataset11.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list21 = defaultStatisticalCategoryDataset11.getColumnKeys();
        boolean boolean22 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultStatisticalCategoryDataset11.getStdDevValue((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10.0f);
        defaultStatisticalCategoryDataset0.add((double) (-1), (double) (byte) 0, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getColumnKey(0);
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) -1 + "'", comparable12, (short) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup15);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        double double17 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Class<?> wildcardClass7 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        double double9 = defaultStatisticalCategoryDataset6.getRangeUpperBound(false);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset6.hasListener(eventListener10);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset6.hasListener(eventListener12);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) eventListener12);
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultStatisticalCategoryDataset0.hasListener(eventListener5);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) -1, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) Double.NaN, (java.lang.Comparable) 100L, (java.lang.Comparable) 1L);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj16 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultStatisticalCategoryDataset8.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset0.hasListener(eventListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100.0d + "'", number13, 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1L, (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 100);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        java.lang.Number number14 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0.0d);
        java.lang.Object obj15 = defaultStatisticalCategoryDataset6.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Comparable comparable14 = null;
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 2, comparable14);
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double9 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list12 = defaultStatisticalCategoryDataset11.getRowKeys();
        defaultStatisticalCategoryDataset11.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int18 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset11.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset11.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset11.hasListener(eventListener27);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(datasetGroup29);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue(4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 1);
        int int15 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (byte) 10);
        double double22 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Comparable comparable8 = null;
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue(comparable8, (java.lang.Comparable) true);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.Range range4 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        double double6 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(range4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getRowKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue(100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) (-1), (double) 1L, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 100, (java.lang.Number) Double.NaN, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 97.0d);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double16 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((int) (short) 0, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) true, (java.lang.Comparable) 10L);
        defaultStatisticalCategoryDataset0.add(Double.NaN, 97.0d, (java.lang.Comparable) 1, (java.lang.Comparable) (-1.0f));
        java.lang.Number number16 = null;
        defaultStatisticalCategoryDataset0.add(number16, (java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultStatisticalCategoryDataset0.getValue((int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj4 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue(3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue(2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        defaultStatisticalCategoryDataset0.validateObject();
        int int17 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultStatisticalCategoryDataset0.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        java.lang.Class<?> wildcardClass4 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        int int21 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 100);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 10);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset6.getGroup();
        java.util.List list17 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int18 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int19 = defaultStatisticalCategoryDataset6.getRowCount();
        java.lang.Class<?> wildcardClass20 = defaultStatisticalCategoryDataset6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100L, (java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((int) (byte) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals(obj9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(datasetGroup15);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultStatisticalCategoryDataset0.getMeanValue(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        java.lang.Number number14 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0.0d);
        defaultStatisticalCategoryDataset6.validateObject();
        java.lang.Class<?> wildcardClass16 = defaultStatisticalCategoryDataset6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Class<?> wildcardClass19 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultStatisticalCategoryDataset0.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultStatisticalCategoryDataset0.hasListener(eventListener5);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Comparable comparable8 = null;
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex(comparable8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = null; // flaky: defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) -1, 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 1);
        int int15 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 2, (java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) '#');
        double double18 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Number number19 = null;
        defaultStatisticalCategoryDataset0.add(number19, (java.lang.Number) 100.0f, (java.lang.Comparable) (short) 1, (java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset6.getRowKeys();
        double double11 = defaultStatisticalCategoryDataset6.getRangeLowerBound(true);
        java.lang.Number number14 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset6.removeChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable15 = null;
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1, comparable15);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) -1, (java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) '#');
        java.util.List list22 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int23 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getRowKey(0);
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 2, (java.lang.Comparable) (byte) 1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10L, (java.lang.Number) (short) 10, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + '4' + "'", comparable12, '4');
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset3.hasListener(eventListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultStatisticalCategoryDataset3.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((int) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultStatisticalCategoryDataset0.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(range5);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable10 = null;
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '4', comparable10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add(100.0d, 97.0d, (java.lang.Comparable) false, (java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultStatisticalCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable20 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, comparable20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultStatisticalCategoryDataset0.getMeanValue((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(number21);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        defaultStatisticalCategoryDataset0.add((double) '#', (double) 0L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        java.util.List list18 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.Range range11 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.Range range11 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Object obj12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.equals(obj12);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset0.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Comparable comparable13 = null;
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex(comparable13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((int) (short) -1, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list8 = defaultStatisticalCategoryDataset7.getRowKeys();
        defaultStatisticalCategoryDataset7.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int14 = defaultStatisticalCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset7.getGroup();
        int int16 = defaultStatisticalCategoryDataset7.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int22 = defaultStatisticalCategoryDataset17.getColumnCount();
        defaultStatisticalCategoryDataset17.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number30 = defaultStatisticalCategoryDataset17.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int32 = defaultStatisticalCategoryDataset17.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset17.getGroup();
        boolean boolean34 = defaultStatisticalCategoryDataset7.equals((java.lang.Object) datasetGroup33);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 100.0d + "'", number30, 100.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        int int23 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, 100.0d, (java.lang.Comparable) (short) 10, (java.lang.Comparable) "hi!");
        java.lang.Number number31 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNull(number31);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) '#', (java.lang.Comparable) true);
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Class<?> wildcardClass10 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 0.0d);
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        java.lang.Number number17 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10.0d, number17, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int22 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        java.lang.Object obj23 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener24);
        int int27 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 1.0f);
        int int28 = defaultStatisticalCategoryDataset12.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int19 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj20 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultStatisticalCategoryDataset0.getValue((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNull(number20);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        double double28 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int30 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (-1.0f), (double) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue((int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (short) 0);
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (-1L));
        java.lang.Class<?> wildcardClass17 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100.0d + "'", number13, 100.0d);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) 10.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultStatisticalCategoryDataset0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 0.0d);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj2 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range4 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(range4);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100.0d);
        int int18 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        java.lang.Number number18 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int19 = defaultStatisticalCategoryDataset13.getRowCount();
        double double21 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        boolean boolean23 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) (short) 10);
        double double25 = defaultStatisticalCategoryDataset13.getRangeLowerBound(false);
        java.lang.Number number28 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.util.List list29 = defaultStatisticalCategoryDataset13.getRowKeys();
        double double31 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = defaultStatisticalCategoryDataset13.getMeanValue((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0L, (java.lang.Number) 2, (java.lang.Comparable) 0, (java.lang.Comparable) 0.0d);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list27 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0L, (java.lang.Number) (short) 1, (java.lang.Comparable) 10L, (java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable13 = null;
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0.0d, comparable13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        int int23 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0d, (java.lang.Number) 100.0f, (java.lang.Comparable) '4', (java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = null; // flaky: defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) -1, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener9);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener2 = null;
        boolean boolean3 = defaultStatisticalCategoryDataset0.hasListener(eventListener2);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultStatisticalCategoryDataset0.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener9);
        int int12 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass11 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int18 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list19 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        int int10 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) 'a');
        defaultStatisticalCategoryDataset4.add((java.lang.Number) 1L, (java.lang.Number) (-1L), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 10.0f);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset4.hasListener(eventListener16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list25 = defaultStatisticalCategoryDataset24.getRowKeys();
        boolean boolean26 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        int int27 = defaultStatisticalCategoryDataset24.getColumnCount();
        boolean boolean28 = defaultStatisticalCategoryDataset4.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 97.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int19 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Comparable comparable20 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue(comparable20, (java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(number22);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        double double28 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        org.jfree.data.Range range30 = defaultStatisticalCategoryDataset13.getRangeBounds(false);
        int int31 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Number number34 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNull(range30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(number34);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0d), (java.lang.Number) (short) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0d, (java.lang.Number) Double.NaN, (java.lang.Comparable) 1, (java.lang.Comparable) (byte) 1);
        double double24 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (-1.0f));
        java.lang.Class<?> wildcardClass8 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        defaultStatisticalCategoryDataset0.add((double) ' ', (double) 100L, (java.lang.Comparable) 1L, (java.lang.Comparable) 'a');
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        java.util.List list15 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getStdDevValue((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(datasetGroup16);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultStatisticalCategoryDataset8.getMeanValue(3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        double double20 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int22 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 4);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset12.validateObject();
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        int int21 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number24 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int26 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list27 = defaultStatisticalCategoryDataset12.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        double double31 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Object obj32 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNull(range20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(datasetGroup28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        int int28 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100);
        java.lang.Object obj29 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (byte) 100, (double) 100.0f, (java.lang.Comparable) "hi!", (java.lang.Comparable) '#');
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) '#');
        java.lang.Class<?> wildcardClass20 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1, (java.lang.Comparable) '#');
        int int21 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list22 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener19);
        defaultStatisticalCategoryDataset13.add(0.0d, (double) (byte) 0, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0d);
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 0.0d);
        java.lang.Comparable comparable28 = defaultStatisticalCategoryDataset0.getRowKey(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (short) -1 + "'", comparable28, (short) -1);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) Double.NaN, (java.lang.Comparable) 100L, (java.lang.Comparable) 1L);
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset0.equals(obj15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) 100);
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultStatisticalCategoryDataset0.getStdDevValue((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        int int15 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1));
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) '#');
        java.lang.Object obj22 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int5 = defaultStatisticalCategoryDataset4.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset4.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset4.getColumnKeys();
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        int int11 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset4.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultStatisticalCategoryDataset6.getValue((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        int int12 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset6.removeChangeListener(datasetChangeListener13);
        boolean boolean15 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        double double17 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0f), (java.lang.Number) (short) 0, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1.0f);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset18.getRangeBounds(true);
        java.util.List list22 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean23 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset18.removeChangeListener(datasetChangeListener24);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(range21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) (short) 0, (java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(datasetGroup11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.lang.Number number9 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset3.hasListener(eventListener10);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset3.hasListener(eventListener12);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset3.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset6.getRowCount();
        double double15 = defaultStatisticalCategoryDataset6.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset6.getValue(4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 1);
        int int15 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(datasetGroup16);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (byte) 100, (double) 100.0f, (java.lang.Comparable) "hi!", (java.lang.Comparable) '#');
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range12 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener13);
        defaultStatisticalCategoryDataset6.add((java.lang.Number) 100.0f, (java.lang.Number) 1.0d, (java.lang.Comparable) '#', (java.lang.Comparable) (short) 0);
        java.util.List list20 = defaultStatisticalCategoryDataset6.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset0.getColumnKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) '#');
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }
}
