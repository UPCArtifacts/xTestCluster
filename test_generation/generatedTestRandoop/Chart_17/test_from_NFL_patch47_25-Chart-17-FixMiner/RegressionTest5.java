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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries38.addOrUpdate(regularTimePeriod39, 0.0d);
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
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        timeSeries19.setMaximumItemCount(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries19.addChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries15.addAndOrUpdate(timeSeries19);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries27.removePropertyChangeListener(propertyChangeListener28);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        boolean boolean64 = timeSeries25.getNotify();
        timeSeries25.setMaximumItemAge((long) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries12.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        timeSeries2.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.removeAgedItems(true);
        int int11 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        timeSeries13.setDomainDescription("Value");
        java.util.Collection collection16 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        java.lang.String str17 = timeSeries13.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries13.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class33);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries34.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str38 = timeSeries34.getRangeDescription();
        timeSeries34.setMaximumItemCount((int) ' ');
        timeSeries34.setMaximumItemAge((long) (short) 100);
        timeSeries34.setRangeDescription("");
        java.util.List list45 = timeSeries34.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries34.addChangeListener(seriesChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries25.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries22.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries51 = timeSeries34.addAndOrUpdate(timeSeries50);
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
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNotNull(timeSeries49);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        timeSeries12.removeAgedItems(true);
        java.lang.Object obj22 = timeSeries12.clone();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener23);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
            int int19 = timeSeries15.getIndex(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        timeSeries5.setRangeDescription("Overwritten values from: 4");
        java.lang.String str9 = timeSeries5.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries5.addChangeListener(seriesChangeListener10);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + '4' + "'", comparable6, '4');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Overwritten values from: 4" + "'", str9, "Overwritten values from: 4");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        timeSeries32.setMaximumItemCount(10);
        boolean boolean35 = timeSeries32.getNotify();
        java.lang.String str36 = timeSeries32.getRangeDescription();
        boolean boolean37 = timeSeries32.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries32.update(regularTimePeriod38, (java.lang.Number) 100.0f);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null; // flaky: timeSeries18.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries28.removeChangeListener(seriesChangeListener49);
        long long51 = timeSeries28.getMaximumItemAge();
        java.lang.Class class53 = null;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class53);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries54.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str58 = timeSeries54.getRangeDescription();
        timeSeries54.setMaximumItemCount((int) ' ');
        java.lang.Class class62 = null;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class62);
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries63.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str67 = timeSeries63.getRangeDescription();
        timeSeries63.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        timeSeries63.removePropertyChangeListener(propertyChangeListener70);
        boolean boolean73 = timeSeries63.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries54.addAndOrUpdate(timeSeries63);
        org.jfree.data.time.TimeSeries timeSeries77 = timeSeries63.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries77.createCopy((int) (byte) 1, (int) '4');
        timeSeries77.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries28.addAndOrUpdate(timeSeries77);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod83 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries77.add(regularTimePeriod83, (double) 1);
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
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 9223372036854775807L + "'", long51 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Value" + "'", str58, "Value");
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Value" + "'", str67, "Value");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(timeSeries74);
        org.junit.Assert.assertNotNull(timeSeries77);
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertNotNull(timeSeries82);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        long long26 = timeSeries19.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.createCopy((int) '4', (int) (byte) 10);
        long long30 = timeSeries19.getMaximumItemAge();
        java.util.Collection collection31 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        boolean boolean32 = timeSeries13.getNotify();
        java.util.Collection collection33 = timeSeries13.getTimePeriods();
        java.lang.String str34 = timeSeries13.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "hi!", "Value", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "Value", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, (java.lang.Class) wildcardClass20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.update(regularTimePeriod24, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        timeSeries6.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener13);
        timeSeries6.setNotify(false);
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.addAndOrUpdate(timeSeries28);
        boolean boolean31 = timeSeries29.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries29.removeChangeListener(seriesChangeListener32);
        java.util.Collection collection34 = timeSeries6.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.lang.Class<?> wildcardClass35 = collection34.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass35);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "Overwritten values from: 4", "", (java.lang.Class) wildcardClass35);
        timeSeries37.setNotify(true);
        java.lang.String str40 = timeSeries37.getDescription();
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class42);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries43.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class48);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries49.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries43.addAndOrUpdate(timeSeries52);
        java.lang.Comparable comparable54 = timeSeries43.getKey();
        java.lang.Class class55 = timeSeries43.getTimePeriodClass();
        int int56 = timeSeries43.getMaximumItemCount();
        java.lang.Class class59 = null;
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class59);
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries60.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str64 = timeSeries60.getRangeDescription();
        timeSeries60.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        timeSeries60.addPropertyChangeListener(propertyChangeListener67);
        timeSeries60.setNotify(false);
        java.lang.Class class72 = null;
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class72);
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries73.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class78 = null;
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class78);
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries79.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries83 = timeSeries73.addAndOrUpdate(timeSeries82);
        boolean boolean85 = timeSeries83.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener86 = null;
        timeSeries83.removeChangeListener(seriesChangeListener86);
        java.util.Collection collection88 = timeSeries60.getTimePeriodsUniqueToOtherSeries(timeSeries83);
        java.lang.Class<?> wildcardClass89 = collection88.getClass();
        org.jfree.data.time.TimeSeries timeSeries90 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass89);
        java.util.Collection collection91 = timeSeries43.getTimePeriodsUniqueToOtherSeries(timeSeries90);
        java.lang.Object obj92 = timeSeries90.clone();
        org.jfree.data.time.TimeSeries timeSeries93 = timeSeries37.addAndOrUpdate(timeSeries90);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod94 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries37.add(regularTimePeriod94, (double) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + '4' + "'", comparable54, '4');
        org.junit.Assert.assertNull(class55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Value" + "'", str64, "Value");
        org.junit.Assert.assertNotNull(timeSeries76);
        org.junit.Assert.assertNotNull(timeSeries82);
        org.junit.Assert.assertNotNull(timeSeries83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertNotNull(obj92);
        org.junit.Assert.assertNotNull(timeSeries93);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries5.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "hi!", "Value", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "Value", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, (java.lang.Class) wildcardClass20);
        timeSeries23.removeAgedItems(false);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setDescription("Time");
        java.lang.String str17 = timeSeries2.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries2.getDataItem(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        java.lang.Comparable comparable18 = timeSeries17.getKey();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str25 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount((int) ' ');
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str34 = timeSeries30.getRangeDescription();
        timeSeries30.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener37);
        boolean boolean40 = timeSeries30.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries21.addAndOrUpdate(timeSeries30);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries30.createCopy((int) (short) 0, (int) '4');
        boolean boolean45 = timeSeries44.getNotify();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries17.addAndOrUpdate(timeSeries44);
        timeSeries17.setRangeDescription("Overwritten values from: 4");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries17.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + false + "'", comparable18, false);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(timeSeries46);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        int int16 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Overwritten values from: 4");
        timeSeries2.setMaximumItemAge(0L);
        timeSeries2.setKey((java.lang.Comparable) 100L);
        timeSeries2.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        timeSeries5.setNotify(true);
        timeSeries5.fireSeriesChanged();
        boolean boolean14 = timeSeries5.getNotify();
        timeSeries5.setDomainDescription("");
        timeSeries5.setMaximumItemCount(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries5.removeChangeListener(seriesChangeListener19);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        timeSeries5.setNotify(true);
        timeSeries5.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener15);
        timeSeries5.clear();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries17);
        java.lang.Class<?> wildcardClass19 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass19);
        java.lang.Class class23 = timeSeries22.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, "hi!", "Overwritten values from: 4", class23);
        timeSeries24.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener27);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(class23);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        java.lang.Class<?> wildcardClass16 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Value", "Time", (java.lang.Class) wildcardClass16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, "Overwritten values from: 4", "hi!", (java.lang.Class) wildcardClass16);
        java.lang.Class class20 = timeSeries19.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.update(regularTimePeriod21, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(class20);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        timeSeries11.setDescription("");
        boolean boolean41 = timeSeries11.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        long long13 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("");
        java.lang.String str16 = timeSeries2.getRangeDescription();
        int int17 = timeSeries2.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries2.addChangeListener(seriesChangeListener18);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        java.lang.Object obj10 = timeSeries4.clone();
        boolean boolean11 = timeSeries4.getNotify();
        java.lang.Class class12 = timeSeries4.getTimePeriodClass();
        timeSeries4.setRangeDescription("Overwritten values from: Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        timeSeries2.setKey((java.lang.Comparable) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod37, (java.lang.Number) (short) 100);
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
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        java.util.List list4 = timeSeries1.getItems();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str14 = timeSeries10.getRangeDescription();
        java.lang.Class<?> wildcardClass15 = timeSeries10.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass15);
        int int17 = timeSeries16.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries16.createCopy(1, (int) (short) 0);
        timeSeries20.setMaximumItemCount(100);
        java.lang.String str23 = timeSeries20.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries20.createCopy((int) (byte) 1, (int) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries1.addAndOrUpdate(timeSeries20);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.add(timeSeriesDataItem28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener18);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        java.util.List list27 = timeSeries22.getItems();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries15.addAndOrUpdate(timeSeries22);
        timeSeries15.clear();
        java.lang.Class<?> wildcardClass30 = timeSeries15.getClass();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener19);
        timeSeries12.setNotify(false);
        java.lang.Class<?> wildcardClass23 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Time", (java.lang.Class) wildcardClass23);
        java.lang.Class<?> wildcardClass26 = timeSeries25.getClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Time", "hi!", (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "Value", "hi!", (java.lang.Class) wildcardClass26);
        timeSeries28.setMaximumItemAge((long) 10);
        java.lang.Comparable comparable31 = timeSeries28.getKey();
        timeSeries28.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.update(regularTimePeriod33, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (-1.0f) + "'", comparable31, (-1.0f));
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class3);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str8 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        timeSeries4.setNotify(false);
        java.lang.Class<?> wildcardClass15 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass15);
        java.lang.Object obj18 = timeSeries17.clone();
        boolean boolean19 = timeSeries17.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) '#', 0);
        boolean boolean5 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems((long) (short) 1, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.update(regularTimePeriod21, (java.lang.Number) (short) 10);
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
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class34);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries35.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str39 = timeSeries35.getRangeDescription();
        timeSeries35.setMaximumItemCount((int) ' ');
        long long42 = timeSeries35.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries35.createCopy((int) '4', (int) (byte) 10);
        timeSeries45.removeAgedItems(true);
        timeSeries45.setDescription("hi!");
        java.util.Collection collection50 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        timeSeries45.setMaximumItemAge((long) (byte) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = timeSeries45.addOrUpdate(regularTimePeriod53, (java.lang.Number) (byte) 1);
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
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.lang.String str14 = timeSeries12.getRangeDescription();
        timeSeries12.setNotify(true);
        timeSeries12.setDomainDescription("Value");
        timeSeries12.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        java.lang.Comparable comparable20 = timeSeries15.getKey();
        timeSeries15.setNotify(true);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 0L + "'", comparable20, 0L);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Time");
        long long12 = timeSeries2.getMaximumItemAge();
        java.util.Collection collection13 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries2.createCopy(0, 10);
        java.lang.Object obj12 = timeSeries2.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) (byte) 1, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        java.lang.String str37 = timeSeries35.getRangeDescription();
        timeSeries35.setMaximumItemAge((long) (short) 10);
        int int40 = timeSeries35.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9223372036854775807L + "'", long36 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.util.List list14 = timeSeries12.getItems();
        int int15 = timeSeries12.getMaximumItemCount();
        java.lang.String str16 = timeSeries12.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        java.lang.String str23 = timeSeries2.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries22.createCopy(0, 10);
        boolean boolean32 = timeSeries12.equals((java.lang.Object) 10);
        int int33 = timeSeries12.getMaximumItemCount();
        timeSeries12.removeAgedItems(true);
        timeSeries12.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class3);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str8 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        timeSeries4.setNotify(false);
        java.lang.Class<?> wildcardClass15 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(timeSeriesDataItem18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        timeSeries1.setDomainDescription("Value");
        long long4 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        boolean boolean23 = timeSeries22.isEmpty();
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class25);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries26.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str30 = timeSeries26.getRangeDescription();
        timeSeries26.setMaximumItemCount((int) ' ');
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class34);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries35.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str39 = timeSeries35.getRangeDescription();
        timeSeries35.setMaximumItemCount((int) ' ');
        timeSeries35.setMaximumItemAge((long) (short) 100);
        timeSeries35.setRangeDescription("");
        java.util.List list46 = timeSeries35.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        timeSeries35.addChangeListener(seriesChangeListener47);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries26.addAndOrUpdate(timeSeries35);
        java.util.Collection collection50 = timeSeries49.getTimePeriods();
        timeSeries49.setDomainDescription("hi!");
        timeSeries49.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries22.addAndOrUpdate(timeSeries49);
        timeSeries55.clear();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(timeSeries55);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.setMaximumItemCount((int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries12.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        java.util.List list36 = timeSeries35.getItems();
        timeSeries35.setRangeDescription("Overwritten values from: 4");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number40 = timeSeries35.getValue(regularTimePeriod39);
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
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        timeSeries8.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries8.createCopy(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "Overwritten values from: Overwritten values from: 4", "Overwritten values from: 1", (java.lang.Class) wildcardClass14);
        timeSeries15.setMaximumItemCount(2147483647);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener27);
        java.util.Collection collection29 = timeSeries25.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = timeSeries25.getValue(97);
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
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str11 = timeSeries7.getRangeDescription();
        java.lang.Class<?> wildcardClass12 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass12);
        timeSeries14.clear();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        int int18 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries17);
        java.lang.Class<?> wildcardClass20 = timeSeries17.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", (java.lang.Class) wildcardClass20);
        int int22 = timeSeries21.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class15);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries16.addChangeListener(seriesChangeListener17);
        boolean boolean19 = timeSeries3.equals((java.lang.Object) timeSeries16);
        java.lang.String str20 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("");
        boolean boolean23 = timeSeries3.isEmpty();
        java.lang.String str24 = timeSeries3.getRangeDescription();
        java.lang.Class<?> wildcardClass25 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass25);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        long long23 = timeSeries12.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        java.lang.String str17 = timeSeries2.getDomainDescription();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class19 = timeSeries2.getTimePeriodClass();
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        boolean boolean28 = timeSeries22.equals((java.lang.Object) 10L);
        timeSeries22.setDescription("Value");
        java.lang.Object obj31 = timeSeries22.clone();
        timeSeries22.setMaximumItemCount((int) 'a');
        timeSeries22.setNotify(false);
        java.util.Collection collection36 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries2.removeChangeListener(seriesChangeListener18);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        timeSeries33.setNotify(true);
        java.lang.Class<?> wildcardClass36 = timeSeries33.getClass();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        long long6 = timeSeries5.getMaximumItemAge();
        timeSeries5.clear();
        java.lang.Comparable comparable8 = timeSeries5.getKey();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + '4' + "'", comparable8, '4');
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries12.addOrUpdate(regularTimePeriod17, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) 1);
        java.lang.Class class11 = timeSeries2.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries2.createCopy(32, 0);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        timeSeries32.setMaximumItemCount(10);
        boolean boolean35 = timeSeries32.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries32.addPropertyChangeListener(propertyChangeListener36);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.createCopy(regularTimePeriod38, regularTimePeriod39);
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
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        java.lang.Object obj28 = timeSeries25.clone();
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class32);
        timeSeries33.setRangeDescription("hi!");
        timeSeries33.setNotify(true);
        timeSeries33.setDescription("");
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class43);
        timeSeries44.setRangeDescription("hi!");
        timeSeries44.setNotify(true);
        java.lang.Comparable comparable49 = timeSeries44.getKey();
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries33.addAndOrUpdate(timeSeries44);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries44.removeChangeListener(seriesChangeListener51);
        boolean boolean53 = timeSeries44.isEmpty();
        java.util.Collection collection54 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries25.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod57, (double) (short) 100);
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
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + 1 + "'", comparable49, 1);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(collection54);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.removeAgedItems(true);
        java.lang.Object obj13 = timeSeries2.clone();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str20 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount((int) ' ');
        long long23 = timeSeries16.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.createCopy((int) '4', (int) (byte) 10);
        timeSeries26.removeAgedItems(true);
        timeSeries26.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries26.addAndOrUpdate(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.addAndOrUpdate(timeSeries35);
        boolean boolean37 = timeSeries36.isEmpty();
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries40.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str44 = timeSeries40.getRangeDescription();
        timeSeries40.setMaximumItemCount((int) ' ');
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class48);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries49.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str53 = timeSeries49.getRangeDescription();
        timeSeries49.setMaximumItemCount((int) ' ');
        timeSeries49.setMaximumItemAge((long) (short) 100);
        timeSeries49.setRangeDescription("");
        java.util.List list60 = timeSeries49.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener61 = null;
        timeSeries49.addChangeListener(seriesChangeListener61);
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries40.addAndOrUpdate(timeSeries49);
        java.util.Collection collection64 = timeSeries63.getTimePeriods();
        timeSeries63.setDomainDescription("hi!");
        timeSeries63.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries36.addAndOrUpdate(timeSeries63);
        java.lang.Class<?> wildcardClass70 = timeSeries36.getClass();
        boolean boolean71 = timeSeries2.equals((java.lang.Object) wildcardClass70);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Value" + "'", str44, "Value");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value" + "'", str53, "Value");
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(timeSeries69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        long long22 = timeSeries15.getMaximumItemAge();
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str35 = timeSeries31.getRangeDescription();
        java.lang.Class<?> wildcardClass36 = timeSeries31.getClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass36);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Value", "Time", (java.lang.Class) wildcardClass36);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries38.removeChangeListener(seriesChangeListener39);
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class42);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries43.createCopy((int) (byte) 10, (int) '#');
        java.lang.Comparable comparable47 = timeSeries46.getKey();
        timeSeries46.setRangeDescription("Time");
        java.util.Collection collection50 = timeSeries38.getTimePeriodsUniqueToOtherSeries(timeSeries46);
        boolean boolean51 = timeSeries15.equals((java.lang.Object) collection50);
        java.lang.Class class52 = timeSeries15.getTimePeriodClass();
        boolean boolean53 = timeSeries15.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod54, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1 + "'", comparable20, 1);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + '4' + "'", comparable47, '4');
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(class52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Time");
        java.util.Collection collection12 = timeSeries2.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries2.createCopy(0, 1);
        boolean boolean16 = timeSeries15.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        timeSeries21.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries21.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
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
        java.lang.Class<?> wildcardClass46 = timeSeries40.getClass();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass46);
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class49);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries50.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str54 = timeSeries50.getRangeDescription();
        java.util.List list55 = timeSeries50.getItems();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries47.addAndOrUpdate(timeSeries50);
        boolean boolean57 = timeSeries56.getNotify();
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries2.addAndOrUpdate(timeSeries56);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener59 = null;
        timeSeries56.addChangeListener(seriesChangeListener59);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value" + "'", str54, "Value");
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(timeSeries58);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        timeSeries2.setDescription("Time");
        java.lang.Object obj55 = timeSeries2.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod56 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod56, (double) 32);
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
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        timeSeries2.setMaximumItemCount((int) 'a');
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries2.createCopy(2147483647, (int) (short) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries14.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setDescription("hi!");
        boolean boolean17 = timeSeries12.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        long long18 = timeSeries15.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries15.addChangeListener(seriesChangeListener19);
        timeSeries15.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.List list10 = timeSeries2.getItems();
        timeSeries2.removeAgedItems(true);
        timeSeries2.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener15);
        java.lang.Object obj17 = timeSeries2.clone();
        java.lang.Class<?> wildcardClass18 = timeSeries2.getClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount((int) ' ');
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str18 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener21);
        boolean boolean24 = timeSeries14.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries5.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries14.createCopy((int) (short) 0, (int) '4');
        timeSeries28.setDescription("");
        java.lang.Object obj31 = timeSeries28.clone();
        boolean boolean32 = timeSeries1.equals((java.lang.Object) timeSeries28);
        timeSeries1.removeAgedItems(false);
        java.lang.Comparable comparable35 = timeSeries1.getKey();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + true + "'", comparable35, true);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        java.util.List list31 = timeSeries30.getItems();
        timeSeries30.setKey((java.lang.Comparable) 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        timeSeries2.setDescription("Overwritten values from: 1");
        java.lang.String str32 = timeSeries2.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "hi!", "Value", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "Value", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 1", (java.lang.Class) wildcardClass20);
        int int24 = timeSeries23.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        java.lang.Class class43 = timeSeries42.getTimePeriodClass();
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class45);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries46.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str50 = timeSeries46.getRangeDescription();
        timeSeries46.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        timeSeries46.addPropertyChangeListener(propertyChangeListener53);
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class58);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries59.addChangeListener(seriesChangeListener60);
        boolean boolean62 = timeSeries46.equals((java.lang.Object) timeSeries59);
        java.lang.String str63 = timeSeries46.getDomainDescription();
        timeSeries46.setDomainDescription("");
        boolean boolean66 = timeSeries46.isEmpty();
        java.util.Collection collection67 = timeSeries42.getTimePeriodsUniqueToOtherSeries(timeSeries46);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener68);
        java.lang.Object obj70 = timeSeries42.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries42.update(97, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
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
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value" + "'", str50, "Value");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Time" + "'", str63, "Time");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(obj70);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setNotify(false);
        timeSeries2.setKey((java.lang.Comparable) 10L);
        timeSeries2.setMaximumItemCount((int) '4');
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str28 = timeSeries24.getRangeDescription();
        timeSeries24.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries24.addPropertyChangeListener(propertyChangeListener31);
        timeSeries24.setNotify(false);
        java.lang.Class<?> wildcardClass35 = timeSeries24.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass35);
        timeSeries36.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries2.addAndOrUpdate(timeSeries36);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries39.addPropertyChangeListener(propertyChangeListener40);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(timeSeries39);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.lang.Class<?> wildcardClass9 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Overwritten values from: 4", "", (java.lang.Class) wildcardClass9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Value", "hi!", (java.lang.Class) wildcardClass9);
        int int13 = timeSeries12.getItemCount();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        java.lang.Object obj17 = timeSeries2.clone();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries2.createCopy((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(timeSeries20);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "", "Time", class3);
        boolean boolean5 = timeSeries4.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = timeSeries4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + false + "'", comparable8, false);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", class3);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str11 = timeSeries7.getRangeDescription();
        timeSeries7.setMaximumItemCount((int) ' ');
        java.util.Collection collection14 = timeSeries7.getTimePeriods();
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries7);
        timeSeries7.setDomainDescription("Overwritten values from: 4");
        java.lang.String str18 = timeSeries7.getDescription();
        int int19 = timeSeries7.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries7.createCopy(97, 0);
        timeSeries7.setDomainDescription("Overwritten values from: Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str11 = timeSeries7.getRangeDescription();
        java.lang.Class<?> wildcardClass12 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass12);
        timeSeries14.clear();
        long long16 = timeSeries14.getMaximumItemAge();
        java.lang.String str17 = timeSeries14.getDescription();
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str24 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount((int) ' ');
        long long27 = timeSeries20.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries20.createCopy((int) '4', (int) (byte) 10);
        long long31 = timeSeries20.getMaximumItemAge();
        java.util.Collection collection32 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        boolean boolean33 = timeSeries14.getNotify();
        java.util.Collection collection34 = timeSeries14.getTimePeriods();
        java.lang.Class<?> wildcardClass35 = collection34.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, (java.lang.Class) wildcardClass35);
        timeSeries36.removeAgedItems(true);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Time");
        java.lang.Comparable comparable12 = timeSeries2.getKey();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str20 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount((int) ' ');
        long long23 = timeSeries16.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.createCopy((int) '4', (int) (byte) 10);
        java.util.Collection collection27 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str34 = timeSeries30.getRangeDescription();
        boolean boolean36 = timeSeries30.equals((java.lang.Object) 10L);
        boolean boolean37 = timeSeries30.getNotify();
        timeSeries30.setDescription("Time");
        java.lang.Comparable comparable40 = timeSeries30.getKey();
        boolean boolean41 = timeSeries30.isEmpty();
        long long42 = timeSeries30.getMaximumItemAge();
        java.util.Collection collection43 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + '4' + "'", comparable12, '4');
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + '4' + "'", comparable40, '4');
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) '#', 0);
        java.util.List list5 = timeSeries1.getItems();
        timeSeries1.setDomainDescription("Value");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        long long20 = timeSeries17.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.delete(32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setRangeDescription("");
        boolean boolean13 = timeSeries2.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries2.createCopy((int) (short) 10, (int) (short) -1);
        int int17 = timeSeries2.getItemCount();
        timeSeries2.setRangeDescription("Overwritten values from: 1");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass32);
        long long34 = timeSeries33.getMaximumItemAge();
        boolean boolean35 = timeSeries33.isEmpty();
        timeSeries33.setDomainDescription("Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        java.util.List list20 = timeSeries12.getItems();
        java.lang.String str21 = timeSeries12.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        java.lang.String str29 = timeSeries25.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.removeAgedItems((long) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries11.createCopy((int) '4', (int) (byte) 1);
        int int29 = timeSeries11.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        java.lang.Object obj31 = timeSeries25.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries25.addOrUpdate(regularTimePeriod32, 0.0d);
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
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str18 = timeSeries14.getRangeDescription();
        java.lang.Class<?> wildcardClass19 = timeSeries14.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass19);
        timeSeries21.clear();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        int int25 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.addAndOrUpdate(timeSeries24);
        java.lang.Class<?> wildcardClass27 = timeSeries24.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Value", "", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "hi!", "Value", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: Overwritten values from: 4", (java.lang.Class) wildcardClass27);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries12);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, (java.lang.Class) wildcardClass14);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        java.lang.Class<?> wildcardClass27 = timeSeries22.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass27);
        timeSeries29.clear();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        int int33 = timeSeries32.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries32);
        timeSeries34.fireSeriesChanged();
        timeSeries34.setMaximumItemAge(10L);
        timeSeries34.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries15.addAndOrUpdate(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries39);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        boolean boolean4 = timeSeries2.equals((java.lang.Object) (-1.0f));
        java.util.List list5 = timeSeries2.getItems();
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str12 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount((int) ' ');
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str21 = timeSeries17.getRangeDescription();
        timeSeries17.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener24);
        boolean boolean27 = timeSeries17.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries8.addAndOrUpdate(timeSeries17);
        timeSeries8.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries8.createCopy((int) '#', 100);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries2.addAndOrUpdate(timeSeries33);
        long long35 = timeSeries34.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries34.update(regularTimePeriod36, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Time");
        java.lang.Comparable comparable12 = timeSeries2.getKey();
        timeSeries2.fireSeriesChanged();
        timeSeries2.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        java.util.Collection collection18 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        int int19 = timeSeries2.getMaximumItemCount();
        boolean boolean20 = timeSeries2.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + '4' + "'", comparable12, '4');
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class1);
        timeSeries2.setRangeDescription("Time");
        java.lang.Comparable comparable5 = timeSeries2.getKey();
        long long6 = timeSeries2.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 0 + "'", comparable5, (short) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str31 = timeSeries27.getRangeDescription();
        timeSeries27.setMaximumItemCount((int) ' ');
        timeSeries27.setMaximumItemAge((long) (short) 100);
        timeSeries27.setRangeDescription("");
        java.util.List list38 = timeSeries27.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries27.addChangeListener(seriesChangeListener39);
        timeSeries27.fireSeriesChanged();
        boolean boolean42 = timeSeries19.equals((java.lang.Object) timeSeries27);
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class44);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries45.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str49 = timeSeries45.getRangeDescription();
        java.util.List list50 = timeSeries45.getItems();
        java.util.Collection collection51 = timeSeries45.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries27.addAndOrUpdate(timeSeries45);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value" + "'", str49, "Value");
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(timeSeries52);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.clear();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener12);
        timeSeries2.setDescription("Value");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        timeSeries15.setRangeDescription("Overwritten values from: 1");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries15.removeChangeListener(seriesChangeListener22);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        timeSeries19.setDescription("Overwritten values from: 4");
        timeSeries19.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod26, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
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
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        long long10 = timeSeries2.getMaximumItemAge();
        boolean boolean11 = timeSeries2.isEmpty();
        timeSeries2.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries2.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        timeSeries11.setDescription("");
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class42);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries43.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str47 = timeSeries43.getRangeDescription();
        timeSeries43.setMaximumItemCount((int) ' ');
        timeSeries43.setMaximumItemAge((long) (short) 100);
        timeSeries43.setRangeDescription("");
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        timeSeries43.addPropertyChangeListener(propertyChangeListener54);
        java.util.List list56 = timeSeries43.getItems();
        boolean boolean57 = timeSeries43.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries11.addAndOrUpdate(timeSeries43);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem59 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries58.add(timeSeriesDataItem59);
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
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value" + "'", str47, "Value");
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(timeSeries58);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        java.lang.String str20 = timeSeries17.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(timeSeriesDataItem21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "hi!", "Value", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "Value", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, (java.lang.Class) wildcardClass20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.add(regularTimePeriod24, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount((int) ' ');
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str18 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount((int) ' ');
        timeSeries14.setMaximumItemAge((long) (short) 100);
        timeSeries14.setRangeDescription("");
        java.util.List list25 = timeSeries14.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries14.addChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        java.lang.Class<?> wildcardClass30 = timeSeries28.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, "Overwritten values from: 1", "hi!", (java.lang.Class) wildcardClass30);
        timeSeries31.setMaximumItemAge(1L);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        java.util.List list4 = timeSeries1.getItems();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str14 = timeSeries10.getRangeDescription();
        java.lang.Class<?> wildcardClass15 = timeSeries10.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass15);
        int int17 = timeSeries16.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries16.createCopy(1, (int) (short) 0);
        timeSeries20.setMaximumItemCount(100);
        java.lang.String str23 = timeSeries20.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries20.createCopy((int) (byte) 1, (int) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries1.addAndOrUpdate(timeSeries20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod28, (double) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.removeAgedItems(true);
        timeSeries2.setRangeDescription("Overwritten values from: 4");
        int int13 = timeSeries2.getItemCount();
        timeSeries2.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        timeSeries2.setDescription("");
        timeSeries2.setMaximumItemAge((long) 10);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        int int13 = timeSeries11.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.removeAgedItems((long) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class28);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries29.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str33 = timeSeries29.getRangeDescription();
        timeSeries29.setMaximumItemCount((int) ' ');
        long long36 = timeSeries29.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries29.createCopy((int) '4', (int) (byte) 10);
        timeSeries39.removeAgedItems(true);
        timeSeries39.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries39.addAndOrUpdate(timeSeries45);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries46.addAndOrUpdate(timeSeries48);
        java.util.Collection collection50 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries46);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        timeSeries46.addPropertyChangeListener(propertyChangeListener51);
        int int53 = timeSeries46.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9223372036854775807L + "'", long36 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        timeSeries2.clear();
        timeSeries2.setNotify(false);
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
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount((int) ' ');
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str18 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount((int) ' ');
        timeSeries14.setMaximumItemAge((long) (short) 100);
        timeSeries14.setRangeDescription("");
        java.util.List list25 = timeSeries14.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries14.addChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        java.lang.Class<?> wildcardClass30 = timeSeries28.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "Overwritten values from: 1", "Overwritten values from: 4", (java.lang.Class) wildcardClass30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries31.addOrUpdate(regularTimePeriod32, (java.lang.Number) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class34);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries35.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str39 = timeSeries35.getRangeDescription();
        timeSeries35.setMaximumItemCount((int) ' ');
        long long42 = timeSeries35.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries35.createCopy((int) '4', (int) (byte) 10);
        timeSeries45.removeAgedItems(true);
        timeSeries45.setDescription("hi!");
        java.util.Collection collection50 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        java.lang.Class<?> wildcardClass51 = timeSeries45.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        java.util.List list26 = timeSeries5.getItems();
        java.lang.String str27 = timeSeries5.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        int int13 = timeSeries12.getItemCount();
        java.lang.Class<?> wildcardClass14 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, (java.lang.Class) wildcardClass14);
        boolean boolean16 = timeSeries15.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries15.createCopy(regularTimePeriod17, regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries40.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class45);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries46.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries40.addAndOrUpdate(timeSeries49);
        java.lang.Comparable comparable51 = timeSeries40.getKey();
        java.lang.Class class52 = timeSeries40.getTimePeriodClass();
        int int53 = timeSeries40.getMaximumItemCount();
        boolean boolean54 = timeSeries25.equals((java.lang.Object) timeSeries40);
        java.util.List list55 = timeSeries25.getItems();
        java.lang.Class class60 = null;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class60);
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries61.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str65 = timeSeries61.getRangeDescription();
        java.lang.Class<?> wildcardClass66 = timeSeries61.getClass();
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass66);
        int int68 = timeSeries67.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries71 = timeSeries67.createCopy(1, (int) (short) 0);
        timeSeries71.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries25.addAndOrUpdate(timeSeries71);
        int int75 = timeSeries71.getItemCount();
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
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + '4' + "'", comparable51, '4');
        org.junit.Assert.assertNull(class52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Value" + "'", str65, "Value");
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(timeSeries71);
        org.junit.Assert.assertNotNull(timeSeries74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries25.createCopy(10, 0);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries25.addPropertyChangeListener(propertyChangeListener36);
        java.lang.String str38 = timeSeries25.getDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries25.addPropertyChangeListener(propertyChangeListener32);
        timeSeries25.setNotify(false);
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class37);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries38.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class43);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries44.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries38.addAndOrUpdate(timeSeries47);
        boolean boolean50 = timeSeries48.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries48.removeChangeListener(seriesChangeListener51);
        java.util.Collection collection53 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        java.lang.Class<?> wildcardClass54 = timeSeries48.getClass();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, (java.lang.Class) wildcardClass54);
        java.lang.Object obj56 = timeSeries55.clone();
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries21.addAndOrUpdate(timeSeries55);
        java.lang.String str58 = timeSeries55.getDescription();
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1 + "'", comparable20, 1);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener16);
        timeSeries9.setNotify(false);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Time", (java.lang.Class) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = timeSeries22.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "Time", (java.lang.Class) wildcardClass23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.update(regularTimePeriod25, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener18);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        java.util.List list27 = timeSeries22.getItems();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries15.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod29, (java.lang.Number) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        timeSeries2.setDescription("Value");
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        timeSeries13.setMaximumItemCount((int) ' ');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries22.removePropertyChangeListener(propertyChangeListener29);
        boolean boolean32 = timeSeries22.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries13.addAndOrUpdate(timeSeries22);
        boolean boolean34 = timeSeries2.equals((java.lang.Object) timeSeries13);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries2.createCopy((int) (byte) 0, (int) (byte) 100);
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries40.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str44 = timeSeries40.getRangeDescription();
        timeSeries40.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        timeSeries40.removePropertyChangeListener(propertyChangeListener47);
        boolean boolean50 = timeSeries40.equals((java.lang.Object) ' ');
        java.lang.String str51 = timeSeries40.getDescription();
        int int52 = timeSeries40.getMaximumItemCount();
        java.util.Collection collection53 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        java.lang.Class class55 = null;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class55);
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries56.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str60 = timeSeries56.getRangeDescription();
        timeSeries56.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        timeSeries56.addPropertyChangeListener(propertyChangeListener63);
        java.lang.Class class68 = null;
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class68);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener70 = null;
        timeSeries69.addChangeListener(seriesChangeListener70);
        boolean boolean72 = timeSeries56.equals((java.lang.Object) timeSeries69);
        timeSeries56.setMaximumItemCount((int) '4');
        timeSeries56.setDomainDescription("Value");
        java.lang.Class class78 = null;
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class78);
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries79.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str83 = timeSeries79.getRangeDescription();
        timeSeries79.setMaximumItemCount((int) ' ');
        timeSeries79.setMaximumItemAge((long) (short) 100);
        java.lang.String str88 = timeSeries79.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries89 = timeSeries56.addAndOrUpdate(timeSeries79);
        org.jfree.data.time.TimeSeries timeSeries90 = timeSeries40.addAndOrUpdate(timeSeries79);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Value" + "'", str44, "Value");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Value" + "'", str60, "Value");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(timeSeries82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Value" + "'", str83, "Value");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Value" + "'", str88, "Value");
        org.junit.Assert.assertNotNull(timeSeries89);
        org.junit.Assert.assertNotNull(timeSeries90);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Time");
        java.lang.Comparable comparable12 = timeSeries2.getKey();
        boolean boolean13 = timeSeries2.isEmpty();
        long long14 = timeSeries2.getMaximumItemAge();
        java.util.List list15 = timeSeries2.getItems();
        java.lang.Class class16 = timeSeries2.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + '4' + "'", comparable12, '4');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        java.lang.String str27 = timeSeries5.getDescription();
        java.lang.Object obj28 = timeSeries5.clone();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(class26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class3);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str8 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener11);
        boolean boolean14 = timeSeries4.equals((java.lang.Object) ' ');
        timeSeries4.clear();
        timeSeries4.setKey((java.lang.Comparable) 0);
        int int18 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener19);
        long long21 = timeSeries4.getMaximumItemAge();
        java.lang.String str22 = timeSeries4.getDescription();
        boolean boolean23 = timeSeries1.equals((java.lang.Object) timeSeries4);
        java.util.List list24 = timeSeries4.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = timeSeries4.getIndex(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        long long34 = timeSeries33.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        timeSeries5.setRangeDescription("Overwritten values from: 4");
        timeSeries5.clear();
        timeSeries5.setMaximumItemCount((int) '#');
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + '4' + "'", comparable6, '4');
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        int int13 = timeSeries12.getItemCount();
        java.lang.Class<?> wildcardClass14 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, (java.lang.Class) wildcardClass14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener16);
        timeSeries15.setDescription("Overwritten values from: Overwritten values from: 4");
        java.lang.Comparable comparable20 = timeSeries15.getKey();
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 100.0d + "'", comparable20, 100.0d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries35.addChangeListener(seriesChangeListener36);
        int int38 = timeSeries35.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.clear();
        java.lang.Object obj12 = timeSeries2.clone();
        java.util.List list13 = timeSeries2.getItems();
        java.util.List list14 = timeSeries2.getItems();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener15);
        java.util.List list17 = timeSeries2.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "hi!", "Value", (java.lang.Class) wildcardClass16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries17.getValue(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        int int11 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection13 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.lang.Class<?> wildcardClass9 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Overwritten values from: 4", "", (java.lang.Class) wildcardClass9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "Overwritten values from: 1", "Overwritten values from: 1", (java.lang.Class) wildcardClass9);
        timeSeries12.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries12.addOrUpdate(regularTimePeriod15, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.lang.Class<?> wildcardClass6 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Overwritten values from: 4", "", (java.lang.Class) wildcardClass6);
        java.lang.Object obj9 = timeSeries8.clone();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        timeSeries8.setRangeDescription("");
        java.lang.Object obj14 = timeSeries8.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries8.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        java.util.Collection collection34 = timeSeries33.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries33.add(regularTimePeriod35, (double) 9223372036854775807L);
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
        org.junit.Assert.assertNotNull(collection34);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        timeSeries1.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy(0, (int) (byte) 1);
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        int int8 = timeSeries1.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        timeSeries4.setMaximumItemCount((int) (short) 10);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str18 = timeSeries14.getRangeDescription();
        java.util.List list19 = timeSeries14.getItems();
        timeSeries14.setKey((java.lang.Comparable) 2147483647);
        timeSeries14.setKey((java.lang.Comparable) ' ');
        boolean boolean24 = timeSeries4.equals((java.lang.Object) ' ');
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str31 = timeSeries27.getRangeDescription();
        timeSeries27.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener34);
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class39);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries40.addChangeListener(seriesChangeListener41);
        boolean boolean43 = timeSeries27.equals((java.lang.Object) timeSeries40);
        timeSeries27.setMaximumItemCount((int) '4');
        timeSeries27.setDomainDescription("Value");
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class49);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries50.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str54 = timeSeries50.getRangeDescription();
        timeSeries50.setMaximumItemCount((int) ' ');
        timeSeries50.setMaximumItemAge((long) (short) 100);
        java.lang.String str59 = timeSeries50.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries27.addAndOrUpdate(timeSeries50);
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries4.addAndOrUpdate(timeSeries60);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value" + "'", str54, "Value");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Value" + "'", str59, "Value");
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertNotNull(timeSeries61);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        timeSeries5.setNotify(true);
        timeSeries5.fireSeriesChanged();
        boolean boolean14 = timeSeries5.getNotify();
        timeSeries5.setDomainDescription("");
        java.util.Collection collection17 = timeSeries5.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.update(2147483647, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries28.removeChangeListener(seriesChangeListener49);
        long long51 = timeSeries28.getMaximumItemAge();
        java.lang.Class class53 = null;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class53);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries54.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str58 = timeSeries54.getRangeDescription();
        timeSeries54.setMaximumItemCount((int) ' ');
        java.lang.Class class62 = null;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class62);
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries63.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str67 = timeSeries63.getRangeDescription();
        timeSeries63.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        timeSeries63.removePropertyChangeListener(propertyChangeListener70);
        boolean boolean73 = timeSeries63.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries54.addAndOrUpdate(timeSeries63);
        org.jfree.data.time.TimeSeries timeSeries77 = timeSeries63.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries77.createCopy((int) (byte) 1, (int) '4');
        timeSeries77.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries28.addAndOrUpdate(timeSeries77);
        java.util.List list83 = timeSeries77.getItems();
        timeSeries77.setMaximumItemCount((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries77.delete((int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 9223372036854775807L + "'", long51 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Value" + "'", str58, "Value");
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Value" + "'", str67, "Value");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(timeSeries74);
        org.junit.Assert.assertNotNull(timeSeries77);
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertNotNull(timeSeries82);
        org.junit.Assert.assertNotNull(list83);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.createCopy(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries15.getTimePeriod(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount((int) ' ');
        long long12 = timeSeries5.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.createCopy((int) '4', (int) (byte) 10);
        timeSeries15.removeAgedItems(true);
        timeSeries15.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.addAndOrUpdate(timeSeries24);
        java.lang.Class class26 = timeSeries25.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "Value", class26);
        java.lang.String str28 = timeSeries27.getDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        long long10 = timeSeries2.getMaximumItemAge();
        timeSeries2.setNotify(false);
        int int13 = timeSeries2.getMaximumItemCount();
        boolean boolean14 = timeSeries2.isEmpty();
        timeSeries2.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        timeSeries17.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.delete(regularTimePeriod19);
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
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        java.lang.String str37 = timeSeries35.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries35.createCopy(1, 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.add(regularTimePeriod41, (java.lang.Number) 10.0d, false);
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        java.lang.String str31 = timeSeries2.getRangeDescription();
        int int32 = timeSeries2.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = null; // flaky: timeSeries2.getValue((-1));
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        timeSeries4.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener9);
        timeSeries4.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener13);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Class<?> wildcardClass8 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass8);
        boolean boolean10 = timeSeries9.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.Collection collection10 = timeSeries2.getTimePeriods();
        timeSeries2.clear();
        java.lang.String str12 = timeSeries2.getDescription();
        timeSeries2.setDescription("Time");
        java.lang.Class class15 = timeSeries2.getTimePeriodClass();
        java.lang.String str16 = timeSeries2.getDomainDescription();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        long long26 = timeSeries19.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.createCopy((int) '4', (int) (byte) 10);
        long long30 = timeSeries19.getMaximumItemAge();
        timeSeries19.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries2.addAndOrUpdate(timeSeries19);
        int int34 = timeSeries33.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class26);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.addChangeListener(seriesChangeListener28);
        java.util.Collection collection30 = timeSeries27.getTimePeriods();
        timeSeries27.setNotify(true);
        java.util.Collection collection33 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        timeSeries9.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.createCopy(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = timeSeries14.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "", (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(timeSeriesDataItem18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries28.removeChangeListener(seriesChangeListener49);
        long long51 = timeSeries28.getMaximumItemAge();
        java.lang.Class class53 = null;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class53);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries54.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str58 = timeSeries54.getRangeDescription();
        timeSeries54.setMaximumItemCount((int) ' ');
        java.lang.Class class62 = null;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class62);
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries63.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str67 = timeSeries63.getRangeDescription();
        timeSeries63.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        timeSeries63.removePropertyChangeListener(propertyChangeListener70);
        boolean boolean73 = timeSeries63.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries54.addAndOrUpdate(timeSeries63);
        org.jfree.data.time.TimeSeries timeSeries77 = timeSeries63.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries77.createCopy((int) (byte) 1, (int) '4');
        timeSeries77.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries28.addAndOrUpdate(timeSeries77);
        java.util.List list83 = timeSeries77.getItems();
        timeSeries77.setMaximumItemCount((int) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod86 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries77.add(regularTimePeriod86, (double) 0L);
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
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 9223372036854775807L + "'", long51 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Value" + "'", str58, "Value");
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Value" + "'", str67, "Value");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(timeSeries74);
        org.junit.Assert.assertNotNull(timeSeries77);
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertNotNull(timeSeries82);
        org.junit.Assert.assertNotNull(list83);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        long long18 = timeSeries15.getMaximumItemAge();
        java.lang.Class<?> wildcardClass19 = timeSeries15.getClass();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries20);
        java.lang.Class<?> wildcardClass22 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "hi!", "Value", (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "Value", (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "Overwritten values from: 4", (java.lang.Class) wildcardClass22);
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str32 = timeSeries28.getRangeDescription();
        timeSeries28.setMaximumItemCount((int) ' ');
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class36);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries37.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str41 = timeSeries37.getRangeDescription();
        timeSeries37.setMaximumItemCount((int) ' ');
        timeSeries37.setMaximumItemAge((long) (short) 100);
        timeSeries37.setRangeDescription("");
        java.util.List list48 = timeSeries37.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries37.addChangeListener(seriesChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries28.addAndOrUpdate(timeSeries37);
        java.util.Collection collection52 = timeSeries51.getTimePeriods();
        boolean boolean53 = timeSeries51.getNotify();
        timeSeries51.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries25.addAndOrUpdate(timeSeries51);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = null; // flaky: timeSeries51.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value" + "'", str41, "Value");
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(timeSeries55);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Value");
        timeSeries2.setMaximumItemAge((long) 100);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener14);
        timeSeries2.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        java.lang.String str13 = timeSeries2.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener14);
        java.util.Collection collection16 = timeSeries2.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        java.lang.Class class15 = timeSeries13.getTimePeriodClass();
        timeSeries13.setDomainDescription("");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        java.util.List list7 = timeSeries2.getItems();
        int int8 = timeSeries2.getMaximumItemCount();
        java.lang.Comparable comparable9 = timeSeries2.getKey();
        java.lang.String str10 = timeSeries2.getDescription();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        timeSeries13.setMaximumItemCount((int) ' ');
        java.lang.Comparable comparable20 = timeSeries13.getKey();
        timeSeries13.setKey((java.lang.Comparable) 10.0f);
        java.util.Collection collection23 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + '4' + "'", comparable9, '4');
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + '4' + "'", comparable20, '4');
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class class16 = timeSeries14.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.createCopy(1, 100);
        java.lang.Class<?> wildcardClass20 = timeSeries19.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Overwritten values from: Overwritten values from: 4", "Overwritten values from: 1", (java.lang.Class) wildcardClass20);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.addChangeListener(seriesChangeListener22);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener5);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        boolean boolean21 = timeSeries19.equals((java.lang.Object) 0);
        boolean boolean22 = timeSeries19.isEmpty();
        timeSeries19.fireSeriesChanged();
        java.util.List list24 = timeSeries19.getItems();
        boolean boolean25 = timeSeries4.equals((java.lang.Object) list24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries4.getDataItem(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        timeSeries15.fireSeriesChanged();
        java.lang.String str23 = timeSeries15.getRangeDescription();
        timeSeries15.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries15.removeChangeListener(seriesChangeListener26);
        java.lang.String str28 = timeSeries15.getDomainDescription();
        java.lang.String str29 = timeSeries15.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1 + "'", comparable20, 1);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        timeSeries25.fireSeriesChanged();
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
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        java.util.List list17 = timeSeries15.getItems();
        timeSeries15.removeAgedItems(true);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        long long13 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("");
        java.lang.String str16 = timeSeries2.getRangeDescription();
        long long17 = timeSeries2.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1);
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries1.createCopy(0, (int) (short) -1);
        java.lang.String str6 = timeSeries5.getDescription();
        timeSeries5.removeAgedItems(10L, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries5.addOrUpdate(regularTimePeriod10, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        timeSeries19.setDescription("");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        timeSeries2.setDescription("Overwritten values from: 1");
        timeSeries2.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries36 = timeSeries2.createCopy(regularTimePeriod34, regularTimePeriod35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
}
