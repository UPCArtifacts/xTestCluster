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
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(comparable0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class<?> wildcardClass4 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(regularTimePeriod6, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(regularTimePeriod8, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Class<?> wildcardClass15 = timeSeries10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(1, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries13.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeSeries10.getIndex(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class<?> wildcardClass22 = timeSeries17.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(regularTimePeriod6, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str29 = timeSeries19.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null; // flaky: timeSeries19.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod15, (double) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod10, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries3.getValue(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod11, (double) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((int) (short) -1, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        java.lang.Class<?> wildcardClass17 = timeSeries10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(regularTimePeriod2, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries3.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(timeSeriesDataItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update((int) (byte) 0, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null; // flaky: timeSeries1.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        java.lang.String str11 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        java.lang.Class class6 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) 10, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.delete(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, (java.lang.Number) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries21.addOrUpdate(regularTimePeriod22, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete((int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        timeSeries17.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod24, (java.lang.Number) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount((int) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod8, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod5, (double) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries3.getValue(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        java.lang.Class class6 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries3.getValue(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries3.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries19.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        timeSeries17.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update(regularTimePeriod24, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod29, (double) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        boolean boolean18 = timeSeries10.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod19, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeSeries3.getIndex(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.update((int) (short) -1, (java.lang.Number) 10.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getDataItem(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        boolean boolean9 = timeSeries3.equals((java.lang.Object) "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod14, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        java.lang.String str5 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        boolean boolean15 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries3.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries8.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod3, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null; // flaky: timeSeries3.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(timeSeriesDataItem30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((int) (short) -1, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.update(100, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries19.addOrUpdate(regularTimePeriod30, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.update(regularTimePeriod29, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries10.addOrUpdate(timeSeriesDataItem18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod29, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(regularTimePeriod8, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod11, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        boolean boolean15 = timeSeries3.getNotify();
        java.lang.String str16 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        timeSeries17.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries25 = timeSeries17.addAndOrUpdate(timeSeries24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries10.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str12 = timeSeries11.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries18.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        timeSeries17.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(timeSeriesDataItem24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.getDataItem(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = timeSeries3.getValue(regularTimePeriod33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy(2147483647, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        boolean boolean9 = timeSeries3.equals((java.lang.Object) "");
        timeSeries3.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        timeSeries34.removeAgedItems(true);
        timeSeries34.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number42 = timeSeries3.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = timeSeries1.getValue(regularTimePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = null; // flaky: timeSeries3.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries19.addOrUpdate(timeSeriesDataItem25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = timeSeries17.getIndex(regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy((int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null; // flaky: timeSeries13.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeSeries3.getIndex(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str29 = timeSeries19.getDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries19.addOrUpdate(timeSeriesDataItem30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(false);
        double double6 = timeSeries3.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries3.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str12 = timeSeries11.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries18.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries22.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        timeSeries8.setRangeDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        java.lang.Number number10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, number10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        long long13 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((int) (byte) -1, (int) (short) 1, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries3.setDescription("");
        timeSeries3.setDomainDescription("Time");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        timeSeries3.removeAgedItems((long) 1, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        double double9 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod15, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        timeSeries21.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = timeSeries21.getTimePeriod(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (double) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = timeSeries19.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        java.lang.String str30 = timeSeries19.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod31, (java.lang.Number) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (java.lang.Number) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = timeSeries21.getIndex(regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        int int43 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean45 = timeSeries44.getNotify();
        java.util.Collection collection46 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries21.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str53 = timeSeries52.getDomainDescription();
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries21.addAndOrUpdate(timeSeries52);
        java.util.Collection collection59 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries62 = timeSeries10.createCopy((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(collection59);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        java.lang.Object obj11 = timeSeries3.clone();
        timeSeries3.setKey((java.lang.Comparable) (-1L));
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "Overwritten values from: 10", "");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        boolean boolean7 = timeSeries3.isEmpty();
        java.lang.Object obj8 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = timeSeries36.isEmpty();
        timeSeries36.clear();
        int int41 = timeSeries36.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.addAndOrUpdate(timeSeries36);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = timeSeries42.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (double) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list15 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        double double15 = timeSeries3.getMinY();
        boolean boolean16 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = timeSeries3.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str12 = timeSeries11.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries18.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(100, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.update(regularTimePeriod22, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "", "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update((int) (short) 100, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (double) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        timeSeries3.removeAgedItems((long) 1, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) 10, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries3.getValue(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        boolean boolean7 = timeSeries3.isEmpty();
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '#', (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        timeSeries19.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod28, (double) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        double double7 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(regularTimePeriod8, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        java.util.Collection collection12 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(2147483647, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        timeSeries19.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod28, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        timeSeries3.removeAgedItems(true);
        timeSeries3.fireSeriesChanged();
        java.lang.Class<?> wildcardClass8 = timeSeries3.getClass();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str12 = timeSeries11.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries18.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries11);
        timeSeries11.setMaximumItemAge((long) (short) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod25, (java.lang.Number) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod14, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.util.Collection collection29 = timeSeries19.getTimePeriods();
        int int30 = timeSeries19.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection24 = timeSeries14.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries14.addOrUpdate(timeSeriesDataItem25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str12 = timeSeries11.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries18.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.add(regularTimePeriod23, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getDataItem(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries3.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod11, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries3.addOrUpdate(timeSeriesDataItem33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        int int15 = timeSeries10.getItemCount();
        timeSeries10.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.createCopy((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        java.lang.Class class6 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) ' ', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries3.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        boolean boolean9 = timeSeries3.equals((java.lang.Object) "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        java.util.Collection collection12 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod13, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy((int) (short) 0, (int) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.addOrUpdate(regularTimePeriod14, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection12 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        double double9 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries24.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        java.util.Collection collection32 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        int int33 = timeSeries24.getMaximumItemCount();
        java.lang.Class<?> wildcardClass34 = timeSeries24.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        java.lang.Number number15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.addOrUpdate(regularTimePeriod14, number15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str29 = timeSeries19.getDescription();
        int int30 = timeSeries19.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries19.addOrUpdate(regularTimePeriod31, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        timeSeries3.setRangeDescription("");
        java.lang.Class<?> wildcardClass17 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.addOrUpdate(regularTimePeriod4, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = null; // flaky: timeSeries1.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        int int25 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) ' ', (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        timeSeries32.setRangeDescription("hi!");
        java.util.Collection collection36 = timeSeries32.getTimePeriods();
        java.lang.Comparable comparable37 = timeSeries32.getKey();
        boolean boolean38 = timeSeries3.equals((java.lang.Object) comparable37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod39, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 10L + "'", comparable37, 10L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries10.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        timeSeries10.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update(10, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        int int14 = timeSeries11.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries11.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.addAndOrUpdate(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update(0, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        timeSeries12.setRangeDescription("hi!");
        boolean boolean16 = timeSeries3.equals((java.lang.Object) "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy(regularTimePeriod11, regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        int int7 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy((int) (byte) -1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries3.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "hi!");
        timeSeries3.setMaximumItemCount((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries3.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 100, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        timeSeries3.removeAgedItems((long) 100, false);
        double double12 = timeSeries3.getMaxY();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str29 = timeSeries19.getDescription();
        int int30 = timeSeries19.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.delete((int) (short) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        int int25 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemAge(0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries3.addOrUpdate(regularTimePeriod28, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        java.util.List list2 = timeSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        java.lang.Comparable comparable31 = timeSeries3.getKey();
        java.lang.Object obj32 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries3.addOrUpdate(regularTimePeriod33, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 10L + "'", comparable31, 10L);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries3.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str29 = timeSeries19.getDescription();
        java.lang.Comparable comparable30 = timeSeries19.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.update((int) (byte) 100, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + "Overwritten values from: 10" + "'", comparable30, "Overwritten values from: 10");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(false);
        double double6 = timeSeries3.getMinY();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, (java.lang.Number) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        java.lang.String str30 = timeSeries19.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy(1, (int) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries33.add(regularTimePeriod34, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod25, (java.lang.Number) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.createCopy(regularTimePeriod10, regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.clear();
        java.lang.Number number15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '#', number15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        boolean boolean15 = timeSeries3.getNotify();
        java.lang.String str16 = timeSeries3.getRangeDescription();
        java.util.List list17 = timeSeries3.getItems();
        double double18 = timeSeries3.getMinY();
        java.lang.Class<?> wildcardClass19 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.createCopy((int) '4', (int) '4');
        timeSeries17.setDomainDescription("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        timeSeries34.removeAgedItems(true);
        timeSeries34.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number42 = timeSeries34.getValue(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) 0, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        timeSeries34.removeAgedItems(true);
        timeSeries34.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries3.getDataItem(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod13, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries3.setDescription("");
        timeSeries3.removeAgedItems((long) (byte) 1, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries3.getValue(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(regularTimePeriod11, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (java.lang.Number) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        int int14 = timeSeries11.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries11.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.util.List list18 = timeSeries11.getItems();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries11.addOrUpdate(timeSeriesDataItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries3.addOrUpdate(timeSeriesDataItem35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        boolean boolean14 = timeSeries10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries10.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        double double9 = timeSeries3.getMaxY();
        boolean boolean10 = timeSeries3.isEmpty();
        java.lang.Class class11 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((-1), (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = timeSeries3.getIndex(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) ' ', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(timeSeriesDataItem14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection24 = timeSeries14.getTimePeriods();
        timeSeries14.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries14.addOrUpdate(regularTimePeriod27, Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        timeSeries3.setMaximumItemAge((long) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries3.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        boolean boolean11 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod15, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries10.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.createCopy(0, 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.update(regularTimePeriod19, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod18, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        int int24 = timeSeries21.getMaximumItemCount();
        java.lang.String str25 = timeSeries21.getRangeDescription();
        java.lang.Comparable comparable26 = timeSeries21.getKey();
        java.lang.Object obj27 = timeSeries21.clone();
        boolean boolean28 = timeSeries10.equals((java.lang.Object) timeSeries21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.delete(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 10L + "'", comparable26, 10L);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        double double22 = timeSeries21.getMinY();
        java.lang.String str23 = timeSeries21.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.update(100, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.String str29 = timeSeries26.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(regularTimePeriod30, (java.lang.Number) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, (java.lang.Number) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        timeSeries3.setMaximumItemAge((long) 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod11, (double) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries8.addOrUpdate(regularTimePeriod9, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        int int7 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        java.lang.String str30 = timeSeries19.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy(1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null; // flaky: timeSeries19.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        java.lang.Object obj11 = timeSeries3.clone();
        timeSeries3.setKey((java.lang.Comparable) (-1L));
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, number13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        double double7 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries3.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.createCopy((int) (byte) 10, (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries28 = timeSeries21.addAndOrUpdate(timeSeries27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        long long13 = timeSeries3.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod16, (java.lang.Number) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        int int24 = timeSeries21.getMaximumItemCount();
        java.lang.String str25 = timeSeries21.getRangeDescription();
        java.lang.Comparable comparable26 = timeSeries21.getKey();
        java.lang.Object obj27 = timeSeries21.clone();
        boolean boolean28 = timeSeries10.equals((java.lang.Object) timeSeries21);
        boolean boolean29 = timeSeries21.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(timeSeriesDataItem30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 10L + "'", comparable26, 10L);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        int int25 = timeSeries3.getItemCount();
        boolean boolean26 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem27, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        int int7 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeSeries3.getIndex(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.createCopy((int) (byte) 10, (int) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(regularTimePeriod27, (java.lang.Number) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries3.addOrUpdate(regularTimePeriod29, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries3.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        timeSeries12.setRangeDescription("hi!");
        boolean boolean16 = timeSeries3.equals((java.lang.Object) "hi!");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str21 = timeSeries20.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries27.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries20.addAndOrUpdate(timeSeries27);
        java.util.List list31 = timeSeries27.getItems();
        java.lang.Object obj32 = null;
        boolean boolean33 = timeSeries27.equals(obj32);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries3.addAndOrUpdate(timeSeries27);
        java.lang.String str35 = timeSeries27.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries38 = timeSeries27.createCopy((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list15 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries3.getDataItem(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries3.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = timeSeries19.getValue(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getDataItem(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        int int43 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean45 = timeSeries44.getNotify();
        java.util.Collection collection46 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries21.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str53 = timeSeries52.getDomainDescription();
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries21.addAndOrUpdate(timeSeries52);
        java.util.Collection collection59 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        int int60 = timeSeries10.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod61, (double) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        timeSeries34.removeAgedItems(true);
        timeSeries34.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries34);
        java.lang.Class<?> wildcardClass41 = timeSeries34.getClass();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(regularTimePeriod29, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        java.lang.Class class6 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        long long13 = timeSeries3.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries3.removeChangeListener(seriesChangeListener16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod18, (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 100 + "'", comparable9, 100);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = timeSeries36.isEmpty();
        timeSeries36.clear();
        int int41 = timeSeries36.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries46.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries46.createCopy((int) (short) 10, (int) ' ');
        boolean boolean52 = timeSeries3.equals((java.lang.Object) timeSeries46);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries46.add(regularTimePeriod53, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        java.lang.Object obj11 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (java.lang.Number) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries3.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10L + "'", comparable6, 10L);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        java.lang.String str30 = timeSeries19.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy(1, (int) (byte) 10);
        int int34 = timeSeries19.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.delete((int) 'a', (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        int int14 = timeSeries11.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries11.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries3.addOrUpdate(timeSeriesDataItem18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries3.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        int int8 = timeSeries3.getItemCount();
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod11, (java.lang.Number) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null; // flaky: timeSeries1.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod35, (double) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        timeSeries3.setKey((java.lang.Comparable) 10.0f);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        timeSeries3.removeAgedItems((long) 'a', false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (java.lang.Number) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.lang.String str9 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        timeSeries32.setRangeDescription("hi!");
        java.util.Collection collection36 = timeSeries32.getTimePeriods();
        java.lang.Comparable comparable37 = timeSeries32.getKey();
        boolean boolean38 = timeSeries3.equals((java.lang.Object) comparable37);
        timeSeries3.removeAgedItems((long) 100, true);
        java.lang.Object obj42 = timeSeries3.clone();
        java.lang.String str43 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 10L + "'", comparable37, 10L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        long long9 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.createCopy((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount((int) (short) 10);
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        double double9 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod10, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        timeSeries10.removeAgedItems(10L, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = timeSeries10.getIndex(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        java.lang.String str8 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str29 = timeSeries19.getDescription();
        java.lang.Comparable comparable30 = timeSeries19.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(timeSeriesDataItem31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + "Overwritten values from: 10" + "'", comparable30, "Overwritten values from: 10");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        double double9 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(regularTimePeriod10, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        timeSeries34.removeAgedItems(true);
        timeSeries34.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.add(timeSeriesDataItem41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.createCopy((int) (byte) 10, (int) (short) 100);
        timeSeries26.setMaximumItemAge((long) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries26.getDataItem(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        timeSeries1.setKey((java.lang.Comparable) 9223372036854775807L);
        boolean boolean6 = timeSeries1.getNotify();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        java.util.Collection collection12 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod13, (java.lang.Number) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        timeSeries3.removeAgedItems((long) 1, false);
        java.util.List list12 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries3.setDescription("");
        timeSeries3.setDomainDescription("Time");
        int int19 = timeSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries3.setDescription("");
        timeSeries3.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries3.getDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "Overwritten values from: 10");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        double double9 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.delete(10, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        timeSeries3.setKey((java.lang.Comparable) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (double) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        int int24 = timeSeries21.getMaximumItemCount();
        java.lang.String str25 = timeSeries21.getRangeDescription();
        java.lang.Comparable comparable26 = timeSeries21.getKey();
        java.lang.Object obj27 = timeSeries21.clone();
        boolean boolean28 = timeSeries10.equals((java.lang.Object) timeSeries21);
        java.lang.String str29 = timeSeries21.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod30, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 10L + "'", comparable26, 10L);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries17.setMaximumItemCount((int) (short) 0);
        java.lang.Object obj24 = timeSeries17.clone();
        long long25 = timeSeries17.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update((int) (short) 100, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9223372036854775807L + "'", long25 == 9223372036854775807L);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries10.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.createCopy(0, 0);
        timeSeries10.setMaximumItemCount((int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries10.addOrUpdate(regularTimePeriod21, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.addOrUpdate(regularTimePeriod12, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        boolean boolean15 = timeSeries3.getNotify();
        int int16 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod17, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (java.lang.Number) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        double double9 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.isEmpty();
        java.lang.String str12 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.fireSeriesChanged();
        java.util.List list4 = timeSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null; // flaky: timeSeries1.getDataItem((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = timeSeries36.isEmpty();
        timeSeries36.clear();
        int int41 = timeSeries36.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = timeSeries3.getIndex(regularTimePeriod43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.delete((int) (byte) 1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        int int24 = timeSeries21.getMaximumItemCount();
        java.lang.String str25 = timeSeries21.getRangeDescription();
        java.lang.Comparable comparable26 = timeSeries21.getKey();
        java.lang.Object obj27 = timeSeries21.clone();
        boolean boolean28 = timeSeries10.equals((java.lang.Object) timeSeries21);
        boolean boolean29 = timeSeries21.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.delete((int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 10L + "'", comparable26, 10L);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) '#', (int) 'a');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = null; // flaky: timeSeries3.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.List list8 = timeSeries3.getItems();
        java.lang.String str9 = timeSeries3.getDescription();
        java.util.Collection collection10 = timeSeries3.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        timeSeries3.removeAgedItems((long) 100, false);
        java.lang.String str12 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries3.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        timeSeries3.removeAgedItems((long) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((int) (byte) -1, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDomainDescription("");
        int int11 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection24 = timeSeries14.getTimePeriods();
        timeSeries14.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries14.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        double double9 = timeSeries3.getMaxY();
        boolean boolean10 = timeSeries3.isEmpty();
        java.lang.Class class11 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) 1, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries3.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = timeSeries36.isEmpty();
        timeSeries36.clear();
        int int41 = timeSeries36.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries46.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries46.createCopy((int) (short) 10, (int) ' ');
        boolean boolean52 = timeSeries3.equals((java.lang.Object) timeSeries46);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem54 = timeSeries3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str29 = timeSeries19.getDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.setNotify(false);
        timeSeries33.setMaximumItemCount((int) (short) 10);
        boolean boolean38 = timeSeries19.equals((java.lang.Object) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.delete(regularTimePeriod39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.lang.Object obj9 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        double double22 = timeSeries21.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = timeSeries21.getValue(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        long long13 = timeSeries3.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        int int22 = timeSeries19.getMaximumItemCount();
        timeSeries19.setKey((java.lang.Comparable) 100);
        java.lang.String str25 = timeSeries19.getRangeDescription();
        int int26 = timeSeries19.getItemCount();
        timeSeries19.removeAgedItems(true);
        timeSeries19.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list31 = timeSeries19.getItems();
        timeSeries19.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries3.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries19.addOrUpdate(regularTimePeriod35, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) 1, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        timeSeries16.fireSeriesChanged();
        boolean boolean19 = timeSeries3.equals((java.lang.Object) timeSeries16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null; // flaky: timeSeries16.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod22, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        int int43 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean45 = timeSeries44.getNotify();
        java.util.Collection collection46 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries21.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str53 = timeSeries52.getDomainDescription();
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries21.addAndOrUpdate(timeSeries52);
        java.util.Collection collection59 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries10.removeChangeListener(seriesChangeListener60);
        java.lang.Object obj62 = timeSeries10.clone();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem63 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries17.setMaximumItemCount((int) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries27.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.createCopy((int) (short) 10, (int) ' ');
        timeSeries27.setDescription("hi!");
        timeSeries27.setKey((java.lang.Comparable) 100);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries17.addAndOrUpdate(timeSeries27);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener38);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries37.delete((int) (short) 1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        java.lang.String str30 = timeSeries19.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null; // flaky: timeSeries19.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(regularTimePeriod8, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries3.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        int int24 = timeSeries21.getMaximumItemCount();
        java.lang.String str25 = timeSeries21.getRangeDescription();
        java.lang.Comparable comparable26 = timeSeries21.getKey();
        java.lang.Object obj27 = timeSeries21.clone();
        boolean boolean28 = timeSeries10.equals((java.lang.Object) timeSeries21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries21.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 10L + "'", comparable26, 10L);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        int int43 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean45 = timeSeries44.getNotify();
        java.util.Collection collection46 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries21.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str53 = timeSeries52.getDomainDescription();
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries21.addAndOrUpdate(timeSeries52);
        java.util.Collection collection59 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        java.lang.String str60 = timeSeries52.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries52.getDataItem(regularTimePeriod61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(timeSeriesDataItem25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemCount((int) (byte) 0);
        timeSeries3.setKey((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection24 = timeSeries14.getTimePeriods();
        timeSeries14.setMaximumItemAge((long) 10);
        java.util.Collection collection27 = timeSeries14.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = timeSeries36.isEmpty();
        timeSeries36.clear();
        int int41 = timeSeries36.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.addAndOrUpdate(timeSeries36);
        timeSeries3.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries47 = timeSeries3.createCopy(regularTimePeriod45, regularTimePeriod46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (double) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemCount(1);
        timeSeries3.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) 'a', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries3.setDescription("");
        timeSeries3.removeAgedItems((long) (byte) 1, true);
        java.util.List list20 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = timeSeries3.getIndex(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        int int43 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean45 = timeSeries44.getNotify();
        java.util.Collection collection46 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries21.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str53 = timeSeries52.getDomainDescription();
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries21.addAndOrUpdate(timeSeries52);
        java.util.Collection collection59 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        int int60 = timeSeries10.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries10.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries12.removeAgedItems(true);
        int int15 = timeSeries12.getMaximumItemCount();
        timeSeries12.setKey((java.lang.Comparable) 100);
        int int18 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries12.addOrUpdate(regularTimePeriod20, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete((int) (short) 10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.List list8 = timeSeries3.getItems();
        java.lang.String str9 = timeSeries3.getDescription();
        java.util.Collection collection10 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy(regularTimePeriod11, regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        int int4 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj5 = timeSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries1.delete((-1), 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        java.lang.String str10 = timeSeries8.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries8.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) '#', (int) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (double) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        java.util.Collection collection12 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        java.lang.Class<?> wildcardClass13 = collection12.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        java.lang.String str15 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries3.getValue(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        timeSeries3.setMaximumItemAge(0L);
        java.lang.Class<?> wildcardClass6 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        int int25 = timeSeries3.getItemCount();
        timeSeries3.setDomainDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(false);
        double double6 = timeSeries3.getMinY();
        java.util.List list7 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) 'a', (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(regularTimePeriod10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemCount(1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeSeries3.getIndex(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        java.lang.String str5 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class10 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries28.removeAgedItems(true);
        int int31 = timeSeries28.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries24.addAndOrUpdate(timeSeries28);
        boolean boolean33 = timeSeries32.getNotify();
        java.util.Collection collection34 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        boolean boolean44 = timeSeries9.equals((java.lang.Object) comparable43);
        timeSeries9.removeAgedItems((long) 100, true);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection50 = timeSeries49.getTimePeriods();
        timeSeries49.fireSeriesChanged();
        java.lang.String str52 = timeSeries49.getDescription();
        boolean boolean53 = timeSeries9.equals((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries3.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod56 = timeSeries54.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        double double9 = timeSeries3.getMaxY();
        boolean boolean10 = timeSeries3.isEmpty();
        java.lang.Class class11 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemCount(1);
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries3.getDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        timeSeries12.setRangeDescription("hi!");
        boolean boolean16 = timeSeries3.equals((java.lang.Object) "hi!");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str21 = timeSeries20.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries27.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries20.addAndOrUpdate(timeSeries27);
        java.util.List list31 = timeSeries27.getItems();
        java.lang.Object obj32 = null;
        boolean boolean33 = timeSeries27.equals(obj32);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries3.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries34.update(regularTimePeriod35, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        timeSeries8.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod12, (java.lang.Number) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        int int43 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean45 = timeSeries44.getNotify();
        java.util.Collection collection46 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries21.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str53 = timeSeries52.getDomainDescription();
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries21.addAndOrUpdate(timeSeries52);
        java.util.Collection collection59 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        int int60 = timeSeries10.getItemCount();
        timeSeries10.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries65 = timeSeries10.createCopy(regularTimePeriod63, regularTimePeriod64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        int int14 = timeSeries11.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries11.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.addAndOrUpdate(timeSeries11);
        timeSeries17.removeAgedItems((long) (byte) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = null; // flaky: timeSeries17.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        java.lang.String str30 = timeSeries19.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy(1, (int) (byte) 10);
        int int34 = timeSeries19.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(timeSeriesDataItem35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        java.util.Collection collection15 = timeSeries3.getTimePeriods();
        java.lang.Class<?> wildcardClass16 = timeSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((-1), (int) (byte) 1, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.lang.Object obj6 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries21 = timeSeries10.createCopy(regularTimePeriod19, regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod12, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        int int23 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries21.addOrUpdate(regularTimePeriod24, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.removeChangeListener(seriesChangeListener3);
        timeSeries1.setDescription("Overwritten values from: Overwritten values from: 10");
        boolean boolean7 = timeSeries1.getNotify();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        timeSeries32.setRangeDescription("hi!");
        java.util.Collection collection36 = timeSeries32.getTimePeriods();
        java.lang.Comparable comparable37 = timeSeries32.getKey();
        boolean boolean38 = timeSeries3.equals((java.lang.Object) comparable37);
        timeSeries3.removeAgedItems((long) 100, true);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection44 = timeSeries43.getTimePeriods();
        timeSeries43.fireSeriesChanged();
        java.lang.String str46 = timeSeries43.getDescription();
        boolean boolean47 = timeSeries3.equals((java.lang.Object) timeSeries43);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 10L + "'", comparable37, 10L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount((int) (short) 10);
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        double double9 = timeSeries3.getMaxY();
        double double10 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        boolean boolean11 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy(regularTimePeriod12, regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries3.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class33 = timeSeries32.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str38 = timeSeries37.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries44.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries37.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries51.removeAgedItems(true);
        int int54 = timeSeries51.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries47.addAndOrUpdate(timeSeries51);
        boolean boolean56 = timeSeries55.getNotify();
        java.util.Collection collection57 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        timeSeries32.setDomainDescription("Overwritten values from: 10");
        java.util.Collection collection60 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries64.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str71 = timeSeries70.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        timeSeries70.addPropertyChangeListener(propertyChangeListener72);
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries77.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries70.addAndOrUpdate(timeSeries77);
        org.jfree.data.time.TimeSeries timeSeries84 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries84.removeAgedItems(true);
        int int87 = timeSeries84.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries88 = timeSeries80.addAndOrUpdate(timeSeries84);
        java.util.Collection collection89 = timeSeries64.getTimePeriodsUniqueToOtherSeries(timeSeries80);
        java.util.Collection collection90 = timeSeries80.getTimePeriods();
        int int91 = timeSeries80.getItemCount();
        java.util.Collection collection92 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries80);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem93 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries80.add(timeSeriesDataItem93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2147483647 + "'", int87 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries88);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(collection92);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        java.lang.String str5 = timeSeries3.getDescription();
        timeSeries3.setRangeDescription("Time");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "hi!");
        timeSeries3.setMaximumItemCount((int) (short) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries10.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.createCopy(0, 0);
        timeSeries10.setMaximumItemCount((int) ' ');
        timeSeries10.setDomainDescription("Value");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries16.addPropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = timeSeries16.getItems();
        timeSeries16.removeAgedItems(false);
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries3.getDataItem(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = timeSeries3.getItems();
        boolean boolean8 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        int int8 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries3.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        int int14 = timeSeries11.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries11.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.addAndOrUpdate(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update((int) (short) 10, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemCount(1);
        timeSeries3.fireSeriesChanged();
        long long18 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        java.lang.String str15 = timeSeries3.getDomainDescription();
        timeSeries3.setKey((java.lang.Comparable) (byte) 0);
        java.lang.Class<?> wildcardClass18 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (double) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null; // flaky: timeSeries3.getDataItem((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        boolean boolean9 = timeSeries3.equals((java.lang.Object) "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemAge((long) 100);
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.removeChangeListener(seriesChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null; // flaky: timeSeries1.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", "Value", "hi!");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        java.lang.Object obj5 = timeSeries3.clone();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (double) 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries17.setMaximumItemCount((int) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries27.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.createCopy((int) (short) 10, (int) ' ');
        timeSeries27.setDescription("hi!");
        timeSeries27.setKey((java.lang.Comparable) 100);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries17.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = timeSeries27.getDataItem(regularTimePeriod38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((int) (byte) -1, (int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        timeSeries3.setMaximumItemCount(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        timeSeries16.fireSeriesChanged();
        boolean boolean19 = timeSeries3.equals((java.lang.Object) timeSeries16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod20, (double) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.util.Collection collection29 = timeSeries19.getTimePeriods();
        int int30 = timeSeries19.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod31, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries26.removeAgedItems(true);
        int int29 = timeSeries26.getMaximumItemCount();
        timeSeries26.setKey((java.lang.Comparable) 100);
        boolean boolean32 = timeSeries17.equals((java.lang.Object) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries17.removeChangeListener(seriesChangeListener33);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update((int) (short) 10, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries16.addPropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = timeSeries16.getItems();
        timeSeries16.removeAgedItems(false);
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries16.addOrUpdate(regularTimePeriod24, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(false);
        double double6 = timeSeries3.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str12 = timeSeries11.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries18.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries11);
        timeSeries11.setMaximumItemAge((long) (short) 1);
        java.util.Collection collection25 = timeSeries11.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener26);
        int int28 = timeSeries11.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod29, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        timeSeries32.setRangeDescription("hi!");
        java.util.Collection collection36 = timeSeries32.getTimePeriods();
        java.lang.Comparable comparable37 = timeSeries32.getKey();
        boolean boolean38 = timeSeries3.equals((java.lang.Object) comparable37);
        timeSeries3.removeAgedItems((long) 100, true);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection44 = timeSeries43.getTimePeriods();
        timeSeries43.fireSeriesChanged();
        java.lang.String str46 = timeSeries43.getDescription();
        boolean boolean47 = timeSeries3.equals((java.lang.Object) timeSeries43);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries43.addOrUpdate(regularTimePeriod48, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 10L + "'", comparable37, 10L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        boolean boolean7 = timeSeries3.isEmpty();
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        java.lang.String str5 = timeSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        boolean boolean15 = timeSeries3.getNotify();
        java.lang.String str16 = timeSeries3.getRangeDescription();
        java.util.List list17 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod9, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        long long13 = timeSeries3.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        int int22 = timeSeries19.getMaximumItemCount();
        timeSeries19.setKey((java.lang.Comparable) 100);
        java.lang.String str25 = timeSeries19.getRangeDescription();
        int int26 = timeSeries19.getItemCount();
        timeSeries19.removeAgedItems(true);
        timeSeries19.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list31 = timeSeries19.getItems();
        timeSeries19.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries3.addAndOrUpdate(timeSeries19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null; // flaky: timeSeries19.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        int int22 = timeSeries1.getItemCount();
        int int23 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries1.addOrUpdate(regularTimePeriod24, (double) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries3.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        timeSeries3.removeAgedItems((long) 'a', false);
        java.lang.Object obj12 = timeSeries3.clone();
        java.util.List list13 = timeSeries3.getItems();
        timeSeries3.setNotify(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        boolean boolean29 = timeSeries26.isEmpty();
        timeSeries26.removeAgedItems((long) '#', true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null; // flaky: timeSeries26.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(regularTimePeriod11, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        java.lang.String str11 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (double) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod15, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        timeSeries1.setKey((java.lang.Comparable) 9223372036854775807L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod6, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Value", "Overwritten values from: Overwritten values from: 10");
        timeSeries3.setMaximumItemAge((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        int int7 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems((long) (short) 100, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries3.setDescription("");
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries3.addChangeListener(seriesChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        java.lang.String str5 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(regularTimePeriod6, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries3.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        int int24 = timeSeries21.getMaximumItemCount();
        java.lang.String str25 = timeSeries21.getRangeDescription();
        java.lang.Comparable comparable26 = timeSeries21.getKey();
        java.lang.Object obj27 = timeSeries21.clone();
        boolean boolean28 = timeSeries10.equals((java.lang.Object) timeSeries21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries21.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 10L + "'", comparable26, 10L);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        double double4 = timeSeries1.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries3.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str29 = timeSeries19.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.delete((int) (short) 100, 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        timeSeries17.fireSeriesChanged();
        java.lang.String str24 = timeSeries17.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class17 = timeSeries16.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str22 = timeSeries21.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries21.addPropertyChangeListener(propertyChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries28.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries21.addAndOrUpdate(timeSeries28);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries35.removeAgedItems(true);
        int int38 = timeSeries35.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries31.addAndOrUpdate(timeSeries35);
        boolean boolean40 = timeSeries39.getNotify();
        java.util.Collection collection41 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        timeSeries16.setDomainDescription("Overwritten values from: 10");
        timeSeries16.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        timeSeries49.addPropertyChangeListener(propertyChangeListener50);
        boolean boolean52 = timeSeries49.isEmpty();
        timeSeries49.clear();
        int int54 = timeSeries49.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries16.addAndOrUpdate(timeSeries49);
        boolean boolean56 = timeSeries16.isEmpty();
        java.util.Collection collection57 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((-1), (int) (byte) 100, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        boolean boolean29 = timeSeries26.isEmpty();
        int int30 = timeSeries26.getMaximumItemCount();
        java.util.Collection collection31 = timeSeries26.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = timeSeries26.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = timeSeries3.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        java.lang.Object obj11 = timeSeries3.clone();
        timeSeries3.setKey((java.lang.Comparable) (-1L));
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        timeSeries3.removeAgedItems((long) (short) 1, true);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.List list21 = timeSeries17.getItems();
        java.lang.Object obj22 = null;
        boolean boolean23 = timeSeries17.equals(obj22);
        int int24 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class29 = timeSeries28.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str34 = timeSeries33.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries33.addPropertyChangeListener(propertyChangeListener35);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries40);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries47.removeAgedItems(true);
        int int50 = timeSeries47.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries43.addAndOrUpdate(timeSeries47);
        boolean boolean52 = timeSeries51.getNotify();
        java.util.Collection collection53 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        timeSeries28.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str60 = timeSeries59.getDomainDescription();
        timeSeries59.removeAgedItems(true);
        timeSeries59.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries28.addAndOrUpdate(timeSeries59);
        java.util.Collection collection66 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        java.util.Collection collection67 = timeSeries59.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries3.addAndOrUpdate(timeSeries59);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod69 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries59.add(regularTimePeriod69, (java.lang.Number) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(timeSeries68);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.List list8 = timeSeries3.getItems();
        java.lang.String str9 = timeSeries3.getDescription();
        timeSeries3.removeAgedItems((long) (short) 1, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        long long7 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries3.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setRangeDescription("Time");
        int int11 = timeSeries3.getItemCount();
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries3.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        boolean boolean18 = timeSeries10.getNotify();
        java.lang.String str19 = timeSeries10.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries10.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        int int7 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems((long) (short) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy(regularTimePeriod5, regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        int int2 = timeSeries1.getMaximumItemCount();
        boolean boolean3 = timeSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries1.addOrUpdate(timeSeriesDataItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "", "Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries16.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries23);
        java.lang.String str27 = timeSeries16.getDescription();
        timeSeries16.setMaximumItemCount(1);
        timeSeries16.removeAgedItems(true);
        boolean boolean32 = timeSeries3.equals((java.lang.Object) true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod33, (java.lang.Number) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = timeSeries21.getValue(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        timeSeries3.setMaximumItemAge((long) 2147483647);
        java.lang.String str11 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        java.util.Collection collection12 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries10.update((-1), (java.lang.Number) (-1.0f));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemCount(1);
        timeSeries3.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries3.removeChangeListener(seriesChangeListener19);
        timeSeries3.clear();
        java.lang.Class<?> wildcardClass22 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.getDataItem(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        java.util.List list23 = timeSeries21.getItems();
        boolean boolean24 = timeSeries21.getNotify();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "hi!");
        timeSeries3.setMaximumItemCount((int) (short) 100);
        java.lang.String str6 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        boolean boolean29 = timeSeries26.isEmpty();
        timeSeries26.removeAgedItems((long) '#', true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.update(1, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        int int25 = timeSeries3.getItemCount();
        boolean boolean26 = timeSeries3.getNotify();
        boolean boolean27 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(1, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        double double15 = timeSeries3.getMinY();
        boolean boolean16 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        int int15 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        int int23 = timeSeries21.getMaximumItemCount();
        int int24 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod25, (double) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.createCopy(0, 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, "Value", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(100, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        int int25 = timeSeries3.getItemCount();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        boolean boolean10 = timeSeries8.getNotify();
        boolean boolean11 = timeSeries8.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        timeSeries32.setRangeDescription("hi!");
        java.util.Collection collection36 = timeSeries32.getTimePeriods();
        java.lang.Comparable comparable37 = timeSeries32.getKey();
        boolean boolean38 = timeSeries3.equals((java.lang.Object) comparable37);
        timeSeries3.removeAgedItems((long) 100, true);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection44 = timeSeries43.getTimePeriods();
        timeSeries43.fireSeriesChanged();
        java.lang.String str46 = timeSeries43.getDescription();
        boolean boolean47 = timeSeries3.equals((java.lang.Object) timeSeries43);
        timeSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '#', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 10L + "'", comparable37, 10L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        java.lang.Object obj9 = timeSeries3.clone();
        long long10 = timeSeries3.getMaximumItemAge();
        java.lang.Class<?> wildcardClass11 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        java.lang.String str30 = timeSeries19.getRangeDescription();
        boolean boolean31 = timeSeries19.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(timeSeriesDataItem32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        java.util.List list23 = timeSeries21.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries21.addOrUpdate(regularTimePeriod24, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(list23);
    }
}
