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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 0);
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNull(number21);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        java.util.List list15 = defaultStatisticalCategoryDataset4.getColumnKeys();
        int int17 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) (-1.0f));
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset4.hasListener(eventListener18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultStatisticalCategoryDataset4.getValue((int) 'a', (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getColumnKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10L, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNull(number22);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(range15);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1));
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 0, (int) ' ');
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
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultStatisticalCategoryDataset0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        java.util.List list28 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        java.util.List list19 = defaultStatisticalCategoryDataset8.getRowKeys();
        java.util.List list20 = defaultStatisticalCategoryDataset8.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        defaultStatisticalCategoryDataset0.add((double) 0L, 0.0d, (java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 10);
        int int17 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        int int23 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int24 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj25 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset10.addChangeListener(datasetChangeListener11);
        int int13 = defaultStatisticalCategoryDataset10.getColumnCount();
        java.util.List list14 = defaultStatisticalCategoryDataset10.getColumnKeys();
        java.lang.Number number17 = defaultStatisticalCategoryDataset10.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int19 = defaultStatisticalCategoryDataset10.getColumnIndex((java.lang.Comparable) 100L);
        int int21 = defaultStatisticalCategoryDataset10.getColumnIndex((java.lang.Comparable) 10.0d);
        double double23 = defaultStatisticalCategoryDataset10.getRangeUpperBound(true);
        int int24 = defaultStatisticalCategoryDataset10.getRowCount();
        java.util.List list25 = defaultStatisticalCategoryDataset10.getRowKeys();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable28 = defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.hasListener(eventListener12);
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNotNull(datasetGroup16);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable10 = null;
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '4', comparable10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) Double.NaN);
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultStatisticalCategoryDataset0.hasListener(eventListener6);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        int int19 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener20);
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.hasListener(eventListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.add((double) ' ', 35.0d, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        double double21 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        java.lang.Comparable comparable24 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(comparable24);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener20);
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Comparable comparable15 = null;
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue(comparable15, (java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) '#');
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) 100L, (double) (-1L), (java.lang.Comparable) 2, (java.lang.Comparable) (short) -1);
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(number20);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) '#');
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) '4', (double) 0L, (java.lang.Comparable) (-1L), (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (-1.0d));
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass25 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(datasetGroup20);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        java.util.List list33 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable35 = defaultStatisticalCategoryDataset0.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 2");
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
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        double double2 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultStatisticalCategoryDataset0.hasListener(eventListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue(1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (-1.0f), (double) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 10);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        double double31 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        double double7 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(datasetGroup8);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1), (java.lang.Number) 100.0f, (java.lang.Comparable) ' ', (java.lang.Comparable) 10L);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10L, (java.lang.Comparable) (short) 100);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) (byte) 10, (java.lang.Comparable) '4', (java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset4.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset4.getValue((int) (byte) 100, (int) ' ');
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
        org.junit.Assert.assertNotNull(datasetGroup15);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        java.lang.Number number25 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10.0d, number25, (java.lang.Comparable) 0L, (java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (short) 10);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(datasetGroup15);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        org.jfree.data.Range range19 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        java.util.List list20 = defaultStatisticalCategoryDataset3.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(range19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        int int26 = defaultStatisticalCategoryDataset12.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 0, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) -1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultStatisticalCategoryDataset0.getColumnKey(0);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 2);
        java.lang.Number number12 = null;
        defaultStatisticalCategoryDataset0.add(number12, (java.lang.Number) 1, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset12.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = null; // flaky: defaultStatisticalCategoryDataset12.getStdDevValue((int) (byte) -1, 2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(datasetGroup28);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) ' ', (java.lang.Comparable) 1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10.0f, (java.lang.Number) 1.0d, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 1.0f);
        int int21 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultStatisticalCategoryDataset0.getValue(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable7 = null;
        defaultStatisticalCategoryDataset0.add(1.0d, (double) (byte) 1, comparable7, (java.lang.Comparable) 1.0d);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset11.hasListener(eventListener12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int17 = defaultStatisticalCategoryDataset11.getRowCount();
        double double19 = defaultStatisticalCategoryDataset11.getRangeUpperBound(true);
        boolean boolean21 = defaultStatisticalCategoryDataset11.equals((java.lang.Object) (short) 10);
        double double23 = defaultStatisticalCategoryDataset11.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number27 = defaultStatisticalCategoryDataset24.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int29 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int30 = defaultStatisticalCategoryDataset24.getColumnCount();
        java.lang.Comparable comparable32 = null;
        java.lang.Number number33 = defaultStatisticalCategoryDataset24.getMeanValue((java.lang.Comparable) 1.0d, comparable32);
        java.util.EventListener eventListener34 = null;
        boolean boolean35 = defaultStatisticalCategoryDataset24.hasListener(eventListener34);
        defaultStatisticalCategoryDataset24.validateObject();
        boolean boolean37 = defaultStatisticalCategoryDataset11.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        defaultStatisticalCategoryDataset24.add((double) (short) -1, (double) (short) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1));
        boolean boolean43 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNull(number27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(number33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        defaultStatisticalCategoryDataset0.add((double) 10, (double) (byte) 10, (java.lang.Comparable) 100L, (java.lang.Comparable) 0.0d);
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset0.hasListener(eventListener29);
        java.lang.Class<?> wildcardClass31 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int18 = defaultStatisticalCategoryDataset12.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int25 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        defaultStatisticalCategoryDataset12.add((double) 1, (double) (byte) 100, (java.lang.Comparable) (short) 1, (java.lang.Comparable) true);
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 1);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(range27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable9 = null;
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex(comparable9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNotNull(datasetGroup21);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        defaultStatisticalCategoryDataset0.add((double) 10, (double) (byte) 10, (java.lang.Comparable) 100L, (java.lang.Comparable) 0.0d);
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset0.hasListener(eventListener29);
        double double32 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Class<?> wildcardClass33 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        defaultStatisticalCategoryDataset0.add((double) (short) -1, (-1.0d), (java.lang.Comparable) (short) 1, (java.lang.Comparable) "");
        java.lang.Object obj21 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) -1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (short) 1);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10, (java.lang.Comparable) 0.0d);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.lang.Comparable comparable11 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, comparable11);
        java.lang.Comparable comparable13 = null;
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex(comparable13);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(range10);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        java.lang.Class<?> wildcardClass17 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener16);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        java.util.List list15 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 0L);
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
        org.junit.Assert.assertNull(number25);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        java.lang.Number number12 = null;
        defaultStatisticalCategoryDataset0.add(number12, (java.lang.Number) 1.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0d);
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((-1), 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range12 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (11.0) <= upper (9.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 0.0d);
        java.lang.Comparable comparable12 = null;
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, comparable12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(datasetGroup14);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        int int22 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1L));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 1, (java.lang.Number) Double.NaN, (java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable15 = null;
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue(comparable15, (java.lang.Comparable) 1);
        int int19 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset0.hasListener(eventListener20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener23);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) -1 + "'", comparable20, (short) -1);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset0.clone();
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Class<?> wildcardClass18 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        int int17 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (byte) 1);
        int int19 = defaultStatisticalCategoryDataset6.getRowIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset6.hasListener(eventListener12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 3, (java.lang.Number) 97.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 100);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset0.hasListener(eventListener17);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int20 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        org.jfree.data.Range range29 = defaultStatisticalCategoryDataset12.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener30);
        defaultStatisticalCategoryDataset12.validateObject();
        int int34 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(number27);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        defaultStatisticalCategoryDataset0.add((double) (-1), (double) (short) 10, (java.lang.Comparable) (short) 1, (java.lang.Comparable) (byte) 0);
        defaultStatisticalCategoryDataset0.add(35.0d, (double) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add(1.0d, (double) (-1L), (java.lang.Comparable) (short) -1, (java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultStatisticalCategoryDataset0.getMeanValue((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
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
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 2);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultStatisticalCategoryDataset0.getValue((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.hasListener(eventListener12);
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1L, (java.lang.Number) (-1L), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultStatisticalCategoryDataset0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((double) (-1L), 0.0d, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 'a');
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list10 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) (-1), (java.lang.Comparable) 10, (java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        int int12 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        defaultStatisticalCategoryDataset13.validateObject();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset13.hasListener(eventListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset13.validateObject();
        double double24 = defaultStatisticalCategoryDataset13.getRangeLowerBound(false);
        int int26 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (byte) -1);
        double double28 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) "");
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((-1), 0);
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
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertNull(number23);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.hasListener(eventListener12);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) 1, 35.0d, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        defaultStatisticalCategoryDataset0.add(10.0d, (double) 100L, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        int int15 = defaultStatisticalCategoryDataset0.getRowCount();
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener19);
        int int21 = defaultStatisticalCategoryDataset18.getColumnCount();
        boolean boolean22 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset4.getGroup();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        int int27 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10L, (java.lang.Comparable) 10);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertNotNull(datasetGroup26);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (-1.0f), (double) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Comparable comparable15 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0f, (java.lang.Number) (short) 10, comparable15, (java.lang.Comparable) true);
        org.jfree.data.Range range19 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100, (java.lang.Number) Double.NaN, (java.lang.Comparable) 100, (java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.hasListener(eventListener9);
        java.lang.Comparable comparable13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, (java.lang.Number) 32.0d, comparable13, (java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        int int28 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list29 = defaultStatisticalCategoryDataset12.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(number26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1.0f));
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int12 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(range10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        java.lang.Number number23 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) 0L, (java.lang.Comparable) 2);
        defaultStatisticalCategoryDataset4.add((java.lang.Number) 100.0d, (java.lang.Number) 0.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) 97.0d);
        defaultStatisticalCategoryDataset4.add((java.lang.Number) 32.0d, (java.lang.Number) 0.0d, (java.lang.Comparable) 10, (java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(number23);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset0.hasListener(eventListener25);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0d);
        defaultStatisticalCategoryDataset0.add((double) (short) 1, 0.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (short) 0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(datasetGroup20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(number25);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        double double13 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10.0f);
        defaultStatisticalCategoryDataset0.add((double) (-1), (double) (byte) 0, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNull(number5);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add(Double.NaN, (double) (byte) -1, (java.lang.Comparable) 0L, (java.lang.Comparable) (short) -1);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0, comparable21);
        int int23 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultStatisticalCategoryDataset0.getRowKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, number9, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset0.hasListener(eventListener17);
        int int20 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultStatisticalCategoryDataset0.getStdDevValue(1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(datasetGroup10);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj4 = defaultStatisticalCategoryDataset0.clone();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset0.hasListener(eventListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, number9, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int21 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset0.hasListener(eventListener22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultStatisticalCategoryDataset0.getMeanValue((int) '4', (int) (short) 0);
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
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset0.hasListener(eventListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        defaultStatisticalCategoryDataset0.add(0.0d, (double) (byte) 0, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0d);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0d, (java.lang.Number) (-1.0d), (java.lang.Comparable) "hi!", (java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1));
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((double) ' ', (double) 'a', (java.lang.Comparable) true, (java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list23 = defaultStatisticalCategoryDataset0.getColumnKeys();
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
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        int int9 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.util.List list10 = defaultStatisticalCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset6.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        org.jfree.data.Range range29 = defaultStatisticalCategoryDataset12.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener30);
        defaultStatisticalCategoryDataset12.validateObject();
        defaultStatisticalCategoryDataset12.add((double) (byte) 0, (double) (short) 0, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1));
        java.lang.Number number40 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(number27);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertNull(number40);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double16 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double18 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int2 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultStatisticalCategoryDataset0.getGroup();
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1, (java.lang.Comparable) (short) 0);
        java.lang.Comparable comparable11 = null;
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 0.0f, comparable11, (java.lang.Comparable) '4');
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0L, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        double double24 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        int int15 = defaultStatisticalCategoryDataset0.getRowCount();
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) (byte) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(number19);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals(obj9);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 'a');
        double double17 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100, (java.lang.Comparable) 100.0f);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100, (java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1);
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
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        int int19 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list20 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Class<?> wildcardClass21 = defaultStatisticalCategoryDataset4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) Double.NaN, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 100);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 3, (java.lang.Comparable) "");
        int int15 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int24 = defaultStatisticalCategoryDataset23.getColumnCount();
        int int26 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset23.getGroup();
        java.util.List list28 = defaultStatisticalCategoryDataset23.getColumnKeys();
        int int29 = defaultStatisticalCategoryDataset23.getRowCount();
        defaultStatisticalCategoryDataset23.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        org.jfree.data.Range range36 = defaultStatisticalCategoryDataset23.getRangeBounds(false);
        boolean boolean37 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) range36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number40 = defaultStatisticalCategoryDataset0.getStdDevValue(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        org.jfree.data.Range range29 = defaultStatisticalCategoryDataset12.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener30);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list33 = defaultStatisticalCategoryDataset32.getRowKeys();
        defaultStatisticalCategoryDataset32.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int39 = defaultStatisticalCategoryDataset32.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset32.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup40);
        int int43 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) 32.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(number27);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(datasetGroup40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        double double9 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 32.0d, (java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        java.lang.Object obj31 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = defaultStatisticalCategoryDataset0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int7 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10.0f);
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) '4', (double) '#', (java.lang.Comparable) 3, (java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int7 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10.0f);
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        double double16 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultStatisticalCategoryDataset3.getMeanValue(3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
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
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 100.0f, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 10.0f);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset0.hasListener(eventListener24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = defaultStatisticalCategoryDataset0.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0f), (java.lang.Number) 32.0d, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (byte) -1);
        int int27 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list28 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (-1));
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 10, (java.lang.Number) 0.0d, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getStdDevValue(0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        defaultStatisticalCategoryDataset0.add((double) (short) -1, (-1.0d), (java.lang.Comparable) (short) 1, (java.lang.Comparable) "");
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number24 = defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
        java.util.List list25 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double27 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup21);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        defaultStatisticalCategoryDataset3.add((double) (short) 100, (double) (byte) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1);
        int int13 = defaultStatisticalCategoryDataset3.getColumnIndex((java.lang.Comparable) false);
        int int15 = defaultStatisticalCategoryDataset3.getColumnIndex((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        int int15 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) false);
        double double17 = defaultStatisticalCategoryDataset6.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
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
        org.junit.Assert.assertNull(number21);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 10.0d);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultStatisticalCategoryDataset0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener24);
        java.util.List list26 = defaultStatisticalCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultStatisticalCategoryDataset0.getStdDevValue(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '#', (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        defaultStatisticalCategoryDataset0.add((double) 3, (double) 2, (java.lang.Comparable) 97.0d, (java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        double double20 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        java.util.List list25 = defaultStatisticalCategoryDataset22.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset26.addChangeListener(datasetChangeListener27);
        int int29 = defaultStatisticalCategoryDataset26.getColumnCount();
        java.util.List list30 = defaultStatisticalCategoryDataset26.getColumnKeys();
        java.lang.Number number33 = defaultStatisticalCategoryDataset26.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int35 = defaultStatisticalCategoryDataset26.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean36 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset26.removeChangeListener(datasetChangeListener37);
        int int39 = defaultStatisticalCategoryDataset26.getRowCount();
        java.util.List list40 = defaultStatisticalCategoryDataset26.getColumnKeys();
        boolean boolean41 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(number33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener1);
        java.lang.Comparable comparable3 = null;
        int int4 = defaultStatisticalCategoryDataset0.getRowIndex(comparable3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '#', (java.lang.Comparable) Double.NaN);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 32.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) (short) 1);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset0.getGroup();
        double double26 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        int int27 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (-1.0f));
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
        org.junit.Assert.assertNull(number25);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj4 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset0.hasListener(eventListener20);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Class<?> wildcardClass23 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 10.0d);
        double double11 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultStatisticalCategoryDataset0.getStdDevValue((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
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
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 100.0f, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 10.0f);
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 0);
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 'a', (java.lang.Comparable) 97.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(number26);
        org.junit.Assert.assertNull(number29);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1L, (java.lang.Number) 2, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((double) (byte) 0, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener24);
        java.lang.Object obj26 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (-1.0f), (double) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 10);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0L, (java.lang.Number) 1L, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        int int30 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        java.lang.Number number33 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(number33);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (-1));
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 10, (java.lang.Number) 0.0d, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        java.lang.Comparable comparable19 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 32.0d, (java.lang.Number) 100.0d, comparable19, (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) 1.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) Double.NaN);
        double double23 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener24);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Comparable comparable27 = null;
        int int28 = defaultStatisticalCategoryDataset0.getRowIndex(comparable27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset8.hasListener(eventListener29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 10L);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Comparable comparable11 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) -1, comparable11);
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1, (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNull(number23);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list9 = defaultStatisticalCategoryDataset8.getRowKeys();
        defaultStatisticalCategoryDataset8.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int15 = defaultStatisticalCategoryDataset8.getColumnCount();
        java.lang.Number number18 = defaultStatisticalCategoryDataset8.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double20 = defaultStatisticalCategoryDataset8.getRangeLowerBound(false);
        java.util.List list21 = defaultStatisticalCategoryDataset8.getColumnKeys();
        defaultStatisticalCategoryDataset8.add((double) (byte) -1, Double.NaN, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        double double28 = defaultStatisticalCategoryDataset8.getRangeUpperBound(false);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((-1), (int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener16);
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
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
        org.junit.Assert.assertNotNull(datasetGroup15);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        int int21 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj22 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) -1 + "'", comparable20, (short) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) '4');
        java.lang.Comparable comparable12 = null;
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) ' ', (java.lang.Comparable) (byte) 10, comparable12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(datasetGroup14);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((double) (-1L), 0.0d, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        defaultStatisticalCategoryDataset14.validateObject();
        java.lang.Number number20 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        int int22 = defaultStatisticalCategoryDataset14.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup23);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.Range range11 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj27 = defaultStatisticalCategoryDataset0.clone();
        int int28 = defaultStatisticalCategoryDataset0.getRowCount();
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
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        java.lang.Object obj16 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Class<?> wildcardClass9 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        defaultStatisticalCategoryDataset3.add((double) (short) 100, (double) (byte) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1);
        double double13 = defaultStatisticalCategoryDataset3.getRangeUpperBound(false);
        java.util.List list14 = defaultStatisticalCategoryDataset3.getRowKeys();
        java.util.List list15 = defaultStatisticalCategoryDataset3.getRowKeys();
        java.util.List list16 = defaultStatisticalCategoryDataset3.getRowKeys();
        defaultStatisticalCategoryDataset3.validateObject();
        int int18 = defaultStatisticalCategoryDataset3.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultStatisticalCategoryDataset0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultStatisticalCategoryDataset0.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        int int15 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int2 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double4 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = null; // flaky: defaultStatisticalCategoryDataset0.getStdDevValue((int) (short) 1, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 1, (java.lang.Number) Double.NaN, (java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) -1);
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        java.util.List list25 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener26);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener28);
        int int31 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        java.util.List list6 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0d), (java.lang.Number) (short) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 100);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) 10.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 'a');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        int int25 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultStatisticalCategoryDataset0.getStdDevValue((int) '#', (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) '#');
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj8 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset15.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset15.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number34 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number37 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        int int38 = defaultStatisticalCategoryDataset15.getRowCount();
        defaultStatisticalCategoryDataset15.add((double) (short) 10, 100.0d, (java.lang.Comparable) (short) 10, (java.lang.Comparable) "hi!");
        java.util.EventListener eventListener44 = null;
        boolean boolean45 = defaultStatisticalCategoryDataset15.hasListener(eventListener44);
        boolean boolean46 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) boolean45);
        int int47 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNull(number34);
        org.junit.Assert.assertNull(number37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(range20);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Comparable comparable17 = null;
        defaultStatisticalCategoryDataset0.add((double) (byte) 1, 100.0d, comparable17, (java.lang.Comparable) (byte) 10);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 1, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultStatisticalCategoryDataset0.hasListener(eventListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        defaultStatisticalCategoryDataset0.validateObject();
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 32.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultStatisticalCategoryDataset0.getStdDevValue(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10L, (java.lang.Comparable) 10);
        java.lang.Comparable comparable19 = null;
        defaultStatisticalCategoryDataset0.add(0.0d, 97.0d, (java.lang.Comparable) (byte) 1, comparable19);
        int int21 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 10.0d);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int21 = defaultStatisticalCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset15.removeChangeListener(datasetChangeListener22);
        java.lang.Number number26 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int27 = defaultStatisticalCategoryDataset15.getColumnCount();
        org.jfree.data.Range range29 = defaultStatisticalCategoryDataset15.getRangeBounds(false);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = defaultStatisticalCategoryDataset0.getMeanValue(100, 1);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(number26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) false);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) 1, (java.lang.Comparable) 100, (java.lang.Comparable) (short) 0);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(number8);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        java.lang.Comparable comparable29 = null;
        java.lang.Number number30 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 100, comparable29);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(datasetGroup27);
        org.junit.Assert.assertNull(number30);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        java.lang.Comparable comparable11 = null;
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 0L, (java.lang.Comparable) '4', comparable11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range12 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, comparable8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset0.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 3, (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double13 = defaultStatisticalCategoryDataset8.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int15 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int17 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset8.setGroup(datasetGroup18);
        java.util.List list20 = defaultStatisticalCategoryDataset8.getColumnKeys();
        int int22 = defaultStatisticalCategoryDataset8.getRowIndex((java.lang.Comparable) 0);
        int int24 = defaultStatisticalCategoryDataset8.getRowIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset8.add((double) ' ', (double) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup30);
        org.junit.Assert.assertNull(number34);
        org.junit.Assert.assertNotNull(datasetGroup35);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        int int19 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset0.hasListener(eventListener19);
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 'a', (java.lang.Comparable) 0.0d, (java.lang.Comparable) 2);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = null; // flaky: defaultStatisticalCategoryDataset0.getValue((int) (byte) -1, (int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        java.lang.Comparable comparable15 = null;
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0f, comparable15);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        java.lang.Number number34 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) '#', (java.lang.Comparable) 2);
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
        org.junit.Assert.assertNull(number34);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        int int24 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultStatisticalCategoryDataset0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 2");
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
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list13 = defaultStatisticalCategoryDataset12.getRowKeys();
        defaultStatisticalCategoryDataset12.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int19 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number22 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset12.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset12.hasListener(eventListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup30);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset0.getGroup();
        int int34 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(datasetGroup30);
        org.junit.Assert.assertNotNull(datasetGroup32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 100, (java.lang.Number) 35.0d, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        java.lang.Object obj11 = defaultStatisticalCategoryDataset4.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int2 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double4 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Class<?> wildcardClass5 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        java.util.List list21 = defaultStatisticalCategoryDataset4.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        int int9 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.util.List list10 = defaultStatisticalCategoryDataset6.getRowKeys();
        java.lang.Class<?> wildcardClass11 = defaultStatisticalCategoryDataset6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj2 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range4 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(range4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        double double9 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener21);
        double double24 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultStatisticalCategoryDataset0.getValue(2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener18);
        int int20 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list21 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Class<?> wildcardClass22 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1L);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((double) (byte) 1, (double) 'a', (java.lang.Comparable) 10L, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable23 = defaultStatisticalCategoryDataset0.getColumnKey(0);
        int int24 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 10.0f + "'", comparable23, 10.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        int int28 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) (-1));
        int int29 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = null; // flaky: defaultStatisticalCategoryDataset13.getValue((int) (byte) -1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
            java.lang.Number number16 = defaultStatisticalCategoryDataset6.getMeanValue((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
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
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        java.util.List list16 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultStatisticalCategoryDataset8.getRowKey(0);
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
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 0);
        java.lang.Comparable comparable19 = null;
        int int20 = defaultStatisticalCategoryDataset0.getColumnIndex(comparable19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset10.addChangeListener(datasetChangeListener11);
        int int13 = defaultStatisticalCategoryDataset10.getColumnCount();
        java.util.List list14 = defaultStatisticalCategoryDataset10.getColumnKeys();
        java.lang.Number number17 = defaultStatisticalCategoryDataset10.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int19 = defaultStatisticalCategoryDataset10.getColumnIndex((java.lang.Comparable) 100L);
        int int21 = defaultStatisticalCategoryDataset10.getColumnIndex((java.lang.Comparable) 10.0d);
        double double23 = defaultStatisticalCategoryDataset10.getRangeUpperBound(true);
        int int24 = defaultStatisticalCategoryDataset10.getRowCount();
        java.util.List list25 = defaultStatisticalCategoryDataset10.getRowKeys();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset10);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset10.getGroup();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(datasetGroup27);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener17);
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
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        java.lang.Number number32 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 3, (java.lang.Comparable) 2);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(number32);
        org.junit.Assert.assertNotNull(datasetGroup33);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) 0L);
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) false, (java.lang.Comparable) 10.0f);
        int int15 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) Double.NaN, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 100);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 3, (java.lang.Comparable) "");
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 'a');
        int int19 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(datasetGroup18);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        defaultStatisticalCategoryDataset0.add((double) ' ', (double) 100L, (java.lang.Comparable) 1L, (java.lang.Comparable) 'a');
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 97.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 100, (java.lang.Number) Double.NaN, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 97.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset26.hasListener(eventListener27);
        java.util.List list29 = defaultStatisticalCategoryDataset26.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset30.addChangeListener(datasetChangeListener31);
        int int33 = defaultStatisticalCategoryDataset30.getColumnCount();
        java.util.List list34 = defaultStatisticalCategoryDataset30.getColumnKeys();
        java.lang.Number number37 = defaultStatisticalCategoryDataset30.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int39 = defaultStatisticalCategoryDataset30.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean40 = defaultStatisticalCategoryDataset26.equals((java.lang.Object) defaultStatisticalCategoryDataset30);
        defaultStatisticalCategoryDataset30.validateObject();
        defaultStatisticalCategoryDataset30.add((java.lang.Number) 100.0f, (java.lang.Number) 100L, (java.lang.Comparable) "hi!", (java.lang.Comparable) ' ');
        org.jfree.data.Range range48 = defaultStatisticalCategoryDataset30.getRangeBounds(true);
        boolean boolean49 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(number37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        java.lang.Class<?> wildcardClass21 = defaultStatisticalCategoryDataset0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        defaultStatisticalCategoryDataset0.add((double) (short) -1, (-1.0d), (java.lang.Comparable) (short) 1, (java.lang.Comparable) "");
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list22 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list23 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultStatisticalCategoryDataset6.getStdDevValue((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultStatisticalCategoryDataset0.hasListener(eventListener6);
        double double9 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.equals(obj8);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10, (java.lang.Number) 10L, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 10);
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int16 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 3, (java.lang.Comparable) 'a', (java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) '#');
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int22 = defaultStatisticalCategoryDataset21.getColumnCount();
        java.lang.Number number25 = defaultStatisticalCategoryDataset21.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int26 = defaultStatisticalCategoryDataset21.getColumnCount();
        defaultStatisticalCategoryDataset21.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number34 = defaultStatisticalCategoryDataset21.getMeanValue((int) (byte) 0, (int) (short) 0);
        java.lang.Number number37 = defaultStatisticalCategoryDataset21.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (-1L));
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        java.lang.Number number41 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable43 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(number34);
        org.junit.Assert.assertNull(number37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(number41);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        java.util.List list18 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        int int20 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        double double16 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int17 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) '4', (java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultStatisticalCategoryDataset0.getRowKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        defaultStatisticalCategoryDataset0.add((double) (short) 0, (double) 10, (java.lang.Comparable) (-1), (java.lang.Comparable) 0);
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
        defaultStatisticalCategoryDataset12.add(Double.NaN, 0.0d, (java.lang.Comparable) 10, (java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = defaultStatisticalCategoryDataset12.getValue((int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, number9, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset0.hasListener(eventListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue(10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 100.0f);
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset0.hasListener(eventListener18);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0d), (java.lang.Number) (short) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0d, (java.lang.Number) Double.NaN, (java.lang.Comparable) 1, (java.lang.Comparable) (byte) 1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10.0f, (java.lang.Number) (-1L), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) true);
        java.util.List list28 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Comparable comparable29 = null;
        java.lang.Number number31 = defaultStatisticalCategoryDataset0.getStdDevValue(comparable29, (java.lang.Comparable) 100.0d);
        java.lang.Number number34 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) Double.NaN);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(number31);
        org.junit.Assert.assertNull(number34);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener9);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 35.0d, (java.lang.Comparable) (-1.0d));
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 10.0d);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        int int15 = defaultStatisticalCategoryDataset0.getRowCount();
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(range15);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset0.getGroup();
        int int22 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        int int23 = defaultStatisticalCategoryDataset0.getColumnCount();
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
        org.junit.Assert.assertNotNull(datasetGroup20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(datasetGroup18);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        defaultStatisticalCategoryDataset0.add(0.0d, (double) (byte) 0, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0d);
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset0.hasListener(eventListener11);
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 32.0d);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 3, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        defaultStatisticalCategoryDataset0.add((double) (short) 0, (double) (-1), (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 35.0d);
        int int28 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1, (java.lang.Number) (-1.0f), (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 97.0d);
        int int24 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1, (java.lang.Number) 1, (java.lang.Comparable) 100.0d, (java.lang.Comparable) '4');
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass18 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(datasetGroup17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list5 = defaultStatisticalCategoryDataset4.getRowKeys();
        double double7 = defaultStatisticalCategoryDataset4.getRangeUpperBound(false);
        double double9 = defaultStatisticalCategoryDataset4.getRangeUpperBound(true);
        int int10 = defaultStatisticalCategoryDataset4.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset4.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup11);
        defaultStatisticalCategoryDataset0.add(100.0d, (double) (short) 100, (java.lang.Comparable) 100, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset0.hasListener(eventListener18);
        int int21 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(datasetGroup11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        defaultStatisticalCategoryDataset3.add((java.lang.Number) 0L, (java.lang.Number) 0L, (java.lang.Comparable) 10L, (java.lang.Comparable) 0.0f);
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset3.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) 1.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) Double.NaN);
        double double23 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener24);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100);
        int int31 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNull(number29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((double) 3, (double) '4', (java.lang.Comparable) 100.0d, (java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultStatisticalCategoryDataset0.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10, (java.lang.Comparable) Double.NaN);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = number18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(datasetGroup11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultStatisticalCategoryDataset0.setGroup(datasetGroup4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'group' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        java.util.List list23 = defaultStatisticalCategoryDataset4.getColumnKeys();
        org.jfree.data.Range range25 = defaultStatisticalCategoryDataset4.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultStatisticalCategoryDataset4.getMeanValue(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset0.hasListener(eventListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) Double.NaN, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 100);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) -1);
        double double20 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        double double22 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 2, (java.lang.Comparable) 1, (java.lang.Comparable) 'a');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1.0f));
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number19 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double21 = defaultStatisticalCategoryDataset16.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup26);
        int int29 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) '#');
        int int30 = defaultStatisticalCategoryDataset16.getRowCount();
        defaultStatisticalCategoryDataset16.add((double) '4', (double) 0L, (java.lang.Comparable) (-1L), (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset38 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultStatisticalCategoryDataset38.addChangeListener(datasetChangeListener39);
        int int41 = defaultStatisticalCategoryDataset38.getColumnCount();
        java.lang.Number number44 = defaultStatisticalCategoryDataset38.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset38.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset38.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int56 = defaultStatisticalCategoryDataset38.getColumnIndex((java.lang.Comparable) 0.0f);
        java.lang.Comparable comparable57 = null;
        java.lang.Number number59 = defaultStatisticalCategoryDataset38.getStdDevValue(comparable57, (java.lang.Comparable) 1);
        java.lang.Object obj60 = defaultStatisticalCategoryDataset38.clone();
        boolean boolean61 = defaultStatisticalCategoryDataset0.equals(obj60);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(datasetGroup36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(number44);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(number59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        int int23 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1), (java.lang.Number) 10.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue(1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 1, (java.lang.Number) 100, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (-1.0f));
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0f, (java.lang.Number) 100.0f, (java.lang.Comparable) 2, (java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (short) 1);
        defaultStatisticalCategoryDataset0.validateObject();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        java.util.List list10 = defaultStatisticalCategoryDataset7.getColumnKeys();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset7.hasListener(eventListener11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset7.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup13);
        int int15 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset3.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset3.getStdDevValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 97.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 100, (java.lang.Number) 10.0f, (java.lang.Comparable) (short) 0, (java.lang.Comparable) ' ');
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset12.getGroup();
        java.lang.Number number28 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(datasetGroup25);
        org.junit.Assert.assertNull(number28);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        double double11 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
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
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1), (java.lang.Number) 10.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
        int int28 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) (-1));
        int int29 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = defaultStatisticalCategoryDataset13.getValue((int) (byte) 100, (int) (byte) 100);
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
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range11 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultStatisticalCategoryDataset0.getStdDevValue((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int7 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 'a', (double) (byte) 100, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 0.0f);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultStatisticalCategoryDataset0.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 3, (java.lang.Number) 97.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 100);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset0.hasListener(eventListener17);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultStatisticalCategoryDataset0.getColumnKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset3.hasListener(eventListener7);
        defaultStatisticalCategoryDataset3.add((java.lang.Number) 0.0f, (java.lang.Number) 10L, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        java.util.List list23 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double25 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
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
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int22 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(range20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((double) 0L, 32.0d, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (byte) 1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 1, (java.lang.Number) (byte) 1, (java.lang.Comparable) (-1L), (java.lang.Comparable) 1);
        int int29 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(number22);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset0.add((double) 100, (double) 1.0f, (java.lang.Comparable) true, (java.lang.Comparable) 0);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        java.lang.Comparable comparable22 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 0);
        double double24 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double26 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        int int27 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(datasetGroup20);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (-1L) + "'", comparable22, (-1L));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10L, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener18);
        int int20 = defaultStatisticalCategoryDataset0.getRowCount();
        double double22 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        java.util.List list21 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj22 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener27);
        java.lang.Number number31 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100, (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNull(number31);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number number11 = defaultStatisticalCategoryDataset3.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 10L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int7 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10L, (java.lang.Comparable) (short) 1);
        java.lang.Comparable comparable11 = null;
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue(comparable11, (java.lang.Comparable) 'a');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1), (java.lang.Number) 10, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
            java.lang.Number number23 = defaultStatisticalCategoryDataset0.getStdDevValue(1, (int) 'a');
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
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double13 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener14);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((int) (short) 0, (int) (byte) 0);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) '#', (java.lang.Comparable) (byte) 1);
        defaultStatisticalCategoryDataset0.add((double) (byte) 0, (double) 1.0f, (java.lang.Comparable) 10, (java.lang.Comparable) 0L);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset0.hasListener(eventListener24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener19);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(datasetGroup17);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        java.lang.Comparable comparable24 = defaultStatisticalCategoryDataset0.getColumnKey(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (byte) -1 + "'", comparable24, (byte) -1);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
        int int26 = defaultStatisticalCategoryDataset0.getRowCount();
        double double28 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        defaultStatisticalCategoryDataset0.add(0.0d, (double) (byte) 0, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0d);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable2 = null;
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getValue(comparable2, (java.lang.Comparable) (-1));
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list6 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultStatisticalCategoryDataset0.getMeanValue((int) (short) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(number24);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        java.lang.Class<?> wildcardClass15 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.util.List list20 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) "");
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 35.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertNull(number26);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        java.lang.Object obj33 = defaultStatisticalCategoryDataset0.clone();
        int int34 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(number32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) 1.0f, (double) ' ', (java.lang.Comparable) false, (java.lang.Comparable) (short) -1);
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNull(number19);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        defaultStatisticalCategoryDataset3.add((double) (short) 100, (double) (byte) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1);
        int int13 = defaultStatisticalCategoryDataset3.getColumnIndex((java.lang.Comparable) false);
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        double double17 = defaultStatisticalCategoryDataset3.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        int int35 = defaultStatisticalCategoryDataset0.getColumnCount();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 2, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener19);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
        org.jfree.data.Range range33 = defaultStatisticalCategoryDataset12.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(range26);
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable34 = defaultStatisticalCategoryDataset0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 3");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        java.lang.Object obj25 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) '4', (java.lang.Comparable) 1L, (java.lang.Comparable) (-1.0d));
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
        defaultStatisticalCategoryDataset0.validateObject();
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        java.lang.Comparable comparable10 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0d), (java.lang.Number) 10.0d, (java.lang.Comparable) (byte) 10, comparable10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        double double34 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertNotNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(number32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 100.0f);
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 0.0d);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) true, (java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, (java.lang.Comparable) '4', (java.lang.Comparable) '#');
        java.lang.Comparable comparable13 = null;
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex(comparable13);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        defaultStatisticalCategoryDataset15.validateObject();
        java.util.List list19 = defaultStatisticalCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset15.removeChangeListener(datasetChangeListener20);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        boolean boolean26 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) int25);
        int int27 = defaultStatisticalCategoryDataset15.getRowCount();
        double double29 = defaultStatisticalCategoryDataset15.getRangeUpperBound(true);
        java.lang.Number number32 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) 10, (java.lang.Comparable) '#');
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        int int34 = defaultStatisticalCategoryDataset15.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNull(number32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) -1);
        double double20 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        double double22 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1), (java.lang.Number) 0, (java.lang.Comparable) (short) 100, (java.lang.Comparable) "");
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10L, (java.lang.Number) 1, (java.lang.Comparable) "", (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj2 = defaultStatisticalCategoryDataset0.clone();
        double double4 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        int int7 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 35.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1L, (java.lang.Number) (-1L), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 10.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        defaultStatisticalCategoryDataset12.validateObject();
        java.util.List list16 = defaultStatisticalCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener17);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        int int22 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) 0);
        boolean boolean23 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) int22);
        defaultStatisticalCategoryDataset12.add((double) 'a', (double) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        java.util.List list29 = defaultStatisticalCategoryDataset12.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener30);
        boolean boolean32 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = defaultStatisticalCategoryDataset0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
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
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        double double18 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
        java.lang.Number number23 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) 0L, (java.lang.Comparable) 2);
        defaultStatisticalCategoryDataset4.add((java.lang.Number) 100.0d, (java.lang.Number) 0.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) 97.0d);
        org.jfree.data.Range range30 = defaultStatisticalCategoryDataset4.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset4.removeChangeListener(datasetChangeListener31);
        int int33 = defaultStatisticalCategoryDataset4.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Comparable comparable8 = null;
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue(comparable8, (java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = null; // flaky: defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) -1, (int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 32.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list11 = defaultStatisticalCategoryDataset10.getRowKeys();
        defaultStatisticalCategoryDataset10.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int17 = defaultStatisticalCategoryDataset10.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset10.getGroup();
        int int20 = defaultStatisticalCategoryDataset10.getRowIndex((java.lang.Comparable) (short) 0);
        int int22 = defaultStatisticalCategoryDataset10.getRowIndex((java.lang.Comparable) '#');
        java.lang.Number number25 = defaultStatisticalCategoryDataset10.getMeanValue((java.lang.Comparable) 100L, (java.lang.Comparable) 100.0f);
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) number25);
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 10);
        java.util.List list30 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) -1, (java.lang.Number) (short) 100, (java.lang.Comparable) (short) 10, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(number29);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1), (java.lang.Number) 1L, (java.lang.Comparable) 1.0f, (java.lang.Comparable) 'a');
        int int23 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
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
            java.lang.Number number23 = defaultStatisticalCategoryDataset0.getStdDevValue((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
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
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Comparable comparable14 = null;
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex(comparable14);
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener9);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset11.hasListener(eventListener12);
        defaultStatisticalCategoryDataset11.validateObject();
        java.lang.Number number17 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset11.removeChangeListener(datasetChangeListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) "hi!");
        boolean boolean23 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) number22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range11 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1), (java.lang.Comparable) 10);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0L, (java.lang.Comparable) 10);
        defaultStatisticalCategoryDataset0.add((double) 0L, (double) 'a', (java.lang.Comparable) 100, (java.lang.Comparable) 35.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultStatisticalCategoryDataset0.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) -1 + "'", comparable20, (short) -1);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getStdDevValue((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener9);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) 1.0d, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (byte) -1);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number15 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int17 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int18 = defaultStatisticalCategoryDataset12.getColumnCount();
        defaultStatisticalCategoryDataset12.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset24.hasListener(eventListener25);
        java.lang.Number number29 = defaultStatisticalCategoryDataset24.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset24.validateObject();
        org.jfree.data.Range range32 = defaultStatisticalCategoryDataset24.getRangeBounds(true);
        int int33 = defaultStatisticalCategoryDataset24.getColumnCount();
        java.lang.Number number36 = defaultStatisticalCategoryDataset24.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int38 = defaultStatisticalCategoryDataset24.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list39 = defaultStatisticalCategoryDataset24.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup40);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup40);
        java.lang.Number number45 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(number29);
        org.junit.Assert.assertNull(range32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(number36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(datasetGroup40);
        org.junit.Assert.assertNull(number45);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list10 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Comparable comparable14 = null;
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex(comparable14);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable13 = null;
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, comparable13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "", (java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.lang.Comparable comparable11 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, comparable11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (short) 10);
        int int19 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 32.0d, (java.lang.Comparable) (byte) 0);
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue((int) (short) 100, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNull(range16);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Comparable comparable7 = null;
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex(comparable7);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 0);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        org.jfree.data.Range range19 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener20);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(range19);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.util.List list19 = defaultStatisticalCategoryDataset15.getColumnKeys();
        java.lang.Number number22 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset15.getGroup();
        int int24 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number27 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (short) 100);
        double double29 = defaultStatisticalCategoryDataset15.getRangeLowerBound(false);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) double29);
        java.util.EventListener eventListener31 = null;
        boolean boolean32 = defaultStatisticalCategoryDataset0.hasListener(eventListener31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertNotNull(datasetGroup23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(number27);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultStatisticalCategoryDataset0.getStdDevValue(1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range5);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        int int28 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) (-1));
        int int29 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int31 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) 35.0d);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) "hi!");
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.hasListener(eventListener12);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 0L, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (short) 0);
        double double20 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        double double28 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable29 = null;
        int int30 = defaultStatisticalCategoryDataset0.getColumnIndex(comparable29);
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 32.0d + "'", double28 == 32.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10.0f, (java.lang.Number) 97.0d, (java.lang.Comparable) 97.0d, (java.lang.Comparable) "");
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
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
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset3.getGroup();
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(datasetGroup14);
        org.junit.Assert.assertNull(range16);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add(1.0d, (double) (-1L), (java.lang.Comparable) (short) -1, (java.lang.Comparable) 1.0f);
        int int28 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.lang.Comparable comparable11 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, comparable11);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 1);
        java.lang.Comparable comparable16 = defaultStatisticalCategoryDataset0.getColumnKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultStatisticalCategoryDataset0.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 10.0d + "'", comparable16, 10.0d);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        java.lang.Comparable comparable17 = null;
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, comparable17);
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
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultStatisticalCategoryDataset0.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
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
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultStatisticalCategoryDataset0.hasListener(eventListener5);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) 0.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 'a');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) 0, (java.lang.Comparable) 100L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        defaultStatisticalCategoryDataset18.validateObject();
        double double23 = defaultStatisticalCategoryDataset18.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list25 = defaultStatisticalCategoryDataset24.getRowKeys();
        defaultStatisticalCategoryDataset24.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int31 = defaultStatisticalCategoryDataset24.getColumnCount();
        java.lang.Number number34 = defaultStatisticalCategoryDataset24.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset24.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener40 = null;
        boolean boolean41 = defaultStatisticalCategoryDataset24.hasListener(eventListener40);
        org.jfree.data.general.DatasetGroup datasetGroup42 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup42);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup42);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(number34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(datasetGroup42);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        double double16 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Comparable comparable11 = null;
        java.lang.Comparable comparable12 = null;
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue(comparable11, comparable12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        java.lang.Comparable comparable10 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0d), (java.lang.Number) 10.0d, (java.lang.Comparable) (byte) 10, comparable10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = null; // flaky: defaultStatisticalCategoryDataset0.getRowKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset0.hasListener(eventListener7);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultStatisticalCategoryDataset0.hasListener(eventListener5);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list8 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int11 = defaultStatisticalCategoryDataset10.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset10.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int15 = defaultStatisticalCategoryDataset10.getColumnCount();
        defaultStatisticalCategoryDataset10.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number23 = defaultStatisticalCategoryDataset10.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int24 = defaultStatisticalCategoryDataset10.getColumnCount();
        boolean boolean25 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset10);
        double double27 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue(3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(number20);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        double double11 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.hasListener(eventListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultStatisticalCategoryDataset0.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj8 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(range10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        java.lang.Comparable comparable19 = null;
        java.lang.Number number20 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 35.0d, comparable19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(number20);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
        java.util.List list25 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
        java.lang.Object obj16 = defaultStatisticalCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10, (java.lang.Number) (short) 10, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 100);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double13 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        int int21 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj22 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj23 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) -1 + "'", comparable20, (short) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) '4');
        java.lang.Comparable comparable12 = null;
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) ' ', (java.lang.Comparable) (byte) 10, comparable12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1), (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue(1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
        int int23 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int24 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable26 = defaultStatisticalCategoryDataset0.getColumnKey(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 'a' + "'", comparable26, 'a');
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10.0f);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        defaultStatisticalCategoryDataset0.add(0.0d, 100.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.lang.Comparable comparable11 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), comparable11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((int) (short) 0, (int) (byte) 0);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, (java.lang.Number) 1L, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 10);
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset0.hasListener(eventListener21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 2);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj4 = defaultStatisticalCategoryDataset0.clone();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
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
        java.util.List list22 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) "");
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        double double16 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue(3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        double double9 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
        double double33 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = null; // flaky: defaultStatisticalCategoryDataset0.getColumnKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        java.lang.Object obj22 = defaultStatisticalCategoryDataset0.clone();
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
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 2, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener27);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number26);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultStatisticalCategoryDataset0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = null; // flaky: defaultStatisticalCategoryDataset0.getMeanValue((int) (short) -1, 2);
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
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "", (java.lang.Comparable) 2);
        defaultStatisticalCategoryDataset0.add(35.0d, (double) (byte) 0, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) -1);
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (byte) 0);
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultStatisticalCategoryDataset0.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(datasetGroup17);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10, (java.lang.Comparable) '#');
        java.util.List list18 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double20 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        defaultStatisticalCategoryDataset0.add((double) (byte) 0, (double) (byte) 10, (java.lang.Comparable) false, (java.lang.Comparable) 0L);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener19);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(datasetGroup18);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultStatisticalCategoryDataset0.getColumnKey(3);
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
    }
}
