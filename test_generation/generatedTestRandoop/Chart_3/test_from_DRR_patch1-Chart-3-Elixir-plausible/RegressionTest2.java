import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        java.lang.String str10 = timeSeries8.getDescription();
        double double11 = timeSeries8.getMinY();
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries8.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Time");
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries3.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.Comparable comparable7 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10L + "'", comparable6, 10L);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10L + "'", comparable7, 10L);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        double double27 = timeSeries3.getMinY();
        boolean boolean28 = timeSeries3.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        int int2 = timeSeries1.getMaximumItemCount();
        boolean boolean3 = timeSeries1.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        long long33 = timeSeries24.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries24.addOrUpdate(regularTimePeriod34, (java.lang.Number) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        java.lang.String str11 = timeSeries3.getDescription();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        boolean boolean11 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.clear();
        int int15 = timeSeries3.getItemCount();
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setKey(comparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        timeSeries3.setMaximumItemCount((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries3.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        int int4 = timeSeries1.getMaximumItemCount();
        java.util.List list5 = timeSeries1.getItems();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.addChangeListener(seriesChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries1.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        timeSeries1.removeAgedItems((long) (short) 10, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries1.addOrUpdate(timeSeriesDataItem26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class23 = timeSeries22.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str28 = timeSeries27.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries34.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries41.removeAgedItems(true);
        int int44 = timeSeries41.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries37.addAndOrUpdate(timeSeries41);
        boolean boolean46 = timeSeries45.getNotify();
        java.util.Collection collection47 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        timeSeries22.setDomainDescription("Overwritten values from: 10");
        timeSeries22.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries55.addPropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = timeSeries55.isEmpty();
        timeSeries55.clear();
        int int60 = timeSeries55.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries22.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries65.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries65.createCopy((int) (short) 10, (int) ' ');
        boolean boolean71 = timeSeries22.equals((java.lang.Object) timeSeries65);
        boolean boolean72 = timeSeries11.equals((java.lang.Object) timeSeries22);
        java.lang.Comparable comparable73 = timeSeries22.getKey();
        double double74 = timeSeries22.getMaxY();
        timeSeries22.setDescription("Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod77 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.update(regularTimePeriod77, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(class23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + comparable73 + "' != '" + 10L + "'", comparable73, 10L);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Overwritten values from: 100", "Overwritten values from: 10");
        timeSeries3.removeAgedItems(100L, false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Overwritten values from: Overwritten values from: 10", "hi!");
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod11, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        java.lang.Comparable comparable21 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 10L + "'", comparable21, 10L);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems(false);
        double double9 = timeSeries3.getMaxY();
        int int10 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        timeSeries3.setNotify(false);
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d));
        java.util.Collection collection21 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "Overwritten values from: 10");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        timeSeries3.setDescription("");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        timeSeries26.removeAgedItems(false);
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries25 = timeSeries1.createCopy((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        timeSeries3.removeAgedItems(true);
        java.lang.Object obj7 = timeSeries3.clone();
        timeSeries3.setDomainDescription("Overwritten values from: 100");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str14 = timeSeries13.getDomainDescription();
        long long15 = timeSeries13.getMaximumItemAge();
        boolean boolean16 = timeSeries13.isEmpty();
        timeSeries13.setDomainDescription("hi!");
        timeSeries13.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str25 = timeSeries24.getDomainDescription();
        timeSeries24.setRangeDescription("hi!");
        timeSeries24.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries24.removeChangeListener(seriesChangeListener30);
        boolean boolean32 = timeSeries24.getNotify();
        java.util.Collection collection33 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.util.List list34 = timeSeries13.getItems();
        java.util.Collection collection35 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod36, (java.lang.Number) Double.NaN, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "Value", "Overwritten values from: Overwritten values from: 10");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "hi!", "");
        java.lang.Class<?> wildcardClass4 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        boolean boolean11 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.clear();
        java.lang.Class<?> wildcardClass15 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        timeSeries17.removeAgedItems(false);
        int int26 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update(regularTimePeriod27, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        int int8 = timeSeries3.getItemCount();
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        boolean boolean10 = timeSeries3.getNotify();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        java.lang.Class class19 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str24 = timeSeries23.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries23.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries30.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries23.addAndOrUpdate(timeSeries30);
        long long34 = timeSeries30.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries30.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries3.addAndOrUpdate(timeSeries37);
        timeSeries38.fireSeriesChanged();
        java.util.Collection collection40 = timeSeries38.getTimePeriods();
        timeSeries38.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries38.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        boolean boolean33 = timeSeries17.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries17.addOrUpdate(regularTimePeriod34, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        timeSeries10.setMaximumItemAge((long) (byte) 10);
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries1.addChangeListener(seriesChangeListener24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod26, (java.lang.Number) Double.NaN);
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (java.lang.Number) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        timeSeries1.setDescription("Overwritten values from: Overwritten values from: 10");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries10.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.createCopy(0, 0);
        timeSeries18.removeAgedItems((long) (short) 100, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries18.addOrUpdate(timeSeriesDataItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        boolean boolean11 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str16 = timeSeries15.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        int int32 = timeSeries29.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries25.addAndOrUpdate(timeSeries29);
        boolean boolean34 = timeSeries33.getNotify();
        int int35 = timeSeries33.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries33.createCopy((int) (byte) 10, (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.addAndOrUpdate(timeSeries33);
        boolean boolean40 = timeSeries33.getNotify();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        boolean boolean9 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(regularTimePeriod8, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        double double7 = timeSeries3.getMaxY();
        java.lang.Class<?> wildcardClass8 = timeSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        timeSeries52.clear();
        timeSeries52.removeAgedItems((long) '4', false);
        java.util.List list64 = timeSeries52.getItems();
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
        org.junit.Assert.assertNotNull(list64);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries3.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries3.getDataItem(regularTimePeriod33);
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class23 = timeSeries22.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str28 = timeSeries27.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries34.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries41.removeAgedItems(true);
        int int44 = timeSeries41.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries37.addAndOrUpdate(timeSeries41);
        boolean boolean46 = timeSeries45.getNotify();
        java.util.Collection collection47 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        timeSeries22.setDomainDescription("Overwritten values from: 10");
        timeSeries22.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries55.addPropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = timeSeries55.isEmpty();
        timeSeries55.clear();
        int int60 = timeSeries55.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries22.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries65.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries65.createCopy((int) (short) 10, (int) ' ');
        boolean boolean71 = timeSeries22.equals((java.lang.Object) timeSeries65);
        boolean boolean72 = timeSeries11.equals((java.lang.Object) timeSeries22);
        timeSeries22.removeAgedItems((long) 1, false);
        timeSeries22.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod78 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.delete(regularTimePeriod78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(class23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        boolean boolean31 = timeSeries19.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = null; // flaky: timeSeries19.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
            timeSeries21.add(regularTimePeriod24, (double) (short) 10);
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null; // flaky: timeSeries26.getDataItem((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        timeSeries16.setRangeDescription("hi!");
        long long20 = timeSeries16.getMaximumItemAge();
        java.util.Collection collection21 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries24 = timeSeries16.createCopy((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries20.removeAgedItems(true);
        int int23 = timeSeries20.getMaximumItemCount();
        timeSeries20.setKey((java.lang.Comparable) 100);
        java.lang.String str26 = timeSeries20.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str31 = timeSeries30.getDomainDescription();
        timeSeries30.setRangeDescription("");
        java.util.Collection collection34 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        boolean boolean35 = timeSeries3.equals((java.lang.Object) collection34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d);
        java.lang.Object obj38 = timeSeries37.clone();
        java.util.List list39 = timeSeries37.getItems();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str45 = timeSeries44.getDomainDescription();
        long long46 = timeSeries44.getMaximumItemAge();
        boolean boolean47 = timeSeries44.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries51.removeAgedItems(true);
        java.lang.Class class54 = timeSeries51.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries44.addAndOrUpdate(timeSeries51);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries44.removePropertyChangeListener(propertyChangeListener56);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries37.addAndOrUpdate(timeSeries44);
        java.lang.Class class59 = timeSeries44.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number61 = timeSeries44.getValue(regularTimePeriod60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 9223372036854775807L + "'", long46 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(class54);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNull(class59);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setRangeDescription("");
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries3.addOrUpdate(regularTimePeriod48, (java.lang.Number) 2147483647);
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        java.util.Collection collection55 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '4', (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(collection55);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getDataItem(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        int int4 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        timeSeries1.setDescription("hi!");
        timeSeries1.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        timeSeries17.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class30 = timeSeries29.getTimePeriodClass();
        timeSeries29.removeAgedItems(true);
        java.lang.Object obj33 = timeSeries29.clone();
        java.util.Collection collection34 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries29.addOrUpdate(timeSeriesDataItem35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem69 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries68.add(timeSeriesDataItem69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        java.lang.Class class19 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str24 = timeSeries23.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries23.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries30.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries23.addAndOrUpdate(timeSeries30);
        long long34 = timeSeries30.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries30.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries3.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries37.add(regularTimePeriod39, (java.lang.Number) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
            java.lang.Number number13 = null; // flaky: timeSeries3.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        boolean boolean42 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries3.addOrUpdate(regularTimePeriod43, (double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        int int8 = timeSeries3.getItemCount();
        boolean boolean9 = timeSeries3.getNotify();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries1.createCopy((int) (short) 0, 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        double double35 = timeSeries3.getMinY();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        int int23 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries26 = timeSeries22.createCopy(regularTimePeriod24, regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        java.util.List list29 = timeSeries28.getItems();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        timeSeries31.fireSeriesChanged();
        java.lang.Object obj34 = timeSeries31.clone();
        timeSeries31.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries28.addAndOrUpdate(timeSeries31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries31.add(regularTimePeriod38, (double) (byte) 10, false);
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
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries(comparable0, "Value", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries3.clone();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries3.addOrUpdate(regularTimePeriod18, (java.lang.Number) 10);
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount((int) (short) 10);
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        double double9 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems(0L, true);
        java.lang.Object obj13 = timeSeries3.clone();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.lang.Object obj6 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((int) (short) -1, 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        timeSeries3.setKey((java.lang.Comparable) 10.0f);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        long long11 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(1, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
            timeSeries12.add(regularTimePeriod20, (java.lang.Number) (byte) 1);
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        double double58 = timeSeries16.getMaxY();
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
        org.junit.Assert.assertTrue(Double.isNaN(double58));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        timeSeries3.setDescription("Time");
        java.util.List list19 = timeSeries3.getItems();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries3.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod22, (double) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        boolean boolean41 = timeSeries40.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries40.getDataItem((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        timeSeries3.setMaximumItemAge(0L);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        double double31 = timeSeries26.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = timeSeries26.getIndex(regularTimePeriod32);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        timeSeries17.setDescription("Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str48 = timeSeries47.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries47.addPropertyChangeListener(propertyChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries54.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries47.addAndOrUpdate(timeSeries54);
        java.util.List list58 = timeSeries54.getItems();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries38.addAndOrUpdate(timeSeries54);
        int int60 = timeSeries38.getItemCount();
        boolean boolean61 = timeSeries38.getNotify();
        double double62 = timeSeries38.getMinY();
        java.util.Collection collection63 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod64 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries38.add(regularTimePeriod64, (java.lang.Number) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        timeSeries3.setMaximumItemAge((long) 2147483647);
        timeSeries3.setMaximumItemAge(9223372036854775807L);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        int int9 = timeSeries3.getMaximumItemCount();
        int int10 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(regularTimePeriod11, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        timeSeries3.removeAgedItems((long) 1, true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries19.addOrUpdate(regularTimePeriod20, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        int int4 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) 100, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.clear();
        timeSeries3.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.getDataItem(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries11.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class17 = timeSeries11.getTimePeriodClass();
        java.lang.String str18 = timeSeries11.getDomainDescription();
        timeSeries11.setRangeDescription("Value");
        int int21 = timeSeries11.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries11.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.lang.String str25 = timeSeries24.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        java.lang.Class class24 = timeSeries21.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null; // flaky: timeSeries21.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNull(class24);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        java.lang.String str22 = timeSeries13.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.delete(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        java.lang.String str24 = timeSeries1.getDomainDescription();
        timeSeries1.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Time" + "'", str24, "Time");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        java.lang.String str20 = timeSeries10.getRangeDescription();
        java.lang.String str21 = timeSeries10.getDescription();
        java.lang.String str22 = timeSeries10.getDomainDescription();
        timeSeries10.setKey((java.lang.Comparable) 1.0f);
        timeSeries10.setMaximumItemCount(1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        double double9 = timeSeries3.getMaxY();
        boolean boolean10 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Time");
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        long long33 = timeSeries24.getMaximumItemAge();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.add(timeSeriesDataItem34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        boolean boolean7 = timeSeries3.isEmpty();
        java.lang.Object obj8 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        timeSeries3.removeAgedItems((long) (short) 1, true);
        timeSeries3.setRangeDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.update((-1), (java.lang.Number) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Time");
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        timeSeries3.setMaximumItemAge((long) 0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        timeSeries3.removeAgedItems(true);
        java.lang.Object obj7 = timeSeries3.clone();
        timeSeries3.setDomainDescription("Overwritten values from: 100");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str14 = timeSeries13.getDomainDescription();
        long long15 = timeSeries13.getMaximumItemAge();
        boolean boolean16 = timeSeries13.isEmpty();
        timeSeries13.setDomainDescription("hi!");
        timeSeries13.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str25 = timeSeries24.getDomainDescription();
        timeSeries24.setRangeDescription("hi!");
        timeSeries24.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries24.removeChangeListener(seriesChangeListener30);
        boolean boolean32 = timeSeries24.getNotify();
        java.util.Collection collection33 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.util.List list34 = timeSeries13.getItems();
        java.util.Collection collection35 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        timeSeries13.setKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
            int int25 = timeSeries17.getIndex(regularTimePeriod24);
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
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        java.lang.Class class24 = timeSeries21.getTimePeriodClass();
        java.lang.Object obj25 = timeSeries21.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries21.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 0, (int) (short) -1);
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
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 10L + "'", comparable31, 10L);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        int int93 = timeSeries3.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "Overwritten values from: 10");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod5, (double) 1.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Overwritten values from: 10" + "'", str4, "Overwritten values from: 10");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        timeSeries3.removeAgedItems((long) (short) 1, true);
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.lang.String str6 = timeSeries3.getDescription();
        java.lang.Object obj7 = timeSeries3.clone();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        int int9 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        boolean boolean43 = timeSeries3.isEmpty();
        boolean boolean44 = timeSeries3.isEmpty();
        timeSeries3.setMaximumItemCount((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        timeSeries3.setDescription("Time");
        java.util.List list19 = timeSeries3.getItems();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries3.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries3.addOrUpdate(timeSeriesDataItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d));
        java.util.Collection collection21 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        java.lang.String str22 = timeSeries20.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "Overwritten values from: 10");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        double double5 = timeSeries3.getMinY();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Overwritten values from: 10" + "'", str4, "Overwritten values from: 10");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.lang.Object obj9 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries3.getValue(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries3.getDescription();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        timeSeries3.removeAgedItems((long) (short) 1, true);
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        boolean boolean31 = timeSeries19.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries19.getDataItem(regularTimePeriod32);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemAge(9223372036854775807L);
        java.lang.Object obj12 = timeSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        timeSeries3.setMaximumItemAge(0L);
        java.lang.String str10 = timeSeries3.getRangeDescription();
        int int11 = timeSeries3.getMaximumItemCount();
        timeSeries3.setMaximumItemAge((long) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (java.lang.Number) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        long long4 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries3.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        int int16 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod17, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries3.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class42 = timeSeries41.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str47 = timeSeries46.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries46.addPropertyChangeListener(propertyChangeListener48);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries53.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries46.addAndOrUpdate(timeSeries53);
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries60.removeAgedItems(true);
        int int63 = timeSeries60.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries56.addAndOrUpdate(timeSeries60);
        boolean boolean65 = timeSeries64.getNotify();
        java.util.Collection collection66 = timeSeries41.getTimePeriodsUniqueToOtherSeries(timeSeries64);
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str71 = timeSeries70.getDomainDescription();
        timeSeries70.setRangeDescription("hi!");
        java.util.Collection collection74 = timeSeries70.getTimePeriods();
        java.lang.Comparable comparable75 = timeSeries70.getKey();
        boolean boolean76 = timeSeries41.equals((java.lang.Object) comparable75);
        java.util.Collection collection77 = timeSeries27.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries80 = timeSeries41.createCopy((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNull(class42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertEquals("'" + comparable75 + "' != '" + 10L + "'", comparable75, 10L);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(collection77);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        timeSeries24.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = timeSeries24.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        timeSeries3.setDomainDescription("hi!");
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (double) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        java.lang.String str10 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries14.removeAgedItems(true);
        int int17 = timeSeries14.getMaximumItemCount();
        double double18 = timeSeries14.getMaxY();
        timeSeries14.removeAgedItems(true);
        timeSeries14.setMaximumItemAge(9223372036854775807L);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.addAndOrUpdate(timeSeries14);
        boolean boolean24 = timeSeries23.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        timeSeries3.setDescription("Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries3.getValue(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        int int8 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries34 = timeSeries3.createCopy(regularTimePeriod32, regularTimePeriod33);
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
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 10L + "'", comparable31, 10L);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems(false);
        timeSeries3.setMaximumItemAge((long) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (java.lang.Number) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        boolean boolean27 = timeSeries21.getNotify();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        java.lang.String str33 = timeSeries17.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries17.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries10.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.createCopy(0, 0);
        long long19 = timeSeries18.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.setMaximumItemAge((long) ' ');
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        java.lang.String str10 = timeSeries3.getDescription();
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(timeSeriesDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        double double16 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod17, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        java.lang.String str33 = timeSeries17.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class38 = timeSeries37.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str43 = timeSeries42.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries49.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries42.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries56.removeAgedItems(true);
        int int59 = timeSeries56.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries52.addAndOrUpdate(timeSeries56);
        boolean boolean61 = timeSeries60.getNotify();
        java.util.Collection collection62 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries60);
        timeSeries37.setDomainDescription("Overwritten values from: 10");
        timeSeries37.fireSeriesChanged();
        boolean boolean66 = timeSeries17.equals((java.lang.Object) timeSeries37);
        long long67 = timeSeries17.getMaximumItemAge();
        timeSeries17.removeAgedItems((long) (byte) 0, false);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries17.createCopy((int) 'a', (int) (byte) 100);
        java.lang.String str74 = timeSeries73.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod75 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number76 = timeSeries73.getValue(regularTimePeriod75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 9223372036854775807L + "'", long67 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        java.lang.Number number35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.update(regularTimePeriod34, number35);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        timeSeries3.setDescription("Overwritten values from: 10");
        java.lang.String str10 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (java.lang.Number) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Overwritten values from: 10" + "'", str10, "Overwritten values from: 10");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries1.addChangeListener(seriesChangeListener24);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries1.addChangeListener(seriesChangeListener26);
        long long28 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9223372036854775807L + "'", long28 == 9223372036854775807L);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "Value", "Time");
        timeSeries3.removeAgedItems(false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDescription("Time");
        java.lang.Class class14 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        double double24 = timeSeries17.getMinY();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str29 = timeSeries28.getDomainDescription();
        long long30 = timeSeries28.getMaximumItemAge();
        java.lang.String str31 = timeSeries28.getDescription();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries17.addAndOrUpdate(timeSeries28);
        java.lang.Comparable comparable33 = timeSeries17.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update(1, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + 10L + "'", comparable33, 10L);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.List list8 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        java.util.List list29 = timeSeries28.getItems();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        timeSeries31.fireSeriesChanged();
        java.lang.Object obj34 = timeSeries31.clone();
        timeSeries31.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries28.addAndOrUpdate(timeSeries31);
        boolean boolean38 = timeSeries28.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries28.addChangeListener(seriesChangeListener39);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str16 = timeSeries15.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries22);
        timeSeries22.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries22.createCopy(0, 0);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries3.addAndOrUpdate(timeSeries22);
        java.lang.String str32 = timeSeries22.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        int int23 = timeSeries11.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update(regularTimePeriod24, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries29.add(timeSeriesDataItem33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        int int15 = timeSeries10.getItemCount();
        boolean boolean16 = timeSeries10.getNotify();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (double) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        java.lang.String str27 = timeSeries23.getRangeDescription();
        java.lang.Comparable comparable28 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        timeSeries32.setRangeDescription("hi!");
        boolean boolean36 = timeSeries23.equals((java.lang.Object) "hi!");
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str41 = timeSeries40.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries40.addPropertyChangeListener(propertyChangeListener42);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries47.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries40.addAndOrUpdate(timeSeries47);
        java.util.List list51 = timeSeries47.getItems();
        java.lang.Object obj52 = null;
        boolean boolean53 = timeSeries47.equals(obj52);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries23.addAndOrUpdate(timeSeries47);
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries3.addAndOrUpdate(timeSeries23);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.delete((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 10L + "'", comparable28, 10L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(timeSeries55);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
            timeSeries3.update(regularTimePeriod17, (java.lang.Number) 9223372036854775807L);
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        java.lang.String str16 = timeSeries10.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str21 = timeSeries20.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener22);
        timeSeries20.setKey((java.lang.Comparable) 10.0f);
        java.util.Collection collection26 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        timeSeries20.setDomainDescription("Value");
        boolean boolean29 = timeSeries20.isEmpty();
        timeSeries20.removeAgedItems(0L, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener16);
        long long18 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        boolean boolean50 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = timeSeries3.getTimePeriod(0);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 10L + "'", comparable37, 10L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str14 = timeSeries13.getDomainDescription();
        timeSeries13.setRangeDescription("");
        java.util.Collection collection17 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeSeries3.getIndex(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        timeSeries10.setRangeDescription("Time");
        timeSeries10.removeAgedItems((long) (byte) 10, true);
        timeSeries10.removeAgedItems((-1L), true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        timeSeries3.setMaximumItemAge((long) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(regularTimePeriod8, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
            timeSeries19.add(regularTimePeriod39, (java.lang.Number) 1L);
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
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount((int) (short) 10);
        double double8 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.update((-1), (java.lang.Number) 0.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        boolean boolean8 = timeSeries3.isEmpty();
        boolean boolean9 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("Overwritten values from: 100");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, "Value", "hi!");
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.addAndOrUpdate(timeSeries15);
        timeSeries3.setDomainDescription("Overwritten values from: hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        timeSeries3.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (double) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        timeSeries3.removeAgedItems((long) 1, false);
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        java.lang.String str19 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.createCopy(regularTimePeriod20, regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", "Value", "hi!");
        java.lang.String str64 = timeSeries63.getRangeDescription();
        java.lang.Object obj65 = timeSeries63.clone();
        boolean boolean66 = timeSeries63.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries10.addAndOrUpdate(timeSeries63);
        java.lang.String str68 = timeSeries67.getDomainDescription();
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
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Time" + "'", str68, "Time");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        int int8 = timeSeries3.getItemCount();
        timeSeries3.setDomainDescription("");
        java.lang.String str11 = timeSeries3.getDomainDescription();
        long long12 = timeSeries3.getMaximumItemAge();
        java.util.List list13 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setRangeDescription("Time");
        int int11 = timeSeries3.getItemCount();
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        int int13 = timeSeries3.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
            org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = timeSeries3.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        timeSeries16.setRangeDescription("hi!");
        timeSeries16.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries16.removeChangeListener(seriesChangeListener22);
        timeSeries16.fireSeriesChanged();
        timeSeries16.setDescription("Time");
        timeSeries16.setMaximumItemAge((long) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries3.addAndOrUpdate(timeSeries16);
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDomainDescription("Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries3.addOrUpdate(timeSeriesDataItem33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod2, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        int int23 = timeSeries22.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        boolean boolean26 = timeSeries22.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = timeSeries22.getIndex(regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.lang.Class class37 = timeSeries36.getTimePeriodClass();
        timeSeries36.clear();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries36);
        boolean boolean40 = timeSeries39.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries39.addOrUpdate(timeSeriesDataItem41);
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
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        timeSeries3.setMaximumItemAge((long) 2147483647);
        timeSeries3.setMaximumItemAge(9223372036854775807L);
        int int19 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod20, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        int int8 = timeSeries3.getItemCount();
        timeSeries3.setDomainDescription("");
        java.lang.String str11 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(100, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        java.lang.Comparable comparable34 = timeSeries19.getKey();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str48 = timeSeries47.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries47.addPropertyChangeListener(propertyChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries54.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries47.addAndOrUpdate(timeSeries54);
        java.util.List list58 = timeSeries54.getItems();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries38.addAndOrUpdate(timeSeries54);
        timeSeries59.setRangeDescription("");
        java.util.Collection collection62 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        timeSeries19.setMaximumItemAge((long) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = timeSeries19.getDataItem(regularTimePeriod65);
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
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + "Overwritten values from: 10" + "'", comparable34, "Overwritten values from: 10");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(collection62);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        double double9 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries33.addOrUpdate(timeSeriesDataItem34);
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
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener43);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries48.removeAgedItems(true);
        int int51 = timeSeries48.getMaximumItemCount();
        timeSeries48.setKey((java.lang.Comparable) 100);
        java.lang.String str54 = timeSeries48.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        timeSeries48.addPropertyChangeListener(propertyChangeListener55);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries36.addAndOrUpdate(timeSeries48);
        long long58 = timeSeries57.getMaximumItemAge();
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 9223372036854775807L + "'", long58 == 9223372036854775807L);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        java.lang.Comparable comparable19 = timeSeries11.getKey();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10L + "'", comparable19, 10L);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        int int18 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        int int39 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean41 = timeSeries40.getNotify();
        java.util.Collection collection42 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        double double43 = timeSeries10.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem44, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        java.util.Collection collection63 = timeSeries62.getTimePeriods();
        java.util.Collection collection64 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries62);
        java.lang.String str65 = timeSeries62.getDescription();
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries62.createCopy((int) (byte) 10, (int) (byte) 10);
        double double69 = timeSeries68.getMaxY();
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
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(timeSeries68);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries10.addChangeListener(seriesChangeListener19);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries10.removeChangeListener(seriesChangeListener21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null; // flaky: timeSeries1.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        int int8 = timeSeries3.getItemCount();
        timeSeries3.setDomainDescription("");
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setKey(comparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        java.lang.Number number27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.add(regularTimePeriod26, number27);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class23 = timeSeries22.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str28 = timeSeries27.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries34.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries41.removeAgedItems(true);
        int int44 = timeSeries41.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries37.addAndOrUpdate(timeSeries41);
        boolean boolean46 = timeSeries45.getNotify();
        java.util.Collection collection47 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        timeSeries22.setDomainDescription("Overwritten values from: 10");
        timeSeries22.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries55.addPropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = timeSeries55.isEmpty();
        timeSeries55.clear();
        int int60 = timeSeries55.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries22.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries65.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries65.createCopy((int) (short) 10, (int) ' ');
        boolean boolean71 = timeSeries22.equals((java.lang.Object) timeSeries65);
        boolean boolean72 = timeSeries11.equals((java.lang.Object) timeSeries22);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem73 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem74 = timeSeries11.addOrUpdate(timeSeriesDataItem73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(class23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        timeSeries21.setRangeDescription("");
        long long24 = timeSeries21.getMaximumItemAge();
        boolean boolean25 = timeSeries21.getNotify();
        java.lang.Comparable comparable26 = timeSeries21.getKey();
        timeSeries21.setDescription("Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod29, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + "Overwritten values from: Overwritten values from: 10" + "'", comparable26, "Overwritten values from: Overwritten values from: 10");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        int int14 = timeSeries3.getItemCount();
        java.util.List list15 = timeSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str14 = timeSeries13.getDomainDescription();
        timeSeries13.setRangeDescription("hi!");
        java.util.Collection collection17 = timeSeries13.getTimePeriods();
        java.lang.Comparable comparable18 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        java.util.List list33 = timeSeries29.getItems();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries13.addAndOrUpdate(timeSeries29);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries39.removeAgedItems(true);
        java.util.Collection collection42 = timeSeries34.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries8.addAndOrUpdate(timeSeries39);
        long long44 = timeSeries43.getMaximumItemAge();
        java.util.Collection collection45 = timeSeries43.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries43.delete((int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10L + "'", comparable18, 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 9223372036854775807L + "'", long44 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems(false);
        double double9 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(false);
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemAge((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        double double15 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        timeSeries52.clear();
        timeSeries52.removeAgedItems((long) '4', false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem65 = timeSeries52.getDataItem(regularTimePeriod64);
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
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries11.createCopy(regularTimePeriod21, regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        timeSeries16.setRangeDescription("hi!");
        timeSeries16.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries16.removeChangeListener(seriesChangeListener22);
        timeSeries16.fireSeriesChanged();
        timeSeries16.setDescription("Time");
        timeSeries16.setMaximumItemAge((long) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries3.addAndOrUpdate(timeSeries16);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries29.removeChangeListener(seriesChangeListener30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries29.getDataItem(regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        timeSeries3.removeAgedItems(0L, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        java.util.Collection collection60 = timeSeries52.getTimePeriods();
        java.lang.String str61 = timeSeries52.getDomainDescription();
        int int62 = timeSeries52.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int64 = timeSeries52.getIndex(regularTimePeriod63);
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
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2147483647 + "'", int62 == 2147483647);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        java.lang.String str10 = timeSeries8.getDescription();
        double double11 = timeSeries8.getMinY();
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        timeSeries8.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod15, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        int int7 = timeSeries3.getMaximumItemCount();
        java.lang.Class<?> wildcardClass8 = timeSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries10.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries10.getDataItem(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        java.lang.String str33 = timeSeries17.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class38 = timeSeries37.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str43 = timeSeries42.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries49.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries42.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries56.removeAgedItems(true);
        int int59 = timeSeries56.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries52.addAndOrUpdate(timeSeries56);
        boolean boolean61 = timeSeries60.getNotify();
        java.util.Collection collection62 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries60);
        timeSeries37.setDomainDescription("Overwritten values from: 10");
        timeSeries37.fireSeriesChanged();
        boolean boolean66 = timeSeries17.equals((java.lang.Object) timeSeries37);
        long long67 = timeSeries17.getMaximumItemAge();
        timeSeries17.removeAgedItems((long) (byte) 0, false);
        boolean boolean71 = timeSeries17.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod72 = null; // flaky: timeSeries17.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 9223372036854775807L + "'", long67 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        timeSeries16.setRangeDescription("hi!");
        long long20 = timeSeries16.getMaximumItemAge();
        java.util.Collection collection21 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null; // flaky: timeSeries16.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemCount((int) (byte) 0);
        timeSeries3.setKey((java.lang.Comparable) 1L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.addChangeListener(seriesChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(false);
        double double6 = timeSeries3.getMinY();
        java.lang.Class<?> wildcardClass7 = timeSeries3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", "Value", "hi!");
        java.lang.String str64 = timeSeries63.getRangeDescription();
        java.lang.Object obj65 = timeSeries63.clone();
        boolean boolean66 = timeSeries63.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries10.addAndOrUpdate(timeSeries63);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem68 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem69 = timeSeries10.addOrUpdate(timeSeriesDataItem68);
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
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(timeSeries67);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        java.util.Collection collection63 = timeSeries62.getTimePeriods();
        java.util.Collection collection64 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries62);
        java.lang.String str65 = timeSeries62.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries62.update((int) '#', (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
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
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        timeSeries3.removeAgedItems((long) 1, false);
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod15, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        java.util.List list30 = timeSeries19.getItems();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        java.util.List list26 = timeSeries22.getItems();
        timeSeries22.fireSeriesChanged();
        java.util.Collection collection28 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        java.lang.String str29 = timeSeries22.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        timeSeries16.setRangeDescription("hi!");
        timeSeries16.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries16.removeChangeListener(seriesChangeListener22);
        timeSeries16.fireSeriesChanged();
        timeSeries16.setDescription("Time");
        timeSeries16.setMaximumItemAge((long) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries3.addAndOrUpdate(timeSeries16);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries29.removeChangeListener(seriesChangeListener30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = timeSeries29.getIndex(regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "Value", "Time");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        int int8 = timeSeries3.getItemCount();
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        java.lang.String str14 = timeSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        timeSeries8.setRangeDescription("Value");
        double double12 = timeSeries8.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null; // flaky: timeSeries8.getTimePeriod((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        int int20 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = timeSeries12.getIndex(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        java.lang.Object obj9 = timeSeries3.clone();
        java.lang.String str10 = timeSeries3.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries3.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        int int4 = timeSeries1.getMaximumItemCount();
        java.util.List list5 = timeSeries1.getItems();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.addChangeListener(seriesChangeListener6);
        java.lang.String str8 = timeSeries1.getDomainDescription();
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        java.lang.Class<?> wildcardClass10 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        timeSeries10.removeAgedItems(false);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener18);
        timeSeries10.setMaximumItemAge((long) (short) 1);
        timeSeries10.setMaximumItemCount((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems(0L, true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries16.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries23);
        double double27 = timeSeries26.getMaxY();
        timeSeries26.setMaximumItemCount(0);
        timeSeries26.removeAgedItems(1L, true);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries26.removeAgedItems((long) (short) -1, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        timeSeries21.setKey((java.lang.Comparable) ' ');
        timeSeries21.setMaximumItemCount((int) (short) 0);
        timeSeries21.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.update(regularTimePeriod30, (java.lang.Number) 1L);
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

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        double double4 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        double double4 = timeSeries3.getMinY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries3.addChangeListener(seriesChangeListener5);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        timeSeries1.setKey((java.lang.Comparable) 9223372036854775807L);
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
        timeSeries1.setDomainDescription("Value");
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        java.lang.String str16 = timeSeries10.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str21 = timeSeries20.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener22);
        timeSeries20.setKey((java.lang.Comparable) 10.0f);
        java.util.Collection collection26 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        int int27 = timeSeries10.getItemCount();
        java.lang.Object obj28 = timeSeries10.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        java.lang.Class class24 = timeSeries21.getTimePeriodClass();
        long long25 = timeSeries21.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9223372036854775807L + "'", long25 == 9223372036854775807L);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        boolean boolean5 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        timeSeries9.removeAgedItems((long) (short) 1, true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries9.addChangeListener(seriesChangeListener13);
        java.util.List list15 = timeSeries9.getItems();
        boolean boolean16 = timeSeries3.equals((java.lang.Object) list15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "", "Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.lang.Number number14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) 10, number14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        java.lang.Class<?> wildcardClass61 = timeSeries3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        int int23 = timeSeries22.getMaximumItemCount();
        long long24 = timeSeries22.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = timeSeries22.getIndex(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Value", "Value");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: Overwritten values from: 10", "hi!");
        java.lang.Object obj4 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.getDataItem(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str30 = timeSeries29.getDomainDescription();
        timeSeries29.setRangeDescription("");
        boolean boolean33 = timeSeries29.isEmpty();
        timeSeries29.removeAgedItems(true);
        java.util.Collection collection36 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        timeSeries29.setNotify(false);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        java.lang.Class class19 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str24 = timeSeries23.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries23.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries30.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries23.addAndOrUpdate(timeSeries30);
        long long34 = timeSeries30.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries30.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries3.addAndOrUpdate(timeSeries37);
        int int39 = timeSeries3.getItemCount();
        int int40 = timeSeries3.getItemCount();
        double double41 = timeSeries3.getMinY();
        double double42 = timeSeries3.getMinY();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Time", "Overwritten values from: 100");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (java.lang.Number) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        double double9 = timeSeries3.getMaxY();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        timeSeries3.setMaximumItemAge((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        double double13 = timeSeries3.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.createCopy((int) (byte) 1, (int) '#');
        java.lang.Class class18 = timeSeries10.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNull(class18);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
            timeSeries14.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
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
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        java.util.Collection collection60 = timeSeries52.getTimePeriods();
        java.lang.String str61 = timeSeries52.getDomainDescription();
        timeSeries52.setKey((java.lang.Comparable) 10);
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        java.lang.String str68 = timeSeries67.getRangeDescription();
        timeSeries67.setDomainDescription("hi!");
        java.lang.String str71 = timeSeries67.getRangeDescription();
        boolean boolean72 = timeSeries52.equals((java.lang.Object) timeSeries67);
        timeSeries67.setRangeDescription("Overwritten values from: 10");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod75 = null; // flaky: timeSeries67.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Time" + "'", str68, "Time");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Time" + "'", str71, "Time");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        java.lang.Class<?> wildcardClass13 = timeSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries3.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries20.removeAgedItems(true);
        int int23 = timeSeries20.getMaximumItemCount();
        timeSeries20.setKey((java.lang.Comparable) 100);
        java.lang.String str26 = timeSeries20.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str31 = timeSeries30.getDomainDescription();
        timeSeries30.setRangeDescription("");
        java.util.Collection collection34 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        boolean boolean35 = timeSeries3.equals((java.lang.Object) collection34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d);
        java.lang.Object obj38 = timeSeries37.clone();
        java.util.List list39 = timeSeries37.getItems();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries40.getDataItem(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems(false);
        double double9 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(false);
        timeSeries3.fireSeriesChanged();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((int) (short) -1, 10, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d);
        java.lang.Class<?> wildcardClass2 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.List list8 = timeSeries3.getItems();
        java.lang.String str9 = timeSeries3.getDescription();
        timeSeries3.setRangeDescription("Time");
        java.lang.String str12 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod13, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        int int8 = timeSeries3.getItemCount();
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        timeSeries3.setNotify(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        double double31 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries35.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str42 = timeSeries41.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries41.addPropertyChangeListener(propertyChangeListener43);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries48.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries41.addAndOrUpdate(timeSeries48);
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries55.removeAgedItems(true);
        int int58 = timeSeries55.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries51.addAndOrUpdate(timeSeries55);
        java.util.Collection collection60 = timeSeries35.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        timeSeries51.clear();
        java.lang.String str62 = timeSeries51.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries51.createCopy(1, (int) (byte) 10);
        java.lang.Comparable comparable66 = timeSeries51.getKey();
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str71 = timeSeries70.getDomainDescription();
        timeSeries70.setRangeDescription("hi!");
        java.util.Collection collection74 = timeSeries70.getTimePeriods();
        java.lang.Comparable comparable75 = timeSeries70.getKey();
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str80 = timeSeries79.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener81 = null;
        timeSeries79.addPropertyChangeListener(propertyChangeListener81);
        org.jfree.data.time.TimeSeries timeSeries86 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries86.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries89 = timeSeries79.addAndOrUpdate(timeSeries86);
        java.util.List list90 = timeSeries86.getItems();
        org.jfree.data.time.TimeSeries timeSeries91 = timeSeries70.addAndOrUpdate(timeSeries86);
        timeSeries91.setRangeDescription("");
        java.util.Collection collection94 = timeSeries51.getTimePeriodsUniqueToOtherSeries(timeSeries91);
        timeSeries91.setDomainDescription("Overwritten values from: 10");
        timeSeries91.setDomainDescription("Time");
        java.util.Collection collection99 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries91);
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Value" + "'", str62, "Value");
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertEquals("'" + comparable66 + "' != '" + "Overwritten values from: 10" + "'", comparable66, "Overwritten values from: 10");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertEquals("'" + comparable75 + "' != '" + 10L + "'", comparable75, 10L);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(timeSeries89);
        org.junit.Assert.assertNotNull(list90);
        org.junit.Assert.assertNotNull(timeSeries91);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertNotNull(collection99);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        timeSeries3.setMaximumItemAge(0L);
        java.lang.Comparable comparable10 = timeSeries3.getKey();
        timeSeries3.setDomainDescription("Overwritten values from: Overwritten values from: 10");
        int int13 = timeSeries3.getMaximumItemCount();
        timeSeries3.setDescription("Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 100 + "'", comparable10, 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null; // flaky: timeSeries3.getTimePeriod((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        int int9 = timeSeries3.getMaximumItemCount();
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setMaximumItemCount((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        timeSeries1.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        timeSeries10.fireSeriesChanged();
        timeSeries10.setDomainDescription("Overwritten values from: 10");
        java.lang.String str64 = timeSeries10.getRangeDescription();
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
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Overwritten values from: hi!", "Overwritten values from: 100");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        timeSeries16.setRangeDescription("hi!");
        long long20 = timeSeries16.getMaximumItemAge();
        java.util.Collection collection21 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        double double22 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        long long33 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        java.util.Collection collection15 = timeSeries10.getTimePeriods();
        long long16 = timeSeries10.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null; // flaky: timeSeries10.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        int int53 = timeSeries46.getMaximumItemCount();
        timeSeries46.clear();
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        java.util.Collection collection55 = timeSeries3.getTimePeriods();
        java.util.Collection collection56 = timeSeries3.getTimePeriods();
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
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(collection56);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.lang.Object obj6 = timeSeries3.clone();
        boolean boolean7 = timeSeries3.isEmpty();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        timeSeries3.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update(regularTimePeriod18, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod26, (java.lang.Number) 9223372036854775807L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        double double8 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(regularTimePeriod11, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries16.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries23);
        java.lang.String str27 = timeSeries16.getDescription();
        boolean boolean28 = timeSeries16.getNotify();
        int int29 = timeSeries16.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries34.addPropertyChangeListener(propertyChangeListener36);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries41.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries34.addAndOrUpdate(timeSeries41);
        long long45 = timeSeries41.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries41.createCopy((int) (byte) 1, (int) '#');
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries41.removePropertyChangeListener(propertyChangeListener49);
        java.util.Collection collection51 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number53 = timeSeries41.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 9223372036854775807L + "'", long45 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries19.addOrUpdate(regularTimePeriod29, (double) 1);
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
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        java.lang.String str16 = timeSeries10.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str21 = timeSeries20.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener22);
        timeSeries20.setKey((java.lang.Comparable) 10.0f);
        java.util.Collection collection26 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries20.addOrUpdate(regularTimePeriod27, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        timeSeries1.removeAgedItems(false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("Value");
        int int13 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(100, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        boolean boolean11 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.clear();
        int int15 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries3.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Value", "Overwritten values from: Overwritten values from: 10");
        boolean boolean4 = timeSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        boolean boolean9 = timeSeries3.getNotify();
        double double10 = timeSeries3.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(2147483647, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        long long14 = timeSeries12.getMaximumItemAge();
        boolean boolean15 = timeSeries12.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        java.lang.Class class22 = timeSeries19.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries12.addAndOrUpdate(timeSeries19);
        int int24 = timeSeries19.getItemCount();
        java.lang.Object obj25 = timeSeries19.clone();
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.fireSeriesChanged();
        java.lang.Class class28 = timeSeries19.getTimePeriodClass();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries19.addChangeListener(seriesChangeListener29);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(class28);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timeSeries3.getRangeDescription();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        int int8 = timeSeries3.getItemCount();
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries3.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        double double16 = timeSeries3.getMaxY();
        java.util.List list17 = timeSeries3.getItems();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries16.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries23);
        java.lang.String str27 = timeSeries16.getDescription();
        boolean boolean28 = timeSeries16.getNotify();
        int int29 = timeSeries16.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries16);
        java.util.Collection collection31 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        timeSeries3.setMaximumItemAge(0L);
        timeSeries3.removeAgedItems((long) ' ', false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.clear();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        timeSeries1.fireSeriesChanged();
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        timeSeries34.removeAgedItems((long) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries34.delete((int) (short) 100, (int) (short) -1);
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
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        java.util.List list22 = timeSeries21.getItems();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries26.fireSeriesChanged();
        java.lang.String str28 = timeSeries26.getDescription();
        timeSeries26.setRangeDescription("Time");
        java.util.Collection collection31 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str36 = timeSeries35.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries35.addPropertyChangeListener(propertyChangeListener37);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries42.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries35.addAndOrUpdate(timeSeries42);
        java.lang.String str46 = timeSeries35.getDescription();
        timeSeries35.setMaximumItemCount(1);
        timeSeries35.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries35.removeChangeListener(seriesChangeListener51);
        java.lang.Comparable comparable53 = timeSeries35.getKey();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener54 = null;
        timeSeries35.removeChangeListener(seriesChangeListener54);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries21.addAndOrUpdate(timeSeries35);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod57, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + 10L + "'", comparable53, 10L);
        org.junit.Assert.assertNotNull(timeSeries56);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        boolean boolean7 = timeSeries3.isEmpty();
        java.lang.Object obj8 = timeSeries3.clone();
        int int9 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener45);
        timeSeries3.setDomainDescription("Time");
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
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        java.lang.String str33 = timeSeries17.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class38 = timeSeries37.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str43 = timeSeries42.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries49.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries42.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries56.removeAgedItems(true);
        int int59 = timeSeries56.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries52.addAndOrUpdate(timeSeries56);
        boolean boolean61 = timeSeries60.getNotify();
        java.util.Collection collection62 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries60);
        timeSeries37.setDomainDescription("Overwritten values from: 10");
        timeSeries37.fireSeriesChanged();
        boolean boolean66 = timeSeries17.equals((java.lang.Object) timeSeries37);
        int int67 = timeSeries17.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries10.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.createCopy(0, 0);
        timeSeries10.setDescription("Overwritten values from: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, "Overwritten values from: 100", "hi!");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = timeSeries10.getDataItem(regularTimePeriod63);
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
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        java.lang.String str18 = timeSeries3.getDescription();
        java.lang.String str19 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries3.getDataItem(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        double double12 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) '#');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L);
        timeSeries1.setKey((java.lang.Comparable) "Time");
        java.util.Collection collection4 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) '#', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries6.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class23 = timeSeries22.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str28 = timeSeries27.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries34.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries41.removeAgedItems(true);
        int int44 = timeSeries41.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries37.addAndOrUpdate(timeSeries41);
        boolean boolean46 = timeSeries45.getNotify();
        java.util.Collection collection47 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        timeSeries22.setDomainDescription("Overwritten values from: 10");
        timeSeries22.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries55.addPropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = timeSeries55.isEmpty();
        timeSeries55.clear();
        int int60 = timeSeries55.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries22.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries65.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries65.createCopy((int) (short) 10, (int) ' ');
        boolean boolean71 = timeSeries22.equals((java.lang.Object) timeSeries65);
        boolean boolean72 = timeSeries11.equals((java.lang.Object) timeSeries22);
        java.lang.Comparable comparable73 = timeSeries22.getKey();
        timeSeries22.removeAgedItems(100L, false);
        int int77 = timeSeries22.getMaximumItemCount();
        java.lang.String str78 = timeSeries22.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod79 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem81 = timeSeries22.addOrUpdate(regularTimePeriod79, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(class23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + comparable73 + "' != '" + 10L + "'", comparable73, 10L);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2147483647 + "'", int77 == 2147483647);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Overwritten values from: 10" + "'", str78, "Overwritten values from: 10");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        double double26 = timeSeries17.getMinY();
        timeSeries17.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = timeSeries17.getValue(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9223372036854775807L + "'", long25 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) ' ', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemAge(9223372036854775807L);
        java.lang.Object obj12 = timeSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        timeSeries3.setMaximumItemAge(0L);
        double double10 = timeSeries3.getMinY();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        java.lang.Class class19 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str24 = timeSeries23.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries23.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries30.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries23.addAndOrUpdate(timeSeries30);
        long long34 = timeSeries30.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries30.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries3.addAndOrUpdate(timeSeries37);
        int int39 = timeSeries3.getItemCount();
        int int40 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries43 = timeSeries3.createCopy(regularTimePeriod41, regularTimePeriod42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        java.util.Collection collection63 = timeSeries62.getTimePeriods();
        java.util.Collection collection64 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries62);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = timeSeries32.getDataItem(0);
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
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, "Overwritten values from: Overwritten values from: 10", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        int int14 = timeSeries11.getMaximumItemCount();
        timeSeries11.removeAgedItems(false);
        double double17 = timeSeries11.getMaxY();
        timeSeries11.removeAgedItems(false);
        timeSeries11.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod22, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        int int18 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        int int39 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean41 = timeSeries40.getNotify();
        java.util.Collection collection42 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        java.lang.String str43 = timeSeries40.getDescription();
        java.lang.Class<?> wildcardClass44 = timeSeries40.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        int int18 = timeSeries10.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries10.addOrUpdate(regularTimePeriod19, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
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
        timeSeries27.setRangeDescription("");
        long long30 = timeSeries27.getMaximumItemAge();
        boolean boolean31 = timeSeries3.equals((java.lang.Object) long30);
        java.lang.Class<?> wildcardClass32 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries58.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener61 = null;
        timeSeries58.addChangeListener(seriesChangeListener61);
        java.util.Collection collection63 = timeSeries54.getTimePeriodsUniqueToOtherSeries(timeSeries58);
        java.util.Collection collection64 = timeSeries58.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = timeSeries58.addOrUpdate(timeSeriesDataItem65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        java.lang.Class class19 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str24 = timeSeries23.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries23.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries30.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries23.addAndOrUpdate(timeSeries30);
        long long34 = timeSeries30.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries30.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries3.addAndOrUpdate(timeSeries37);
        int int39 = timeSeries3.getItemCount();
        int int40 = timeSeries3.getItemCount();
        int int41 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        java.util.List list22 = timeSeries21.getItems();
        timeSeries21.removeAgedItems(0L, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "", "hi!");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.getDataItem(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Time");
        timeSeries3.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        timeSeries16.setRangeDescription("hi!");
        long long20 = timeSeries16.getMaximumItemAge();
        java.util.Collection collection21 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.update(regularTimePeriod22, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        int int18 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        int int39 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean41 = timeSeries40.getNotify();
        java.util.Collection collection42 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        timeSeries40.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries40.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.add(regularTimePeriod46, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 10");
        timeSeries1.setRangeDescription("");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.List list8 = timeSeries3.getItems();
        java.lang.String str9 = timeSeries3.getDescription();
        timeSeries3.setRangeDescription("Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries11.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class17 = timeSeries11.getTimePeriodClass();
        java.lang.String str18 = timeSeries11.getDomainDescription();
        timeSeries11.setRangeDescription("Value");
        int int21 = timeSeries11.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries11.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries11);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries11.addChangeListener(seriesChangeListener25);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries18.fireSeriesChanged();
        java.lang.String str20 = timeSeries18.getDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class25 = timeSeries24.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str30 = timeSeries29.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries29.addPropertyChangeListener(propertyChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries29.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries43.removeAgedItems(true);
        int int46 = timeSeries43.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries39.addAndOrUpdate(timeSeries43);
        boolean boolean48 = timeSeries47.getNotify();
        java.util.Collection collection49 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries47);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str54 = timeSeries53.getDomainDescription();
        timeSeries53.setRangeDescription("hi!");
        java.util.Collection collection57 = timeSeries53.getTimePeriods();
        java.lang.Comparable comparable58 = timeSeries53.getKey();
        boolean boolean59 = timeSeries24.equals((java.lang.Object) comparable58);
        timeSeries24.removeAgedItems((long) 100, true);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection65 = timeSeries64.getTimePeriods();
        timeSeries64.fireSeriesChanged();
        java.lang.String str67 = timeSeries64.getDescription();
        boolean boolean68 = timeSeries24.equals((java.lang.Object) timeSeries64);
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries18.addAndOrUpdate(timeSeries24);
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries73.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener76 = null;
        timeSeries73.addChangeListener(seriesChangeListener76);
        java.util.Collection collection78 = timeSeries69.getTimePeriodsUniqueToOtherSeries(timeSeries73);
        java.util.Collection collection79 = timeSeries73.getTimePeriods();
        java.util.Collection collection80 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries73);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertEquals("'" + comparable58 + "' != '" + 10L + "'", comparable58, 10L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(timeSeries69);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(collection80);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "", "Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.clear();
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        java.lang.String str16 = timeSeries10.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str21 = timeSeries20.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener22);
        timeSeries20.setKey((java.lang.Comparable) 10.0f);
        java.util.Collection collection26 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        timeSeries10.setNotify(true);
        timeSeries10.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null; // flaky: timeSeries10.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.getNotify();
        boolean boolean12 = timeSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, "Overwritten values from: Overwritten values from: 10", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries18.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class24 = timeSeries18.getTimePeriodClass();
        java.lang.String str25 = timeSeries18.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener26);
        boolean boolean28 = timeSeries18.getNotify();
        boolean boolean29 = timeSeries3.equals((java.lang.Object) timeSeries18);
        timeSeries3.clear();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        timeSeries3.setDescription("Time");
        java.util.List list19 = timeSeries3.getItems();
        int int20 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        int int8 = timeSeries3.getItemCount();
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        boolean boolean10 = timeSeries3.getNotify();
        timeSeries3.setRangeDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        boolean boolean29 = timeSeries19.equals((java.lang.Object) "Overwritten values from: Overwritten values from: 10");
        int int30 = timeSeries19.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries19.addChangeListener(seriesChangeListener31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries3.addChangeListener(seriesChangeListener28);
        int int30 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries34.addPropertyChangeListener(propertyChangeListener36);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries41.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries34.addAndOrUpdate(timeSeries41);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries41.removePropertyChangeListener(propertyChangeListener45);
        java.lang.String str47 = timeSeries41.getDescription();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str52 = timeSeries51.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        timeSeries51.removePropertyChangeListener(propertyChangeListener53);
        timeSeries51.setKey((java.lang.Comparable) 10.0f);
        java.util.Collection collection57 = timeSeries41.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        int int58 = timeSeries41.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries3.addAndOrUpdate(timeSeries41);
        timeSeries3.setNotify(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount((int) (short) 10);
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        double double9 = timeSeries3.getMaxY();
        double double10 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(2147483647, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.List list8 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        timeSeries17.setDescription("Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str48 = timeSeries47.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries47.addPropertyChangeListener(propertyChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries54.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries47.addAndOrUpdate(timeSeries54);
        java.util.List list58 = timeSeries54.getItems();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries38.addAndOrUpdate(timeSeries54);
        int int60 = timeSeries38.getItemCount();
        boolean boolean61 = timeSeries38.getNotify();
        double double62 = timeSeries38.getMinY();
        java.util.Collection collection63 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries38.add(timeSeriesDataItem64, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        timeSeries3.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((int) (byte) -1, (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(regularTimePeriod8, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        int int20 = timeSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount((int) (short) 10);
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        double double9 = timeSeries3.getMaxY();
        double double10 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.lang.String str6 = timeSeries3.getDescription();
        java.lang.Object obj7 = timeSeries3.clone();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        boolean boolean13 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.addChangeListener(seriesChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(regularTimePeriod10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        boolean boolean11 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.clear();
        int int15 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(0, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        boolean boolean55 = timeSeries9.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number57 = timeSeries9.getValue(regularTimePeriod56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
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
        timeSeries27.setRangeDescription("");
        long long30 = timeSeries27.getMaximumItemAge();
        boolean boolean31 = timeSeries3.equals((java.lang.Object) long30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = timeSeries3.getValue(regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries38.removeAgedItems(true);
        int int41 = timeSeries38.getMaximumItemCount();
        java.lang.String str42 = timeSeries38.getRangeDescription();
        timeSeries38.clear();
        boolean boolean44 = timeSeries38.getNotify();
        double double45 = timeSeries38.getMinY();
        boolean boolean46 = timeSeries38.getNotify();
        java.util.Collection collection47 = timeSeries34.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        timeSeries38.setNotify(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries38.add(timeSeriesDataItem50, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        java.lang.String str11 = timeSeries3.getRangeDescription();
        timeSeries3.setRangeDescription("Value");
        long long14 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Value", "Overwritten values from: Overwritten values from: 10");
        timeSeries3.setMaximumItemAge((long) 10);
        java.lang.Class<?> wildcardClass6 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: Overwritten values from: 10");
        long long2 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(timeSeriesDataItem3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        java.lang.Comparable comparable34 = timeSeries19.getKey();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str48 = timeSeries47.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries47.addPropertyChangeListener(propertyChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries54.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries47.addAndOrUpdate(timeSeries54);
        java.util.List list58 = timeSeries54.getItems();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries38.addAndOrUpdate(timeSeries54);
        timeSeries59.setRangeDescription("");
        java.util.Collection collection62 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        timeSeries19.setMaximumItemAge((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries19.update((int) (byte) -1, (java.lang.Number) 100L);
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
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + "Overwritten values from: 10" + "'", comparable34, "Overwritten values from: 10");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(collection62);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        java.util.Collection collection12 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        double double13 = timeSeries10.getMaxY();
        timeSeries10.removeAgedItems((long) (byte) -1, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries21.getDataItem(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        timeSeries1.setKey((java.lang.Comparable) 9223372036854775807L);
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        boolean boolean10 = timeSeries8.getNotify();
        boolean boolean11 = timeSeries8.getNotify();
        timeSeries8.removeAgedItems((long) '4', false);
        java.lang.String str15 = timeSeries8.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries8.addOrUpdate(regularTimePeriod16, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.setMaximumItemAge((long) ' ');
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Overwritten values from: 100", "Overwritten values from: 10");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        boolean boolean17 = timeSeries3.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries3.addChangeListener(seriesChangeListener28);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 1, 10);
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
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        java.util.List list29 = timeSeries28.getItems();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        timeSeries31.fireSeriesChanged();
        java.lang.Object obj34 = timeSeries31.clone();
        timeSeries31.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries28.addAndOrUpdate(timeSeries31);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries31.removePropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries31.addOrUpdate(regularTimePeriod40, (double) (-1.0f));
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
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        java.lang.Class class19 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str24 = timeSeries23.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries23.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries30.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries23.addAndOrUpdate(timeSeries30);
        long long34 = timeSeries30.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries30.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries3.addAndOrUpdate(timeSeries37);
        timeSeries38.fireSeriesChanged();
        long long40 = timeSeries38.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 9223372036854775807L + "'", long40 == 9223372036854775807L);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        java.lang.Class class19 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str24 = timeSeries23.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries23.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries30.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries23.addAndOrUpdate(timeSeries30);
        long long34 = timeSeries30.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries30.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries3.addAndOrUpdate(timeSeries37);
        int int39 = timeSeries3.getItemCount();
        int int40 = timeSeries3.getItemCount();
        double double41 = timeSeries3.getMinY();
        java.lang.Class<?> wildcardClass42 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        int int24 = timeSeries17.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries3.removeChangeListener(seriesChangeListener20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        boolean boolean34 = timeSeries24.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries24.getDataItem(regularTimePeriod35);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod11, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        int int2 = timeSeries1.getMaximumItemCount();
        boolean boolean3 = timeSeries1.isEmpty();
        java.lang.Object obj4 = timeSeries1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: Overwritten values from: 10");
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timeSeries1.getValue(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        boolean boolean8 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = null; // flaky: timeSeries3.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        java.lang.Object obj4 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries3.addChangeListener(seriesChangeListener28);
        int int30 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) 10, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
            timeSeries52.update(regularTimePeriod61, (java.lang.Number) (byte) 100);
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
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.createCopy((int) ' ', (int) '#');
        int int18 = timeSeries17.getItemCount();
        java.lang.String str19 = timeSeries17.getDescription();
        java.lang.Class<?> wildcardClass20 = timeSeries17.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        timeSeries3.removeAgedItems((long) 1, true);
        timeSeries3.removeAgedItems(true);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        int int4 = timeSeries1.getMaximumItemCount();
        java.util.List list5 = timeSeries1.getItems();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.addChangeListener(seriesChangeListener6);
        java.lang.String str8 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        java.lang.String str12 = timeSeries10.getDomainDescription();
        int int13 = timeSeries10.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries10.clone();
        java.util.Collection collection15 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "Overwritten values from: 10");
        boolean boolean4 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod5, (java.lang.Number) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
            timeSeries3.add(regularTimePeriod11, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        long long24 = timeSeries17.getMaximumItemAge();
        java.lang.Comparable comparable25 = timeSeries17.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 10L + "'", comparable25, 10L);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        java.lang.Object obj18 = timeSeries17.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.delete(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        timeSeries10.removeAgedItems(10L, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries38.removeAgedItems(true);
        int int41 = timeSeries38.getMaximumItemCount();
        java.lang.String str42 = timeSeries38.getRangeDescription();
        timeSeries38.clear();
        boolean boolean44 = timeSeries38.getNotify();
        double double45 = timeSeries38.getMinY();
        boolean boolean46 = timeSeries38.getNotify();
        java.util.Collection collection47 = timeSeries34.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries38.addOrUpdate(regularTimePeriod48, (double) 100.0f);
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        int int18 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        int int39 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean41 = timeSeries40.getNotify();
        java.util.Collection collection42 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        timeSeries40.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries40.addPropertyChangeListener(propertyChangeListener44);
        java.lang.Comparable comparable46 = timeSeries40.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries49 = timeSeries40.createCopy(regularTimePeriod47, regularTimePeriod48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + "Overwritten values from: Overwritten values from: 10" + "'", comparable46, "Overwritten values from: Overwritten values from: 10");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        timeSeries3.clear();
        java.lang.String str7 = timeSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries3.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        timeSeries16.setRangeDescription("hi!");
        long long20 = timeSeries16.getMaximumItemAge();
        java.util.Collection collection21 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        int int53 = timeSeries46.getMaximumItemCount();
        timeSeries46.setDescription("");
        int int56 = timeSeries46.getMaximumItemCount();
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        double double17 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries3.addOrUpdate(regularTimePeriod18, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.createCopy((int) (byte) 1, (int) '#');
        timeSeries10.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = null; // flaky: timeSeries10.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        java.lang.String str33 = timeSeries17.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class38 = timeSeries37.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str43 = timeSeries42.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries49.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries42.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries56.removeAgedItems(true);
        int int59 = timeSeries56.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries52.addAndOrUpdate(timeSeries56);
        boolean boolean61 = timeSeries60.getNotify();
        java.util.Collection collection62 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries60);
        timeSeries37.setDomainDescription("Overwritten values from: 10");
        timeSeries37.fireSeriesChanged();
        boolean boolean66 = timeSeries17.equals((java.lang.Object) timeSeries37);
        long long67 = timeSeries17.getMaximumItemAge();
        timeSeries17.removeAgedItems((long) (byte) 0, false);
        boolean boolean71 = timeSeries17.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod72 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod72, (java.lang.Number) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 9223372036854775807L + "'", long67 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        timeSeries3.clear();
        long long9 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        timeSeries3.setNotify(false);
        java.util.List list63 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        int int66 = timeSeries65.getMaximumItemCount();
        int int67 = timeSeries65.getItemCount();
        boolean boolean68 = timeSeries3.equals((java.lang.Object) timeSeries65);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener69);
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
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2147483647 + "'", int66 == 2147483647);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries19.addOrUpdate(regularTimePeriod29, (double) 1.0f);
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
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        boolean boolean13 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.addChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries3.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        double double9 = timeSeries3.getMaxY();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        timeSeries3.setMaximumItemAge((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.createCopy((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        timeSeries21.setRangeDescription("");
        long long24 = timeSeries21.getMaximumItemAge();
        boolean boolean25 = timeSeries21.getNotify();
        java.lang.Comparable comparable26 = timeSeries21.getKey();
        timeSeries21.setNotify(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + "Overwritten values from: Overwritten values from: 10" + "'", comparable26, "Overwritten values from: Overwritten values from: 10");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        int int9 = timeSeries8.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries8.addOrUpdate(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setRangeDescription("Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries3.addChangeListener(seriesChangeListener28);
        int int30 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries34.addPropertyChangeListener(propertyChangeListener36);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries41.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries34.addAndOrUpdate(timeSeries41);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries41.removePropertyChangeListener(propertyChangeListener45);
        java.lang.String str47 = timeSeries41.getDescription();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str52 = timeSeries51.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        timeSeries51.removePropertyChangeListener(propertyChangeListener53);
        timeSeries51.setKey((java.lang.Comparable) 10.0f);
        java.util.Collection collection57 = timeSeries41.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        int int58 = timeSeries41.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries3.addAndOrUpdate(timeSeries41);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener60);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem62, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        boolean boolean24 = timeSeries3.getNotify();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        timeSeries3.setMaximumItemAge(0L);
        java.lang.String str10 = timeSeries3.getRangeDescription();
        int int11 = timeSeries3.getMaximumItemCount();
        timeSeries3.setMaximumItemAge((long) '#');
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str18 = timeSeries17.getDomainDescription();
        timeSeries17.setRangeDescription("hi!");
        timeSeries17.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries17.removeChangeListener(seriesChangeListener23);
        boolean boolean25 = timeSeries17.getNotify();
        java.util.List list26 = timeSeries17.getItems();
        long long27 = timeSeries17.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries17.removeChangeListener(seriesChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        int int36 = timeSeries33.getMaximumItemCount();
        timeSeries33.setKey((java.lang.Comparable) 100);
        java.lang.String str39 = timeSeries33.getRangeDescription();
        int int40 = timeSeries33.getItemCount();
        timeSeries33.removeAgedItems(true);
        timeSeries33.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list45 = timeSeries33.getItems();
        timeSeries33.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries17.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.lang.Class class51 = timeSeries50.getTimePeriodClass();
        timeSeries50.clear();
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries48.addAndOrUpdate(timeSeries50);
        boolean boolean54 = timeSeries53.getNotify();
        boolean boolean55 = timeSeries3.equals((java.lang.Object) boolean54);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNull(class51);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        double double9 = timeSeries3.getMaxY();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '4', (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        int int18 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        int int39 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean41 = timeSeries40.getNotify();
        java.util.Collection collection42 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        double double43 = timeSeries10.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = null; // flaky: timeSeries10.getDataItem((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class23 = timeSeries22.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str28 = timeSeries27.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries34.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries41.removeAgedItems(true);
        int int44 = timeSeries41.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries37.addAndOrUpdate(timeSeries41);
        boolean boolean46 = timeSeries45.getNotify();
        java.util.Collection collection47 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        timeSeries22.setDomainDescription("Overwritten values from: 10");
        timeSeries22.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries55.addPropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = timeSeries55.isEmpty();
        timeSeries55.clear();
        int int60 = timeSeries55.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries22.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries65.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries65.createCopy((int) (short) 10, (int) ' ');
        boolean boolean71 = timeSeries22.equals((java.lang.Object) timeSeries65);
        boolean boolean72 = timeSeries11.equals((java.lang.Object) timeSeries22);
        java.lang.Comparable comparable73 = timeSeries22.getKey();
        double double74 = timeSeries22.getMaxY();
        timeSeries22.setDescription("Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod77 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.add(regularTimePeriod77, (double) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(class23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + comparable73 + "' != '" + 10L + "'", comparable73, 10L);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        int int18 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        int int39 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean41 = timeSeries40.getNotify();
        java.util.Collection collection42 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        int int39 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        timeSeries36.setMaximumItemCount((int) (short) 0);
        double double43 = timeSeries36.getMinY();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str48 = timeSeries47.getDomainDescription();
        long long49 = timeSeries47.getMaximumItemAge();
        java.lang.String str50 = timeSeries47.getDescription();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries36.addAndOrUpdate(timeSeries47);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        java.util.Collection collection54 = timeSeries47.getTimePeriodsUniqueToOtherSeries(timeSeries53);
        boolean boolean55 = timeSeries3.equals((java.lang.Object) collection54);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 9223372036854775807L + "'", long49 == 9223372036854775807L);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems(0L, true);
        java.lang.Object obj13 = timeSeries3.clone();
        timeSeries3.removeAgedItems((long) 100, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        java.util.List list29 = timeSeries28.getItems();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        timeSeries31.fireSeriesChanged();
        java.lang.Object obj34 = timeSeries31.clone();
        timeSeries31.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries28.addAndOrUpdate(timeSeries31);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries31.removePropertyChangeListener(propertyChangeListener38);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries31.addChangeListener(seriesChangeListener40);
        timeSeries31.setMaximumItemAge((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries31.getDataItem((int) ' ');
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Class<?> wildcardClass8 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str8 = timeSeries7.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries14.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries7.addAndOrUpdate(timeSeries14);
        java.util.List list18 = timeSeries14.getItems();
        java.lang.Object obj19 = null;
        boolean boolean20 = timeSeries14.equals(obj19);
        int int21 = timeSeries14.getMaximumItemCount();
        boolean boolean22 = timeSeries14.getNotify();
        timeSeries14.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) ' ', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.Class<?> wildcardClass7 = timeSeries3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "Overwritten values from: 10");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Overwritten values from: 10" + "'", str4, "Overwritten values from: 10");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        java.lang.Comparable comparable21 = timeSeries3.getKey();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries3.removeChangeListener(seriesChangeListener22);
        timeSeries3.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(2147483647, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 10L + "'", comparable21, 10L);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries10.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.createCopy(0, 0);
        timeSeries18.removeAgedItems((long) (short) 100, false);
        timeSeries18.removeAgedItems((long) 1, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.update(regularTimePeriod25, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(true);
        boolean boolean11 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        timeSeries17.setDescription("Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str48 = timeSeries47.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries47.addPropertyChangeListener(propertyChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries54.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries47.addAndOrUpdate(timeSeries54);
        java.util.List list58 = timeSeries54.getItems();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries38.addAndOrUpdate(timeSeries54);
        int int60 = timeSeries38.getItemCount();
        boolean boolean61 = timeSeries38.getNotify();
        double double62 = timeSeries38.getMinY();
        java.util.Collection collection63 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod65 = timeSeries38.getTimePeriod((int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "Overwritten values from: 10");
        java.lang.Comparable comparable4 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 100.0d + "'", comparable4, 100.0d);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        java.lang.Class class19 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable20 = timeSeries3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 10L + "'", comparable20, 10L);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        timeSeries1.setKey((java.lang.Comparable) 9223372036854775807L);
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries24.removeAgedItems(true);
        int int27 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries20.addAndOrUpdate(timeSeries24);
        timeSeries24.setMaximumItemCount((int) (short) 0);
        double double31 = timeSeries24.getMinY();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str36 = timeSeries35.getDomainDescription();
        long long37 = timeSeries35.getMaximumItemAge();
        java.lang.String str38 = timeSeries35.getDescription();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries24.addAndOrUpdate(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        java.util.Collection collection42 = timeSeries35.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries41.removePropertyChangeListener(propertyChangeListener43);
        java.util.Collection collection45 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        java.lang.String str46 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 9223372036854775807L + "'", long37 == 9223372036854775807L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Time" + "'", str46, "Time");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setRangeDescription("Time");
        timeSeries3.clear();
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        java.lang.Comparable comparable34 = timeSeries19.getKey();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str48 = timeSeries47.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries47.addPropertyChangeListener(propertyChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries54.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries47.addAndOrUpdate(timeSeries54);
        java.util.List list58 = timeSeries54.getItems();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries38.addAndOrUpdate(timeSeries54);
        timeSeries59.setRangeDescription("");
        java.util.Collection collection62 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        timeSeries19.setMaximumItemAge((long) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod65 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod65, (double) (byte) -1, false);
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
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + "Overwritten values from: 10" + "'", comparable34, "Overwritten values from: 10");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(collection62);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        timeSeries24.setDomainDescription("");
        timeSeries24.setNotify(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = timeSeries3.getItems();
        timeSeries3.fireSeriesChanged();
        boolean boolean9 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str14 = timeSeries13.getDomainDescription();
        long long15 = timeSeries13.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener16);
        timeSeries13.setRangeDescription("");
        java.lang.Object obj20 = timeSeries13.clone();
        timeSeries13.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        timeSeries26.setRangeDescription("hi!");
        timeSeries26.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries26.removeChangeListener(seriesChangeListener32);
        timeSeries26.fireSeriesChanged();
        timeSeries26.setDescription("Time");
        timeSeries26.setMaximumItemAge((long) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries13.addAndOrUpdate(timeSeries26);
        boolean boolean40 = timeSeries3.equals((java.lang.Object) timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries26.addOrUpdate(regularTimePeriod41, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.clear();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries3.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, "Value", "hi!");
        timeSeries3.removeAgedItems((long) (byte) -1, false);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        double double13 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (java.lang.Number) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries58.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener61 = null;
        timeSeries58.addChangeListener(seriesChangeListener61);
        java.util.Collection collection63 = timeSeries54.getTimePeriodsUniqueToOtherSeries(timeSeries58);
        java.lang.Comparable comparable64 = timeSeries58.getKey();
        timeSeries58.fireSeriesChanged();
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
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertEquals("'" + comparable64 + "' != '" + 10L + "'", comparable64, 10L);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        java.lang.Class class61 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str66 = timeSeries65.getDomainDescription();
        timeSeries65.setRangeDescription("hi!");
        long long69 = timeSeries65.getMaximumItemAge();
        java.util.Collection collection70 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries65);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod71 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod71, (java.lang.Number) 10L, true);
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
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(class61);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 9223372036854775807L + "'", long69 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection70);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        timeSeries21.setRangeDescription("");
        long long24 = timeSeries21.getMaximumItemAge();
        boolean boolean25 = timeSeries21.getNotify();
        java.lang.Comparable comparable26 = timeSeries21.getKey();
        int int27 = timeSeries21.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(timeSeriesDataItem28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + "Overwritten values from: Overwritten values from: 10" + "'", comparable26, "Overwritten values from: Overwritten values from: 10");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str30 = timeSeries29.getDomainDescription();
        timeSeries29.setRangeDescription("");
        boolean boolean33 = timeSeries29.isEmpty();
        timeSeries29.removeAgedItems(true);
        java.util.Collection collection36 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries1.removeChangeListener(seriesChangeListener37);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDomainDescription("");
        int int11 = timeSeries3.getItemCount();
        timeSeries3.setDomainDescription("Time");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '#', (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
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
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        java.lang.Object obj9 = timeSeries3.clone();
        java.lang.String str10 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Overwritten values from: 100", "");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(regularTimePeriod2, Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
            timeSeries3.add(regularTimePeriod12, (double) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        timeSeries16.setRangeDescription("hi!");
        long long20 = timeSeries16.getMaximumItemAge();
        java.util.Collection collection21 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        java.lang.String str22 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        int int20 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.createCopy((int) (byte) 1, (int) '#');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete((int) '#', (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries1.addOrUpdate(timeSeriesDataItem4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d));
        timeSeries1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null; // flaky: timeSeries1.getDataItem((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        java.lang.Class class23 = timeSeries11.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update((int) (short) 10, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(class23);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        java.lang.String str10 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries14.removeAgedItems(true);
        int int17 = timeSeries14.getMaximumItemCount();
        double double18 = timeSeries14.getMaxY();
        timeSeries14.removeAgedItems(true);
        timeSeries14.setMaximumItemAge(9223372036854775807L);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries26 = timeSeries14.createCopy(regularTimePeriod24, regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDescription("Time");
        java.lang.Class class14 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.addOrUpdate(regularTimePeriod15, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        int int4 = timeSeries3.getMaximumItemCount();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Comparable comparable7 = timeSeries3.getKey();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 100 + "'", comparable7, 100);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries10.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.createCopy(0, 0);
        int int19 = timeSeries10.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) '#', (int) 'a');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries6.addOrUpdate(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "Overwritten values from: 10");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timeSeries3.getRangeDescription();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        int int8 = timeSeries3.getItemCount();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries13.removeAgedItems(true);
        int int16 = timeSeries13.getMaximumItemCount();
        double double17 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        timeSeries19.fireSeriesChanged();
        java.util.List list22 = timeSeries19.getItems();
        boolean boolean23 = timeSeries13.equals((java.lang.Object) timeSeries19);
        timeSeries13.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries3.addAndOrUpdate(timeSeries13);
        timeSeries13.setMaximumItemAge((long) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        int int9 = timeSeries3.getMaximumItemCount();
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        timeSeries10.removeAgedItems(false);
        boolean boolean18 = timeSeries10.getNotify();
        double double19 = timeSeries10.getMinY();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("Value");
        int int13 = timeSeries3.getItemCount();
        int int14 = timeSeries3.getItemCount();
        java.util.Collection collection15 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) '#', (int) 'a');
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        timeSeries3.setDomainDescription("Overwritten values from: Overwritten values from: 10");
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        boolean boolean8 = timeSeries3.isEmpty();
        boolean boolean9 = timeSeries3.isEmpty();
        boolean boolean10 = timeSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
            java.lang.Number number21 = timeSeries10.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = timeSeries3.getValue(regularTimePeriod32);
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, "Value", "Value");
        timeSeries3.clear();
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        timeSeries3.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class12 = timeSeries11.getTimePeriodClass();
        timeSeries11.removeAgedItems(true);
        java.util.Collection collection15 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        double double16 = timeSeries11.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries11.addOrUpdate(timeSeriesDataItem17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        timeSeries1.removeAgedItems((long) (short) 10, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod26, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        timeSeries1.setKey((java.lang.Comparable) 9223372036854775807L);
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.addOrUpdate(regularTimePeriod7, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        java.lang.String str10 = timeSeries8.getDescription();
        double double11 = timeSeries8.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Overwritten values from: Overwritten values from: 10", "hi!");
        double double4 = timeSeries3.getMinY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        timeSeries3.setMaximumItemAge(0L);
        java.lang.Class class10 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.getDataItem(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class10);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Time");
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        timeSeries3.setKey((java.lang.Comparable) (-1));
        int int12 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        boolean boolean11 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str16 = timeSeries15.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        int int32 = timeSeries29.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries25.addAndOrUpdate(timeSeries29);
        boolean boolean34 = timeSeries33.getNotify();
        int int35 = timeSeries33.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries33.createCopy((int) (byte) 10, (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem40, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(timeSeries39);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        timeSeries3.clear();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        double double6 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener43);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries48.removeAgedItems(true);
        int int51 = timeSeries48.getMaximumItemCount();
        timeSeries48.setKey((java.lang.Comparable) 100);
        java.lang.String str54 = timeSeries48.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        timeSeries48.addPropertyChangeListener(propertyChangeListener55);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries36.addAndOrUpdate(timeSeries48);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem58 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries36.add(timeSeriesDataItem58, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(timeSeries57);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        java.util.Collection collection15 = timeSeries10.getTimePeriods();
        long long16 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries10.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        java.lang.String str35 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries3.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy(regularTimePeriod2, regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        java.lang.Class<?> wildcardClass19 = list18.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        boolean boolean43 = timeSeries3.isEmpty();
        timeSeries3.setDescription("Time");
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.util.Collection collection60 = timeSeries52.getTimePeriods();
        java.lang.String str61 = timeSeries52.getDomainDescription();
        timeSeries52.setKey((java.lang.Comparable) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod64 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries52.update(regularTimePeriod64, (java.lang.Number) 100.0f);
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
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        long long12 = timeSeries10.getMaximumItemAge();
        boolean boolean13 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        java.lang.Class class20 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries10.addAndOrUpdate(timeSeries17);
        timeSeries10.setDescription("");
        timeSeries10.setDomainDescription("Time");
        java.lang.Class class26 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str31 = timeSeries30.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries30.addPropertyChangeListener(propertyChangeListener32);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries37.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries30.addAndOrUpdate(timeSeries37);
        long long41 = timeSeries37.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries37.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries10.addAndOrUpdate(timeSeries44);
        timeSeries45.fireSeriesChanged();
        java.util.Collection collection47 = timeSeries45.getTimePeriods();
        boolean boolean48 = timeSeries3.equals((java.lang.Object) collection47);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 9223372036854775807L + "'", long41 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        java.lang.String str27 = timeSeries23.getRangeDescription();
        java.lang.Comparable comparable28 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        timeSeries32.setRangeDescription("hi!");
        boolean boolean36 = timeSeries23.equals((java.lang.Object) "hi!");
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str41 = timeSeries40.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries40.addPropertyChangeListener(propertyChangeListener42);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries47.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries40.addAndOrUpdate(timeSeries47);
        java.util.List list51 = timeSeries47.getItems();
        java.lang.Object obj52 = null;
        boolean boolean53 = timeSeries47.equals(obj52);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries23.addAndOrUpdate(timeSeries47);
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries3.addAndOrUpdate(timeSeries23);
        boolean boolean56 = timeSeries3.getNotify();
        java.util.List list57 = timeSeries3.getItems();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 10L + "'", comparable28, 10L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        java.util.List list29 = timeSeries28.getItems();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        timeSeries31.fireSeriesChanged();
        java.lang.Object obj34 = timeSeries31.clone();
        timeSeries31.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries28.addAndOrUpdate(timeSeries31);
        boolean boolean38 = timeSeries31.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number40 = timeSeries31.getValue(regularTimePeriod39);
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
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean3 = timeSeries1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        long long4 = timeSeries3.getMaximumItemAge();
        long long5 = timeSeries3.getMaximumItemAge();
        timeSeries3.setRangeDescription("Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class28 = timeSeries27.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries32.addPropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries39.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries32.addAndOrUpdate(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries46.removeAgedItems(true);
        int int49 = timeSeries46.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries42.addAndOrUpdate(timeSeries46);
        boolean boolean51 = timeSeries50.getNotify();
        java.util.Collection collection52 = timeSeries27.getTimePeriodsUniqueToOtherSeries(timeSeries50);
        timeSeries27.setDomainDescription("Overwritten values from: 10");
        boolean boolean55 = timeSeries3.equals((java.lang.Object) "Overwritten values from: 10");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = timeSeries3.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        java.util.Collection collection13 = timeSeries3.getTimePeriods();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        java.util.Collection collection15 = timeSeries10.getTimePeriods();
        long long16 = timeSeries10.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update((int) '#', (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries58.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener61 = null;
        timeSeries58.addChangeListener(seriesChangeListener61);
        java.util.Collection collection63 = timeSeries54.getTimePeriodsUniqueToOtherSeries(timeSeries58);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = timeSeries58.addOrUpdate(regularTimePeriod64, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemAge(9223372036854775807L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
            timeSeries3.add(regularTimePeriod11, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        boolean boolean7 = timeSeries3.getNotify();
        java.util.List list8 = timeSeries3.getItems();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        java.lang.Object obj9 = timeSeries3.clone();
        long long10 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries14.removeAgedItems(true);
        int int17 = timeSeries14.getMaximumItemCount();
        int int18 = timeSeries14.getItemCount();
        boolean boolean19 = timeSeries3.equals((java.lang.Object) timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries14.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        timeSeries3.setMaximumItemAge(0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list15 = timeSeries3.getItems();
        timeSeries3.setNotify(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        timeSeries10.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update(regularTimePeriod18, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        timeSeries3.removeAgedItems(true);
        java.lang.Object obj7 = timeSeries3.clone();
        timeSeries3.setDomainDescription("Overwritten values from: 100");
        java.util.List list10 = timeSeries3.getItems();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        timeSeries3.setDescription("Overwritten values from: 10");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries10.addChangeListener(seriesChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update((int) (short) 100, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        boolean boolean10 = timeSeries8.getNotify();
        boolean boolean11 = timeSeries8.getNotify();
        timeSeries8.removeAgedItems((long) '4', false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        timeSeries1.setKey((java.lang.Comparable) 9223372036854775807L);
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries24.removeAgedItems(true);
        int int27 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries20.addAndOrUpdate(timeSeries24);
        timeSeries24.setMaximumItemCount((int) (short) 0);
        double double31 = timeSeries24.getMinY();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str36 = timeSeries35.getDomainDescription();
        long long37 = timeSeries35.getMaximumItemAge();
        java.lang.String str38 = timeSeries35.getDescription();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries24.addAndOrUpdate(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        java.util.Collection collection42 = timeSeries35.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries41.removePropertyChangeListener(propertyChangeListener43);
        java.util.Collection collection45 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries41.delete(2147483647, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 9223372036854775807L + "'", long37 == 9223372036854775807L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(collection45);
    }
}
