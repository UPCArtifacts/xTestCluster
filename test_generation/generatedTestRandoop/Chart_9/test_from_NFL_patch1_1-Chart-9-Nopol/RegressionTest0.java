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
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(regularTimePeriod6, (java.lang.Number) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries12.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod13, (double) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(timeSeriesDataItem15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries11.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries2.update((-1), (java.lang.Number) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries2.addOrUpdate(regularTimePeriod11, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) '4', (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries5.addOrUpdate(regularTimePeriod7, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null; // flaky: timeSeries2.getDataItem((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries2.update((int) (short) -1, (java.lang.Number) (-1.0f));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod13, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.update(regularTimePeriod8, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.add(regularTimePeriod23, (java.lang.Number) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null; // flaky: timeSeries12.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries2.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod13, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries12.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeSeries2.getIndex(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod9, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = null; // flaky: timeSeries11.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        java.lang.Object obj13 = timeSeries2.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod14, (java.lang.Number) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.createCopy(regularTimePeriod15, regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod13, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries4.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod26, (double) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries33 = timeSeries2.createCopy(regularTimePeriod31, regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries2.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries4.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update(100, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries2.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) (byte) 10, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.clear();
        timeSeries2.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries15.createCopy(0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries15.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        timeSeries2.setMaximumItemCount((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Comparable comparable13 = timeSeries2.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries2.createCopy(regularTimePeriod14, regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod13, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries12.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(timeSeriesDataItem6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries15.getDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.List list10 = timeSeries2.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod12, number13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = timeSeries15.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        java.lang.Object obj13 = timeSeries2.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries15.createCopy(0, (int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod22, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        java.lang.String str11 = timeSeries2.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems((long) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1);
        timeSeries1.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod3, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod2, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        timeSeries11.setMaximumItemAge((long) (short) 100);
        timeSeries11.setRangeDescription("");
        java.util.List list22 = timeSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries11.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = timeSeries11.getValue(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        long long13 = timeSeries2.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries2.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "hi!", "Value", (java.lang.Class) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries17.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        timeSeries9.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries9.getDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod10, (java.lang.Number) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("");
        boolean boolean11 = timeSeries4.isEmpty();
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.setKey(comparable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod33, (java.lang.Number) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries2.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries2.delete((-1), (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeSeries12.getIndex(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.clear();
        java.util.List list14 = timeSeries2.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries2.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        long long23 = timeSeries22.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.removeAgedItems((long) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod5, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener12);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class17);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.addChangeListener(seriesChangeListener19);
        boolean boolean21 = timeSeries5.equals((java.lang.Object) timeSeries18);
        java.lang.String str22 = timeSeries5.getDomainDescription();
        java.util.Collection collection23 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries2.addOrUpdate(regularTimePeriod24, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries4.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.List list10 = timeSeries2.getItems();
        java.util.List list11 = timeSeries2.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        timeSeries11.setMaximumItemAge((long) (short) 100);
        timeSeries11.setRangeDescription("");
        java.util.List list22 = timeSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries11.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.delete(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod15, (java.lang.Number) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries2.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        timeSeries11.setMaximumItemAge((long) (short) 100);
        timeSeries11.setRangeDescription("");
        java.util.List list22 = timeSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries11.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.addAndOrUpdate(timeSeries11);
        long long26 = timeSeries25.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries25.addOrUpdate(regularTimePeriod27, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        timeSeries25.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries25.getDataItem(regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.clear();
        timeSeries2.setKey((java.lang.Comparable) 0);
        int int16 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(0, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        timeSeries2.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete((int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass14);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod18, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.util.Collection collection13 = timeSeries11.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod14, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        boolean boolean9 = timeSeries4.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod10, (double) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries5.addOrUpdate(regularTimePeriod8, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries12.getDataItem(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries12);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries15.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        java.lang.Comparable comparable33 = timeSeries25.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod34, (java.lang.Number) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + "Overwritten values from: 4" + "'", comparable33, "Overwritten values from: 4");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        timeSeries2.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries2.createCopy(regularTimePeriod15, regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        int int7 = timeSeries4.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod8, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        long long23 = timeSeries22.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.update((int) 'a', (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.List list10 = timeSeries2.getItems();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        timeSeries25.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.delete(regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        timeSeries25.setDescription("");
        java.lang.String str28 = timeSeries25.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries25.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Time" + "'", str28, "Time");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = timeSeries15.getIndex(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) 1);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.update(regularTimePeriod14, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        timeSeries25.clear();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener34);
        java.lang.Comparable comparable36 = timeSeries25.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod37, (double) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + "Overwritten values from: 4" + "'", comparable36, "Overwritten values from: 4");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.update((int) (short) 100, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        timeSeries11.setMaximumItemAge((long) (short) 100);
        timeSeries11.setRangeDescription("");
        java.util.List list22 = timeSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries11.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries25.addOrUpdate(regularTimePeriod26, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = timeSeries25.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries4.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setDescription("Time");
        java.lang.Comparable comparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.setKey(comparable17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        boolean boolean9 = timeSeries4.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod10, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.clear();
        java.lang.String str12 = timeSeries2.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries2.addOrUpdate(regularTimePeriod13, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Time");
        java.lang.Comparable comparable12 = timeSeries2.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + '4' + "'", comparable12, '4');
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries15.createCopy(0, (int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries21.getDataItem(regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod11, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod13, (double) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(10, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries12.removeChangeListener(seriesChangeListener15);
        timeSeries12.clear();
        timeSeries12.setMaximumItemCount((int) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update(regularTimePeriod20, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setDescription("Time");
        java.lang.String str17 = timeSeries2.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod18, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod13, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries11.getDataItem(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null; // flaky: timeSeries4.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod17, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        timeSeries25.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod34, (java.lang.Number) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        java.util.List list13 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.removeChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries2.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod17, (double) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Comparable comparable13 = timeSeries2.getKey();
        timeSeries2.setMaximumItemAge((long) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries2.getDataItem(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.clear();
        timeSeries2.setKey((java.lang.Comparable) 0);
        int int16 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = timeSeries2.getValue(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries12.removeChangeListener(seriesChangeListener15);
        timeSeries12.clear();
        timeSeries12.setMaximumItemCount((int) (short) 10);
        timeSeries12.setDescription("hi!");
        java.lang.Class<?> wildcardClass22 = timeSeries12.getClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Class class13 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries11.getDataItem(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries12.removeChangeListener(seriesChangeListener15);
        timeSeries12.clear();
        timeSeries12.setMaximumItemCount((int) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod20, (java.lang.Number) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, (java.lang.Class) wildcardClass32);
        java.lang.Object obj34 = timeSeries33.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = timeSeries33.getValue(regularTimePeriod35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        timeSeries9.setMaximumItemAge((long) (short) 100);
        java.lang.String str18 = timeSeries9.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries4.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries19.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("");
        boolean boolean11 = timeSeries4.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod12, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        timeSeries9.setMaximumItemAge((long) (short) 100);
        java.lang.String str18 = timeSeries9.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries4.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries9.getDataItem(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.update(regularTimePeriod26, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1);
        timeSeries1.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = timeSeries1.getIndex(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 1, (int) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries28.getDataItem(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries15.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setRangeDescription("Time");
        boolean boolean17 = timeSeries12.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries12.addOrUpdate(regularTimePeriod18, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        timeSeries11.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeSeries11.getIndex(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update(regularTimePeriod13, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries12.removeChangeListener(seriesChangeListener15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries12.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setDescription("hi!");
        timeSeries12.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod19, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        java.lang.String str19 = timeSeries2.getDomainDescription();
        java.lang.Class class20 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod21, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertNull(class20);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        timeSeries9.setMaximumItemAge((long) (short) 100);
        java.lang.String str18 = timeSeries9.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries4.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems((long) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        timeSeries5.setRangeDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.addAndOrUpdate(timeSeries9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + '4' + "'", comparable6, '4');
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str12 = timeSeries8.getRangeDescription();
        java.lang.Class<?> wildcardClass13 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Value", "Time", (java.lang.Class) wildcardClass13);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.update(regularTimePeriod18, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries2.addOrUpdate(regularTimePeriod11, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries2.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        long long10 = timeSeries2.getMaximumItemAge();
        boolean boolean11 = timeSeries2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = null; // flaky: timeSeries2.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        boolean boolean15 = timeSeries12.isEmpty();
        timeSeries12.fireSeriesChanged();
        boolean boolean17 = timeSeries12.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null; // flaky: timeSeries12.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        boolean boolean4 = timeSeries2.equals((java.lang.Object) (-1.0f));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries2.getValue(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        java.util.List list7 = timeSeries2.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.setMaximumItemAge((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries11.delete((int) (short) -1, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries2.addOrUpdate(regularTimePeriod13, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries12);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries15.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        timeSeries2.setMaximumItemCount((int) (short) 0);
        java.lang.String str16 = timeSeries2.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries2.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries12);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass14);
        timeSeries15.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null; // flaky: timeSeries15.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (double) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries9.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class26);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.addChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries27.getTimePeriods();
        timeSeries27.setNotify(true);
        boolean boolean33 = timeSeries11.equals((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.delete(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        boolean boolean13 = timeSeries2.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod14, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Comparable comparable13 = timeSeries2.getKey();
        java.lang.Class class14 = timeSeries2.getTimePeriodClass();
        java.lang.Class class15 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries2.getValue(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod18, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        java.lang.String str11 = timeSeries5.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries5.addOrUpdate(regularTimePeriod12, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setRangeDescription("Time");
        timeSeries12.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries12.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        java.lang.String str18 = timeSeries15.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries15.removeChangeListener(seriesChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries15.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.Comparable comparable0 = null;
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class3);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str8 = timeSeries4.getRangeDescription();
        java.lang.Class<?> wildcardClass9 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries(comparable0, (java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        long long23 = timeSeries22.getMaximumItemAge();
        timeSeries22.clear();
        timeSeries22.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.add(regularTimePeriod27, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        java.lang.Object obj14 = timeSeries2.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries2.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        boolean boolean9 = timeSeries4.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod10, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        long long23 = timeSeries22.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries22.addOrUpdate(regularTimePeriod24, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries12.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update(regularTimePeriod20, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries4.update((-1), (java.lang.Number) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        timeSeries25.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries25.addOrUpdate(regularTimePeriod34, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.removeAgedItems((long) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 1, (int) '4');
        int int29 = timeSeries25.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod30, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        boolean boolean13 = timeSeries2.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries2.createCopy((int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries10.getDataItem(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries2.getDataItem(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        java.lang.String str18 = timeSeries15.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries15.createCopy((int) (byte) 1, (int) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries4.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        java.util.List list13 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.addChangeListener(seriesChangeListener14);
        timeSeries2.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        java.lang.Object obj14 = timeSeries2.clone();
        timeSeries2.setMaximumItemCount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Time");
        java.lang.Comparable comparable12 = timeSeries2.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod13, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + '4' + "'", comparable12, '4');
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = timeSeries11.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.clear();
        timeSeries2.setKey((java.lang.Comparable) 0);
        int int16 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod17, (double) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener12);
        timeSeries5.setNotify(false);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "hi!", (java.lang.Class) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries17.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod31, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries2.addOrUpdate(regularTimePeriod12, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        java.util.List list7 = timeSeries2.getItems();
        timeSeries2.setKey((java.lang.Comparable) 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries33.add(timeSeriesDataItem34, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        java.lang.Object obj14 = timeSeries2.clone();
        timeSeries2.setMaximumItemCount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null; // flaky: timeSeries2.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        java.util.List list13 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.removeChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries2.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeSeries2.getIndex(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod15, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass6 = timeSeries2.getClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        int int7 = timeSeries4.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod8, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) (short) 0, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod9, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        boolean boolean13 = timeSeries2.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries2.createCopy((int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.removeAgedItems((long) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        java.util.List list7 = timeSeries2.getItems();
        int int8 = timeSeries2.getMaximumItemCount();
        java.lang.Comparable comparable9 = timeSeries2.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy(regularTimePeriod10, regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + '4' + "'", comparable9, '4');
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        int int7 = timeSeries4.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null; // flaky: timeSeries4.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        java.lang.String str11 = timeSeries5.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.update(regularTimePeriod12, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        long long19 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.createCopy((int) '4', (int) (byte) 10);
        timeSeries22.removeAgedItems(true);
        timeSeries22.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries4.addAndOrUpdate(timeSeries22);
        timeSeries27.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        timeSeries25.clear();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener34);
        boolean boolean36 = timeSeries25.getNotify();
        java.util.Collection collection37 = timeSeries25.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod38, (java.lang.Number) 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        boolean boolean9 = timeSeries4.getNotify();
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries21);
        java.util.Collection collection23 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries11.getDataItem(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str12 = timeSeries8.getRangeDescription();
        java.lang.Class<?> wildcardClass13 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Value", "Time", (java.lang.Class) wildcardClass13);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        timeSeries4.setMaximumItemCount((int) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod12, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        long long5 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = null; // flaky: timeSeries2.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries2.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        timeSeries5.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null; // flaky: timeSeries5.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + '4' + "'", comparable6, '4');
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries33 = timeSeries25.createCopy(regularTimePeriod31, regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        long long13 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(timeSeriesDataItem14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        timeSeries4.setNotify(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        long long19 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.createCopy((int) '4', (int) (byte) 10);
        timeSeries22.removeAgedItems(true);
        timeSeries22.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries4.addAndOrUpdate(timeSeries22);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.update((int) (byte) 100, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null; // flaky: timeSeries12.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        java.lang.String str18 = timeSeries15.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries15.createCopy((int) (byte) 1, (int) (byte) 10);
        long long22 = timeSeries15.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = null; // flaky: timeSeries15.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.delete((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries12);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, (java.lang.Class) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries15.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass14);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class19);
        timeSeries20.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries20.createCopy((int) (short) 1, (int) ' ');
        java.lang.Object obj26 = timeSeries20.clone();
        java.util.Collection collection27 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        java.lang.Comparable comparable31 = timeSeries2.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod32, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + '4' + "'", comparable31, '4');
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        long long13 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod14, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        timeSeries13.fireSeriesChanged();
        timeSeries13.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries13.addChangeListener(seriesChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null; // flaky: timeSeries13.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries11.createCopy(regularTimePeriod15, regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod10, (double) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        boolean boolean7 = timeSeries4.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries4.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries15.createCopy(0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries21.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod18, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        timeSeries12.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries12.addChangeListener(seriesChangeListener16);
        java.lang.String str18 = timeSeries12.getRangeDescription();
        java.lang.Object obj19 = timeSeries12.clone();
        java.lang.String str20 = timeSeries12.getDomainDescription();
        timeSeries12.setMaximumItemCount(10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod23, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        timeSeries2.setDescription("Value");
        timeSeries2.setMaximumItemAge((long) ' ');
        timeSeries2.setDomainDescription("");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        java.lang.String str19 = timeSeries2.getDomainDescription();
        timeSeries2.setDomainDescription("");
        java.util.Collection collection22 = timeSeries2.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.createCopy(regularTimePeriod23, regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        timeSeries11.setMaximumItemAge((long) (short) 100);
        timeSeries11.setRangeDescription("");
        java.util.List list22 = timeSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries11.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.addAndOrUpdate(timeSeries11);
        long long26 = timeSeries25.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.update(regularTimePeriod27, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries5.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        long long19 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.createCopy((int) '4', (int) (byte) 10);
        timeSeries22.removeAgedItems(true);
        timeSeries22.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries4.addAndOrUpdate(timeSeries22);
        boolean boolean28 = timeSeries4.isEmpty();
        timeSeries4.clear();
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, (java.lang.Class) wildcardClass32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries33.add(regularTimePeriod34, (java.lang.Number) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries2.getDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Comparable comparable13 = timeSeries2.getKey();
        java.lang.Class class14 = timeSeries2.getTimePeriodClass();
        java.lang.Class class15 = timeSeries2.getTimePeriodClass();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str25 = timeSeries21.getRangeDescription();
        java.lang.Class<?> wildcardClass26 = timeSeries21.getClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass26);
        timeSeries27.fireSeriesChanged();
        java.util.Collection collection29 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries2.addOrUpdate(regularTimePeriod30, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        boolean boolean9 = timeSeries4.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries4.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        timeSeries13.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(timeSeriesDataItem6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        boolean boolean13 = timeSeries2.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries2.getValue(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        timeSeries6.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener13);
        timeSeries6.setNotify(false);
        java.lang.Class<?> wildcardClass17 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Time", (java.lang.Class) wildcardClass17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod20, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        boolean boolean15 = timeSeries12.isEmpty();
        timeSeries12.fireSeriesChanged();
        java.util.List list17 = timeSeries12.getItems();
        timeSeries12.setMaximumItemCount((int) '4');
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        java.lang.Class<?> wildcardClass30 = timeSeries25.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass30);
        int int32 = timeSeries31.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries31.createCopy(1, (int) (short) 0);
        timeSeries35.setMaximumItemCount(100);
        java.lang.String str38 = timeSeries35.getDomainDescription();
        java.util.Collection collection39 = timeSeries35.getTimePeriods();
        boolean boolean40 = timeSeries12.equals((java.lang.Object) timeSeries35);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = null; // flaky: timeSeries35.getTimePeriod((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("");
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        timeSeries15.setRangeDescription("hi!");
        timeSeries15.setNotify(true);
        java.lang.Comparable comparable20 = timeSeries15.getKey();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries4.addAndOrUpdate(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null; // flaky: timeSeries15.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1 + "'", comparable20, 1);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        timeSeries1.setRangeDescription("Overwritten values from: 4");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy(regularTimePeriod4, regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        long long23 = timeSeries22.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries22.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass32);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str40 = timeSeries36.getRangeDescription();
        timeSeries36.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener43);
        timeSeries36.setNotify(false);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class48);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries49.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class54 = null;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class54);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries55.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries49.addAndOrUpdate(timeSeries58);
        boolean boolean61 = timeSeries59.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries59.removeChangeListener(seriesChangeListener62);
        java.util.Collection collection64 = timeSeries36.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        java.lang.Class<?> wildcardClass65 = collection64.getClass();
        boolean boolean66 = timeSeries33.equals((java.lang.Object) collection64);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = null; // flaky: timeSeries33.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.List list10 = timeSeries2.getItems();
        java.util.List list11 = timeSeries2.getItems();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener12);
        timeSeries2.fireSeriesChanged();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str21 = timeSeries17.getRangeDescription();
        timeSeries17.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener24);
        timeSeries17.setNotify(false);
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries30.addAndOrUpdate(timeSeries39);
        boolean boolean42 = timeSeries40.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries40.removeChangeListener(seriesChangeListener43);
        java.util.Collection collection45 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        boolean boolean47 = timeSeries40.equals((java.lang.Object) 100L);
        timeSeries40.clear();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries40.removePropertyChangeListener(propertyChangeListener49);
        java.lang.Comparable comparable51 = timeSeries40.getKey();
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries2.addAndOrUpdate(timeSeries40);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries40.addChangeListener(seriesChangeListener53);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + "Overwritten values from: 4" + "'", comparable51, "Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries52);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Class class13 = timeSeries11.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries11.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        timeSeries9.setMaximumItemAge((long) (short) 100);
        java.lang.String str18 = timeSeries9.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries4.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries4.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.clear();
        timeSeries2.setKey((java.lang.Comparable) 0);
        int int16 = timeSeries2.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = timeSeries2.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.clear();
        timeSeries2.setKey((java.lang.Comparable) 0);
        int int16 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries2.addOrUpdate(regularTimePeriod17, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        java.lang.String str18 = timeSeries15.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries15.createCopy((int) (byte) 1, (int) (byte) 10);
        long long22 = timeSeries15.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.createCopy(regularTimePeriod23, regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        boolean boolean15 = timeSeries12.isEmpty();
        timeSeries12.fireSeriesChanged();
        java.util.List list17 = timeSeries12.getItems();
        timeSeries12.setMaximumItemCount((int) '4');
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        java.lang.Class<?> wildcardClass30 = timeSeries25.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass30);
        int int32 = timeSeries31.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries31.createCopy(1, (int) (short) 0);
        timeSeries35.setMaximumItemCount(100);
        java.lang.String str38 = timeSeries35.getDomainDescription();
        java.util.Collection collection39 = timeSeries35.getTimePeriods();
        boolean boolean40 = timeSeries12.equals((java.lang.Object) timeSeries35);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.removeAgedItems((long) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = timeSeries33.getValue(regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries2.addOrUpdate(regularTimePeriod9, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str20 = timeSeries16.getRangeDescription();
        java.lang.Class<?> wildcardClass21 = timeSeries16.getClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass21);
        int int23 = timeSeries22.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries22.createCopy(1, (int) (short) 0);
        timeSeries26.setMaximumItemCount(100);
        java.lang.String str29 = timeSeries26.getDomainDescription();
        java.util.Collection collection30 = timeSeries26.getTimePeriods();
        boolean boolean31 = timeSeries26.getNotify();
        timeSeries26.fireSeriesChanged();
        java.util.Collection collection33 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.update(regularTimePeriod34, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.clear();
        timeSeries2.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries2.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        timeSeries11.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class3);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.addAndOrUpdate(timeSeries13);
        java.lang.Class<?> wildcardClass15 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass15);
        timeSeries17.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = null; // flaky: timeSeries17.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        timeSeries2.setMaximumItemCount((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener12);
        timeSeries5.setNotify(false);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "hi!", (java.lang.Class) wildcardClass16);
        java.lang.Comparable comparable18 = timeSeries17.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod19, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        timeSeries6.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener13);
        timeSeries6.setNotify(false);
        java.lang.Class<?> wildcardClass17 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Value", "Time", (java.lang.Class) wildcardClass17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy(regularTimePeriod20, regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        long long10 = timeSeries2.getMaximumItemAge();
        boolean boolean11 = timeSeries2.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries2.getValue(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = null; // flaky: timeSeries12.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        boolean boolean9 = timeSeries4.getNotify();
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries21);
        java.util.Collection collection23 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass32);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str40 = timeSeries36.getRangeDescription();
        timeSeries36.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener43);
        timeSeries36.setNotify(false);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class48);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries49.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class54 = null;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class54);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries55.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries49.addAndOrUpdate(timeSeries58);
        boolean boolean61 = timeSeries59.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries59.removeChangeListener(seriesChangeListener62);
        java.util.Collection collection64 = timeSeries36.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        java.lang.Class<?> wildcardClass65 = collection64.getClass();
        boolean boolean66 = timeSeries33.equals((java.lang.Object) collection64);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        timeSeries33.removeChangeListener(seriesChangeListener67);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem71 = timeSeries33.addOrUpdate(regularTimePeriod69, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 1, (int) '4');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(timeSeriesDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries12.addOrUpdate(regularTimePeriod17, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setRangeDescription("Time");
        long long17 = timeSeries12.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        java.lang.String str11 = timeSeries5.getDescription();
        java.util.Collection collection12 = timeSeries5.getTimePeriods();
        boolean boolean13 = timeSeries5.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries5.addOrUpdate(regularTimePeriod14, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) 1);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener11);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class16);
        timeSeries17.setDescription("hi!");
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount((int) ' ');
        timeSeries22.setMaximumItemAge((long) (short) 100);
        java.lang.String str31 = timeSeries22.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries17.addAndOrUpdate(timeSeries22);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries2.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries2.createCopy(2147483647, (-1));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries2.addOrUpdate(regularTimePeriod39, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) 1);
        java.lang.Class class11 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.removeChangeListener(seriesChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null; // flaky: timeSeries11.getTimePeriod((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        timeSeries5.setNotify(true);
        timeSeries5.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.update((int) ' ', (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        timeSeries5.fireSeriesChanged();
        java.lang.String str8 = timeSeries5.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + '4' + "'", comparable6, '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        timeSeries2.setMaximumItemCount((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems((long) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Class<?> wildcardClass8 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries9.delete((int) (short) -1, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.util.List list13 = timeSeries2.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries2.getDataItem(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        int int2 = timeSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        timeSeries2.setRangeDescription("Time");
        int int13 = timeSeries2.getItemCount();
        timeSeries2.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries2.getValue(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries33.addOrUpdate(regularTimePeriod34, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        long long10 = timeSeries2.getMaximumItemAge();
        boolean boolean11 = timeSeries2.isEmpty();
        long long12 = timeSeries2.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries2.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        java.util.List list7 = timeSeries2.getItems();
        int int8 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod9, (double) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, (java.lang.Class) wildcardClass32);
        java.lang.Object obj34 = timeSeries33.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries33.addOrUpdate(regularTimePeriod35, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        timeSeries2.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod25, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        timeSeries9.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries9.addOrUpdate(regularTimePeriod12, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        timeSeries25.clear();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener34);
        boolean boolean36 = timeSeries25.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null; // flaky: timeSeries25.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        boolean boolean9 = timeSeries4.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod12, (java.lang.Number) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        timeSeries4.setMaximumItemCount((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries4.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        java.lang.String str19 = timeSeries2.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries2.addOrUpdate(regularTimePeriod20, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        java.lang.Class<?> wildcardClass14 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass14);
        timeSeries16.clear();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        int int20 = timeSeries19.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries19);
        java.lang.Class<?> wildcardClass22 = timeSeries19.getClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Value", "", (java.lang.Class) wildcardClass22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.delete(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.List list10 = timeSeries2.getItems();
        java.util.List list11 = timeSeries2.getItems();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener12);
        java.lang.Object obj14 = timeSeries2.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        timeSeries25.clear();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener34);
        boolean boolean36 = timeSeries25.getNotify();
        java.util.Collection collection37 = timeSeries25.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number39 = timeSeries25.getValue(regularTimePeriod38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        java.util.Collection collection19 = timeSeries15.getTimePeriods();
        timeSeries15.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries15.createCopy(regularTimePeriod21, regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Comparable comparable13 = timeSeries2.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries2.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        java.lang.String str18 = timeSeries15.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries15.createCopy((int) (byte) 1, (int) (byte) 10);
        long long22 = timeSeries15.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        long long19 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.createCopy((int) '4', (int) (byte) 10);
        timeSeries22.removeAgedItems(true);
        timeSeries22.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries4.addAndOrUpdate(timeSeries22);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries27.getTimePeriod((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) (byte) 0, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        timeSeries11.setMaximumItemAge((long) (short) 100);
        timeSeries11.setRangeDescription("");
        java.util.List list22 = timeSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries11.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.String str26 = timeSeries2.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = timeSeries2.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries4.getValue(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        timeSeries11.setMaximumItemAge((long) (short) 100);
        timeSeries11.setRangeDescription("");
        java.util.List list22 = timeSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries11.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.String str26 = timeSeries2.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries2.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("");
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        timeSeries15.setRangeDescription("hi!");
        timeSeries15.setNotify(true);
        java.lang.Comparable comparable20 = timeSeries15.getKey();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries4.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries21.addOrUpdate(regularTimePeriod22, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1 + "'", comparable20, 1);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries13.removePropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries2.addOrUpdate(regularTimePeriod15, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries12.removeChangeListener(seriesChangeListener15);
        timeSeries12.clear();
        timeSeries12.setDomainDescription("hi!");
        java.lang.Comparable comparable20 = timeSeries12.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries12.getDataItem(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + "Overwritten values from: 4" + "'", comparable20, "Overwritten values from: 4");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        java.lang.String str18 = timeSeries15.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        java.util.List list7 = timeSeries2.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod8, (double) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        java.lang.String str19 = timeSeries2.getDomainDescription();
        java.lang.Class class20 = timeSeries2.getTimePeriodClass();
        timeSeries2.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod22, (double) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertNull(class20);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        java.lang.Object obj14 = timeSeries2.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries2.removeChangeListener(seriesChangeListener15);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries2.removeChangeListener(seriesChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        timeSeries11.setNotify(true);
        java.lang.String str25 = timeSeries11.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod26, (double) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Value");
        timeSeries2.setMaximumItemAge((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries2.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null; // flaky: timeSeries4.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        timeSeries12.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries12.addChangeListener(seriesChangeListener16);
        java.lang.String str18 = timeSeries12.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update(10, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        boolean boolean15 = timeSeries12.isEmpty();
        timeSeries12.fireSeriesChanged();
        java.util.List list17 = timeSeries12.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeSeries12.getIndex(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        long long19 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.createCopy((int) '4', (int) (byte) 10);
        timeSeries22.removeAgedItems(true);
        timeSeries22.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries4.addAndOrUpdate(timeSeries22);
        boolean boolean28 = timeSeries4.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries4.addOrUpdate(regularTimePeriod29, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str20 = timeSeries16.getRangeDescription();
        java.lang.Class<?> wildcardClass21 = timeSeries16.getClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass21);
        int int23 = timeSeries22.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries22.createCopy(1, (int) (short) 0);
        timeSeries26.setMaximumItemCount(100);
        java.lang.String str29 = timeSeries26.getDomainDescription();
        java.util.Collection collection30 = timeSeries26.getTimePeriods();
        boolean boolean31 = timeSeries26.getNotify();
        timeSeries26.fireSeriesChanged();
        java.util.Collection collection33 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries2.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        java.lang.String str18 = timeSeries15.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries15.createCopy((int) (byte) 1, (int) (byte) 10);
        java.lang.String str22 = timeSeries15.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries15.addOrUpdate(regularTimePeriod23, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries5.getValue(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + '4' + "'", comparable6, '4');
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.removeAgedItems(true);
        int int11 = timeSeries2.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries2.createCopy((int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (short) 1);
        timeSeries12.setRangeDescription("hi!");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        timeSeries9.setMaximumItemAge((long) (short) 100);
        java.lang.String str18 = timeSeries9.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries4.addAndOrUpdate(timeSeries9);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        int int21 = timeSeries19.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(timeSeriesDataItem22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("");
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        timeSeries15.setRangeDescription("hi!");
        timeSeries15.setNotify(true);
        java.lang.Comparable comparable20 = timeSeries15.getKey();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries4.addAndOrUpdate(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null; // flaky: timeSeries4.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1 + "'", comparable20, 1);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setMaximumItemAge((long) 32);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod4, (java.lang.Number) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.List list10 = timeSeries2.getItems();
        java.util.List list11 = timeSeries2.getItems();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener12);
        timeSeries2.fireSeriesChanged();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str21 = timeSeries17.getRangeDescription();
        timeSeries17.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener24);
        timeSeries17.setNotify(false);
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries30.addAndOrUpdate(timeSeries39);
        boolean boolean42 = timeSeries40.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries40.removeChangeListener(seriesChangeListener43);
        java.util.Collection collection45 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        boolean boolean47 = timeSeries40.equals((java.lang.Object) 100L);
        timeSeries40.clear();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries40.removePropertyChangeListener(propertyChangeListener49);
        java.lang.Comparable comparable51 = timeSeries40.getKey();
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries2.addAndOrUpdate(timeSeries40);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries40.addChangeListener(seriesChangeListener53);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.add(regularTimePeriod55, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + "Overwritten values from: 4" + "'", comparable51, "Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries52);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        timeSeries11.setMaximumItemAge((long) (short) 100);
        timeSeries11.setRangeDescription("");
        java.util.List list22 = timeSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries11.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.util.Collection collection26 = timeSeries25.getTimePeriods();
        java.lang.String str27 = timeSeries25.getRangeDescription();
        boolean boolean28 = timeSeries25.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(timeSeriesDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        timeSeries25.clear();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener34);
        java.lang.Comparable comparable36 = timeSeries25.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(timeSeriesDataItem37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + "Overwritten values from: 4" + "'", comparable36, "Overwritten values from: 4");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries2.addOrUpdate(regularTimePeriod19, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries2.createCopy(regularTimePeriod15, regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries7.addAndOrUpdate(timeSeries16);
        java.lang.Class<?> wildcardClass18 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass18);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Overwritten values from: 4", "Overwritten values from: 4", (java.lang.Class) wildcardClass18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries21.addOrUpdate(regularTimePeriod22, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries2.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class3);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.addAndOrUpdate(timeSeries13);
        java.lang.Class<?> wildcardClass15 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries17.addOrUpdate(regularTimePeriod18, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class3);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str8 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        timeSeries4.setNotify(false);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class22);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries23.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries17.addAndOrUpdate(timeSeries26);
        boolean boolean29 = timeSeries27.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries27.removeChangeListener(seriesChangeListener30);
        java.util.Collection collection32 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        java.lang.Class<?> wildcardClass33 = collection32.getClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass33);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, (java.lang.Class) wildcardClass33);
        long long36 = timeSeries35.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = timeSeries35.getValue(regularTimePeriod37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9223372036854775807L + "'", long36 == 9223372036854775807L);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) 1);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener11);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class16);
        timeSeries17.setDescription("hi!");
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount((int) ' ');
        timeSeries22.setMaximumItemAge((long) (short) 100);
        java.lang.String str31 = timeSeries22.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries17.addAndOrUpdate(timeSeries22);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries2.addAndOrUpdate(timeSeries17);
        boolean boolean36 = timeSeries17.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update(regularTimePeriod37, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = timeSeries11.getValue(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setRangeDescription("");
        java.lang.Class<?> wildcardClass12 = timeSeries2.getClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        java.lang.Object obj14 = timeSeries2.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries2.removeChangeListener(seriesChangeListener15);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries2.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries2.addOrUpdate(regularTimePeriod19, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        java.util.List list13 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.addChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str12 = timeSeries8.getRangeDescription();
        java.lang.Class<?> wildcardClass13 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass13);
        int int15 = timeSeries14.getItemCount();
        java.lang.Class<?> wildcardClass16 = timeSeries14.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "Value", (java.lang.Class) wildcardClass16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod18, (java.lang.Number) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        long long19 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.createCopy((int) '4', (int) (byte) 10);
        timeSeries22.removeAgedItems(true);
        timeSeries22.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries4.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.delete(regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        timeSeries9.setMaximumItemAge((long) (short) 100);
        java.lang.String str18 = timeSeries9.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries4.addAndOrUpdate(timeSeries9);
        timeSeries19.clear();
        timeSeries19.setMaximumItemCount(32);
        timeSeries19.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.update((int) (short) 0, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries2.addChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries2.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries2.addOrUpdate(regularTimePeriod3, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        boolean boolean15 = timeSeries12.isEmpty();
        timeSeries12.fireSeriesChanged();
        boolean boolean17 = timeSeries12.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries12.getDataItem(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        timeSeries13.fireSeriesChanged();
        timeSeries13.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries13.addChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(timeSeriesDataItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod15, (double) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        timeSeries11.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries11.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        timeSeries6.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener13);
        timeSeries6.setNotify(false);
        java.lang.Class<?> wildcardClass17 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Value", "Time", (java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries19.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        timeSeries11.setMaximumItemAge((long) (short) 100);
        timeSeries11.setRangeDescription("");
        java.util.List list22 = timeSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries11.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.util.Collection collection26 = timeSeries25.getTimePeriods();
        java.lang.String str27 = timeSeries25.getRangeDescription();
        boolean boolean28 = timeSeries25.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null; // flaky: timeSeries25.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        java.lang.Comparable comparable33 = timeSeries25.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = timeSeries25.getValue(regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + "Overwritten values from: 4" + "'", comparable33, "Overwritten values from: 4");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        timeSeries9.setMaximumItemAge((long) (short) 100);
        java.lang.String str18 = timeSeries9.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries4.addAndOrUpdate(timeSeries9);
        java.lang.Object obj20 = timeSeries4.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(32, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod7, (double) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        timeSeries11.clear();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = null; // flaky: timeSeries12.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.Collection collection10 = timeSeries2.getTimePeriods();
        timeSeries2.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries2.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries12.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.addAndOrUpdate(timeSeries21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries21.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.lang.String str14 = timeSeries12.getRangeDescription();
        int int15 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        timeSeries25.clear();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener34);
        boolean boolean36 = timeSeries25.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod37, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries2.createCopy(0, 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod12, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.List list10 = timeSeries2.getItems();
        java.util.List list11 = timeSeries2.getItems();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener12);
        timeSeries2.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries2.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeSeries11.getIndex(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        timeSeries12.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries12.addChangeListener(seriesChangeListener16);
        java.lang.String str18 = timeSeries12.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod19, (java.lang.Number) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        long long19 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.createCopy((int) '4', (int) (byte) 10);
        timeSeries22.removeAgedItems(true);
        timeSeries22.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries4.addAndOrUpdate(timeSeries22);
        boolean boolean28 = timeSeries4.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) 1);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener11);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class16);
        timeSeries17.setDescription("hi!");
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount((int) ' ');
        timeSeries22.setMaximumItemAge((long) (short) 100);
        java.lang.String str31 = timeSeries22.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries17.addAndOrUpdate(timeSeries22);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries2.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries2.createCopy(2147483647, (-1));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int40 = timeSeries2.getIndex(regularTimePeriod39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        long long10 = timeSeries2.getMaximumItemAge();
        boolean boolean11 = timeSeries2.isEmpty();
        long long12 = timeSeries2.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries2.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Comparable comparable13 = timeSeries2.getKey();
        java.lang.Class class14 = timeSeries2.getTimePeriodClass();
        timeSeries2.fireSeriesChanged();
        int int16 = timeSeries2.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = null; // flaky: timeSeries2.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.delete(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.Object obj13 = timeSeries2.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod14, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Time");
        java.lang.Comparable comparable12 = timeSeries2.getKey();
        timeSeries2.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries2.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + '4' + "'", comparable12, '4');
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener12);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class17);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.addChangeListener(seriesChangeListener19);
        boolean boolean21 = timeSeries5.equals((java.lang.Object) timeSeries18);
        java.lang.String str22 = timeSeries5.getDomainDescription();
        java.util.Collection collection23 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        timeSeries5.setMaximumItemCount((int) (short) 0);
        java.lang.Class class26 = timeSeries5.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(regularTimePeriod27, (java.lang.Number) 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(class26);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        java.lang.Object obj10 = timeSeries4.clone();
        java.util.Collection collection11 = timeSeries4.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        java.lang.Object obj14 = timeSeries2.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries2.removeChangeListener(seriesChangeListener15);
        boolean boolean17 = timeSeries2.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        int int17 = timeSeries16.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries16);
        int int19 = timeSeries13.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries13.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        java.util.List list13 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.removeChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries2.getDescription();
        int int17 = timeSeries2.getItemCount();
        java.lang.String str18 = timeSeries2.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries2.getDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        timeSeries4.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries4.createCopy(regularTimePeriod9, regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", class3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod5, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        java.util.List list7 = timeSeries2.getItems();
        int int8 = timeSeries2.getMaximumItemCount();
        java.lang.Comparable comparable9 = timeSeries2.getKey();
        timeSeries2.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + '4' + "'", comparable9, '4');
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        long long10 = timeSeries2.getMaximumItemAge();
        boolean boolean11 = timeSeries2.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod14, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        int int7 = timeSeries4.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod8, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries2.createCopy(0, 10);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str18 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount((int) ' ');
        long long21 = timeSeries14.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.createCopy((int) '4', (int) (byte) 10);
        java.lang.String str25 = timeSeries24.getDomainDescription();
        int int26 = timeSeries24.getMaximumItemCount();
        java.util.Collection collection27 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str35 = timeSeries31.getRangeDescription();
        timeSeries31.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries31.addPropertyChangeListener(propertyChangeListener38);
        timeSeries31.setNotify(false);
        java.lang.Class<?> wildcardClass42 = timeSeries31.getClass();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass42);
        timeSeries43.removeAgedItems(false);
        java.util.Collection collection46 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries43);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries43.addOrUpdate(regularTimePeriod47, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(collection46);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 1, (int) '4');
        int int29 = timeSeries25.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.createCopy(0, 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries32.update(regularTimePeriod33, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(timeSeries32);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        java.util.List list13 = timeSeries2.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod14, (java.lang.Number) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(timeSeriesDataItem7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        java.lang.String str18 = timeSeries15.getDomainDescription();
        java.util.Collection collection19 = timeSeries15.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod20, (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries15.getValue(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", class3);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str11 = timeSeries7.getRangeDescription();
        timeSeries7.setMaximumItemCount((int) ' ');
        java.util.Collection collection14 = timeSeries7.getTimePeriods();
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        java.lang.Number number17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod16, number17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("");
        boolean boolean11 = timeSeries4.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod12, (java.lang.Number) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        java.lang.String str18 = timeSeries15.getDomainDescription();
        java.util.Collection collection19 = timeSeries15.getTimePeriods();
        boolean boolean20 = timeSeries15.getNotify();
        timeSeries15.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries24 = timeSeries15.createCopy(regularTimePeriod22, regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries12);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, (java.lang.Class) wildcardClass14);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str22 = timeSeries18.getRangeDescription();
        timeSeries18.setMaximumItemCount((int) ' ');
        timeSeries18.setMaximumItemAge((long) (short) 100);
        timeSeries18.clear();
        java.util.Collection collection28 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries18.getDataItem(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        java.lang.Object obj14 = timeSeries2.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries2.removeChangeListener(seriesChangeListener15);
        java.util.List list17 = timeSeries2.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries20 = timeSeries2.createCopy(regularTimePeriod18, regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        timeSeries11.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries11.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        java.lang.Object obj14 = timeSeries2.clone();
        timeSeries2.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries2.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        java.lang.String str11 = timeSeries5.getDescription();
        java.util.Collection collection12 = timeSeries5.getTimePeriods();
        boolean boolean13 = timeSeries5.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries5.getDataItem(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 1, (int) '4');
        int int29 = timeSeries25.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.createCopy(0, 1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries32.add(timeSeriesDataItem33, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(timeSeries32);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries2.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) '#', 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy(regularTimePeriod5, regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        java.lang.String str18 = timeSeries15.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries15.createCopy((int) (byte) 1, (int) (byte) 10);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        java.util.Collection collection29 = timeSeries26.getTimePeriods();
        timeSeries26.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries15.addAndOrUpdate(timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries32.update(regularTimePeriod33, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries32);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener12);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class17);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.addChangeListener(seriesChangeListener19);
        boolean boolean21 = timeSeries5.equals((java.lang.Object) timeSeries18);
        java.lang.String str22 = timeSeries5.getDomainDescription();
        java.util.Collection collection23 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        long long24 = timeSeries5.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = timeSeries5.getIndex(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setRangeDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries12.createCopy(regularTimePeriod17, regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        timeSeries11.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy((int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        timeSeries9.setMaximumItemAge((long) (short) 100);
        java.lang.String str18 = timeSeries9.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries4.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null; // flaky: timeSeries9.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        timeSeries9.removeAgedItems(true);
        timeSeries9.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries9.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Time");
        java.util.Collection collection12 = timeSeries2.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.List list10 = timeSeries2.getItems();
        java.util.List list11 = timeSeries2.getItems();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener12);
        timeSeries2.fireSeriesChanged();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str21 = timeSeries17.getRangeDescription();
        timeSeries17.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener24);
        timeSeries17.setNotify(false);
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries30.addAndOrUpdate(timeSeries39);
        boolean boolean42 = timeSeries40.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries40.removeChangeListener(seriesChangeListener43);
        java.util.Collection collection45 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        boolean boolean47 = timeSeries40.equals((java.lang.Object) 100L);
        timeSeries40.clear();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries40.removePropertyChangeListener(propertyChangeListener49);
        java.lang.Comparable comparable51 = timeSeries40.getKey();
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries2.addAndOrUpdate(timeSeries40);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + "Overwritten values from: 4" + "'", comparable51, "Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries52);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Comparable comparable13 = timeSeries2.getKey();
        java.lang.Class class14 = timeSeries2.getTimePeriodClass();
        int int15 = timeSeries2.getMaximumItemCount();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener26);
        timeSeries19.setNotify(false);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class37);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries38.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries32.addAndOrUpdate(timeSeries41);
        boolean boolean44 = timeSeries42.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        timeSeries42.removeChangeListener(seriesChangeListener45);
        java.util.Collection collection47 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        java.lang.Class<?> wildcardClass48 = collection47.getClass();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass48);
        java.util.Collection collection50 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries49);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete((int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries12.removeChangeListener(seriesChangeListener15);
        timeSeries12.clear();
        timeSeries12.setMaximumItemCount((int) (short) 10);
        timeSeries12.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries12.addChangeListener(seriesChangeListener21);
        timeSeries12.setRangeDescription("hi!");
        timeSeries12.setKey((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries2.createCopy(0, 10);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str22 = timeSeries18.getRangeDescription();
        java.lang.Class<?> wildcardClass23 = timeSeries18.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass23);
        timeSeries25.clear();
        long long27 = timeSeries25.getMaximumItemAge();
        java.lang.String str28 = timeSeries25.getDescription();
        java.util.Collection collection29 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        timeSeries25.setKey((java.lang.Comparable) "Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        timeSeries13.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(timeSeriesDataItem18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        timeSeries25.clear();
        java.util.Collection collection34 = timeSeries25.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        boolean boolean15 = timeSeries12.isEmpty();
        timeSeries12.fireSeriesChanged();
        java.util.List list17 = timeSeries12.getItems();
        timeSeries12.setMaximumItemCount((int) '4');
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        java.lang.Class<?> wildcardClass30 = timeSeries25.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass30);
        int int32 = timeSeries31.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries31.createCopy(1, (int) (short) 0);
        timeSeries35.setMaximumItemCount(100);
        java.lang.String str38 = timeSeries35.getDomainDescription();
        java.util.Collection collection39 = timeSeries35.getTimePeriods();
        boolean boolean40 = timeSeries12.equals((java.lang.Object) timeSeries35);
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class44);
        timeSeries45.setDescription("hi!");
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class49);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries50.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str54 = timeSeries50.getRangeDescription();
        timeSeries50.setMaximumItemCount((int) ' ');
        timeSeries50.setMaximumItemAge((long) (short) 100);
        java.lang.String str59 = timeSeries50.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries45.addAndOrUpdate(timeSeries50);
        timeSeries60.clear();
        timeSeries60.setMaximumItemCount(32);
        java.util.Collection collection64 = timeSeries35.getTimePeriodsUniqueToOtherSeries(timeSeries60);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries35.removeAgedItems((long) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value" + "'", str54, "Value");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Value" + "'", str59, "Value");
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "hi!", "Value", (java.lang.Class) wildcardClass16);
        java.lang.Class class18 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod19, (java.lang.Number) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        timeSeries2.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries2.getDataItem(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod15, (double) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "");
        boolean boolean2 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        java.lang.Class<?> wildcardClass8 = collection7.getClass();
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount((int) ' ');
        timeSeries25.setMaximumItemAge((long) (short) 100);
        timeSeries25.setRangeDescription("");
        timeSeries25.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries11.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(timeSeriesDataItem39, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        java.lang.Object obj14 = timeSeries2.clone();
        timeSeries2.setMaximumItemCount((int) (byte) 0);
        int int17 = timeSeries2.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries2.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Time");
        java.util.Collection collection12 = timeSeries2.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries2.addOrUpdate(regularTimePeriod13, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass32);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str40 = timeSeries36.getRangeDescription();
        java.util.List list41 = timeSeries36.getItems();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries33.addAndOrUpdate(timeSeries36);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = timeSeries42.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.lang.String str14 = timeSeries12.getRangeDescription();
        timeSeries12.setDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries12.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = collection31.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = timeSeries33.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timeSeries2.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null; // flaky: timeSeries2.getTimePeriod((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str20 = timeSeries16.getRangeDescription();
        java.lang.Class<?> wildcardClass21 = timeSeries16.getClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass21);
        int int23 = timeSeries22.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries22.createCopy(1, (int) (short) 0);
        timeSeries26.setMaximumItemCount(100);
        java.lang.String str29 = timeSeries26.getDomainDescription();
        java.util.Collection collection30 = timeSeries26.getTimePeriods();
        boolean boolean31 = timeSeries26.getNotify();
        timeSeries26.fireSeriesChanged();
        java.util.Collection collection33 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class class34 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = timeSeries2.getValue(regularTimePeriod35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(class34);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        timeSeries11.setMaximumItemAge((long) (short) 100);
        timeSeries11.setRangeDescription("");
        java.util.List list22 = timeSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries11.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.util.Collection collection26 = timeSeries25.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = timeSeries25.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        java.lang.String str19 = timeSeries2.getDomainDescription();
        timeSeries2.setDomainDescription("");
        boolean boolean22 = timeSeries2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = null; // flaky: timeSeries2.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        int int11 = timeSeries10.getItemCount();
        timeSeries10.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod13, (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        boolean boolean4 = timeSeries2.equals((java.lang.Object) (-1.0f));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod5, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener12);
        timeSeries5.setNotify(false);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "hi!", (java.lang.Class) wildcardClass16);
        java.lang.Comparable comparable18 = timeSeries17.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries17.addOrUpdate(regularTimePeriod19, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        int int7 = timeSeries4.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries4.removeChangeListener(seriesChangeListener8);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries21);
        boolean boolean24 = timeSeries22.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries22.removeChangeListener(seriesChangeListener25);
        timeSeries22.clear();
        timeSeries22.setMaximumItemCount((int) (short) 10);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries4.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries30.add(regularTimePeriod31, (double) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        timeSeries5.setKey((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.removeAgedItems((long) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + '4' + "'", comparable6, '4');
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount((int) ' ');
        timeSeries25.setMaximumItemAge((long) (short) 100);
        timeSeries25.setRangeDescription("");
        timeSeries25.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries11.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        java.lang.Number number40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries25.addOrUpdate(regularTimePeriod39, number40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        timeSeries11.setMaximumItemAge((long) (short) 100);
        timeSeries11.setRangeDescription("");
        java.util.List list22 = timeSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries11.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str32 = timeSeries28.getRangeDescription();
        timeSeries28.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries28.addPropertyChangeListener(propertyChangeListener35);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class40);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries41.addChangeListener(seriesChangeListener42);
        boolean boolean44 = timeSeries28.equals((java.lang.Object) timeSeries41);
        java.lang.String str45 = timeSeries28.getDomainDescription();
        java.lang.Class class46 = timeSeries28.getTimePeriodClass();
        timeSeries28.fireSeriesChanged();
        java.util.Collection collection48 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(regularTimePeriod49, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Time" + "'", str45, "Time");
        org.junit.Assert.assertNull(class46);
        org.junit.Assert.assertNotNull(collection48);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        java.lang.String str11 = timeSeries2.getDescription();
        java.lang.String str12 = timeSeries2.getDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.util.List list14 = timeSeries12.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update(regularTimePeriod15, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy(regularTimePeriod20, regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount((int) ' ');
        timeSeries25.setMaximumItemAge((long) (short) 100);
        timeSeries25.setRangeDescription("");
        timeSeries25.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries11.addAndOrUpdate(timeSeries25);
        java.lang.String str39 = timeSeries25.getDescription();
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class41);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries42.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class47);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries48.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries42.addAndOrUpdate(timeSeries51);
        boolean boolean54 = timeSeries52.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries52.removeChangeListener(seriesChangeListener55);
        timeSeries52.clear();
        timeSeries52.setMaximumItemCount((int) (short) 10);
        timeSeries52.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener61 = null;
        timeSeries52.addChangeListener(seriesChangeListener61);
        java.util.Collection collection63 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener64);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str20 = timeSeries16.getRangeDescription();
        java.lang.Class<?> wildcardClass21 = timeSeries16.getClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass21);
        int int23 = timeSeries22.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries22.createCopy(1, (int) (short) 0);
        timeSeries26.setMaximumItemCount(100);
        java.lang.String str29 = timeSeries26.getDomainDescription();
        java.util.Collection collection30 = timeSeries26.getTimePeriods();
        boolean boolean31 = timeSeries26.getNotify();
        timeSeries26.fireSeriesChanged();
        java.util.Collection collection33 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(timeSeriesDataItem34, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries9.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod12, 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass32);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str40 = timeSeries36.getRangeDescription();
        timeSeries36.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener43);
        timeSeries36.setNotify(false);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class48);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries49.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class54 = null;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class54);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries55.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries49.addAndOrUpdate(timeSeries58);
        boolean boolean61 = timeSeries59.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries59.removeChangeListener(seriesChangeListener62);
        java.util.Collection collection64 = timeSeries36.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        java.lang.Class<?> wildcardClass65 = collection64.getClass();
        boolean boolean66 = timeSeries33.equals((java.lang.Object) collection64);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        timeSeries33.removeChangeListener(seriesChangeListener67);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries33.removeAgedItems(10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        java.util.List list13 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.removeChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries2.getDescription();
        int int17 = timeSeries2.getItemCount();
        java.util.List list18 = timeSeries2.getItems();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries2.createCopy(0, 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries11.getValue(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Comparable comparable13 = timeSeries2.getKey();
        java.lang.Class class14 = timeSeries2.getTimePeriodClass();
        java.lang.Class class15 = timeSeries2.getTimePeriodClass();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str25 = timeSeries21.getRangeDescription();
        java.lang.Class<?> wildcardClass26 = timeSeries21.getClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass26);
        timeSeries27.fireSeriesChanged();
        java.util.Collection collection29 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = timeSeries2.getValue(regularTimePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        timeSeries13.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(timeSeriesDataItem18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        boolean boolean32 = timeSeries25.equals((java.lang.Object) 100L);
        java.lang.Comparable comparable33 = timeSeries25.getKey();
        timeSeries25.setRangeDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.delete(regularTimePeriod36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + "Overwritten values from: 4" + "'", comparable33, "Overwritten values from: 4");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        timeSeries4.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.createCopy(regularTimePeriod11, regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass32);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str40 = timeSeries36.getRangeDescription();
        java.util.List list41 = timeSeries36.getItems();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries33.addAndOrUpdate(timeSeries36);
        boolean boolean43 = timeSeries42.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null; // flaky: timeSeries42.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = null; // flaky: timeSeries2.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        timeSeries2.fireSeriesChanged();
        timeSeries2.setMaximumItemAge((long) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod16, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        timeSeries5.setKey((java.lang.Comparable) '#');
        boolean boolean9 = timeSeries5.isEmpty();
        timeSeries5.clear();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + '4' + "'", comparable6, '4');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.lang.Class<?> wildcardClass3 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass3);
        java.lang.String str5 = timeSeries4.getDescription();
        long long6 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener12);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class17);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.addChangeListener(seriesChangeListener19);
        boolean boolean21 = timeSeries5.equals((java.lang.Object) timeSeries18);
        java.lang.String str22 = timeSeries5.getDomainDescription();
        java.util.Collection collection23 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        long long24 = timeSeries5.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.delete(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        boolean boolean27 = timeSeries25.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        long long15 = timeSeries13.getMaximumItemAge();
        java.lang.String str16 = timeSeries13.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null; // flaky: timeSeries13.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        java.lang.Object obj14 = timeSeries2.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries2.removeChangeListener(seriesChangeListener15);
        java.util.List list17 = timeSeries2.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems((long) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries12);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, (java.lang.Class) wildcardClass14);
        timeSeries15.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries17);
        java.lang.Class<?> wildcardClass19 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "hi!", "Value", (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "Value", (java.lang.Class) wildcardClass19);
        boolean boolean22 = timeSeries21.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod23, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        boolean boolean15 = timeSeries12.isEmpty();
        timeSeries12.fireSeriesChanged();
        java.util.List list17 = timeSeries12.getItems();
        timeSeries12.setMaximumItemCount((int) '4');
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        java.lang.Class<?> wildcardClass30 = timeSeries25.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass30);
        int int32 = timeSeries31.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries31.createCopy(1, (int) (short) 0);
        timeSeries35.setMaximumItemCount(100);
        java.lang.String str38 = timeSeries35.getDomainDescription();
        java.util.Collection collection39 = timeSeries35.getTimePeriods();
        boolean boolean40 = timeSeries12.equals((java.lang.Object) timeSeries35);
        java.lang.Class class41 = timeSeries12.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(class41);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        timeSeries2.setMaximumItemCount((int) '4');
        timeSeries2.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timeSeries2.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete((int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        timeSeries11.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries11.getValue(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries11.createCopy(1, (int) (short) 0);
        timeSeries15.setMaximumItemCount(100);
        java.lang.String str18 = timeSeries15.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries15.removeChangeListener(seriesChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.update((int) (short) 100, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        java.util.List list13 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.removeChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries2.getDescription();
        int int17 = timeSeries2.getItemCount();
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod20, (double) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        int int7 = timeSeries4.getMaximumItemCount();
        timeSeries4.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries4.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Comparable comparable9 = timeSeries2.getKey();
        timeSeries2.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.time.TimeSeries timeSeries12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries2.addAndOrUpdate(timeSeries12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + '4' + "'", comparable9, '4');
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries2.createCopy(0, 10);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str18 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount((int) ' ');
        long long21 = timeSeries14.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.createCopy((int) '4', (int) (byte) 10);
        java.lang.String str25 = timeSeries24.getDomainDescription();
        int int26 = timeSeries24.getMaximumItemCount();
        java.util.Collection collection27 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str35 = timeSeries31.getRangeDescription();
        timeSeries31.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries31.addPropertyChangeListener(propertyChangeListener38);
        timeSeries31.setNotify(false);
        java.lang.Class<?> wildcardClass42 = timeSeries31.getClass();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass42);
        timeSeries43.removeAgedItems(false);
        java.util.Collection collection46 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries43);
        timeSeries43.setDescription("Value");
        int int49 = timeSeries43.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number51 = timeSeries43.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries2.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        timeSeries12.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries12.addChangeListener(seriesChangeListener16);
        java.lang.String str18 = timeSeries12.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries12.getDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        java.lang.Comparable comparable19 = timeSeries2.getKey();
        timeSeries2.removeAgedItems(true);
        java.lang.Object obj22 = timeSeries2.clone();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener32);
        timeSeries25.setRangeDescription("Time");
        java.util.Collection collection36 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = timeSeries2.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '4' + "'", comparable19, '4');
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) (byte) 0, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries15.createCopy(0, (int) ' ');
        timeSeries21.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = timeSeries21.getIndex(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        java.lang.Object obj14 = timeSeries2.clone();
        timeSeries2.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod17, (double) 1.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        timeSeries9.removeAgedItems(true);
        timeSeries9.setDescription("");
        timeSeries9.setDomainDescription("hi!");
        timeSeries9.setNotify(true);
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener12);
        timeSeries5.setNotify(false);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries18.addAndOrUpdate(timeSeries27);
        boolean boolean30 = timeSeries28.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries28.removeChangeListener(seriesChangeListener31);
        java.util.Collection collection33 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        java.lang.Class<?> wildcardClass34 = collection33.getClass();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "", "Overwritten values from: 4", (java.lang.Class) wildcardClass34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = timeSeries35.getIndex(regularTimePeriod36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries2.createCopy(0, 10);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str18 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount((int) ' ');
        long long21 = timeSeries14.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.createCopy((int) '4', (int) (byte) 10);
        java.lang.String str25 = timeSeries24.getDomainDescription();
        int int26 = timeSeries24.getMaximumItemCount();
        java.util.Collection collection27 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries24.addOrUpdate(regularTimePeriod28, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        java.util.List list13 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.removeChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries2.getDescription();
        int int17 = timeSeries2.getItemCount();
        java.lang.String str18 = timeSeries2.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries2.addOrUpdate(regularTimePeriod19, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class<?> wildcardClass32 = collection31.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy(regularTimePeriod34, regularTimePeriod35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        timeSeries13.fireSeriesChanged();
        java.lang.Object obj16 = timeSeries13.clone();
        boolean boolean17 = timeSeries13.getNotify();
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        boolean boolean15 = timeSeries12.isEmpty();
        timeSeries12.fireSeriesChanged();
        java.util.List list17 = timeSeries12.getItems();
        timeSeries12.setMaximumItemCount((int) '4');
        timeSeries12.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeries1.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.lang.String str14 = timeSeries12.getRangeDescription();
        timeSeries12.setDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries12.removeChangeListener(seriesChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) '#', 0);
        java.util.List list5 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.addOrUpdate(regularTimePeriod6, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
    }
}
