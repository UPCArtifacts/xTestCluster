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
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        int int7 = timePeriodValues1.getMinEndIndex();
        int int8 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Time", "", "Time");
        timePeriodValues3.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod7 = timePeriodValues3.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues3.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        boolean boolean5 = timePeriodValues1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue7 = timePeriodValues1.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        int int8 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod10, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy(0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues12.update((int) (byte) 0, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timePeriodValues12);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue9 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (short) 0);
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues1.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        int int6 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable9 = timePeriodValues8.getKey();
        timePeriodValues8.setDescription("hi!");
        timePeriodValues8.setRangeDescription("Time");
        boolean boolean14 = timePeriodValues3.equals((java.lang.Object) "Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100 + "'", comparable3, 100);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) 'a', (int) (short) -1);
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod16, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMinEndIndex();
        java.lang.String str4 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        java.lang.Comparable comparable4 = timePeriodValues3.getKey();
        int int5 = timePeriodValues3.getMaxMiddleIndex();
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue8 = timePeriodValues3.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (-1.0f) + "'", comparable4, (-1.0f));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        java.lang.Object obj7 = timePeriodValues1.clone();
        timePeriodValues1.setKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.setRangeDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener14);
        int int16 = timePeriodValues3.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        java.lang.String str8 = timePeriodValues1.getDescription();
        int int9 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.delete((int) '#', 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.update((int) (short) -1, (java.lang.Number) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod9, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 10, (int) '4');
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean14 = timePeriodValues13.getNotify();
        java.lang.String str15 = timePeriodValues13.getDomainDescription();
        int int16 = timePeriodValues13.getMaxMiddleIndex();
        int int17 = timePeriodValues13.getMinMiddleIndex();
        int int18 = timePeriodValues13.getMaxStartIndex();
        java.lang.String str19 = timePeriodValues13.getRangeDescription();
        boolean boolean20 = timePeriodValues1.equals((java.lang.Object) str19);
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener10);
        java.lang.Object obj12 = timePeriodValues3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue14 = timePeriodValues3.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.setRangeDescription("Time");
        int int12 = timePeriodValues3.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue14 = timePeriodValues3.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 100, (int) (short) 0);
        int int13 = timePeriodValues12.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj16 = timePeriodValues15.clone();
        java.lang.String str17 = timePeriodValues15.getDescription();
        int int18 = timePeriodValues15.getItemCount();
        timePeriodValues15.fireSeriesChanged();
        timePeriodValues15.setRangeDescription("Value");
        int int22 = timePeriodValues15.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timePeriodValues15.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timePeriodValues15.addChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimePeriodValues timePeriodValues29 = timePeriodValues15.createCopy((int) (short) 0, (int) (short) 1);
        boolean boolean30 = timePeriodValues12.equals((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue32 = timePeriodValues12.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy(0, (int) ' ');
        int int17 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timePeriodValues1.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod8, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        int int15 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setRangeDescription("Time");
        timePeriodValues3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue21 = timePeriodValues3.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        java.lang.Comparable comparable4 = timePeriodValues3.getKey();
        java.lang.String str5 = timePeriodValues3.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues7.createCopy((int) '4', (int) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues10.addChangeListener(seriesChangeListener11);
        boolean boolean13 = timePeriodValues3.equals((java.lang.Object) seriesChangeListener11);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (-1.0f) + "'", comparable4, (-1.0f));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues11.getMinEndIndex();
        timePeriodValues11.setKey((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod18 = timePeriodValues11.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0d, "Time", "Time");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues3.update((int) (byte) -1, (java.lang.Number) 10L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0L);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener3);
        timePeriodValues1.setNotify(true);
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj11 = timePeriodValues10.clone();
        java.lang.String str12 = timePeriodValues10.getRangeDescription();
        int int13 = timePeriodValues10.getMaxEndIndex();
        timePeriodValues10.fireSeriesChanged();
        boolean boolean15 = timePeriodValues3.equals((java.lang.Object) timePeriodValues10);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) '#', (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        boolean boolean11 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue13 = null; // flaky: timePeriodValues1.getDataItem((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues3.getItemCount();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean9 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = timePeriodValues1.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setKey((java.lang.Comparable) 100);
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = null; // flaky: timePeriodValues1.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        boolean boolean8 = timePeriodValues1.isEmpty();
        int int9 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = null; // flaky: timePeriodValues1.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean5 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDomainDescription("Time");
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.time.TimePeriodValue timePeriodValue10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        int int6 = timePeriodValues3.getMinEndIndex();
        java.lang.String str7 = timePeriodValues3.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValue timePeriodValue2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10L, "", "hi!");
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod4, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        boolean boolean11 = timePeriodValues1.isEmpty();
        int int12 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy(0, (int) (short) 10);
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj18 = timePeriodValues17.clone();
        java.lang.String str19 = timePeriodValues17.getDescription();
        java.lang.Comparable comparable20 = timePeriodValues17.getKey();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timePeriodValues17.removePropertyChangeListener(propertyChangeListener21);
        int int23 = timePeriodValues17.getMaxStartIndex();
        java.lang.Object obj24 = timePeriodValues17.clone();
        boolean boolean25 = timePeriodValues17.getNotify();
        int int26 = timePeriodValues17.getMaxEndIndex();
        int int27 = timePeriodValues17.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues29 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj30 = timePeriodValues29.clone();
        java.lang.String str31 = timePeriodValues29.getDescription();
        java.lang.Comparable comparable32 = timePeriodValues29.getKey();
        int int33 = timePeriodValues29.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timePeriodValues29.addPropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimePeriodValues timePeriodValues38 = timePeriodValues29.createCopy((-1), (-1));
        boolean boolean39 = timePeriodValues17.equals((java.lang.Object) timePeriodValues38);
        int int40 = timePeriodValues17.getMaxStartIndex();
        java.lang.String str41 = timePeriodValues17.getRangeDescription();
        boolean boolean42 = timePeriodValues1.equals((java.lang.Object) str41);
        java.lang.Object obj43 = timePeriodValues1.clone();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value" + "'", str41, "Value");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMaxEndIndex();
        boolean boolean5 = timePeriodValues3.isEmpty();
        timePeriodValues3.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod9 = timePeriodValues3.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        int int6 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setNotify(true);
        timePeriodValues3.setDescription("Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str10 = timePeriodValues3.getDomainDescription();
        java.lang.String str11 = timePeriodValues3.getRangeDescription();
        timePeriodValues3.setKey((java.lang.Comparable) 0.0f);
        timePeriodValues3.setDomainDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.update((int) (byte) -1, (java.lang.Number) 0.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod8, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '4', "hi!", "Value");
        int int4 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setNotify(true);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues10.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues10.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean16 = timePeriodValues10.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timePeriodValues10.removeChangeListener(seriesChangeListener17);
        java.lang.Object obj19 = timePeriodValues10.clone();
        java.lang.Class<?> wildcardClass20 = timePeriodValues10.getClass();
        boolean boolean21 = timePeriodValues3.equals((java.lang.Object) timePeriodValues10);
        java.lang.Comparable comparable22 = timePeriodValues3.getKey();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + '4' + "'", comparable22, '4');
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.delete((int) (short) -1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod17 = timePeriodValues3.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.fireSeriesChanged();
        timePeriodValues3.setDomainDescription("Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues3.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener8);
        timePeriodValues3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete((int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy(0, (int) 'a');
        boolean boolean11 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod12, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 10, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) '#', (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timePeriodValues1.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (short) 0);
        boolean boolean6 = timePeriodValues1.getNotify();
        int int7 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        int int6 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setDomainDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) (short) 10, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy((int) (short) 0, (int) (short) 1);
        int int16 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 10, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 100, (int) (short) 0);
        int int13 = timePeriodValues3.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean16 = timePeriodValues15.getNotify();
        boolean boolean17 = timePeriodValues15.getNotify();
        java.lang.Object obj18 = timePeriodValues15.clone();
        boolean boolean19 = timePeriodValues3.equals(obj18);
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        int int12 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.delete((int) (byte) 0, (int) (short) -1);
        org.jfree.data.time.TimePeriodValue timePeriodValue16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue8 = timePeriodValues3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (byte) 0, (int) '#');
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(timePeriodValues10);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("hi!");
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value", "", "Time");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        java.lang.String str6 = timePeriodValues1.getDescription();
        int int7 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod10 = timePeriodValues1.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDescription();
        int int8 = timePeriodValues1.getMaxEndIndex();
        java.lang.Object obj9 = timePeriodValues1.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0f, "hi!", "");
        java.lang.Class<?> wildcardClass4 = timePeriodValues3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy(0, (int) 'a');
        java.lang.Object obj11 = timePeriodValues10.clone();
        int int12 = timePeriodValues10.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timePeriodValues10.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy(1, (int) (short) 100);
        int int9 = timePeriodValues8.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriod12, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) ' ', (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.setRangeDescription("Value");
        timePeriodValues3.setDescription("Value");
        int int8 = timePeriodValues3.getItemCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        java.lang.String str12 = timePeriodValues3.getRangeDescription();
        int int13 = timePeriodValues3.getMaxEndIndex();
        java.lang.String str14 = timePeriodValues3.getDescription();
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod15, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = timePeriodValues3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        boolean boolean5 = timePeriodValues1.isEmpty();
        timePeriodValues1.delete((int) '4', 0);
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        int int7 = timePeriodValues6.getMinEndIndex();
        int int8 = timePeriodValues6.getMaxStartIndex();
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy(0, (int) 'a');
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj13 = timePeriodValues12.clone();
        java.lang.String str14 = timePeriodValues12.getDescription();
        java.lang.Comparable comparable15 = timePeriodValues12.getKey();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues12.removePropertyChangeListener(propertyChangeListener16);
        int int18 = timePeriodValues12.getMaxStartIndex();
        java.lang.Object obj19 = timePeriodValues12.clone();
        boolean boolean20 = timePeriodValues12.getNotify();
        int int21 = timePeriodValues12.getMaxEndIndex();
        int int22 = timePeriodValues12.getMaxStartIndex();
        java.lang.Comparable comparable23 = timePeriodValues12.getKey();
        java.lang.Object obj24 = timePeriodValues12.clone();
        java.lang.Object obj25 = timePeriodValues12.clone();
        boolean boolean26 = timePeriodValues1.equals((java.lang.Object) timePeriodValues12);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(1, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 10 + "'", comparable15, (short) 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 10 + "'", comparable23, (short) 10);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener2);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener4);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1L), "", "");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) '#', (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Class<?> wildcardClass2 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str10 = timePeriodValues3.getDomainDescription();
        java.lang.String str11 = timePeriodValues3.getRangeDescription();
        timePeriodValues3.setKey((java.lang.Comparable) 0.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timePeriodValues3.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timePeriodValues1.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod14 = null; // flaky: timePeriodValues1.getTimePeriod((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 100, (int) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) '4', (int) (short) 10);
        timePeriodValues15.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue19 = timePeriodValues15.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy(0, (int) 'a');
        int int11 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timePeriodValues1.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener3);
        timePeriodValues1.setNotify(false);
        int int7 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        boolean boolean3 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues1.createCopy((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.addChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues8.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(0, 0);
        int int7 = timePeriodValues3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) ' ', (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timePeriodValues10.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues10);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        timePeriodValues6.setDescription("hi!");
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '4', "hi!", "");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        int int9 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        boolean boolean8 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (short) 1, 1);
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.add(timePeriod12, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "");
        int int4 = timePeriodValues3.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj11 = timePeriodValues10.clone();
        java.lang.String str12 = timePeriodValues10.getRangeDescription();
        int int13 = timePeriodValues10.getMaxEndIndex();
        timePeriodValues10.fireSeriesChanged();
        boolean boolean15 = timePeriodValues3.equals((java.lang.Object) timePeriodValues10);
        java.lang.Class<?> wildcardClass16 = timePeriodValues3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int10 = timePeriodValues9.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues14.fireSeriesChanged();
        java.lang.Object obj16 = timePeriodValues14.clone();
        boolean boolean17 = timePeriodValues9.equals((java.lang.Object) timePeriodValues14);
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        timePeriodValues14.setDomainDescription("Value");
        int int21 = timePeriodValues14.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str10 = timePeriodValues3.getDescription();
        java.lang.String str11 = timePeriodValues3.getDomainDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "", "Value");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Time", "", "hi!");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues1.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues3.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener8);
        timePeriodValues3.fireSeriesChanged();
        int int11 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean6 = timePeriodValues1.equals((java.lang.Object) 100L);
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        int int9 = timePeriodValues3.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = timePeriodValues3.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getItemCount();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Object obj10 = timePeriodValues1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        int int13 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener14);
        java.lang.Class<?> wildcardClass16 = timePeriodValues3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        int int15 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues8.getMaxEndIndex();
        timePeriodValues8.setDescription("");
        int int14 = timePeriodValues8.getMinMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriod15, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setDomainDescription("Time");
        java.lang.Comparable comparable13 = timePeriodValues3.getKey();
        boolean boolean14 = timePeriodValues3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (-1.0d) + "'", comparable13, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        java.lang.String str7 = timePeriodValues1.getDescription();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1, "Value", "");
        timePeriodValues3.setDomainDescription("Time");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.lang.Object obj13 = timePeriodValues1.clone();
        java.lang.Object obj14 = timePeriodValues1.clone();
        java.lang.Object obj15 = timePeriodValues1.clone();
        java.lang.Class<?> wildcardClass16 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod19 = timePeriodValues1.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj10 = timePeriodValues9.clone();
        java.lang.String str11 = timePeriodValues9.getDescription();
        java.lang.Comparable comparable12 = timePeriodValues9.getKey();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues9.removePropertyChangeListener(propertyChangeListener13);
        int int15 = timePeriodValues9.getMinMiddleIndex();
        timePeriodValues9.setRangeDescription("Time");
        boolean boolean18 = timePeriodValues9.getNotify();
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.String str20 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValue timePeriodValue21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setKey((java.lang.Comparable) 0L);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimePeriodValue timePeriodValue13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        boolean boolean13 = timePeriodValues12.getNotify();
        timePeriodValues12.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod16 = timePeriodValues12.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        java.lang.String str8 = timePeriodValues1.getDescription();
        int int9 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 10 + "'", comparable10, (short) 10);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMinStartIndex();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setKey((java.lang.Comparable) false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) ' ', (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("hi!");
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod13, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        int int11 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable7 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 10 + "'", comparable7, (short) 10);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f, "", "hi!");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj13 = timePeriodValues12.clone();
        java.lang.String str14 = timePeriodValues12.getDescription();
        int int15 = timePeriodValues12.getItemCount();
        timePeriodValues12.fireSeriesChanged();
        timePeriodValues12.setRangeDescription("Value");
        int int19 = timePeriodValues12.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues12.removePropertyChangeListener(propertyChangeListener20);
        java.lang.String str22 = timePeriodValues12.getDescription();
        boolean boolean23 = timePeriodValues3.equals((java.lang.Object) timePeriodValues12);
        timePeriodValues12.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getMaxStartIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod10, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean6 = timePeriodValues1.equals((java.lang.Object) 100L);
        int int7 = timePeriodValues1.getMinStartIndex();
        int int8 = timePeriodValues1.getMinStartIndex();
        int int9 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        int int15 = timePeriodValues3.getMaxMiddleIndex();
        java.lang.Comparable comparable16 = timePeriodValues3.getKey();
        org.jfree.data.time.TimePeriodValue timePeriodValue17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (-1.0d) + "'", comparable16, (-1.0d));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue7 = timePeriodValues1.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10L, "", "hi!");
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod4, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        timePeriodValues3.setDescription("hi!");
        int int9 = timePeriodValues3.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setKey((java.lang.Comparable) true);
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj15 = timePeriodValues14.clone();
        java.lang.String str16 = timePeriodValues14.getDescription();
        int int17 = timePeriodValues14.getMinStartIndex();
        int int18 = timePeriodValues14.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timePeriodValues14.addChangeListener(seriesChangeListener19);
        boolean boolean21 = timePeriodValues3.equals((java.lang.Object) timePeriodValues14);
        timePeriodValues14.setDescription("Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMaxStartIndex();
        int int7 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues14.getMaxMiddleIndex();
        java.lang.Comparable comparable23 = timePeriodValues14.getKey();
        timePeriodValues14.setNotify(false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (-1.0d) + "'", comparable23, (-1.0d));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 100, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        int int10 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean9 = timePeriodValues1.getNotify();
        java.lang.String str10 = timePeriodValues1.getDescription();
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod12, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        int int6 = timePeriodValues3.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue8 = timePeriodValues3.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        boolean boolean13 = timePeriodValues12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues12.update(100, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue3 = timePeriodValues1.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        int int8 = timePeriodValues1.getMinEndIndex();
        java.lang.String str9 = timePeriodValues1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        boolean boolean8 = timePeriodValues1.isEmpty();
        int int9 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy(0, (int) 'a');
        java.lang.Object obj11 = timePeriodValues10.clone();
        int int12 = timePeriodValues10.getMinStartIndex();
        int int13 = timePeriodValues10.getMaxMiddleIndex();
        timePeriodValues10.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues10.delete((int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean9 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues1.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        int int15 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setRangeDescription("Time");
        timePeriodValues3.setNotify(false);
        timePeriodValues3.setRangeDescription("Value");
        timePeriodValues3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues3.delete((int) (byte) -1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod9, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy(0, (int) 'a');
        java.lang.Object obj11 = timePeriodValues10.clone();
        int int12 = timePeriodValues10.getMinStartIndex();
        int int13 = timePeriodValues10.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues10.createCopy((int) (byte) -1, (int) (short) 100);
        int int17 = timePeriodValues10.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 100, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("hi!");
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.delete((int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timePeriodValues1.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "");
        java.lang.String str4 = timePeriodValues3.getRangeDescription();
        java.lang.String str5 = timePeriodValues3.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues1.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        java.lang.String str12 = timePeriodValues11.getDomainDescription();
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.add(timePeriod13, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        boolean boolean8 = timePeriodValues1.isEmpty();
        int int9 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 1L);
        int int12 = timePeriodValues1.getMinStartIndex();
        int int13 = timePeriodValues1.getItemCount();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod16, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj13 = timePeriodValues12.clone();
        timePeriodValues12.fireSeriesChanged();
        java.lang.String str15 = timePeriodValues12.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues12.removePropertyChangeListener(propertyChangeListener16);
        int int18 = timePeriodValues12.getMaxStartIndex();
        java.lang.Comparable comparable19 = timePeriodValues12.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues23 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues23.setRangeDescription("hi!");
        boolean boolean26 = timePeriodValues23.isEmpty();
        int int27 = timePeriodValues23.getMaxStartIndex();
        java.lang.Comparable comparable28 = timePeriodValues23.getKey();
        boolean boolean29 = timePeriodValues12.equals((java.lang.Object) timePeriodValues23);
        boolean boolean30 = timePeriodValues1.equals((java.lang.Object) boolean29);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (-1.0d) + "'", comparable28, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1, "hi!", "");
        java.lang.Class<?> wildcardClass4 = timePeriodValues3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 10);
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setKey((java.lang.Comparable) 100);
        int int9 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMinEndIndex();
        java.lang.String str4 = timePeriodValues1.getRangeDescription();
        boolean boolean5 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod6, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        boolean boolean11 = timePeriodValues1.isEmpty();
        int int12 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy(0, (int) (short) 10);
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj18 = timePeriodValues17.clone();
        java.lang.String str19 = timePeriodValues17.getDescription();
        java.lang.Comparable comparable20 = timePeriodValues17.getKey();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timePeriodValues17.removePropertyChangeListener(propertyChangeListener21);
        int int23 = timePeriodValues17.getMaxStartIndex();
        java.lang.Object obj24 = timePeriodValues17.clone();
        boolean boolean25 = timePeriodValues17.getNotify();
        int int26 = timePeriodValues17.getMaxEndIndex();
        int int27 = timePeriodValues17.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues29 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj30 = timePeriodValues29.clone();
        java.lang.String str31 = timePeriodValues29.getDescription();
        java.lang.Comparable comparable32 = timePeriodValues29.getKey();
        int int33 = timePeriodValues29.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timePeriodValues29.addPropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimePeriodValues timePeriodValues38 = timePeriodValues29.createCopy((-1), (-1));
        boolean boolean39 = timePeriodValues17.equals((java.lang.Object) timePeriodValues38);
        int int40 = timePeriodValues17.getMaxStartIndex();
        java.lang.String str41 = timePeriodValues17.getRangeDescription();
        boolean boolean42 = timePeriodValues1.equals((java.lang.Object) str41);
        java.lang.Object obj43 = timePeriodValues1.clone();
        int int44 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value" + "'", str41, "Value");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        java.lang.Class<?> wildcardClass9 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        java.lang.String str7 = timePeriodValues3.getDescription();
        org.jfree.data.time.TimePeriodValue timePeriodValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.lang.Object obj13 = timePeriodValues1.clone();
        int int14 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timePeriodValues3.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 10, (-1));
        int int12 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener15);
        java.lang.Comparable comparable17 = timePeriodValues3.getKey();
        boolean boolean18 = timePeriodValues3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (-1.0d) + "'", comparable17, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) '4', (int) (byte) 1);
        int int12 = timePeriodValues11.getMinEndIndex();
        timePeriodValues11.setDomainDescription("");
        org.jfree.data.time.TimePeriodValue timePeriodValue15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.add(timePeriodValue15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) (short) 0, 10);
        boolean boolean13 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener14);
        boolean boolean16 = timePeriodValues1.getNotify();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue7 = timePeriodValues1.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        int int7 = timePeriodValues3.getMaxStartIndex();
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod8, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setRangeDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 100, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        boolean boolean8 = timePeriodValues1.isEmpty();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj10 = timePeriodValues9.clone();
        java.lang.String str11 = timePeriodValues9.getDescription();
        java.lang.Comparable comparable12 = timePeriodValues9.getKey();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues9.removePropertyChangeListener(propertyChangeListener13);
        int int15 = timePeriodValues9.getMinMiddleIndex();
        timePeriodValues9.setRangeDescription("Time");
        boolean boolean18 = timePeriodValues9.getNotify();
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.String str20 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.time.TimePeriod timePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod23, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener8);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 10, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getItemCount();
        int int6 = timePeriodValues3.getMinMiddleIndex();
        java.lang.Class<?> wildcardClass7 = timePeriodValues3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value");
        timePeriodValues1.setKey((java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.update((int) (short) -1, (java.lang.Number) (-1.0f));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 10);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) '4', (int) (short) -1);
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod5, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj4 = timePeriodValues1.clone();
        int int5 = timePeriodValues1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue7 = null; // flaky: timePeriodValues1.getDataItem((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy(1, (int) (short) 100);
        int int9 = timePeriodValues8.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = timePeriodValues8.getKey();
        java.lang.Comparable comparable13 = timePeriodValues8.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (short) 10 + "'", comparable13, (short) 10);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy(0, (int) 'a');
        java.lang.Object obj11 = timePeriodValues10.clone();
        int int12 = timePeriodValues10.getMinStartIndex();
        int int13 = timePeriodValues10.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues10.update((int) (byte) 1, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) '4', (int) (byte) 100);
        int int8 = timePeriodValues7.getMinStartIndex();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues7.add(timePeriod9, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str10 = timePeriodValues1.getDescription();
        int int11 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        int int6 = timePeriodValues3.getMinStartIndex();
        boolean boolean7 = timePeriodValues3.isEmpty();
        int int8 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        java.lang.Class<?> wildcardClass9 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setRangeDescription("Time");
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        java.lang.Comparable comparable11 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        boolean boolean6 = timePeriodValues3.isEmpty();
        java.lang.Object obj7 = timePeriodValues3.clone();
        int int8 = timePeriodValues3.getMaxStartIndex();
        int int9 = timePeriodValues3.getMaxEndIndex();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod10, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setKey((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.update((int) (short) -1, (java.lang.Number) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        int int5 = timePeriodValues1.getMinEndIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean5 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDomainDescription("Time");
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.delete((int) '4', (int) (short) 10);
        int int13 = timePeriodValues1.getMaxEndIndex();
        int int14 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod15, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timePeriodValues3.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        java.lang.Object obj2 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriod timePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod3, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        timePeriodValues1.setDescription("hi!");
        timePeriodValues1.setRangeDescription("Time");
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        java.lang.Class<?> wildcardClass8 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0f, "hi!", "");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener4);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.setRangeDescription("Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setNotify(true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod10, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((-1), 10);
        boolean boolean9 = timePeriodValues3.isEmpty();
        java.lang.String str10 = timePeriodValues3.getRangeDescription();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        int int9 = timePeriodValues8.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "", "", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues13.createCopy((int) (short) -1, (int) (short) -1);
        boolean boolean17 = timePeriodValues8.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        int int8 = timePeriodValues1.getMinStartIndex();
        int int9 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.lang.Object obj13 = timePeriodValues1.clone();
        java.lang.Object obj14 = timePeriodValues1.clone();
        int int15 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 10L);
        int int18 = timePeriodValues1.getItemCount();
        java.lang.Class<?> wildcardClass19 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int13 = timePeriodValues1.getItemCount();
        int int14 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timePeriodValues1.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) (short) 0, 10);
        boolean boolean13 = timePeriodValues1.getNotify();
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 100, (int) (short) 0);
        int int13 = timePeriodValues3.getItemCount();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        int int13 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue17 = timePeriodValues3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        int int12 = timePeriodValues1.getMinStartIndex();
        java.lang.Comparable comparable13 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (short) 10 + "'", comparable13, (short) 10);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (byte) 0, (int) '#');
        timePeriodValues10.setKey((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(timePeriodValues10);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setRangeDescription("Value");
        int int14 = timePeriodValues1.getMaxStartIndex();
        int int15 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod16, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) (byte) -1, (int) 'a');
        org.jfree.data.time.TimePeriodValue timePeriodValue15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues14.add(timePeriodValue15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable8 = timePeriodValues7.getKey();
        int int9 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) int9);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(1, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        boolean boolean13 = timePeriodValues1.isEmpty();
        java.lang.String str14 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod15, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        java.lang.Object obj7 = timePeriodValues1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue26 = timePeriodValues1.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = null; // flaky: timePeriodValues1.getTimePeriod((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.String str8 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) '4', (int) (byte) 100);
        timePeriodValues7.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertNotNull(timePeriodValues7);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        java.lang.Comparable comparable8 = timePeriodValues5.getKey();
        java.lang.String str9 = timePeriodValues5.getDescription();
        int int10 = timePeriodValues5.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues5.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues5.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = timePeriodValues5.clone();
        java.lang.Comparable comparable16 = timePeriodValues5.getKey();
        boolean boolean18 = timePeriodValues5.equals((java.lang.Object) (byte) 0);
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.Comparable comparable20 = timePeriodValues1.getKey();
        int int21 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        timePeriodValues11.fireSeriesChanged();
        int int15 = timePeriodValues11.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener16);
        java.lang.Class<?> wildcardClass18 = timePeriodValues11.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = timePeriodValues12.getDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj16 = timePeriodValues15.clone();
        java.lang.String str17 = timePeriodValues15.getDescription();
        int int18 = timePeriodValues15.getItemCount();
        timePeriodValues15.fireSeriesChanged();
        timePeriodValues15.setRangeDescription("Value");
        int int22 = timePeriodValues15.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timePeriodValues15.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timePeriodValues15.addChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimePeriodValues timePeriodValues29 = timePeriodValues15.createCopy((int) (short) 0, (int) (short) 1);
        boolean boolean30 = timePeriodValues12.equals((java.lang.Object) timePeriodValues15);
        timePeriodValues12.fireSeriesChanged();
        timePeriodValues12.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues3.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues1.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.String str8 = timePeriodValues3.getDescription();
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        int int10 = timePeriodValues3.getItemCount();
        boolean boolean11 = timePeriodValues3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete((int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean6 = timePeriodValues1.equals((java.lang.Object) 100L);
        int int7 = timePeriodValues1.getMinStartIndex();
        int int8 = timePeriodValues1.getMinStartIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = null; // flaky: timePeriodValues11.getTimePeriod((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Class<?> wildcardClass8 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriod timePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod2, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        int int7 = timePeriodValues3.getMaxStartIndex();
        boolean boolean8 = timePeriodValues3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod11, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy(0, (int) 'a');
        timePeriodValues3.setNotify(true);
        timePeriodValues3.setNotify(false);
        int int20 = timePeriodValues3.getMinMiddleIndex();
        java.lang.Object obj21 = null;
        boolean boolean22 = timePeriodValues3.equals(obj21);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues3.update((int) (byte) -1, (java.lang.Number) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '4', "hi!", "Value");
        int int4 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setNotify(true);
        int int7 = timePeriodValues3.getMaxEndIndex();
        int int8 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.lang.String str13 = timePeriodValues1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(100, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str10 = timePeriodValues1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timePeriodValues1.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean6 = timePeriodValues1.equals((java.lang.Object) 100L);
        int int7 = timePeriodValues1.getMinStartIndex();
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.lang.Object obj9 = timePeriodValues1.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setKey((java.lang.Comparable) true);
        int int13 = timePeriodValues3.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue15 = timePeriodValues3.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "");
        java.lang.String str4 = timePeriodValues3.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) (short) 10, 0);
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        java.lang.Number number9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues7.add(timePeriod8, number9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timePeriodValues7);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 100, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues3.getKey();
        timePeriodValues3.setNotify(true);
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues3.createCopy((int) (byte) 0, 0);
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod14, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0d) + "'", comparable8, (-1.0d));
        org.junit.Assert.assertNotNull(timePeriodValues13);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.setRangeDescription("Value");
        java.lang.String str6 = timePeriodValues3.getDescription();
        java.lang.String str7 = timePeriodValues3.getDescription();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        int int11 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        boolean boolean13 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod14, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        int int8 = timePeriodValues1.getMinEndIndex();
        boolean boolean9 = timePeriodValues1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timePeriodValues1.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        int int10 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.update((-1), (java.lang.Number) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1) + "'", comparable9, (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        int int9 = timePeriodValues3.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues3.createCopy((int) (short) -1, (int) (short) 10);
        org.jfree.data.time.TimePeriodValue timePeriodValue15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues14.add(timePeriodValue15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str10 = timePeriodValues3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues3.delete((int) (short) -1, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj7 = timePeriodValues6.clone();
        java.lang.String str8 = timePeriodValues6.getDescription();
        java.lang.Comparable comparable9 = timePeriodValues6.getKey();
        java.lang.String str10 = timePeriodValues6.getDescription();
        int int11 = timePeriodValues6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues6.getMaxStartIndex();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues6);
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = timePeriodValues1.createCopy((int) (short) -1, (int) (short) 0);
        int int21 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod22, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timePeriodValues20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 10 + "'", comparable10, (short) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.String str8 = timePeriodValues3.getDescription();
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        int int10 = timePeriodValues3.getItemCount();
        boolean boolean11 = timePeriodValues3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue13 = timePeriodValues3.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj13 = timePeriodValues12.clone();
        java.lang.String str14 = timePeriodValues12.getDescription();
        java.lang.Comparable comparable15 = timePeriodValues12.getKey();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues12.removePropertyChangeListener(propertyChangeListener16);
        int int18 = timePeriodValues12.getMaxStartIndex();
        java.lang.Object obj19 = timePeriodValues12.clone();
        boolean boolean20 = timePeriodValues12.getNotify();
        int int21 = timePeriodValues12.getMaxEndIndex();
        int int22 = timePeriodValues12.getMaxStartIndex();
        java.lang.Comparable comparable23 = timePeriodValues12.getKey();
        java.lang.Object obj24 = timePeriodValues12.clone();
        java.lang.Object obj25 = timePeriodValues12.clone();
        boolean boolean26 = timePeriodValues1.equals((java.lang.Object) timePeriodValues12);
        java.lang.String str27 = timePeriodValues1.getDomainDescription();
        java.lang.Comparable comparable28 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 10 + "'", comparable15, (short) 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 10 + "'", comparable23, (short) 10);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Time" + "'", str27, "Time");
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (short) 10 + "'", comparable28, (short) 10);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0f, "Time", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod5 = null; // flaky: timePeriodValues3.getTimePeriod((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1);
        int int2 = timePeriodValues1.getMinMiddleIndex();
        int int3 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        timePeriodValues1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int10 = timePeriodValues9.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues14.fireSeriesChanged();
        java.lang.Object obj16 = timePeriodValues14.clone();
        boolean boolean17 = timePeriodValues9.equals((java.lang.Object) timePeriodValues14);
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        timePeriodValues14.setDomainDescription("Value");
        timePeriodValues14.setDomainDescription("");
        java.lang.Class<?> wildcardClass23 = timePeriodValues14.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        timePeriodValues3.setNotify(false);
        java.lang.Class<?> wildcardClass7 = timePeriodValues3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues1.getMinMiddleIndex();
        java.lang.Class<?> wildcardClass10 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value");
        timePeriodValues1.delete(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timePeriodValues1.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0L);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        int int3 = timePeriodValues1.getItemCount();
        int int4 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        boolean boolean14 = timePeriodValues11.getNotify();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.setNotify(true);
        int int6 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues3.createCopy((int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = timePeriodValues9.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMinEndIndex();
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (-1.0f));
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int13 = timePeriodValues1.getMaxEndIndex();
        int int14 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.delete((-1), (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(0, 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10, "hi!", "");
        boolean boolean11 = timePeriodValues6.equals((java.lang.Object) timePeriodValues10);
        int int12 = timePeriodValues10.getMaxEndIndex();
        int int13 = timePeriodValues10.getMinEndIndex();
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) (short) 0, (-1));
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues4.removePropertyChangeListener(propertyChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timePeriodValues4.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = null; // flaky: timePeriodValues3.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDomainDescription("Time");
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.lang.Object obj13 = timePeriodValues1.clone();
        int int14 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        int int13 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Value");
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod16, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1L), "", "");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) (short) 1, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100, "hi!", "hi!");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj15 = timePeriodValues14.clone();
        java.lang.String str16 = timePeriodValues14.getDescription();
        int int17 = timePeriodValues14.getItemCount();
        timePeriodValues14.fireSeriesChanged();
        timePeriodValues14.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timePeriodValues14.removeChangeListener(seriesChangeListener21);
        int int23 = timePeriodValues14.getMaxEndIndex();
        boolean boolean24 = timePeriodValues14.isEmpty();
        timePeriodValues14.setDomainDescription("Value");
        timePeriodValues14.setDomainDescription("");
        int int29 = timePeriodValues14.getMaxMiddleIndex();
        java.lang.Class<?> wildcardClass30 = timePeriodValues14.getClass();
        boolean boolean31 = timePeriodValues1.equals((java.lang.Object) wildcardClass30);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        timePeriodValues1.setNotify(true);
        int int15 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDomainDescription("Value");
        timePeriodValues1.delete((int) (short) 100, (int) ' ');
        boolean boolean21 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues12.addPropertyChangeListener(propertyChangeListener13);
        int int15 = timePeriodValues12.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues12.update((int) '#', (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj7 = timePeriodValues6.clone();
        java.lang.String str8 = timePeriodValues6.getDescription();
        java.lang.Comparable comparable9 = timePeriodValues6.getKey();
        java.lang.String str10 = timePeriodValues6.getDescription();
        int int11 = timePeriodValues6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues6.getMaxStartIndex();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues6);
        int int18 = timePeriodValues1.getMaxMiddleIndex();
        int int19 = timePeriodValues1.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100L);
        int int2 = timePeriodValues1.getMaxMiddleIndex();
        int int3 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timePeriodValues1.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "Value");
        boolean boolean4 = timePeriodValues3.getNotify();
        int int5 = timePeriodValues3.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) ' ', (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        timePeriodValues3.setDescription("hi!");
        java.lang.Comparable comparable9 = timePeriodValues3.getKey();
        java.lang.Object obj10 = timePeriodValues3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 0 + "'", comparable9, (short) 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinEndIndex();
        boolean boolean10 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        int int4 = timePeriodValues3.getMinEndIndex();
        timePeriodValues3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        int int6 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setNotify(true);
        int int9 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) 'a', (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues3.createCopy((int) (short) 1, (int) ' ');
        int int19 = timePeriodValues18.getMaxEndIndex();
        int int20 = timePeriodValues18.getMaxMiddleIndex();
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues18.setKey(comparable21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Time", "hi!");
        int int4 = timePeriodValues3.getItemCount();
        timePeriodValues3.fireSeriesChanged();
        java.lang.String str6 = timePeriodValues3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update(0, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        int int5 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue7 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValue timePeriodValue9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(0, 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10, "hi!", "");
        boolean boolean11 = timePeriodValues6.equals((java.lang.Object) timePeriodValues10);
        java.lang.Comparable comparable12 = timePeriodValues6.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod14 = timePeriodValues6.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (-1.0f) + "'", comparable12, (-1.0f));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        int int4 = timePeriodValues3.getMaxEndIndex();
        int int5 = timePeriodValues3.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) (byte) 0, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues1.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        int int17 = timePeriodValues13.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = timePeriodValues13.createCopy((-1), (-1));
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues22);
        java.lang.Number number25 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.update((-1), number25);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        boolean boolean11 = timePeriodValues1.isEmpty();
        int int12 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy(0, (int) (short) 10);
        boolean boolean16 = timePeriodValues15.getNotify();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 10);
        int int13 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Class<?> wildcardClass14 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.time.TimePeriodValue timePeriodValue12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj11 = timePeriodValues10.clone();
        java.lang.String str12 = timePeriodValues10.getDescription();
        timePeriodValues10.fireSeriesChanged();
        timePeriodValues10.setDescription("Value");
        java.lang.Comparable comparable16 = timePeriodValues10.getKey();
        boolean boolean17 = timePeriodValues8.equals((java.lang.Object) comparable16);
        org.jfree.data.time.TimePeriod timePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriod18, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        int int10 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener11);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1) + "'", comparable9, (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        boolean boolean8 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (short) 1, 1);
        int int12 = timePeriodValues11.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int13 = timePeriodValues1.getItemCount();
        timePeriodValues1.delete((int) (byte) 10, (int) (byte) -1);
        java.lang.Comparable comparable17 = timePeriodValues1.getKey();
        java.lang.Class<?> wildcardClass18 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 10 + "'", comparable17, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        int int4 = timePeriodValues1.getMaxEndIndex();
        boolean boolean5 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimePeriodValue timePeriodValue12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f));
        org.jfree.data.time.TimePeriod timePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod2, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        timePeriodValues1.fireSeriesChanged();
        java.lang.Class<?> wildcardClass13 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues1.getItemCount();
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues(comparable0, "Value", "Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.Object obj5 = timePeriodValues1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1, "hi!", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable6 = timePeriodValues5.getKey();
        timePeriodValues5.setDescription("hi!");
        timePeriodValues5.setRangeDescription("Time");
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues5);
        java.lang.Class<?> wildcardClass12 = timePeriodValues3.getClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean9 = timePeriodValues1.getNotify();
        java.lang.String str10 = timePeriodValues1.getDescription();
        timePeriodValues1.setNotify(false);
        org.jfree.data.time.TimePeriodValue timePeriodValue13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMaxStartIndex();
        int int4 = timePeriodValues1.getMaxEndIndex();
        int int5 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        int int8 = timePeriodValues1.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "", "hi!");
        timePeriodValues3.setDescription("Value");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.String str4 = timePeriodValues1.getDomainDescription();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        boolean boolean7 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        java.lang.Comparable comparable8 = timePeriodValues5.getKey();
        java.lang.String str9 = timePeriodValues5.getDescription();
        int int10 = timePeriodValues5.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues5.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues5.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = timePeriodValues5.clone();
        java.lang.Comparable comparable16 = timePeriodValues5.getKey();
        boolean boolean18 = timePeriodValues5.equals((java.lang.Object) (byte) 0);
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.Object obj20 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriod timePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod21, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setKey((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.update((int) (short) -1, (java.lang.Number) (-1L));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        timePeriodValues1.setDescription("Value");
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "");
        int int4 = timePeriodValues3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update(1, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        int int8 = timePeriodValues1.getItemCount();
        boolean boolean9 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDescription("");
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues15.setRangeDescription("hi!");
        boolean boolean18 = timePeriodValues15.isEmpty();
        int int19 = timePeriodValues15.getMaxStartIndex();
        int int20 = timePeriodValues15.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timePeriodValues15.removePropertyChangeListener(propertyChangeListener21);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timePeriodValues15.addChangeListener(seriesChangeListener23);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timePeriodValues15.removeChangeListener(seriesChangeListener25);
        int int27 = timePeriodValues15.getMaxMiddleIndex();
        timePeriodValues15.setRangeDescription("hi!");
        boolean boolean30 = timePeriodValues1.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        int int8 = timePeriodValues1.getItemCount();
        timePeriodValues1.setRangeDescription("Value");
        java.lang.Comparable comparable11 = timePeriodValues1.getKey();
        int int12 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.String str4 = timePeriodValues1.getDomainDescription();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValue timePeriodValue7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues3.getKey();
        boolean boolean9 = timePeriodValues3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues3.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0d) + "'", comparable8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMaxEndIndex();
        boolean boolean5 = timePeriodValues3.isEmpty();
        java.lang.String str6 = timePeriodValues3.getDomainDescription();
        java.lang.Object obj7 = timePeriodValues3.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int13 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod17 = timePeriodValues1.getTimePeriod((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '4', "", "Time");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues3.update((int) (short) -1, (java.lang.Number) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        int int12 = timePeriodValues3.getMaxStartIndex();
        java.lang.String str13 = timePeriodValues3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timePeriodValues3.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "", "hi!");
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod4, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.String str13 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues1.getMaxEndIndex();
        int int17 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener18);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "hi!", "hi!");
        java.lang.String str4 = timePeriodValues3.getDescription();
        java.lang.String str5 = timePeriodValues3.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d);
        java.lang.Object obj2 = timePeriodValues1.clone();
        boolean boolean3 = timePeriodValues1.getNotify();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) '4', (int) (byte) 1);
        java.lang.String str12 = timePeriodValues3.getRangeDescription();
        boolean boolean13 = timePeriodValues3.isEmpty();
        int int14 = timePeriodValues3.getMinStartIndex();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        int int12 = timePeriodValues1.getMinStartIndex();
        int int13 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy(0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues3.delete((int) (byte) -1, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) '4', (int) 'a');
        timePeriodValues4.setKey((java.lang.Comparable) (byte) 100);
        java.lang.Object obj7 = timePeriodValues4.clone();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues3.getKey();
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0d) + "'", comparable8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimePeriodValue timePeriodValue10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        java.lang.String str18 = timePeriodValues17.getRangeDescription();
        java.lang.Object obj19 = timePeriodValues17.clone();
        boolean boolean20 = timePeriodValues1.equals((java.lang.Object) timePeriodValues17);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        java.lang.Object obj12 = timePeriodValues3.clone();
        int int13 = timePeriodValues3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        timePeriodValues8.setDomainDescription("");
        java.lang.Object obj11 = timePeriodValues8.clone();
        timePeriodValues8.setDescription("hi!");
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriod14, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener13);
        timePeriodValues1.setDescription("Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimePeriodValue timePeriodValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj6 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj9 = timePeriodValues8.clone();
        java.lang.String str10 = timePeriodValues8.getDescription();
        int int11 = timePeriodValues8.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues8.addPropertyChangeListener(propertyChangeListener12);
        int int14 = timePeriodValues8.getItemCount();
        boolean boolean15 = timePeriodValues8.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener16);
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) seriesChangeListener16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        timePeriodValues3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        java.lang.String str7 = timePeriodValues3.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue11 = null; // flaky: timePeriodValues3.getDataItem((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10);
        java.lang.String str2 = timePeriodValues1.getDomainDescription();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.lang.Object obj4 = timePeriodValues1.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "Time", "Time");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        int int8 = timePeriodValues1.getItemCount();
        boolean boolean9 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        int int7 = timePeriodValues6.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues6.createCopy((int) (short) 1, 1);
        java.lang.Comparable comparable11 = timePeriodValues10.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues13.setDescription("hi!");
        boolean boolean16 = timePeriodValues13.isEmpty();
        int int17 = timePeriodValues13.getMinEndIndex();
        timePeriodValues13.setDomainDescription("Value");
        java.lang.Object obj20 = timePeriodValues13.clone();
        boolean boolean21 = timePeriodValues10.equals((java.lang.Object) timePeriodValues13);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues13.update((int) (byte) 0, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 0.0d + "'", comparable11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        int int11 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean12 = timePeriodValues1.getNotify();
        int int13 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj14 = timePeriodValues1.clone();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) '4', (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        int int10 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timePeriodValues1.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1) + "'", comparable9, (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        timePeriodValues11.fireSeriesChanged();
        java.lang.Object obj15 = timePeriodValues11.clone();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues11.removePropertyChangeListener(propertyChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.update((int) (byte) 10, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues3.getKey();
        java.lang.String str9 = timePeriodValues3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = timePeriodValues3.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0d) + "'", comparable8, (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        int int5 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj8 = timePeriodValues7.clone();
        java.lang.String str9 = timePeriodValues7.getDescription();
        timePeriodValues7.setRangeDescription("hi!");
        timePeriodValues7.setKey((java.lang.Comparable) (-1));
        int int14 = timePeriodValues7.getItemCount();
        int int15 = timePeriodValues7.getMaxMiddleIndex();
        timePeriodValues7.setRangeDescription("Time");
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) timePeriodValues7);
        java.lang.String str19 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value");
        timePeriodValues1.setKey((java.lang.Comparable) 10.0f);
        java.lang.String str4 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getItemCount();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean10 = timePeriodValues1.getNotify();
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        java.lang.Object obj12 = timePeriodValues1.clone();
        int int13 = timePeriodValues1.getMaxEndIndex();
        int int14 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str15 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("hi!");
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) '4', (int) (byte) 1);
        java.lang.String str12 = timePeriodValues3.getRangeDescription();
        timePeriodValues3.setDescription("");
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod15, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        int int12 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getItemCount();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean10 = timePeriodValues1.getNotify();
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        java.lang.Object obj12 = timePeriodValues1.clone();
        java.lang.Comparable comparable13 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (-1) + "'", comparable13, (-1));
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getDescription();
        boolean boolean5 = timePeriodValues1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimePeriodValue timePeriodValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        java.lang.Comparable comparable9 = timePeriodValues8.getKey();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 0 + "'", comparable9, (short) 0);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMinEndIndex();
        int int4 = timePeriodValues1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod6 = timePeriodValues1.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "hi!", "hi!");
        java.lang.String str4 = timePeriodValues3.getDescription();
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod5, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) (short) 1, (-1));
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues14.removePropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0);
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setKey((java.lang.Comparable) (short) 10);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "");
        timePeriodValues3.setKey((java.lang.Comparable) 0L);
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod7, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues12.setRangeDescription("hi!");
        boolean boolean15 = timePeriodValues12.isEmpty();
        int int16 = timePeriodValues12.getMaxStartIndex();
        java.lang.Comparable comparable17 = timePeriodValues12.getKey();
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) timePeriodValues12);
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setDescription("Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (-1.0d) + "'", comparable17, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener10);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Time");
        int int15 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setKey((java.lang.Comparable) '4');
        boolean boolean10 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValue timePeriodValue11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setRangeDescription("Value");
        int int14 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        java.lang.Comparable comparable8 = timePeriodValues5.getKey();
        java.lang.String str9 = timePeriodValues5.getDescription();
        int int10 = timePeriodValues5.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues5.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues5.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = timePeriodValues5.clone();
        java.lang.Comparable comparable16 = timePeriodValues5.getKey();
        boolean boolean18 = timePeriodValues5.equals((java.lang.Object) (byte) 0);
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.Comparable comparable20 = timePeriodValues1.getKey();
        java.lang.Object obj21 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        timePeriodValues3.setDescription("hi!");
        java.lang.Comparable comparable9 = timePeriodValues3.getKey();
        java.lang.Object obj10 = timePeriodValues3.clone();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 0 + "'", comparable9, (short) 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0d, "Time", "Time");
        java.lang.Comparable comparable4 = timePeriodValues3.getKey();
        java.lang.String str5 = timePeriodValues3.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 100.0d + "'", comparable4, 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) (short) 1, (int) '4');
        boolean boolean8 = timePeriodValues7.isEmpty();
        int int9 = timePeriodValues7.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues7.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "hi!", "Value");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = null; // flaky: timePeriodValues3.getDataItem((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues3.delete((-1), (int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDomainDescription("");
        java.lang.String str13 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod14, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = timePeriodValues12.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues12.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        java.lang.Object obj7 = timePeriodValues1.clone();
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        java.lang.Object obj12 = timePeriodValues3.clone();
        int int13 = timePeriodValues3.getItemCount();
        int int14 = timePeriodValues3.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1, "Value", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        int int8 = timePeriodValues5.getItemCount();
        boolean boolean9 = timePeriodValues3.equals((java.lang.Object) int8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = timePeriodValues3.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int10 = timePeriodValues9.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues14.fireSeriesChanged();
        java.lang.Object obj16 = timePeriodValues14.clone();
        boolean boolean17 = timePeriodValues9.equals((java.lang.Object) timePeriodValues14);
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        timePeriodValues14.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues14.update((int) '#', (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 1, "Value", "Value");
        timePeriodValues3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue6 = timePeriodValues3.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean10 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod12 = timePeriodValues1.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues11.setRangeDescription("hi!");
        boolean boolean14 = timePeriodValues11.isEmpty();
        int int15 = timePeriodValues11.getMaxStartIndex();
        int int16 = timePeriodValues11.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues11.removePropertyChangeListener(propertyChangeListener17);
        timePeriodValues11.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timePeriodValues11.removeChangeListener(seriesChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timePeriodValues11.addPropertyChangeListener(propertyChangeListener23);
        java.lang.Comparable comparable25 = timePeriodValues11.getKey();
        boolean boolean26 = timePeriodValues1.equals((java.lang.Object) timePeriodValues11);
        int int27 = timePeriodValues11.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (-1.0d) + "'", comparable25, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        boolean boolean5 = timePeriodValues1.equals((java.lang.Object) (byte) 100);
        boolean boolean6 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Time", "hi!");
        int int4 = timePeriodValues3.getItemCount();
        int int5 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setDomainDescription("Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
        int int6 = timePeriodValues3.getItemCount();
        timePeriodValues3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        int int8 = timePeriodValues1.getMinEndIndex();
        boolean boolean9 = timePeriodValues1.isEmpty();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 10 + "'", comparable10, (short) 10);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        java.lang.Comparable comparable7 = timePeriodValues1.getKey();
        int int8 = timePeriodValues1.getMinMiddleIndex();
        int int9 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 10 + "'", comparable7, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj13 = timePeriodValues12.clone();
        java.lang.String str14 = timePeriodValues12.getDescription();
        java.lang.Comparable comparable15 = timePeriodValues12.getKey();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues12.removePropertyChangeListener(propertyChangeListener16);
        int int18 = timePeriodValues12.getMaxStartIndex();
        java.lang.Object obj19 = timePeriodValues12.clone();
        boolean boolean20 = timePeriodValues12.getNotify();
        int int21 = timePeriodValues12.getMaxEndIndex();
        int int22 = timePeriodValues12.getMaxStartIndex();
        java.lang.Comparable comparable23 = timePeriodValues12.getKey();
        java.lang.Object obj24 = timePeriodValues12.clone();
        java.lang.Object obj25 = timePeriodValues12.clone();
        boolean boolean26 = timePeriodValues1.equals((java.lang.Object) timePeriodValues12);
        boolean boolean27 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues29 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj30 = timePeriodValues29.clone();
        java.lang.String str31 = timePeriodValues29.getDescription();
        timePeriodValues29.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timePeriodValues29.addChangeListener(seriesChangeListener34);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timePeriodValues29.removeChangeListener(seriesChangeListener36);
        boolean boolean38 = timePeriodValues1.equals((java.lang.Object) timePeriodValues29);
        org.jfree.data.time.TimePeriodValues timePeriodValues41 = timePeriodValues1.createCopy((int) (short) 100, (int) 'a');
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 10 + "'", comparable15, (short) 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 10 + "'", comparable23, (short) 10);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(timePeriodValues41);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) "Time");
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) '4', (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMinEndIndex();
        int int4 = timePeriodValues1.getItemCount();
        int int5 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        timePeriodValues1.setKey((java.lang.Comparable) 10.0f);
        int int10 = timePeriodValues1.getMaxEndIndex();
        boolean boolean11 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        timePeriodValues11.fireSeriesChanged();
        java.lang.Object obj15 = timePeriodValues11.clone();
        org.jfree.data.time.TimePeriodValue timePeriodValue16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.add(timePeriodValue16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0L);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        int int8 = timePeriodValues5.getItemCount();
        timePeriodValues5.fireSeriesChanged();
        timePeriodValues5.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues5.removeChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues5.getMaxEndIndex();
        int int15 = timePeriodValues5.getMinStartIndex();
        java.lang.String str16 = timePeriodValues5.getRangeDescription();
        boolean boolean17 = timePeriodValues5.getNotify();
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) timePeriodValues5);
        java.lang.String str19 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriod timePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod20, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener23);
        int int25 = timePeriodValues1.getMinEndIndex();
        int int26 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) "Value");
        org.jfree.data.time.TimePeriod timePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod29, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        java.lang.Object obj9 = timePeriodValues1.clone();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        int int12 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.delete((int) (byte) 0, (int) (short) -1);
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = timePeriodValues1.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy(1, (int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        java.lang.String str12 = timePeriodValues11.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj15 = timePeriodValues14.clone();
        java.lang.String str16 = timePeriodValues14.getDescription();
        java.lang.Comparable comparable17 = timePeriodValues14.getKey();
        java.lang.String str18 = timePeriodValues14.getDescription();
        int int19 = timePeriodValues14.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues14.removePropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues14.addPropertyChangeListener(propertyChangeListener22);
        java.lang.Object obj24 = timePeriodValues14.clone();
        java.lang.Comparable comparable25 = timePeriodValues14.getKey();
        boolean boolean26 = timePeriodValues11.equals((java.lang.Object) timePeriodValues14);
        timePeriodValues14.setKey((java.lang.Comparable) 100L);
        int int29 = timePeriodValues14.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 10 + "'", comparable17, (short) 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (short) 10 + "'", comparable25, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod12 = timePeriodValues1.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0);
        int int2 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener8);
        java.lang.Comparable comparable10 = timePeriodValues3.getKey();
        boolean boolean11 = timePeriodValues3.getNotify();
        java.lang.String str12 = timePeriodValues3.getRangeDescription();
        java.lang.String str13 = timePeriodValues3.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (-1.0d) + "'", comparable10, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinStartIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean12 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener13);
        timePeriodValues1.setKey((java.lang.Comparable) "Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod18 = timePeriodValues1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMaxStartIndex();
        java.lang.Class<?> wildcardClass6 = timePeriodValues3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.String str4 = timePeriodValues1.getDomainDescription();
        java.lang.String str5 = timePeriodValues1.getDomainDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        int int12 = timePeriodValues8.getMinStartIndex();
        boolean boolean13 = timePeriodValues8.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        java.lang.Comparable comparable8 = timePeriodValues5.getKey();
        java.lang.String str9 = timePeriodValues5.getDescription();
        int int10 = timePeriodValues5.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues5.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues5.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = timePeriodValues5.clone();
        java.lang.Comparable comparable16 = timePeriodValues5.getKey();
        boolean boolean18 = timePeriodValues5.equals((java.lang.Object) (byte) 0);
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        int int20 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Value");
        boolean boolean11 = timePeriodValues1.getNotify();
        timePeriodValues1.setNotify(false);
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy((int) (byte) 100, 10);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy(1, (int) (short) 100);
        int int9 = timePeriodValues8.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues8.createCopy((int) ' ', (int) '4');
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriod13, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues12);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        timePeriodValues1.setDomainDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        java.lang.String str17 = timePeriodValues13.getDescription();
        int int18 = timePeriodValues13.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timePeriodValues13.removePropertyChangeListener(propertyChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener21);
        java.lang.Object obj23 = timePeriodValues13.clone();
        boolean boolean24 = timePeriodValues1.equals(obj23);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(0, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getItemCount();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener8);
        java.lang.Comparable comparable10 = timePeriodValues3.getKey();
        boolean boolean11 = timePeriodValues3.getNotify();
        java.lang.String str12 = timePeriodValues3.getRangeDescription();
        int int13 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setDescription("Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (-1.0d) + "'", comparable10, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) '4', (int) (byte) 1);
        java.lang.String str12 = timePeriodValues3.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy(1, (int) (short) 100);
        int int9 = timePeriodValues8.getItemCount();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriod10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        java.lang.Comparable comparable7 = timePeriodValues1.getKey();
        int int8 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 10 + "'", comparable7, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        java.lang.String str9 = timePeriodValues1.getDescription();
        boolean boolean10 = timePeriodValues1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod12 = null; // flaky: timePeriodValues1.getTimePeriod((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0);
        timePeriodValues1.setNotify(false);
        int int4 = timePeriodValues1.getMinStartIndex();
        java.lang.Class<?> wildcardClass5 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("hi!");
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timePeriodValues1.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues11.setRangeDescription("hi!");
        boolean boolean14 = timePeriodValues11.isEmpty();
        int int15 = timePeriodValues11.getMaxStartIndex();
        int int16 = timePeriodValues11.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues11.removePropertyChangeListener(propertyChangeListener17);
        timePeriodValues11.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timePeriodValues11.removeChangeListener(seriesChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timePeriodValues11.addPropertyChangeListener(propertyChangeListener23);
        java.lang.Comparable comparable25 = timePeriodValues11.getKey();
        boolean boolean26 = timePeriodValues1.equals((java.lang.Object) timePeriodValues11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod28 = null; // flaky: timePeriodValues1.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (-1.0d) + "'", comparable25, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "");
        java.lang.String str4 = timePeriodValues3.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) (short) 10, 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) '4', (int) '#');
        java.lang.String str11 = timePeriodValues3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = timePeriodValues1.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str10 = timePeriodValues3.getDomainDescription();
        java.lang.String str11 = timePeriodValues3.getRangeDescription();
        timePeriodValues3.setKey((java.lang.Comparable) 0.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener14);
        java.lang.Object obj16 = timePeriodValues3.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue9 = timePeriodValues1.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy(1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues12);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setKey((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue14 = timePeriodValues3.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10, "hi!", "Time");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.delete((int) (short) 100, (int) '#');
        timePeriodValues1.setDomainDescription("Value");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        int int8 = timePeriodValues5.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues5.addPropertyChangeListener(propertyChangeListener9);
        boolean boolean11 = timePeriodValues5.isEmpty();
        java.lang.String str12 = timePeriodValues5.getDomainDescription();
        boolean boolean13 = timePeriodValues1.equals((java.lang.Object) str12);
        timePeriodValues1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue17 = timePeriodValues1.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) 10 + "'", comparable3, (short) 10);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getItemCount();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue13 = timePeriodValues1.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable8 = timePeriodValues7.getKey();
        int int9 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) int9);
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0d, "hi!", "");
        boolean boolean4 = timePeriodValues3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 100, (int) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) '4', (int) (short) 10);
        java.lang.Comparable comparable16 = timePeriodValues3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) (byte) 100, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (-1.0d) + "'", comparable16, (-1.0d));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getItemCount();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean10 = timePeriodValues1.getNotify();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) (short) 100, (int) 'a');
        int int15 = timePeriodValues14.getMinMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.lang.String str13 = timePeriodValues1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.update((-1), (java.lang.Number) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj10 = timePeriodValues9.clone();
        java.lang.String str11 = timePeriodValues9.getRangeDescription();
        int int12 = timePeriodValues9.getMaxEndIndex();
        java.lang.Comparable comparable13 = timePeriodValues9.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int18 = timePeriodValues17.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues22.fireSeriesChanged();
        java.lang.Object obj24 = timePeriodValues22.clone();
        boolean boolean25 = timePeriodValues17.equals((java.lang.Object) timePeriodValues22);
        boolean boolean26 = timePeriodValues9.equals((java.lang.Object) timePeriodValues22);
        boolean boolean27 = timePeriodValues3.equals((java.lang.Object) timePeriodValues22);
        timePeriodValues22.setRangeDescription("Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (short) 10 + "'", comparable13, (short) 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        int int6 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValue timePeriodValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "hi!", "Value");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setKey((java.lang.Comparable) true);
        java.lang.Object obj13 = timePeriodValues3.clone();
        timePeriodValues3.setKey((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setDomainDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (-1) + "'", comparable10, (-1));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "");
        timePeriodValues3.setKey((java.lang.Comparable) 0L);
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue8 = null; // flaky: timePeriodValues3.getDataItem((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 0);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 100, (int) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) '4', (int) (short) 10);
        timePeriodValues15.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues15.update((int) (short) 1, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        int int8 = timePeriodValues5.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues5.addPropertyChangeListener(propertyChangeListener9);
        boolean boolean11 = timePeriodValues5.isEmpty();
        java.lang.String str12 = timePeriodValues5.getDomainDescription();
        boolean boolean13 = timePeriodValues1.equals((java.lang.Object) str12);
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod14, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) 10 + "'", comparable3, (short) 10);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Time", "hi!");
        int int4 = timePeriodValues3.getItemCount();
        timePeriodValues3.setDescription("Value");
        int int7 = timePeriodValues3.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.addChangeListener(seriesChangeListener9);
        timePeriodValues8.delete(100, (int) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues8.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        timePeriodValues1.setRangeDescription("");
        int int12 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0L);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener3);
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Value");
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "Value");
        java.lang.Object obj4 = timePeriodValues3.clone();
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener23);
        java.lang.String str25 = timePeriodValues1.getDomainDescription();
        int int26 = timePeriodValues1.getMaxStartIndex();
        int int27 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener28);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(10, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues1.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value");
        timePeriodValues1.delete(0, (int) (short) -1);
        boolean boolean5 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        int int8 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        timePeriodValues1.setKey((java.lang.Comparable) 10.0f);
        int int10 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 10);
        int int13 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener14);
        java.lang.String str16 = timePeriodValues1.getDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int10 = timePeriodValues9.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues14.fireSeriesChanged();
        java.lang.Object obj16 = timePeriodValues14.clone();
        boolean boolean17 = timePeriodValues9.equals((java.lang.Object) timePeriodValues14);
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        timePeriodValues1.setNotify(true);
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.setKey(comparable21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        int int8 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        java.lang.Class<?> wildcardClass4 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues3.getItemCount();
        timePeriodValues3.delete((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDomainDescription("");
        int int12 = timePeriodValues1.getMaxStartIndex();
        java.lang.Class<?> wildcardClass13 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.setRangeDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener12);
        timePeriodValues3.setDomainDescription("Value");
        timePeriodValues3.setKey((java.lang.Comparable) 10L);
        org.jfree.data.time.TimePeriodValue timePeriodValue18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1L), "", "Time");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod6, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriod timePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod3, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues1.getMinStartIndex();
        int int12 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d);
        boolean boolean15 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        timePeriodValues14.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        boolean boolean11 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        int int16 = timePeriodValues13.getItemCount();
        timePeriodValues13.fireSeriesChanged();
        timePeriodValues13.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timePeriodValues13.removeChangeListener(seriesChangeListener20);
        int int22 = timePeriodValues13.getMaxEndIndex();
        boolean boolean23 = timePeriodValues13.isEmpty();
        int int24 = timePeriodValues13.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues27 = timePeriodValues13.createCopy(0, (int) (short) 10);
        boolean boolean28 = timePeriodValues1.equals((java.lang.Object) (short) 10);
        int int29 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriod12, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }
}
