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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset0.getGroup();
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list9 = defaultStatisticalCategoryDataset8.getRowKeys();
        double double11 = defaultStatisticalCategoryDataset8.getRangeUpperBound(false);
        double double13 = defaultStatisticalCategoryDataset8.getRangeUpperBound(true);
        int int14 = defaultStatisticalCategoryDataset8.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset8.getGroup();
        boolean boolean16 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup15);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100, (java.lang.Number) 100, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        int int22 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset19.getGroup();
        java.util.List list24 = defaultStatisticalCategoryDataset19.getColumnKeys();
        int int25 = defaultStatisticalCategoryDataset19.getRowCount();
        defaultStatisticalCategoryDataset19.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Number number33 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 1);
        java.util.List list34 = defaultStatisticalCategoryDataset19.getRowKeys();
        boolean boolean35 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(number33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int2 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double4 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list5 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(datasetGroup17);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        int int7 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1, (java.lang.Number) (-1L), (java.lang.Comparable) (short) 1, (java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener21);
        org.jfree.data.Range range24 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultStatisticalCategoryDataset0.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.lang.Number number9 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        defaultStatisticalCategoryDataset3.add((java.lang.Number) Double.NaN, (java.lang.Number) 3, (java.lang.Comparable) (-1), (java.lang.Comparable) (byte) -1);
        defaultStatisticalCategoryDataset3.validateObject();
        int int17 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.lang.Comparable comparable11 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, comparable11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset0.getRowKey(0);
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (-1L) + "'", comparable16, (-1L));
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        defaultStatisticalCategoryDataset0.validateObject();
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj20 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        int int31 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        java.lang.Comparable comparable33 = defaultStatisticalCategoryDataset0.getColumnKey((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + 100.0f + "'", comparable33, 100.0f);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) true);
        int int19 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(datasetGroup11);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        java.util.List list9 = defaultStatisticalCategoryDataset3.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset0.hasListener(eventListener13);
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list29 = defaultStatisticalCategoryDataset28.getRowKeys();
        boolean boolean30 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset28);
        java.util.List list31 = defaultStatisticalCategoryDataset22.getRowKeys();
        int int32 = defaultStatisticalCategoryDataset22.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener33);
        defaultStatisticalCategoryDataset22.add((double) '#', (double) 0L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset40 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener41 = null;
        defaultStatisticalCategoryDataset40.addChangeListener(datasetChangeListener41);
        int int43 = defaultStatisticalCategoryDataset40.getColumnCount();
        int int44 = defaultStatisticalCategoryDataset40.getColumnCount();
        java.util.List list45 = defaultStatisticalCategoryDataset40.getColumnKeys();
        org.jfree.data.Range range47 = defaultStatisticalCategoryDataset40.getRangeBounds(false);
        defaultStatisticalCategoryDataset40.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, (java.lang.Comparable) '4', (java.lang.Comparable) '#');
        double double54 = defaultStatisticalCategoryDataset40.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup55 = defaultStatisticalCategoryDataset40.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup55);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup55);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset58 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener59 = null;
        boolean boolean60 = defaultStatisticalCategoryDataset58.hasListener(eventListener59);
        java.lang.Number number63 = defaultStatisticalCategoryDataset58.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int64 = defaultStatisticalCategoryDataset58.getRowCount();
        double double66 = defaultStatisticalCategoryDataset58.getRangeUpperBound(true);
        boolean boolean68 = defaultStatisticalCategoryDataset58.equals((java.lang.Object) (short) 10);
        double double70 = defaultStatisticalCategoryDataset58.getRangeLowerBound(false);
        java.lang.Number number73 = defaultStatisticalCategoryDataset58.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number76 = defaultStatisticalCategoryDataset58.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list77 = defaultStatisticalCategoryDataset58.getColumnKeys();
        int int78 = defaultStatisticalCategoryDataset58.getColumnCount();
        defaultStatisticalCategoryDataset58.add((double) '4', (double) 0L, (java.lang.Comparable) false, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset58.add((java.lang.Number) 100L, (java.lang.Number) (short) 10, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        boolean boolean89 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(number27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNull(range47);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(datasetGroup55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(number63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertNull(number73);
        org.junit.Assert.assertNull(number76);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        java.util.List list12 = defaultStatisticalCategoryDataset9.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.util.List list17 = defaultStatisticalCategoryDataset13.getColumnKeys();
        java.lang.Number number20 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int22 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean23 = defaultStatisticalCategoryDataset9.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        defaultStatisticalCategoryDataset13.validateObject();
        java.lang.Class<?> wildcardClass25 = defaultStatisticalCategoryDataset13.getClass();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 100, (java.lang.Number) (byte) 10, (java.lang.Comparable) 0, (java.lang.Comparable) (-1L));
        int int21 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 10);
        java.lang.Number number24 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) "");
        java.lang.Number number27 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) '4');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNull(number27);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (-1.0f), (double) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.add((double) 2, (double) 10.0f, (java.lang.Comparable) 10, (java.lang.Comparable) 10.0d);
        int int18 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double20 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        defaultStatisticalCategoryDataset0.add(0.0d, 0.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultStatisticalCategoryDataset0.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
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
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        java.lang.Comparable comparable11 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, comparable11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset0.hasListener(eventListener13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        java.lang.Comparable comparable11 = null;
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 0L, (java.lang.Comparable) '4', comparable11);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) 1, (java.lang.Comparable) 97.0d, (java.lang.Comparable) 1L);
        defaultStatisticalCategoryDataset0.add((double) 100L, (double) (-1L), (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "");
        int int23 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset0.hasListener(eventListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultStatisticalCategoryDataset0.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int15 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        java.util.List list23 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        double double26 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup15);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable12 = null;
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10L, comparable12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int20 = defaultStatisticalCategoryDataset14.getRowCount();
        double double22 = defaultStatisticalCategoryDataset14.getRangeUpperBound(true);
        boolean boolean24 = defaultStatisticalCategoryDataset14.equals((java.lang.Object) (short) 10);
        double double26 = defaultStatisticalCategoryDataset14.getRangeLowerBound(false);
        java.lang.Number number29 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int30 = defaultStatisticalCategoryDataset14.getRowCount();
        int int31 = defaultStatisticalCategoryDataset14.getRowCount();
        defaultStatisticalCategoryDataset14.add((double) 'a', (double) ' ', (java.lang.Comparable) '4', (java.lang.Comparable) false);
        java.lang.Number number39 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset14.getGroup();
        java.lang.Object obj41 = defaultStatisticalCategoryDataset14.clone();
        boolean boolean42 = defaultStatisticalCategoryDataset0.equals(obj41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNull(number29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(number39);
        org.junit.Assert.assertNotNull(datasetGroup40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset0.hasListener(eventListener13);
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int13 = defaultStatisticalCategoryDataset12.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup14);
        int int16 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(datasetGroup14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        java.lang.Number number26 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (byte) 1);
        java.lang.Number number29 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) false, (java.lang.Comparable) ' ');
        int int30 = defaultStatisticalCategoryDataset12.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(number26);
        org.junit.Assert.assertNull(number29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultStatisticalCategoryDataset0.getStdDevValue(3, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
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
        org.junit.Assert.assertNotNull(datasetGroup23);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        java.util.List list22 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int24 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        java.lang.Object obj25 = defaultStatisticalCategoryDataset0.clone();
        int int26 = defaultStatisticalCategoryDataset0.getRowCount();
        int int28 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (short) 0);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Comparable comparable16 = null;
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '4', comparable16);
        int int19 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener21);
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertNull(number25);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 1L);
        defaultStatisticalCategoryDataset0.add((double) 'a', (double) (-1), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        defaultStatisticalCategoryDataset0.add(0.0d, 0.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener20);
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
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        defaultStatisticalCategoryDataset4.validateObject();
        defaultStatisticalCategoryDataset4.add((java.lang.Number) 100.0f, (java.lang.Number) 100L, (java.lang.Comparable) "hi!", (java.lang.Comparable) ' ');
        int int22 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultStatisticalCategoryDataset4.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1), (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset25.addChangeListener(datasetChangeListener26);
        int int28 = defaultStatisticalCategoryDataset25.getColumnCount();
        java.util.List list29 = defaultStatisticalCategoryDataset25.getColumnKeys();
        java.lang.Number number32 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset25.getGroup();
        int int34 = defaultStatisticalCategoryDataset25.getRowCount();
        defaultStatisticalCategoryDataset25.validateObject();
        int int37 = defaultStatisticalCategoryDataset25.getRowIndex((java.lang.Comparable) (short) 100);
        java.lang.Class<?> wildcardClass38 = defaultStatisticalCategoryDataset25.getClass();
        boolean boolean39 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        int int40 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range42 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNull(number32);
        org.junit.Assert.assertNotNull(datasetGroup33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(range42);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable10 = null;
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex(comparable10);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.hasListener(eventListener12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener15);
        int int17 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int18 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.util.List list19 = defaultStatisticalCategoryDataset14.getColumnKeys();
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset14.getRangeBounds(false);
        int int23 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) 32.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener24);
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(range21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1, (java.lang.Number) (byte) 0, (java.lang.Comparable) 0L, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset0.hasListener(eventListener17);
        int int20 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.add((double) 0L, 0.0d, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 0);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0L, (java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(datasetGroup16);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        defaultStatisticalCategoryDataset3.add((double) (short) 100, (double) (byte) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1);
        double double13 = defaultStatisticalCategoryDataset3.getRangeUpperBound(false);
        int int15 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) 100);
        java.util.List list16 = defaultStatisticalCategoryDataset3.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0f, (java.lang.Number) 1.0d, (java.lang.Comparable) '#', (java.lang.Comparable) (short) 0);
        java.util.List list20 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list16 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultStatisticalCategoryDataset0.validateObject();
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset8.validateObject();
        defaultStatisticalCategoryDataset8.add((java.lang.Number) 0.0f, (java.lang.Number) 2, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 0);
        double double27 = defaultStatisticalCategoryDataset8.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) 2, (double) (short) -1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.hasListener(eventListener8);
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        defaultStatisticalCategoryDataset0.validateObject();
        double double25 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.List list26 = defaultStatisticalCategoryDataset0.getColumnKeys();
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
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 10, (java.lang.Number) 1, (java.lang.Comparable) 10, (java.lang.Comparable) (short) 10);
        int int20 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int21 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 10, (java.lang.Number) 100L, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener27);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultStatisticalCategoryDataset0.hasListener(eventListener6);
        java.lang.Object obj8 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        int int22 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset0.hasListener(eventListener23);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, (java.lang.Number) (-1.0d), (java.lang.Comparable) 100.0d, (java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable31 = defaultStatisticalCategoryDataset0.getRowKey((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 1);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        defaultStatisticalCategoryDataset3.add((double) (short) 100, (double) (byte) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1);
        java.lang.Number number14 = defaultStatisticalCategoryDataset3.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double16 = defaultStatisticalCategoryDataset3.getRangeLowerBound(true);
        java.util.List list17 = defaultStatisticalCategoryDataset3.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((double) (-1L), 0.0d, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 'a');
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 2);
        org.jfree.data.Range range12 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(range12);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) '4', (java.lang.Comparable) 1L, (java.lang.Comparable) (-1.0d));
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int20 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number24 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) (short) -1);
        int int25 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup21);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        defaultStatisticalCategoryDataset0.validateObject();
        double double29 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0f, (java.lang.Number) (byte) 100, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable12 = null;
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '#', comparable12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        double double13 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals(obj9);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 1L);
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list17 = defaultStatisticalCategoryDataset16.getRowKeys();
        defaultStatisticalCategoryDataset16.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int23 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.lang.Number number26 = defaultStatisticalCategoryDataset16.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset16.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = defaultStatisticalCategoryDataset16.hasListener(eventListener32);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset16.getGroup();
        java.lang.Comparable comparable36 = null;
        java.lang.Number number37 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 10, comparable36);
        defaultStatisticalCategoryDataset16.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(number26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(datasetGroup34);
        org.junit.Assert.assertNull(number37);
        org.junit.Assert.assertNotNull(datasetGroup43);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0d);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 10, (java.lang.Number) 10.0d, (java.lang.Comparable) 32.0d, (java.lang.Comparable) 0);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        java.lang.Comparable comparable16 = null;
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 0, comparable16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 0.0f);
        int int19 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 32.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        int int19 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) 10.0f);
        double double21 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        java.lang.Comparable comparable23 = null;
        java.lang.Number number24 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) '4', comparable23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNotNull(datasetGroup25);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        double double18 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Comparable comparable20 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 10, comparable20);
        java.lang.Number number24 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 3, (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNull(number24);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener9);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.lang.Number number17 = defaultStatisticalCategoryDataset11.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset11.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int23 = defaultStatisticalCategoryDataset11.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset24.removeChangeListener(datasetChangeListener26);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset24.addChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset24.addChangeListener(datasetChangeListener30);
        defaultStatisticalCategoryDataset24.add(0.0d, (double) (byte) 0, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0d);
        boolean boolean37 = defaultStatisticalCategoryDataset11.equals((java.lang.Object) 0.0d);
        java.lang.Object obj38 = defaultStatisticalCategoryDataset11.clone();
        boolean boolean39 = defaultStatisticalCategoryDataset0.equals(obj38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.add((double) (byte) 0, (double) (short) 0, (java.lang.Comparable) 2, (java.lang.Comparable) '#');
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        defaultStatisticalCategoryDataset0.add((double) (short) 0, (double) 10, (java.lang.Comparable) (-1), (java.lang.Comparable) 0);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable13 = null;
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, comparable13);
        java.util.List list15 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener16);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        defaultStatisticalCategoryDataset3.add((double) (short) 100, (double) (byte) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset3.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 10, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        defaultStatisticalCategoryDataset0.add((double) (byte) -1, (double) 1L, (java.lang.Comparable) 0L, (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        java.util.List list22 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int24 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset0.hasListener(eventListener25);
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) ' ', (java.lang.Comparable) 10.0f);
        int int31 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(number29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 2);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        int int20 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int23 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((double) 1.0f, (double) (byte) 10, (java.lang.Comparable) 10, (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) 1.0f, (double) 10.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals(obj9);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset11.hasListener(eventListener12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset11.validateObject();
        org.jfree.data.Range range19 = defaultStatisticalCategoryDataset11.getRangeBounds(true);
        int int20 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.lang.Number number23 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int25 = defaultStatisticalCategoryDataset11.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset11.getRangeBounds(true);
        defaultStatisticalCategoryDataset11.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNull(range19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(range27);
        org.junit.Assert.assertNotNull(datasetGroup29);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (byte) 100);
        java.util.List list24 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 97.0d, (java.lang.Comparable) 0.0f);
        java.lang.Class<?> wildcardClass11 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.hasListener(eventListener12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.Range range11 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int3 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int5 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.lang.Number number8 = defaultStatisticalCategoryDataset4.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset4.getGroup();
        boolean boolean13 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = null; // flaky: defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) -1, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        java.util.List list28 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(datasetGroup27);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0f, (java.lang.Number) 1.0d, (java.lang.Comparable) '#', (java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset23.hasListener(eventListener24);
        java.util.List list26 = defaultStatisticalCategoryDataset23.getColumnKeys();
        java.util.List list27 = defaultStatisticalCategoryDataset23.getColumnKeys();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        int int30 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        java.util.List list31 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(datasetGroup21);
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.hasListener(eventListener8);
        java.lang.Comparable comparable13 = null;
        defaultStatisticalCategoryDataset0.add(100.0d, (double) 10L, (java.lang.Comparable) 35.0d, comparable13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue(2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) (short) 0);
        java.lang.Comparable comparable21 = null;
        defaultStatisticalCategoryDataset0.add(97.0d, (double) '4', comparable21, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset0.hasListener(eventListener13);
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) '#');
        int int17 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset0.hasListener(eventListener30);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable11 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0d, (java.lang.Number) Double.NaN, (java.lang.Comparable) 100.0f, comparable11);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (-1));
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        double double22 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 100);
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset0.hasListener(eventListener26);
        org.jfree.data.Range range29 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) -1, (java.lang.Number) (short) 0, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 100.0f);
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(number21);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener26);
        java.util.List list28 = defaultStatisticalCategoryDataset12.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Class<?> wildcardClass13 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(range10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        defaultStatisticalCategoryDataset0.validateObject();
        double double22 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.add(Double.NaN, (double) 100, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        int int26 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) 0L);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) Double.NaN, (java.lang.Comparable) 100L, (java.lang.Comparable) 1L);
        defaultStatisticalCategoryDataset0.add((double) 3, (double) (byte) 100, (java.lang.Comparable) ' ', (java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.add((double) 10, (double) 10.0f, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 97.0d, (java.lang.Number) 0.0f, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.hasListener(eventListener8);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) true);
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        defaultStatisticalCategoryDataset0.add((double) ' ', (double) '4', (java.lang.Comparable) (byte) 10, (java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) (-1), (double) 1L, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int18 = defaultStatisticalCategoryDataset12.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset12.hasListener(eventListener24);
        java.util.List list26 = defaultStatisticalCategoryDataset12.getRowKeys();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        java.lang.Number number30 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(number30);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) "hi!");
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) '4', (java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable15 = null;
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex(comparable15);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        java.lang.Comparable comparable10 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0d), (java.lang.Number) 10.0d, (java.lang.Comparable) (byte) 10, comparable10);
        java.lang.Object obj12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.equals(obj12);
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) 1.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) Double.NaN);
        int int22 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        double double22 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '4', (java.lang.Comparable) "hi!");
        double double19 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener20);
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(range23);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (short) 1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) (-1.0f), (java.lang.Comparable) '#', (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 'a', (java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNull(number29);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable28 = defaultStatisticalCategoryDataset0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 3");
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
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.hasListener(eventListener9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 1);
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset0.hasListener(eventListener17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
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
        int int22 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list23 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int25 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener26);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset0.hasListener(eventListener29);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        java.lang.Number number28 = defaultStatisticalCategoryDataset24.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int29 = defaultStatisticalCategoryDataset24.getColumnCount();
        defaultStatisticalCategoryDataset24.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number37 = defaultStatisticalCategoryDataset24.getMeanValue((int) (byte) 0, (int) (short) 0);
        java.lang.Number number40 = defaultStatisticalCategoryDataset24.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (-1L));
        int int41 = defaultStatisticalCategoryDataset24.getColumnCount();
        boolean boolean42 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener43 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(number37);
        org.junit.Assert.assertNull(number40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int7 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10L, (java.lang.Comparable) (short) 1);
        java.lang.Comparable comparable11 = null;
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue(comparable11, (java.lang.Comparable) 'a');
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultStatisticalCategoryDataset0.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNull(range9);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener17);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0f);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1L, (java.lang.Number) 1.0d, (java.lang.Comparable) ' ', (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNull(number19);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset3.getGroup();
        double double11 = defaultStatisticalCategoryDataset3.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset3.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 1);
        double double18 = defaultStatisticalCategoryDataset3.getRangeLowerBound(false);
        defaultStatisticalCategoryDataset3.add((java.lang.Number) 100.0f, (java.lang.Number) (byte) 10, (java.lang.Comparable) 97.0d, (java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultStatisticalCategoryDataset3.getMeanValue((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) '4');
        java.lang.Comparable comparable12 = null;
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) ' ', (java.lang.Comparable) (byte) 10, comparable12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(datasetGroup14);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, (java.lang.Comparable) '4', (java.lang.Comparable) '#');
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(datasetGroup15);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.add((double) 10, (double) 10.0f, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0f);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset0.hasListener(eventListener19);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.util.List list15 = defaultStatisticalCategoryDataset11.getColumnKeys();
        java.lang.Number number18 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup19);
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset0.hasListener(eventListener21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        java.lang.Number number15 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) false);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset6.hasListener(eventListener16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int22 = defaultStatisticalCategoryDataset16.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset16.removeChangeListener(datasetChangeListener23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset16.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int29 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset16.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        java.lang.Number number37 = defaultStatisticalCategoryDataset16.getStdDevValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset38 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number41 = defaultStatisticalCategoryDataset38.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int43 = defaultStatisticalCategoryDataset38.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int44 = defaultStatisticalCategoryDataset38.getColumnCount();
        java.lang.Comparable comparable46 = null;
        java.lang.Number number47 = defaultStatisticalCategoryDataset38.getMeanValue((java.lang.Comparable) 1.0d, comparable46);
        int int49 = defaultStatisticalCategoryDataset38.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset50 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list51 = defaultStatisticalCategoryDataset50.getRowKeys();
        defaultStatisticalCategoryDataset50.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int57 = defaultStatisticalCategoryDataset50.getColumnCount();
        java.lang.Number number60 = defaultStatisticalCategoryDataset50.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset50.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener66 = null;
        boolean boolean67 = defaultStatisticalCategoryDataset50.hasListener(eventListener66);
        org.jfree.data.general.DatasetGroup datasetGroup68 = defaultStatisticalCategoryDataset50.getGroup();
        defaultStatisticalCategoryDataset38.setGroup(datasetGroup68);
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup68);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup68);
        org.jfree.data.Range range73 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(number27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(number37);
        org.junit.Assert.assertNull(number41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(number47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNull(number60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(datasetGroup68);
        org.junit.Assert.assertNull(range73);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "", (java.lang.Comparable) 10.0d);
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) (short) 0, (java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        org.jfree.data.Range range12 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        int int20 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset0.hasListener(eventListener21);
        java.util.List list23 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) 0.0f);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number30 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) '#', (java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNull(number26);
        org.junit.Assert.assertNotNull(datasetGroup27);
        org.junit.Assert.assertNull(number30);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 10);
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range11 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultStatisticalCategoryDataset0.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup14);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        defaultStatisticalCategoryDataset4.validateObject();
        int int12 = defaultStatisticalCategoryDataset4.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        defaultStatisticalCategoryDataset0.add((double) ' ', (double) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset0.getGroup();
        double double24 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset0.hasListener(eventListener25);
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 2);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number33 = defaultStatisticalCategoryDataset30.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int35 = defaultStatisticalCategoryDataset30.getColumnIndex((java.lang.Comparable) (short) -1);
        double double37 = defaultStatisticalCategoryDataset30.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset30.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset30.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        defaultStatisticalCategoryDataset30.validateObject();
        java.lang.Object obj49 = defaultStatisticalCategoryDataset30.clone();
        boolean boolean50 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset30);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 32.0d + "'", double24 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(number29);
        org.junit.Assert.assertNull(number33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        double double16 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        defaultStatisticalCategoryDataset0.add((double) 'a', (double) ' ', (java.lang.Comparable) '4', (java.lang.Comparable) false);
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 10, (java.lang.Number) 100, (java.lang.Comparable) (-1), (java.lang.Comparable) 100L);
        java.util.List list31 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        java.lang.Comparable comparable11 = null;
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 0L, (java.lang.Comparable) '4', comparable11);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) 1, (java.lang.Comparable) 97.0d, (java.lang.Comparable) 1L);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(number21);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) Double.NaN, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 100);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.hasListener(eventListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener14);
        java.lang.Comparable comparable19 = null;
        defaultStatisticalCategoryDataset0.add(97.0d, (double) (short) 10, (java.lang.Comparable) (short) 1, comparable19);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset0.hasListener(eventListener29);
        int int31 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int33 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1), (java.lang.Number) 10.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) "", (java.lang.Comparable) (short) 100);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener19);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultStatisticalCategoryDataset0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable2 = null;
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getValue(comparable2, (java.lang.Comparable) (-1));
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) 100);
        double double9 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset0.hasListener(eventListener13);
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener19);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(datasetGroup14);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset3.getGroup();
        double double11 = defaultStatisticalCategoryDataset3.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = null; // flaky: defaultStatisticalCategoryDataset3.getMeanValue((int) (short) -1, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list16 = defaultStatisticalCategoryDataset15.getRowKeys();
        defaultStatisticalCategoryDataset15.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int22 = defaultStatisticalCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup23);
        double double26 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int27 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, (java.lang.Number) (short) 100, (java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) -1);
        int int34 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number37 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(datasetGroup23);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(number37);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10, (java.lang.Number) 10.0d, (java.lang.Comparable) 0, (java.lang.Comparable) (short) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number23 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int25 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int26 = defaultStatisticalCategoryDataset20.getColumnCount();
        java.lang.Comparable comparable28 = null;
        java.lang.Number number29 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) 1.0d, comparable28);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset20.hasListener(eventListener30);
        defaultStatisticalCategoryDataset20.validateObject();
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        defaultStatisticalCategoryDataset20.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(number29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        int int19 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener20);
        java.util.List list22 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '4', (java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultStatisticalCategoryDataset0.getMeanValue(100, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(number25);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        defaultStatisticalCategoryDataset0.validateObject();
        int int17 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1L), (java.lang.Number) 0, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) "", (java.lang.Comparable) 0.0d);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.add((double) (short) 1, (double) (-1L), (java.lang.Comparable) 100L, (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNull(number21);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        defaultStatisticalCategoryDataset0.add((double) (short) -1, (double) 10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 'a');
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list20 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 10);
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (-1.0d));
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener21);
        int int23 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list24 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) '4');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number25 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int27 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int28 = defaultStatisticalCategoryDataset22.getColumnCount();
        java.lang.Comparable comparable30 = null;
        java.lang.Number number31 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) 1.0d, comparable30);
        int int33 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list35 = defaultStatisticalCategoryDataset34.getRowKeys();
        defaultStatisticalCategoryDataset34.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int41 = defaultStatisticalCategoryDataset34.getColumnCount();
        java.lang.Number number44 = defaultStatisticalCategoryDataset34.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset34.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener50 = null;
        boolean boolean51 = defaultStatisticalCategoryDataset34.hasListener(eventListener50);
        org.jfree.data.general.DatasetGroup datasetGroup52 = defaultStatisticalCategoryDataset34.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup52);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup52);
        java.util.List list55 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(number31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(number44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(datasetGroup52);
        org.junit.Assert.assertNotNull(list55);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        int int27 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        defaultStatisticalCategoryDataset0.add((double) 10, (double) 0L, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        double double12 = defaultStatisticalCategoryDataset6.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset6.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals(obj16);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) false, (java.lang.Comparable) 0.0d);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list23 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) '#');
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1L);
        int int21 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultStatisticalCategoryDataset0.getStdDevValue((int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((double) 100L, (double) 0.0f, (java.lang.Comparable) 1, (java.lang.Comparable) (short) 1);
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset0.hasListener(eventListener19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        int int16 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset3.getGroup();
        double double11 = defaultStatisticalCategoryDataset3.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener12);
        java.util.List list14 = defaultStatisticalCategoryDataset3.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultStatisticalCategoryDataset0.getColumnKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) -1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset0.getGroup();
        int int22 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(datasetGroup20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100, (java.lang.Comparable) "");
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 2, (java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1L);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) 10, comparable13, (java.lang.Comparable) '#');
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 35.0d, (java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((double) 1.0f, (double) (byte) 10, (java.lang.Comparable) 10, (java.lang.Comparable) 0.0d);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset0.hasListener(eventListener15);
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset6.getRangeBounds(true);
        defaultStatisticalCategoryDataset6.add((double) 1, (double) (short) -1, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 32.0d);
        java.lang.Number number25 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) false, (java.lang.Comparable) 35.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNull(number25);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) '#');
        java.lang.Object obj17 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(datasetGroup16);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) '4');
        double double16 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.lang.Class<?> wildcardClass16 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getColumnKey(0);
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
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) '#');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) '4');
        java.lang.Comparable comparable12 = null;
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) ' ', (java.lang.Comparable) (byte) 10, comparable12);
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        defaultStatisticalCategoryDataset3.add((double) (short) 100, (double) (byte) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1);
        double double13 = defaultStatisticalCategoryDataset3.getRangeUpperBound(false);
        int int15 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset3.getValue((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 1, (java.lang.Number) Double.NaN, (java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number20 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int22 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) -1);
        int int24 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int26 = defaultStatisticalCategoryDataset25.getColumnCount();
        int int28 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset17.setGroup(datasetGroup29);
        int int32 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener33);
        defaultStatisticalCategoryDataset17.validateObject();
        java.lang.Number number38 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (-1));
        boolean boolean39 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(number38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Comparable comparable7 = null;
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0, comparable7);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(range10);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 1L);
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        defaultStatisticalCategoryDataset6.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int13 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Number number16 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset6.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset6.hasListener(eventListener22);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        int int27 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        double double29 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 'a', (double) (byte) 100, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 0.0f);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Comparable comparable13 = null;
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue(comparable13, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset0.hasListener(eventListener25);
        double double28 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (-1.0f), (double) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 10);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 10.0d);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) false);
        java.lang.Object obj13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals(obj13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 10, (java.lang.Number) (-1.0d), (java.lang.Comparable) 1L, (java.lang.Comparable) Double.NaN);
        int int23 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1));
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "", (java.lang.Comparable) '#');
        int int23 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = null; // flaky: defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) -1, (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(number22);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1), (java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultStatisticalCategoryDataset0.getValue(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) true, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(datasetGroup14);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener13);
        int int15 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number18 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset12.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        int int27 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int29 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable31 = defaultStatisticalCategoryDataset0.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0f, (java.lang.Number) 1.0d, (java.lang.Comparable) '#', (java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1, (java.lang.Comparable) (-1));
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) (-1.0f), (java.lang.Comparable) 0.0d, (java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(number23);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable20 = defaultStatisticalCategoryDataset0.getRowKey(1);
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 2);
        java.lang.Comparable comparable25 = defaultStatisticalCategoryDataset0.getColumnKey(0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) -1 + "'", comparable20, (short) -1);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 10.0d + "'", comparable25, 10.0d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        defaultStatisticalCategoryDataset0.add((double) '#', (double) 1L, (java.lang.Comparable) 10L, (java.lang.Comparable) 97.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener29);
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
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100, (java.lang.Comparable) "");
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable17 = null;
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0f), comparable17);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10, (java.lang.Number) (byte) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        defaultStatisticalCategoryDataset0.add((double) 1, (double) 2, (java.lang.Comparable) "", (java.lang.Comparable) 'a');
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int23 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        java.lang.Comparable comparable10 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0d), (java.lang.Number) 10.0d, (java.lang.Comparable) (byte) 10, comparable10);
        java.lang.Object obj12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.equals(obj12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(datasetGroup16);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.Range range11 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double20 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        int int22 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultStatisticalCategoryDataset0.hasListener(eventListener5);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1), (java.lang.Comparable) 1.0f);
        java.lang.Object obj22 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener26);
        java.util.List list28 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((double) ' ', (double) 1L, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 97.0d, (java.lang.Comparable) 10L);
        java.lang.Number number16 = null;
        java.lang.Number number17 = null;
        defaultStatisticalCategoryDataset0.add(number16, number17, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Class<?> wildcardClass10 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener27);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNotNull(datasetGroup18);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1), (java.lang.Comparable) 1.0f);
        java.lang.Object obj22 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener26);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertNotNull(datasetGroup28);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultStatisticalCategoryDataset14.getValue(2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
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
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int17 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int19 = defaultStatisticalCategoryDataset18.getColumnCount();
        int int21 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset18.getGroup();
        java.util.List list23 = defaultStatisticalCategoryDataset18.getColumnKeys();
        int int24 = defaultStatisticalCategoryDataset18.getRowCount();
        java.lang.Number number27 = defaultStatisticalCategoryDataset18.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        java.util.List list28 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        double double31 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(number27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultStatisticalCategoryDataset0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 'a', (double) (byte) 100, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 0.0f);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100L);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        java.lang.Number number15 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) false);
        java.util.List list16 = defaultStatisticalCategoryDataset6.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        defaultStatisticalCategoryDataset12.add((java.lang.Number) 100L, (java.lang.Number) 100, (java.lang.Comparable) 100, (java.lang.Comparable) (-1L));
        java.lang.Number number33 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 10);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset12.add((java.lang.Number) 0, (java.lang.Number) (byte) 1, (java.lang.Comparable) 35.0d, (java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(number33);
        org.junit.Assert.assertNotNull(datasetGroup34);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset8.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultStatisticalCategoryDataset8.getValue((int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(datasetGroup21);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 100.0d, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1.0f));
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset0.hasListener(eventListener24);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        double double17 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        int int17 = defaultStatisticalCategoryDataset6.getRowCount();
        java.lang.Class<?> wildcardClass18 = defaultStatisticalCategoryDataset6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
        int int21 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultStatisticalCategoryDataset0.getStdDevValue(1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(datasetGroup11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        double double22 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset26.addChangeListener(datasetChangeListener27);
        int int29 = defaultStatisticalCategoryDataset26.getColumnCount();
        java.util.List list30 = defaultStatisticalCategoryDataset26.getColumnKeys();
        java.lang.Number number33 = defaultStatisticalCategoryDataset26.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset26.getGroup();
        int int35 = defaultStatisticalCategoryDataset26.getColumnCount();
        java.lang.Number number38 = defaultStatisticalCategoryDataset26.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (short) 100);
        double double40 = defaultStatisticalCategoryDataset26.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset41 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list42 = defaultStatisticalCategoryDataset41.getRowKeys();
        defaultStatisticalCategoryDataset41.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int48 = defaultStatisticalCategoryDataset41.getColumnCount();
        int int49 = defaultStatisticalCategoryDataset41.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup50 = defaultStatisticalCategoryDataset41.getGroup();
        defaultStatisticalCategoryDataset26.setGroup(datasetGroup50);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable54 = defaultStatisticalCategoryDataset0.getColumnKey((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(number33);
        org.junit.Assert.assertNotNull(datasetGroup34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(number38);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(datasetGroup50);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int2 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 35.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        int int20 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int23 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) Double.NaN);
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0d);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable8 = null;
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue(comparable8, (java.lang.Comparable) 1);
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 1, (java.lang.Number) 0L, (java.lang.Comparable) 'a', (java.lang.Comparable) (-1L));
        java.util.List list21 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.validateObject();
        double double11 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((int) (short) -1, (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) (-1), (double) 1L, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int18 = defaultStatisticalCategoryDataset12.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset12.hasListener(eventListener24);
        java.util.List list26 = defaultStatisticalCategoryDataset12.getRowKeys();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        defaultStatisticalCategoryDataset12.validateObject();
        int int30 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) true);
        java.lang.Number number33 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) ' ', (java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset12.getGroup();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(number33);
        org.junit.Assert.assertNotNull(datasetGroup34);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener13);
        int int15 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number18 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset12.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        int int27 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int29 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        int int30 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        double double18 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) 10, (java.lang.Comparable) (short) -1, (java.lang.Comparable) '#');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable17 = null;
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0f), comparable17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
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
        java.util.List list22 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int24 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset0.hasListener(eventListener25);
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) ' ', (java.lang.Comparable) 10.0f);
        int int31 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int33 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(number29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
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
        java.lang.Number number26 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (byte) 1);
        java.lang.Number number29 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) false, (java.lang.Comparable) ' ');
        java.lang.Comparable comparable30 = null;
        java.lang.Number number32 = defaultStatisticalCategoryDataset12.getStdDevValue(comparable30, (java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(number26);
        org.junit.Assert.assertNull(number29);
        org.junit.Assert.assertNull(number32);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int15 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int17 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset14.getGroup();
        int int20 = defaultStatisticalCategoryDataset14.getRowIndex((java.lang.Comparable) 10.0f);
        defaultStatisticalCategoryDataset14.add((java.lang.Number) 1L, (java.lang.Number) (-1.0f), (java.lang.Comparable) 10, (java.lang.Comparable) 'a');
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 1L);
        int int28 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.List list29 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        defaultStatisticalCategoryDataset0.add((double) (byte) 0, (double) (byte) 10, (java.lang.Comparable) false, (java.lang.Comparable) 0L);
        java.lang.Comparable comparable20 = null;
        defaultStatisticalCategoryDataset0.add((double) (short) 1, (double) 10.0f, (java.lang.Comparable) 0L, comparable20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        java.lang.Object obj10 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Comparable comparable13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) 35.0d, comparable13, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        java.util.List list11 = defaultStatisticalCategoryDataset3.getRowKeys();
        java.util.List list12 = defaultStatisticalCategoryDataset3.getRowKeys();
        java.util.List list13 = defaultStatisticalCategoryDataset3.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(range10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1L), (java.lang.Number) (byte) 1, (java.lang.Comparable) true, (java.lang.Comparable) 1.0d);
        java.lang.Comparable comparable25 = defaultStatisticalCategoryDataset0.getColumnKey((int) (short) 1);
        int int27 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (short) -1 + "'", comparable25, (short) -1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset3.getGroup();
        double double11 = defaultStatisticalCategoryDataset3.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset3.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 1);
        double double18 = defaultStatisticalCategoryDataset3.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list16 = defaultStatisticalCategoryDataset15.getRowKeys();
        defaultStatisticalCategoryDataset15.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int22 = defaultStatisticalCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup23);
        double double26 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int28 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        java.lang.Number number31 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, (java.lang.Comparable) 35.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(datasetGroup23);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(number31);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10, (java.lang.Number) (byte) 100, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 10.0d);
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 97.0d);
        java.util.List list22 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) true);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset0.hasListener(eventListener19);
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double9 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 35.0d, (java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int20 = defaultStatisticalCategoryDataset14.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset14.removeChangeListener(datasetChangeListener21);
        java.lang.Number number25 = defaultStatisticalCategoryDataset14.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int27 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) 1.0f);
        double double29 = defaultStatisticalCategoryDataset14.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list31 = defaultStatisticalCategoryDataset30.getRowKeys();
        defaultStatisticalCategoryDataset30.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int37 = defaultStatisticalCategoryDataset30.getColumnCount();
        int int39 = defaultStatisticalCategoryDataset30.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int40 = defaultStatisticalCategoryDataset30.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset41 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener42 = null;
        boolean boolean43 = defaultStatisticalCategoryDataset41.hasListener(eventListener42);
        java.lang.Number number46 = defaultStatisticalCategoryDataset41.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int47 = defaultStatisticalCategoryDataset41.getRowCount();
        double double49 = defaultStatisticalCategoryDataset41.getRangeUpperBound(true);
        double double51 = defaultStatisticalCategoryDataset41.getRangeUpperBound(false);
        java.lang.Comparable comparable54 = null;
        defaultStatisticalCategoryDataset41.add((java.lang.Number) 1.0f, (java.lang.Number) (short) 10, comparable54, (java.lang.Comparable) '#');
        int int57 = defaultStatisticalCategoryDataset41.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup58 = defaultStatisticalCategoryDataset41.getGroup();
        defaultStatisticalCategoryDataset30.setGroup(datasetGroup58);
        defaultStatisticalCategoryDataset14.setGroup(datasetGroup58);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup58);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(number46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(datasetGroup58);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double9 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj16 = defaultStatisticalCategoryDataset0.clone();
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        int int19 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) 0L);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultStatisticalCategoryDataset0.getRowKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        defaultStatisticalCategoryDataset6.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int13 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Number number16 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset6.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset6.hasListener(eventListener22);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        int int27 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset0.getColumnKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 0.0d);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
        int int19 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultStatisticalCategoryDataset0.getColumnKey(100);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1);
        java.lang.Class<?> wildcardClass12 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset0.hasListener(eventListener13);
        int int15 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number16 = null;
        defaultStatisticalCategoryDataset0.add(number16, (java.lang.Number) 32.0d, (java.lang.Comparable) ' ', (java.lang.Comparable) (short) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset21.hasListener(eventListener22);
        java.lang.Number number26 = defaultStatisticalCategoryDataset21.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int27 = defaultStatisticalCategoryDataset21.getRowCount();
        double double29 = defaultStatisticalCategoryDataset21.getRangeUpperBound(true);
        double double31 = defaultStatisticalCategoryDataset21.getRangeUpperBound(false);
        java.lang.Comparable comparable34 = null;
        defaultStatisticalCategoryDataset21.add((java.lang.Number) 1.0f, (java.lang.Number) (short) 10, comparable34, (java.lang.Comparable) '#');
        java.lang.Number number39 = defaultStatisticalCategoryDataset21.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 100);
        int int41 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.EventListener eventListener42 = null;
        boolean boolean43 = defaultStatisticalCategoryDataset21.hasListener(eventListener42);
        java.util.List list44 = defaultStatisticalCategoryDataset21.getRowKeys();
        java.lang.Number number47 = defaultStatisticalCategoryDataset21.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) 0.0f);
        org.jfree.data.general.DatasetGroup datasetGroup48 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(number26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNull(number39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNull(number47);
        org.junit.Assert.assertNotNull(datasetGroup48);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset0.hasListener(eventListener17);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable10 = null;
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '4', comparable10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Comparable comparable17 = null;
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) Double.NaN, comparable17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener34);
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
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
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
        int int19 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        double double23 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(range21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10, (java.lang.Number) (byte) 100, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        defaultStatisticalCategoryDataset19.validateObject();
        java.lang.Number number25 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj26 = defaultStatisticalCategoryDataset19.clone();
        org.jfree.data.Range range28 = defaultStatisticalCategoryDataset19.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener29);
        defaultStatisticalCategoryDataset19.validateObject();
        java.lang.Number number34 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int36 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (byte) 100);
        double double38 = defaultStatisticalCategoryDataset19.getRangeUpperBound(true);
        int int40 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) false);
        double double42 = defaultStatisticalCategoryDataset19.getRangeUpperBound(true);
        boolean boolean43 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(range28);
        org.junit.Assert.assertNull(number34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj4 = defaultStatisticalCategoryDataset0.clone();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        defaultStatisticalCategoryDataset0.add((double) 0.0f, (double) (byte) 0, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
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
        double double17 = defaultStatisticalCategoryDataset6.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset6.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(datasetGroup18);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        defaultStatisticalCategoryDataset0.add(0.0d, (double) (byte) 0, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0d);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        double double9 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 100, (java.lang.Number) 0.0f, (java.lang.Comparable) 97.0d, (java.lang.Comparable) 2);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, comparable8);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        double double16 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double18 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        int int27 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Comparable comparable28 = null;
        java.lang.Number number30 = defaultStatisticalCategoryDataset12.getStdDevValue(comparable28, (java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(range26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(number30);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 10);
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultStatisticalCategoryDataset0.hasListener(eventListener5);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) 0.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 'a');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) 0, (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int2 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10L, (java.lang.Number) 0.0d, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 0);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        defaultStatisticalCategoryDataset0.add((double) (-1), 10.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) true);
        org.jfree.data.Range range30 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
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
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.lang.Comparable comparable25 = null;
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, comparable25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNull(number26);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int16 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number19 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int20 = defaultStatisticalCategoryDataset15.getColumnCount();
        defaultStatisticalCategoryDataset15.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number28 = defaultStatisticalCategoryDataset15.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int29 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number32 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) 10L, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultStatisticalCategoryDataset15.removeChangeListener(datasetChangeListener33);
        boolean boolean35 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(number32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int12 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '4', (java.lang.Comparable) (-1L));
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) 0L);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset0.hasListener(eventListener19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
        int int20 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset0.hasListener(eventListener21);
        double double24 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj25 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (-1.0f), (double) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.add((double) 2, (double) 10.0f, (java.lang.Comparable) 10, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener18);
        double double21 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset0.hasListener(eventListener22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue(3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultStatisticalCategoryDataset0.hasListener(eventListener5);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 2, (java.lang.Number) 2, (java.lang.Comparable) 10, (java.lang.Comparable) 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getRowKey(0);
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + '4' + "'", comparable12, '4');
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
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
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset0.hasListener(eventListener25);
        java.util.List list27 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset0.hasListener(eventListener28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.hasListener(eventListener8);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1, (java.lang.Comparable) (short) -1);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        java.lang.Comparable comparable17 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 10, (java.lang.Number) 10L, (java.lang.Comparable) (-1.0f), comparable17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultStatisticalCategoryDataset0.getMeanValue((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) 0L);
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) false, (java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Comparable comparable16 = null;
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, comparable16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, (java.lang.Comparable) '4', (java.lang.Comparable) '#');
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = defaultStatisticalCategoryDataset12.getRowKey((int) '4');
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
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset8.validateObject();
        defaultStatisticalCategoryDataset8.add((java.lang.Number) 0.0f, (java.lang.Number) 2, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 0);
        java.lang.Number number28 = defaultStatisticalCategoryDataset8.getMeanValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (-1L));
        defaultStatisticalCategoryDataset8.add((double) (byte) 1, (double) ' ', (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertNull(number28);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable2 = null;
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getValue(comparable2, (java.lang.Comparable) (-1));
        java.util.List list5 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list6 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals(obj7);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset9.addChangeListener(datasetChangeListener10);
        int int12 = defaultStatisticalCategoryDataset9.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset9.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset9.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset9.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int27 = defaultStatisticalCategoryDataset9.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range29 = defaultStatisticalCategoryDataset9.getRangeBounds(true);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range11 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        java.lang.Comparable comparable21 = null;
        int int22 = defaultStatisticalCategoryDataset0.getRowIndex(comparable21);
        double double24 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(datasetGroup20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultStatisticalCategoryDataset0.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
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
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
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
        double double18 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) 10, (java.lang.Comparable) (short) -1, (java.lang.Comparable) '#');
        int int24 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, (java.lang.Number) 2, (java.lang.Comparable) true, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
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
        int int30 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int31 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int32 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener33 = null;
        boolean boolean34 = defaultStatisticalCategoryDataset0.hasListener(eventListener33);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number38 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 97.0d, (java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNull(number29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(number38);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
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
        java.util.List list26 = defaultStatisticalCategoryDataset12.getColumnKeys();
        defaultStatisticalCategoryDataset12.validateObject();
        defaultStatisticalCategoryDataset12.add((java.lang.Number) 0.0d, (java.lang.Number) (-1), (java.lang.Comparable) Double.NaN, (java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 1.0f);
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((double) (byte) -1, (double) 1L, (java.lang.Comparable) 1.0d, (java.lang.Comparable) true);
        java.util.List list24 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        defaultStatisticalCategoryDataset0.add((double) 1, (double) (byte) 100, (java.lang.Comparable) (short) 1, (java.lang.Comparable) true);
        java.lang.Object obj21 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
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
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list17 = defaultStatisticalCategoryDataset16.getRowKeys();
        defaultStatisticalCategoryDataset16.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int23 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.lang.Number number26 = defaultStatisticalCategoryDataset16.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number29 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.Range range31 = defaultStatisticalCategoryDataset16.getRangeBounds(false);
        double double33 = defaultStatisticalCategoryDataset16.getRangeLowerBound(false);
        java.util.EventListener eventListener34 = null;
        boolean boolean35 = defaultStatisticalCategoryDataset16.hasListener(eventListener34);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number40 = null; // flaky: defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) -1, (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(number26);
        org.junit.Assert.assertNull(number29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(datasetGroup36);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) Double.NaN, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int18 = defaultStatisticalCategoryDataset12.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int25 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset12.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        java.lang.Number number33 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) -1);
        java.util.List list34 = defaultStatisticalCategoryDataset12.getRowKeys();
        org.jfree.data.Range range36 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup37);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener39);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(number33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(datasetGroup37);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
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
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1), (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        int int25 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0d);
        java.lang.Object obj26 = defaultStatisticalCategoryDataset0.clone();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0d, (java.lang.Number) (byte) 10, (java.lang.Comparable) 1.0f, (java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue(0, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset3.getGroup();
        double double11 = defaultStatisticalCategoryDataset3.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset3.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 1);
        java.util.List list17 = defaultStatisticalCategoryDataset3.getColumnKeys();
        defaultStatisticalCategoryDataset3.add((double) 1L, (double) 3, (java.lang.Comparable) false, (java.lang.Comparable) (-1.0f));
        int int24 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.equals(obj8);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
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
        defaultStatisticalCategoryDataset0.validateObject();
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number17 = null;
        defaultStatisticalCategoryDataset0.add(number17, (java.lang.Number) 0L, (java.lang.Comparable) "", (java.lang.Comparable) 10L);
        int int23 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
        defaultStatisticalCategoryDataset0.add((double) (-1), (double) 1, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (-1.0d));
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list22 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) Double.NaN, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 100);
        java.lang.Number number12 = null;
        defaultStatisticalCategoryDataset0.add(number12, (java.lang.Number) 100.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0L, (java.lang.Number) (byte) 100, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.equals(obj8);
        double double11 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) Double.NaN);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNull(number19);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int22 = defaultStatisticalCategoryDataset17.getColumnCount();
        defaultStatisticalCategoryDataset17.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number30 = defaultStatisticalCategoryDataset17.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int32 = defaultStatisticalCategoryDataset17.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.jfree.data.Range range36 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int37 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(number30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup33);
        org.junit.Assert.assertNull(range36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        java.util.List list19 = defaultStatisticalCategoryDataset6.getRowKeys();
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
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
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
        double double13 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(range8);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
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
        defaultStatisticalCategoryDataset0.validateObject();
        int int31 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        java.lang.Comparable comparable32 = null;
        int int33 = defaultStatisticalCategoryDataset0.getColumnIndex(comparable32);
        org.jfree.data.Range range35 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset36 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset36.addChangeListener(datasetChangeListener37);
        int int39 = defaultStatisticalCategoryDataset36.getColumnCount();
        java.lang.Number number42 = defaultStatisticalCategoryDataset36.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset36.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup48 = defaultStatisticalCategoryDataset36.getGroup();
        java.util.List list49 = defaultStatisticalCategoryDataset36.getRowKeys();
        java.util.List list50 = defaultStatisticalCategoryDataset36.getColumnKeys();
        java.util.List list51 = defaultStatisticalCategoryDataset36.getRowKeys();
        boolean boolean52 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset36);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(range35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(number42);
        org.junit.Assert.assertNotNull(datasetGroup48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Class<?> wildcardClass9 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        java.lang.Object obj10 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset0.equals(obj11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
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
        defaultStatisticalCategoryDataset0.add((double) ' ', (double) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int23 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(number26);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Comparable comparable11 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) -1, comparable11);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) ' ', (java.lang.Comparable) 100);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultStatisticalCategoryDataset0.getMeanValue(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Number number20 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 0, number20, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        int int24 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number27 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) false, (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(number27);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        java.lang.Number number17 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) '4');
        java.lang.Comparable comparable21 = null;
        defaultStatisticalCategoryDataset9.add((double) (short) 10, (double) ' ', (java.lang.Comparable) (byte) 10, comparable21);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset9.getGroup();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset9.hasListener(eventListener24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset9.removeChangeListener(datasetChangeListener26);
        int int29 = defaultStatisticalCategoryDataset9.getColumnIndex((java.lang.Comparable) "");
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(datasetGroup23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        double double19 = defaultStatisticalCategoryDataset6.getRangeLowerBound(true);
        int int20 = defaultStatisticalCategoryDataset6.getRowCount();
        java.util.List list21 = defaultStatisticalCategoryDataset6.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultStatisticalCategoryDataset6.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 10L);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        double double13 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) -1, (java.lang.Number) (short) 100, (java.lang.Comparable) (short) 1, (java.lang.Comparable) (-1.0d));
        int int20 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number17 = null;
        defaultStatisticalCategoryDataset0.add(number17, (java.lang.Number) 0L, (java.lang.Comparable) "", (java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = null; // flaky: defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) -1, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable10 = null;
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '4', comparable10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add(97.0d, (double) 100.0f, (java.lang.Comparable) 'a', (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset0.getGroup();
        int int22 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
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
        java.lang.Class<?> wildcardClass21 = datasetGroup19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue(2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener9);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0, (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
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
        java.util.List list16 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (byte) 0, (double) 100, (java.lang.Comparable) 2, (java.lang.Comparable) '4');
        java.util.List list22 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset0.hasListener(eventListener23);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
        int int23 = defaultStatisticalCategoryDataset0.getColumnCount();
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
    }
}
