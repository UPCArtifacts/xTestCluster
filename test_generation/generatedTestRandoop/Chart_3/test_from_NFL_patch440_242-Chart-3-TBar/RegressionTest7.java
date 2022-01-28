import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        int int9 = timeSeries8.getMaximumItemCount();
        java.util.Collection collection10 = timeSeries8.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries8.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries(comparable0, "Overwritten values from: 10", "Overwritten values from: Overwritten values from: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemCount((int) (byte) 0);
        timeSeries3.setKey((java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener8);
        timeSeries3.setMaximumItemAge((long) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.setNotify(false);
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
        java.util.Collection collection40 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries31.clear();
        java.lang.String str42 = timeSeries31.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries31.createCopy(1, (int) (byte) 10);
        java.lang.Comparable comparable46 = timeSeries31.getKey();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str51 = timeSeries50.getDomainDescription();
        timeSeries50.setRangeDescription("hi!");
        java.util.Collection collection54 = timeSeries50.getTimePeriods();
        java.lang.Comparable comparable55 = timeSeries50.getKey();
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str60 = timeSeries59.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        timeSeries59.addPropertyChangeListener(propertyChangeListener61);
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries66.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries59.addAndOrUpdate(timeSeries66);
        java.util.List list70 = timeSeries66.getItems();
        org.jfree.data.time.TimeSeries timeSeries71 = timeSeries50.addAndOrUpdate(timeSeries66);
        timeSeries71.setRangeDescription("");
        java.util.Collection collection74 = timeSeries31.getTimePeriodsUniqueToOtherSeries(timeSeries71);
        timeSeries71.setDomainDescription("Overwritten values from: 10");
        java.util.Collection collection77 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries71);
        java.lang.Class class78 = timeSeries71.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value" + "'", str42, "Value");
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + "Overwritten values from: 10" + "'", comparable46, "Overwritten values from: 10");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertEquals("'" + comparable55 + "' != '" + 10L + "'", comparable55, 10L);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(timeSeries69);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(timeSeries71);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(class78);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) '#', (int) 'a');
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        timeSeries3.setDomainDescription("Overwritten values from: Overwritten values from: 10");
        double double11 = timeSeries3.getMaxY();
        java.lang.Comparable comparable12 = timeSeries3.getKey();
        boolean boolean13 = timeSeries3.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 0 + "'", comparable12, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries14.removeChangeListener(seriesChangeListener27);
        java.lang.Class class29 = timeSeries14.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries33.addPropertyChangeListener(propertyChangeListener34);
        timeSeries33.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class42 = timeSeries41.getTimePeriodClass();
        timeSeries41.removeAgedItems(true);
        java.util.Collection collection45 = timeSeries33.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        double double46 = timeSeries41.getMinY();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str51 = timeSeries50.getDomainDescription();
        timeSeries50.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        timeSeries50.removePropertyChangeListener(propertyChangeListener54);
        int int56 = timeSeries50.getMaximumItemCount();
        timeSeries50.removeAgedItems(0L, true);
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str64 = timeSeries63.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        timeSeries63.addPropertyChangeListener(propertyChangeListener65);
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries70.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries63.addAndOrUpdate(timeSeries70);
        double double74 = timeSeries73.getMaxY();
        timeSeries73.setMaximumItemCount(0);
        timeSeries73.removeAgedItems(1L, true);
        java.util.Collection collection80 = timeSeries50.getTimePeriodsUniqueToOtherSeries(timeSeries73);
        double double81 = timeSeries73.getMinY();
        boolean boolean82 = timeSeries41.equals((java.lang.Object) timeSeries73);
        org.jfree.data.time.TimeSeries timeSeries83 = timeSeries14.addAndOrUpdate(timeSeries41);
        java.lang.String str84 = timeSeries41.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener85 = null;
        timeSeries41.addPropertyChangeListener(propertyChangeListener85);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNull(class42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(timeSeries83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        java.lang.String str19 = timeSeries10.getDomainDescription();
        java.lang.Class<?> wildcardClass20 = timeSeries10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        java.lang.Object obj29 = timeSeries21.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod30, (java.lang.Number) (short) 10, true);
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
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        java.lang.Comparable comparable25 = timeSeries18.getKey();
        timeSeries18.clear();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str31 = timeSeries30.getDomainDescription();
        timeSeries30.removeAgedItems(true);
        double double34 = timeSeries30.getMinY();
        int int35 = timeSeries30.getItemCount();
        boolean boolean36 = timeSeries30.getNotify();
        java.util.Collection collection37 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries30.add(regularTimePeriod38, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + "hi!" + "'", comparable25, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.lang.Class class2 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        java.lang.String str19 = timeSeries8.getDescription();
        timeSeries8.setMaximumItemCount(1);
        timeSeries8.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries8.removeChangeListener(seriesChangeListener24);
        timeSeries8.clear();
        int int27 = timeSeries8.getMaximumItemCount();
        java.util.List list28 = timeSeries8.getItems();
        boolean boolean29 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.junit.Assert.assertNull(class2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        timeSeries3.removeAgedItems((long) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries29 = timeSeries3.createCopy((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDomainDescription("Value");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "", "Time");
        java.util.List list4 = timeSeries3.getItems();
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem63 = timeSeries52.addOrUpdate(regularTimePeriod61, (java.lang.Number) (byte) 10);
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
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        timeSeries3.removeAgedItems((long) 100, false);
        java.lang.String str12 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy((int) (byte) 100, (int) (byte) 100);
        timeSeries15.setNotify(true);
        int int18 = timeSeries15.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        int int33 = timeSeries22.getItemCount();
        java.util.List list34 = timeSeries22.getItems();
        java.util.Collection collection35 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        java.lang.Comparable comparable36 = timeSeries22.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + 10L + "'", comparable36, 10L);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.List list8 = timeSeries3.getItems();
        java.lang.String str9 = timeSeries3.getDescription();
        timeSeries3.setRangeDescription("Overwritten values from: Overwritten values from: 10");
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
        java.lang.Class class34 = timeSeries29.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries38.removeAgedItems(true);
        int int41 = timeSeries38.getMaximumItemCount();
        timeSeries38.setKey((java.lang.Comparable) 100);
        boolean boolean44 = timeSeries29.equals((java.lang.Object) 100);
        boolean boolean45 = timeSeries29.isEmpty();
        java.lang.Class class46 = timeSeries29.getTimePeriodClass();
        timeSeries29.setKey((java.lang.Comparable) (short) -1);
        java.util.Collection collection49 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.util.Collection collection50 = timeSeries29.getTimePeriods();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(class46);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        java.lang.Class class31 = timeSeries3.getTimePeriodClass();
        java.util.List list32 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(10, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        timeSeries11.setKey((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        timeSeries3.setMaximumItemAge((long) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy((int) (short) 0, (int) (byte) 0);
        timeSeries13.setMaximumItemAge((long) 100);
        timeSeries13.setNotify(true);
        int int18 = timeSeries13.getItemCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        double double39 = timeSeries38.getMaxY();
        java.lang.Comparable comparable40 = timeSeries38.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null; // flaky: timeSeries38.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + "Overwritten values from: 10" + "'", comparable40, "Overwritten values from: 10");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        double double3 = timeSeries1.getMaxY();
        java.lang.Object obj4 = timeSeries1.clone();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        timeSeries26.setMaximumItemAge((long) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        java.lang.String str35 = timeSeries34.getRangeDescription();
        timeSeries34.setDomainDescription("hi!");
        java.lang.String str38 = timeSeries34.getRangeDescription();
        java.util.Collection collection39 = timeSeries34.getTimePeriods();
        timeSeries34.clear();
        java.util.Collection collection41 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = timeSeries34.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Time" + "'", str35, "Time");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Time" + "'", str38, "Time");
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str31 = timeSeries30.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries30.addPropertyChangeListener(propertyChangeListener32);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries37.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries30.addAndOrUpdate(timeSeries37);
        java.lang.String str41 = timeSeries30.getDescription();
        boolean boolean42 = timeSeries30.getNotify();
        java.lang.String str43 = timeSeries30.getRangeDescription();
        java.util.List list44 = timeSeries30.getItems();
        double double45 = timeSeries30.getMinY();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries13.addAndOrUpdate(timeSeries30);
        java.lang.Class<?> wildcardClass47 = timeSeries46.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        int int9 = timeSeries8.getMaximumItemCount();
        java.util.Collection collection10 = timeSeries8.getTimePeriods();
        java.lang.Object obj11 = timeSeries8.clone();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class16 = timeSeries15.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str21 = timeSeries20.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries27.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries20.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries34.removeAgedItems(true);
        int int37 = timeSeries34.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries30.addAndOrUpdate(timeSeries34);
        boolean boolean39 = timeSeries38.getNotify();
        java.util.Collection collection40 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        boolean boolean41 = timeSeries38.isEmpty();
        boolean boolean42 = timeSeries8.equals((java.lang.Object) timeSeries38);
        timeSeries38.clear();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(timeSeriesDataItem25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        java.lang.String str29 = timeSeries10.getDescription();
        long long30 = timeSeries10.getMaximumItemAge();
        java.lang.Class<?> wildcardClass31 = timeSeries10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 10L + "'", comparable26, 10L);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        boolean boolean45 = timeSeries43.getNotify();
        timeSeries43.setKey((java.lang.Comparable) (-1.0f));
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        timeSeries19.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod32, (double) 10.0f, false);
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
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        timeSeries3.removeAgedItems((long) 100, false);
        timeSeries3.setMaximumItemCount((int) (byte) 10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem54 = timeSeries3.addOrUpdate(timeSeriesDataItem53);
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
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        int int12 = timeSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "Value", "Overwritten values from: 100");
        long long4 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy(regularTimePeriod6, regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        timeSeries1.setMaximumItemAge((long) 2147483647);
        boolean boolean4 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        double double30 = timeSeries19.getMinY();
        timeSeries19.setMaximumItemAge((long) (short) 1);
        timeSeries19.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null; // flaky: timeSeries19.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries13.setNotify(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        timeSeries8.setDomainDescription("");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "", "Value");
        double double4 = timeSeries3.getMaxY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        java.lang.Class class15 = timeSeries3.getTimePeriodClass();
        java.lang.String str16 = timeSeries3.getRangeDescription();
        java.lang.Object obj17 = timeSeries3.clone();
        java.lang.String str18 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        timeSeries52.addPropertyChangeListener(propertyChangeListener64);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries52.add(timeSeriesDataItem66);
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
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        boolean boolean10 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        int int22 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod23, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: Overwritten values from: 10", "hi!");
        java.lang.Object obj4 = timeSeries3.clone();
        boolean boolean5 = timeSeries3.getNotify();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        timeSeries12.setRangeDescription("hi!");
        boolean boolean16 = timeSeries3.equals((java.lang.Object) "hi!");
        timeSeries3.removeAgedItems((-1L), true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries3.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.createCopy(regularTimePeriod22, regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        timeSeries3.setDomainDescription("Overwritten values from: Overwritten values from: 10");
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
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.List list8 = timeSeries3.getItems();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener8);
        timeSeries3.removeAgedItems(0L, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeSeries3.getIndex(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        timeSeries21.clear();
        int int26 = timeSeries21.getItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) '#', (int) 'a');
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        timeSeries3.setDomainDescription("Overwritten values from: Overwritten values from: 10");
        double double11 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems((long) 0, true);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        java.lang.String str22 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries3.addOrUpdate(timeSeriesDataItem23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        long long24 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod25, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        int int19 = timeSeries18.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(regularTimePeriod20, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        java.lang.String str12 = timeSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Overwritten values from: Overwritten values from: 10" + "'", str12, "Overwritten values from: Overwritten values from: 10");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, "Value", "hi!");
        timeSeries14.removeAgedItems((long) (byte) -1, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries3.addAndOrUpdate(timeSeries14);
        int int21 = timeSeries20.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        timeSeries59.setDomainDescription("Overwritten values from: 10");
        timeSeries59.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem69 = timeSeries59.addOrUpdate(regularTimePeriod67, (java.lang.Number) 10.0f);
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
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener94 = null;
        timeSeries3.removeChangeListener(seriesChangeListener94);
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
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L);
        timeSeries1.setKey((java.lang.Comparable) "Time");
        java.util.Collection collection4 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener5);
        timeSeries1.setDescription("");
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries43.removePropertyChangeListener(propertyChangeListener45);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener47 = null;
        timeSeries43.removeChangeListener(seriesChangeListener47);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries43.removeChangeListener(seriesChangeListener49);
        double double51 = timeSeries43.getMaxY();
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
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod28, (java.lang.Number) 10L, false);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        timeSeries3.removeAgedItems(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries35 = timeSeries3.createCopy(2147483647, (int) ' ');
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
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        timeSeries3.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class12 = timeSeries11.getTimePeriodClass();
        timeSeries11.removeAgedItems(true);
        java.util.Collection collection15 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        double double16 = timeSeries11.getMinY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str21 = timeSeries20.getDomainDescription();
        timeSeries20.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener24);
        int int26 = timeSeries20.getMaximumItemCount();
        timeSeries20.removeAgedItems(0L, true);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str34 = timeSeries33.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries33.addPropertyChangeListener(propertyChangeListener35);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries40);
        double double44 = timeSeries43.getMaxY();
        timeSeries43.setMaximumItemCount(0);
        timeSeries43.removeAgedItems(1L, true);
        java.util.Collection collection50 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries43);
        double double51 = timeSeries43.getMinY();
        boolean boolean52 = timeSeries11.equals((java.lang.Object) timeSeries43);
        timeSeries11.fireSeriesChanged();
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        timeSeries1.removeAgedItems(false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str66 = timeSeries65.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        timeSeries65.addPropertyChangeListener(propertyChangeListener67);
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries72.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries65.addAndOrUpdate(timeSeries72);
        java.beans.PropertyChangeListener propertyChangeListener76 = null;
        timeSeries72.removePropertyChangeListener(propertyChangeListener76);
        timeSeries72.removeAgedItems(10L, true);
        timeSeries72.setRangeDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries86 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries86.fireSeriesChanged();
        boolean boolean88 = timeSeries86.getNotify();
        timeSeries86.setMaximumItemCount((int) (byte) 0);
        java.util.Collection collection91 = timeSeries72.getTimePeriodsUniqueToOtherSeries(timeSeries86);
        timeSeries72.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener93 = null;
        timeSeries72.addPropertyChangeListener(propertyChangeListener93);
        boolean boolean95 = timeSeries10.equals((java.lang.Object) timeSeries72);
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(timeSeries75);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        timeSeries17.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str41 = timeSeries40.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries40.addPropertyChangeListener(propertyChangeListener42);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries47.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries40.addAndOrUpdate(timeSeries47);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries54.removeAgedItems(true);
        int int57 = timeSeries54.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries50.addAndOrUpdate(timeSeries54);
        java.lang.Class class59 = timeSeries58.getTimePeriodClass();
        java.util.List list60 = timeSeries58.getItems();
        java.util.Collection collection61 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries58);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.delete(regularTimePeriod62);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNull(class59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(collection61);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries3.addChangeListener(seriesChangeListener17);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries3.removeChangeListener(seriesChangeListener19);
        long long21 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
        java.lang.String str44 = timeSeries10.getDomainDescription();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        boolean boolean8 = timeSeries3.isEmpty();
        boolean boolean9 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("Overwritten values from: 100");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, "Value", "hi!");
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.addAndOrUpdate(timeSeries15);
        timeSeries3.setDomainDescription("Overwritten values from: Overwritten values from: 10");
        java.lang.Object obj19 = timeSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        timeSeries3.removeAgedItems(true);
        int int16 = timeSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.List list8 = timeSeries3.getItems();
        java.lang.String str9 = timeSeries3.getDescription();
        timeSeries3.setRangeDescription("Overwritten values from: Overwritten values from: 10");
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
        java.lang.Class class34 = timeSeries29.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries38.removeAgedItems(true);
        int int41 = timeSeries38.getMaximumItemCount();
        timeSeries38.setKey((java.lang.Comparable) 100);
        boolean boolean44 = timeSeries29.equals((java.lang.Object) 100);
        boolean boolean45 = timeSeries29.isEmpty();
        java.lang.Class class46 = timeSeries29.getTimePeriodClass();
        timeSeries29.setKey((java.lang.Comparable) (short) -1);
        java.util.Collection collection49 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        timeSeries3.removeAgedItems((long) (byte) 100, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(class46);
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        boolean boolean22 = timeSeries21.isEmpty();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + "Overwritten values from: Overwritten values from: 10" + "'", comparable23, "Overwritten values from: Overwritten values from: 10");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        timeSeries22.fireSeriesChanged();
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
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
            timeSeries73.add(regularTimePeriod75, (double) (-1.0f));
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
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        java.util.List list24 = timeSeries3.getItems();
        double double25 = timeSeries3.getMinY();
        timeSeries3.setKey((java.lang.Comparable) 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        double double17 = timeSeries10.getMaxY();
        java.lang.Object obj18 = timeSeries10.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        java.lang.String str11 = timeSeries3.getDescription();
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
        java.util.List list34 = timeSeries33.getItems();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries38.fireSeriesChanged();
        java.lang.String str40 = timeSeries38.getDescription();
        timeSeries38.setRangeDescription("Time");
        java.util.Collection collection43 = timeSeries33.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries3.addAndOrUpdate(timeSeries33);
        java.lang.String str45 = timeSeries3.getRangeDescription();
        timeSeries3.setKey((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem67 = timeSeries19.addOrUpdate(regularTimePeriod65, (double) (byte) 100);
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
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        timeSeries3.setMaximumItemCount((int) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener58);
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems(true);
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
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        timeSeries23.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        timeSeries29.removeAgedItems(10L, false);
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
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "Overwritten values from: 10", "");
        timeSeries3.removeAgedItems(true);
        java.lang.Class class6 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.List list8 = timeSeries3.getItems();
        timeSeries3.clear();
        java.lang.String str10 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        timeSeries36.setMaximumItemCount((int) (byte) 0);
        timeSeries36.setDomainDescription("hi!");
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
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.Collection collection12 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        int int24 = timeSeries16.getMaximumItemCount();
        java.util.List list25 = timeSeries16.getItems();
        int int26 = timeSeries16.getItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        double double76 = timeSeries22.getMaxY();
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
        org.junit.Assert.assertTrue(Double.isNaN(double76));
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Time");
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        timeSeries3.setKey((java.lang.Comparable) (-1));
        timeSeries3.removeAgedItems((long) (byte) 1, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        java.lang.Class class6 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class16 = timeSeries10.getTimePeriodClass();
        java.lang.String str17 = timeSeries10.getDomainDescription();
        timeSeries10.setRangeDescription("Value");
        int int20 = timeSeries10.getItemCount();
        int int21 = timeSeries10.getItemCount();
        timeSeries10.fireSeriesChanged();
        boolean boolean23 = timeSeries3.equals((java.lang.Object) timeSeries10);
        java.lang.String str24 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str29 = timeSeries28.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries28.addPropertyChangeListener(propertyChangeListener30);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries35.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries28.addAndOrUpdate(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries42.removeAgedItems(true);
        int int45 = timeSeries42.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries38.addAndOrUpdate(timeSeries42);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries50.removeAgedItems(true);
        int int53 = timeSeries50.getMaximumItemCount();
        timeSeries50.setKey((java.lang.Comparable) 100);
        java.lang.String str56 = timeSeries50.getRangeDescription();
        int int57 = timeSeries50.getItemCount();
        boolean boolean58 = timeSeries50.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries46.addAndOrUpdate(timeSeries50);
        int int60 = timeSeries46.getItemCount();
        java.util.Collection collection61 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries46);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(collection61);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        int int9 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.addChangeListener(seriesChangeListener10);
        java.lang.Object obj12 = timeSeries3.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(false);
        double double6 = timeSeries3.getMinY();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("hi!");
        int int10 = timeSeries3.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
        java.lang.Class class31 = timeSeries3.getTimePeriodClass();
        timeSeries3.clear();
        int int33 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemCount((int) (short) 0);
        timeSeries3.setDomainDescription("Overwritten values from: 100");
        timeSeries3.clear();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        int int11 = timeSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        timeSeries21.setKey((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries78.removeAgedItems(true);
        int int81 = timeSeries78.getMaximumItemCount();
        timeSeries78.setKey((java.lang.Comparable) 100);
        int int84 = timeSeries78.getMaximumItemCount();
        boolean boolean85 = timeSeries67.equals((java.lang.Object) timeSeries78);
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
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2147483647 + "'", int81 == 2147483647);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2147483647 + "'", int84 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "hi!");
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Overwritten values from: 100", "Overwritten values from: 10");
        timeSeries3.removeAgedItems(100L, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        timeSeries1.setDomainDescription("Overwritten values from: Overwritten values from: 10");
        timeSeries1.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        boolean boolean8 = timeSeries3.isEmpty();
        boolean boolean9 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("Overwritten values from: 100");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, "Value", "hi!");
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.addAndOrUpdate(timeSeries15);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries16.addPropertyChangeListener(propertyChangeListener19);
        long long21 = timeSeries16.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries71.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener74 = null;
        timeSeries71.addPropertyChangeListener(propertyChangeListener74);
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "", "Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries71.addAndOrUpdate(timeSeries79);
        boolean boolean81 = timeSeries17.equals((java.lang.Object) timeSeries71);
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
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        java.lang.Object obj19 = timeSeries3.clone();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        timeSeries3.setDomainDescription("Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        int int74 = timeSeries17.getMaximumItemCount();
        java.util.List list75 = timeSeries17.getItems();
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2147483647 + "'", int74 == 2147483647);
        org.junit.Assert.assertNotNull(list75);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.fireSeriesChanged();
        java.util.List list4 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        java.lang.Object obj24 = null;
        boolean boolean25 = timeSeries19.equals(obj24);
        int int26 = timeSeries19.getMaximumItemCount();
        boolean boolean27 = timeSeries19.getNotify();
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries8.addAndOrUpdate(timeSeries19);
        boolean boolean31 = timeSeries1.equals((java.lang.Object) timeSeries30);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries35.removeAgedItems(true);
        int int38 = timeSeries35.getMaximumItemCount();
        boolean boolean39 = timeSeries35.isEmpty();
        timeSeries35.clear();
        timeSeries35.removeAgedItems((long) 100, true);
        timeSeries35.setDomainDescription("");
        java.util.Collection collection46 = timeSeries30.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener47);
        timeSeries30.clear();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str54 = timeSeries53.getDomainDescription();
        timeSeries53.setRangeDescription("hi!");
        timeSeries53.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener59 = null;
        timeSeries53.removeChangeListener(seriesChangeListener59);
        boolean boolean61 = timeSeries53.getNotify();
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries65.removeAgedItems(true);
        int int68 = timeSeries65.getMaximumItemCount();
        timeSeries65.setKey((java.lang.Comparable) 100);
        java.lang.String str71 = timeSeries65.getRangeDescription();
        int int72 = timeSeries65.getItemCount();
        timeSeries65.removeAgedItems(true);
        timeSeries65.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list77 = timeSeries65.getItems();
        int int78 = timeSeries65.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries79 = timeSeries53.addAndOrUpdate(timeSeries65);
        java.lang.String str80 = timeSeries65.getDomainDescription();
        timeSeries65.clear();
        boolean boolean82 = timeSeries65.getNotify();
        org.jfree.data.time.TimeSeries timeSeries83 = timeSeries30.addAndOrUpdate(timeSeries65);
        timeSeries83.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(timeSeries79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(timeSeries83);
    }
}
