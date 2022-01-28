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
        java.util.List list6 = timeSeries5.getItems();
        java.lang.String str7 = timeSeries5.getDomainDescription();
        timeSeries5.setDomainDescription("");
        int int10 = timeSeries5.getMaximumItemCount();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries13.addAndOrUpdate(timeSeries22);
        boolean boolean25 = timeSeries23.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries23.removeChangeListener(seriesChangeListener26);
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str34 = timeSeries30.getRangeDescription();
        timeSeries30.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries30.addPropertyChangeListener(propertyChangeListener37);
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class42);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries43.addChangeListener(seriesChangeListener44);
        boolean boolean46 = timeSeries30.equals((java.lang.Object) timeSeries43);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries23.addAndOrUpdate(timeSeries43);
        timeSeries23.clear();
        timeSeries23.setMaximumItemCount((int) (byte) 1);
        int int51 = timeSeries23.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries53.setMaximumItemAge((long) (short) 1);
        java.util.Collection collection56 = timeSeries23.getTimePeriodsUniqueToOtherSeries(timeSeries53);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries5.addAndOrUpdate(timeSeries53);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(timeSeries57);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.addChangeListener(seriesChangeListener14);
        int int16 = timeSeries2.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries2.addChangeListener(seriesChangeListener17);
        timeSeries2.setDomainDescription("Time");
        timeSeries2.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries2.addOrUpdate(regularTimePeriod23, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str14 = timeSeries10.getRangeDescription();
        timeSeries10.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener17);
        int int19 = timeSeries10.getMaximumItemCount();
        int int20 = timeSeries10.getMaximumItemCount();
        long long21 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries10.addChangeListener(seriesChangeListener23);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class1);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null; // flaky: timeSeries1.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries4.equals((java.lang.Object) timeSeries18);
        java.lang.Object obj21 = timeSeries18.clone();
        timeSeries18.setMaximumItemAge((long) 0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(timeSeriesDataItem24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
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
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        timeSeries2.setDomainDescription("Value");
        java.lang.Comparable comparable21 = timeSeries2.getKey();
        java.util.Collection collection22 = timeSeries2.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries25.getDescription();
        boolean boolean28 = timeSeries25.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + '4' + "'", comparable21, '4');
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
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
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries2.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener14);
        java.lang.String str16 = timeSeries2.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        java.lang.Comparable comparable10 = timeSeries2.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod11, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + '4' + "'", comparable10, '4');
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries2.addChangeListener(seriesChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod12, (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class6);
        timeSeries7.setRangeDescription("hi!");
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class11);
        java.util.Collection collection13 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        boolean boolean14 = timeSeries12.getNotify();
        timeSeries12.setDescription("Value");
        java.lang.Class<?> wildcardClass17 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "Value", (java.lang.Class) wildcardClass17);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries24.addAndOrUpdate(timeSeries33);
        java.lang.Class<?> wildcardClass35 = timeSeries24.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass35);
        java.util.List list37 = timeSeries36.getItems();
        java.lang.Comparable comparable38 = timeSeries36.getKey();
        boolean boolean39 = timeSeries18.equals((java.lang.Object) timeSeries36);
        timeSeries36.setKey((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + '#' + "'", comparable38, '#');
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries12.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        timeSeries12.removeAgedItems(true);
        long long18 = timeSeries12.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.addChangeListener(seriesChangeListener14);
        int int16 = timeSeries2.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries2.addChangeListener(seriesChangeListener17);
        timeSeries2.setDomainDescription("Time");
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class33);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries34.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries28.addAndOrUpdate(timeSeries37);
        java.lang.Class<?> wildcardClass39 = timeSeries28.getClass();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass39);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass39);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass39);
        timeSeries42.setMaximumItemAge((long) 10);
        java.lang.Class class45 = timeSeries42.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries2.addAndOrUpdate(timeSeries42);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries46.add(regularTimePeriod47, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(class45);
        org.junit.Assert.assertNotNull(timeSeries46);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries5.addChangeListener(seriesChangeListener6);
        java.lang.Class<?> wildcardClass8 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass8);
        int int10 = timeSeries9.getItemCount();
        timeSeries9.setRangeDescription("");
        java.util.List list13 = timeSeries9.getItems();
        timeSeries9.setDomainDescription("Overwritten values from: 4");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        timeSeries5.setRangeDescription("Value");
        timeSeries5.removeAgedItems(false);
        long long12 = timeSeries5.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries5.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setMaximumItemCount(100);
        timeSeries2.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (byte) 100, (int) (short) 100);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        boolean boolean21 = timeSeries19.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries19.removeChangeListener(seriesChangeListener22);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class25);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries26.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str30 = timeSeries26.getRangeDescription();
        timeSeries26.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener33);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class38);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries39.addChangeListener(seriesChangeListener40);
        boolean boolean42 = timeSeries26.equals((java.lang.Object) timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries19.addAndOrUpdate(timeSeries39);
        timeSeries19.clear();
        timeSeries19.setMaximumItemCount((int) (byte) 1);
        boolean boolean47 = timeSeries6.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        timeSeries6.removeChangeListener(seriesChangeListener48);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        timeSeries11.removeAgedItems(false);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str31 = timeSeries27.getRangeDescription();
        timeSeries27.setMaximumItemCount(0);
        java.lang.String str34 = timeSeries27.getRangeDescription();
        timeSeries27.clear();
        boolean boolean36 = timeSeries11.equals((java.lang.Object) timeSeries27);
        timeSeries11.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries11.getTimePeriods();
        timeSeries11.clear();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        boolean boolean6 = timeSeries2.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener7);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount(0);
        java.lang.String str18 = timeSeries11.getRangeDescription();
        timeSeries11.clear();
        boolean boolean20 = timeSeries2.equals((java.lang.Object) timeSeries11);
        timeSeries11.fireSeriesChanged();
        timeSeries11.setDescription("Overwritten values from: 4");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update(regularTimePeriod24, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        int int4 = timeSeries1.getMaximumItemCount();
        timeSeries1.setKey((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener8);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener19);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class24);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.addChangeListener(seriesChangeListener26);
        boolean boolean28 = timeSeries12.equals((java.lang.Object) timeSeries25);
        timeSeries12.setDomainDescription("Value");
        timeSeries12.setDescription("Value");
        java.lang.String str33 = timeSeries12.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries5.addAndOrUpdate(timeSeries12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries5.removeChangeListener(seriesChangeListener35);
        timeSeries5.setRangeDescription("hi!");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        timeSeries11.removeAgedItems(false);
        boolean boolean25 = timeSeries11.getNotify();
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
        timeSeries28.setDomainDescription("Value");
        timeSeries28.setDescription("Value");
        java.lang.String str49 = timeSeries28.getRangeDescription();
        int int50 = timeSeries28.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries11.addAndOrUpdate(timeSeries28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries51.update(regularTimePeriod52, (java.lang.Number) 1.0f);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value" + "'", str49, "Value");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(timeSeries51);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries2.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries2.getDataItem(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.util.List list18 = timeSeries17.getItems();
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setMaximumItemAge((long) 'a');
        boolean boolean22 = timeSeries17.isEmpty();
        timeSeries17.setKey((java.lang.Comparable) (short) 10);
        long long25 = timeSeries17.getMaximumItemAge();
        timeSeries17.fireSeriesChanged();
        java.lang.Class<?> wildcardClass27 = timeSeries17.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod2, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        timeSeries5.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass24 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass24);
        timeSeries25.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries25.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "hi!", (java.lang.Class) wildcardClass20);
        int int24 = timeSeries23.getItemCount();
        timeSeries23.setDescription("hi!");
        boolean boolean27 = timeSeries23.isEmpty();
        timeSeries23.setKey((java.lang.Comparable) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.update(regularTimePeriod30, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "Time", "Value", (java.lang.Class) wildcardClass34);
        timeSeries35.fireSeriesChanged();
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class38);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries39.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class44);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries45.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries39.addAndOrUpdate(timeSeries48);
        boolean boolean51 = timeSeries49.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries49.removeChangeListener(seriesChangeListener52);
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
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries49.addAndOrUpdate(timeSeries69);
        java.lang.Class class77 = null;
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class77);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener79 = null;
        timeSeries78.addChangeListener(seriesChangeListener79);
        java.util.Collection collection81 = timeSeries78.getTimePeriods();
        timeSeries78.setDomainDescription("Time");
        java.util.Collection collection84 = timeSeries69.getTimePeriodsUniqueToOtherSeries(timeSeries78);
        org.jfree.data.time.TimeSeries timeSeries85 = timeSeries35.addAndOrUpdate(timeSeries69);
        timeSeries85.setMaximumItemAge(1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener88 = null;
        timeSeries85.removeChangeListener(seriesChangeListener88);
        int int90 = timeSeries85.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod91 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem93 = timeSeries85.addOrUpdate(regularTimePeriod91, (java.lang.Number) 10.0d);
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
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Value" + "'", str60, "Value");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(timeSeries85);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2147483647 + "'", int90 == 2147483647);
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
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.setKey((java.lang.Comparable) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries2.removeChangeListener(seriesChangeListener15);
        boolean boolean17 = timeSeries2.isEmpty();
        java.util.List list18 = timeSeries2.getItems();
        timeSeries2.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        boolean boolean19 = timeSeries2.getNotify();
        boolean boolean20 = timeSeries2.isEmpty();
        java.lang.Object obj21 = timeSeries2.clone();
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        java.util.Collection collection29 = timeSeries26.getTimePeriods();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str36 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount((int) ' ');
        timeSeries32.setMaximumItemAge((long) (short) 100);
        timeSeries32.setMaximumItemCount(100);
        java.util.Collection collection43 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries2.addAndOrUpdate(timeSeries26);
        java.util.List list45 = timeSeries2.getItems();
        timeSeries2.setNotify(true);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        boolean boolean7 = timeSeries4.isEmpty();
        int int8 = timeSeries4.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update((int) (byte) 1, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        timeSeries2.setMaximumItemAge((long) (byte) 100);
        java.lang.String str13 = timeSeries2.getDescription();
        timeSeries2.setDomainDescription("hi!");
        timeSeries2.setKey((java.lang.Comparable) 1);
        int int18 = timeSeries2.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries32.addChangeListener(seriesChangeListener33);
        boolean boolean35 = timeSeries19.equals((java.lang.Object) timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries12.addAndOrUpdate(timeSeries32);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class40);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries41.addChangeListener(seriesChangeListener42);
        java.lang.String str44 = timeSeries41.getDescription();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries12.addAndOrUpdate(timeSeries41);
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class52);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries53.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str57 = timeSeries53.getRangeDescription();
        timeSeries53.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        timeSeries53.addPropertyChangeListener(propertyChangeListener60);
        java.lang.Class class65 = null;
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class65);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        timeSeries66.addChangeListener(seriesChangeListener67);
        boolean boolean69 = timeSeries53.equals((java.lang.Object) timeSeries66);
        timeSeries53.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass72 = timeSeries53.getClass();
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass72);
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass72);
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, (java.lang.Class) wildcardClass72);
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries41.addAndOrUpdate(timeSeries75);
        java.lang.String str77 = timeSeries75.getDomainDescription();
        java.lang.String str78 = timeSeries75.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Value" + "'", str57, "Value");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(timeSeries76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Time" + "'", str77, "Time");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Time" + "'", str78, "Time");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries22.addChangeListener(seriesChangeListener23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null; // flaky: timeSeries22.getNextTimePeriod();
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
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(0);
        java.lang.String str9 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) (byte) 100);
        timeSeries2.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setDomainDescription("Value");
        int int6 = timeSeries1.getMaximumItemCount();
        java.lang.String str7 = timeSeries1.getRangeDescription();
        timeSeries1.setNotify(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.util.List list18 = timeSeries17.getItems();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str25 = timeSeries21.getRangeDescription();
        boolean boolean26 = timeSeries17.equals((java.lang.Object) timeSeries21);
        timeSeries17.setMaximumItemCount(1);
        timeSeries17.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener31);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        timeSeries14.setDomainDescription("Value");
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class25);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries26.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries20.addAndOrUpdate(timeSeries29);
        boolean boolean32 = timeSeries30.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries30.removeChangeListener(seriesChangeListener33);
        java.util.Collection collection35 = timeSeries30.getTimePeriods();
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class37);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries38.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str42 = timeSeries38.getRangeDescription();
        timeSeries38.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries38.addPropertyChangeListener(propertyChangeListener45);
        timeSeries38.setDescription("Time");
        timeSeries38.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries30.addAndOrUpdate(timeSeries38);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries14.addAndOrUpdate(timeSeries30);
        java.lang.Class class61 = null;
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class61);
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries62.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str66 = timeSeries62.getRangeDescription();
        timeSeries62.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        timeSeries62.addPropertyChangeListener(propertyChangeListener69);
        java.lang.Class class74 = null;
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class74);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener76 = null;
        timeSeries75.addChangeListener(seriesChangeListener76);
        boolean boolean78 = timeSeries62.equals((java.lang.Object) timeSeries75);
        timeSeries62.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass81 = timeSeries62.getClass();
        org.jfree.data.time.TimeSeries timeSeries82 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass81);
        org.jfree.data.time.TimeSeries timeSeries83 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass81);
        org.jfree.data.time.TimeSeries timeSeries84 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass81);
        org.jfree.data.time.TimeSeries timeSeries85 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "", (java.lang.Class) wildcardClass81);
        boolean boolean86 = timeSeries51.equals((java.lang.Object) wildcardClass81);
        org.jfree.data.time.TimeSeries timeSeries87 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "Time", "", (java.lang.Class) wildcardClass81);
        timeSeries87.clear();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value" + "'", str42, "Value");
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Value" + "'", str66, "Value");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        timeSeries6.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries6.equals((java.lang.Object) timeSeries19);
        timeSeries6.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass25 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass25);
        timeSeries27.setNotify(true);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries6.addAndOrUpdate(timeSeries15);
        timeSeries15.setDomainDescription("Value");
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries21.addAndOrUpdate(timeSeries30);
        boolean boolean33 = timeSeries31.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries31.removeChangeListener(seriesChangeListener34);
        java.util.Collection collection36 = timeSeries31.getTimePeriods();
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class38);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries39.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str43 = timeSeries39.getRangeDescription();
        timeSeries39.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        timeSeries39.addPropertyChangeListener(propertyChangeListener46);
        timeSeries39.setDescription("Time");
        timeSeries39.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries31.addAndOrUpdate(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries15.addAndOrUpdate(timeSeries31);
        java.lang.Class class62 = null;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class62);
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries63.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str67 = timeSeries63.getRangeDescription();
        timeSeries63.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        timeSeries63.addPropertyChangeListener(propertyChangeListener70);
        java.lang.Class class75 = null;
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class75);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener77 = null;
        timeSeries76.addChangeListener(seriesChangeListener77);
        boolean boolean79 = timeSeries63.equals((java.lang.Object) timeSeries76);
        timeSeries63.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass82 = timeSeries63.getClass();
        org.jfree.data.time.TimeSeries timeSeries83 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass82);
        org.jfree.data.time.TimeSeries timeSeries84 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass82);
        org.jfree.data.time.TimeSeries timeSeries85 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass82);
        org.jfree.data.time.TimeSeries timeSeries86 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "", (java.lang.Class) wildcardClass82);
        boolean boolean87 = timeSeries52.equals((java.lang.Object) wildcardClass82);
        org.jfree.data.time.TimeSeries timeSeries88 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass82);
        org.jfree.data.time.TimeSeries timeSeries89 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "Value", (java.lang.Class) wildcardClass82);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod90 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number91 = timeSeries89.getValue(regularTimePeriod90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Value" + "'", str43, "Value");
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Value" + "'", str67, "Value");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        boolean boolean10 = timeSeries4.getNotify();
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
        java.util.Collection collection34 = timeSeries13.getTimePeriods();
        boolean boolean35 = timeSeries4.equals((java.lang.Object) collection34);
        timeSeries4.setMaximumItemCount(32);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Overwritten values from: 4", "hi!", (java.lang.Class) wildcardClass11);
        long long13 = timeSeries12.getMaximumItemAge();
        timeSeries12.setRangeDescription("Time");
        java.lang.Class class16 = timeSeries12.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, class16);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class16);
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
        timeSeries15.removeAgedItems(true);
        timeSeries15.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = timeSeries15.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.util.List list18 = timeSeries17.getItems();
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        java.util.List list20 = timeSeries17.getItems();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener21);
        timeSeries17.setMaximumItemCount((int) '4');
        java.lang.Comparable comparable25 = timeSeries17.getKey();
        int int26 = timeSeries17.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + '#' + "'", comparable25, '#');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, (java.lang.Class) wildcardClass20);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        timeSeries2.setDomainDescription("Time");
        timeSeries2.fireSeriesChanged();
        long long16 = timeSeries2.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        boolean boolean11 = timeSeries5.equals((java.lang.Object) 10L);
        timeSeries5.setMaximumItemCount((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "", (java.lang.Class) wildcardClass14);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, class1);
        timeSeries2.setRangeDescription("Value");
        timeSeries2.setMaximumItemCount((int) '4');
        int int7 = timeSeries2.getItemCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        int int5 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries2.getDescription();
        java.util.List list30 = timeSeries2.getItems();
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str37 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount((int) ' ');
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class41);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries42.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str46 = timeSeries42.getRangeDescription();
        timeSeries42.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries42.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean52 = timeSeries42.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries33.addAndOrUpdate(timeSeries42);
        timeSeries33.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries33.addChangeListener(seriesChangeListener56);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        timeSeries33.removeChangeListener(seriesChangeListener58);
        java.lang.String str60 = timeSeries33.getDescription();
        java.util.List list61 = timeSeries33.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries33.removeChangeListener(seriesChangeListener62);
        timeSeries33.setRangeDescription("hi!");
        java.lang.Object obj66 = timeSeries33.clone();
        java.util.Collection collection67 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries33);
        java.lang.Class<?> wildcardClass68 = timeSeries2.getClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value" + "'", str46, "Value");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(wildcardClass68);
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
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.clear();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries2.createCopy((int) (short) 10, (int) '4');
        boolean boolean14 = timeSeries13.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries13.createCopy(32, 100);
        java.util.List list18 = timeSeries17.getItems();
        java.lang.Comparable comparable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.setKey(comparable19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "hi!", (java.lang.Class) wildcardClass20);
        timeSeries23.setRangeDescription("Overwritten values from: 4");
        java.lang.String str26 = timeSeries23.getRangeDescription();
        java.lang.Object obj27 = timeSeries23.clone();
        java.lang.String str28 = timeSeries23.getRangeDescription();
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        long long32 = timeSeries31.getMaximumItemAge();
        timeSeries31.fireSeriesChanged();
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        timeSeries39.removeAgedItems(false);
        timeSeries39.setRangeDescription("Value");
        timeSeries39.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries31.addAndOrUpdate(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries23.addAndOrUpdate(timeSeries31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number49 = timeSeries31.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Overwritten values from: 4" + "'", str26, "Overwritten values from: 4");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Overwritten values from: 4" + "'", str28, "Overwritten values from: 4");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9223372036854775807L + "'", long32 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries47);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        long long9 = timeSeries8.getMaximumItemAge();
        timeSeries8.setDescription("hi!");
        boolean boolean12 = timeSeries8.getNotify();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries8.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        int int22 = timeSeries20.getMaximumItemCount();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries25.addPropertyChangeListener(propertyChangeListener32);
        timeSeries25.setDescription("Time");
        timeSeries25.setMaximumItemAge((long) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries20.addAndOrUpdate(timeSeries25);
        long long39 = timeSeries20.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries42 = timeSeries20.createCopy(regularTimePeriod40, regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 9223372036854775807L + "'", long39 == 9223372036854775807L);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        boolean boolean19 = timeSeries2.getNotify();
        boolean boolean20 = timeSeries2.isEmpty();
        java.lang.Object obj21 = timeSeries2.clone();
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        java.util.Collection collection29 = timeSeries26.getTimePeriods();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str36 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount((int) ' ');
        timeSeries32.setMaximumItemAge((long) (short) 100);
        timeSeries32.setMaximumItemCount(100);
        java.util.Collection collection43 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries2.addAndOrUpdate(timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(regularTimePeriod45, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries12.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries12.addChangeListener(seriesChangeListener20);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str28 = timeSeries24.getRangeDescription();
        timeSeries24.setMaximumItemCount((int) ' ');
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str37 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries33.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean43 = timeSeries33.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries24.addAndOrUpdate(timeSeries33);
        timeSeries33.removeAgedItems(false);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class48);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries49.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str53 = timeSeries49.getRangeDescription();
        timeSeries49.setMaximumItemCount(0);
        java.lang.String str56 = timeSeries49.getRangeDescription();
        timeSeries49.clear();
        boolean boolean58 = timeSeries33.equals((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries12.addAndOrUpdate(timeSeries33);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        timeSeries33.addPropertyChangeListener(propertyChangeListener60);
        timeSeries33.setNotify(true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value" + "'", str53, "Value");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Value" + "'", str56, "Value");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.String str3 = timeSeries1.getRangeDescription();
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod6, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (byte) 100, (int) (short) 100);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        boolean boolean21 = timeSeries19.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries19.removeChangeListener(seriesChangeListener22);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class25);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries26.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str30 = timeSeries26.getRangeDescription();
        timeSeries26.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener33);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class38);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries39.addChangeListener(seriesChangeListener40);
        boolean boolean42 = timeSeries26.equals((java.lang.Object) timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries19.addAndOrUpdate(timeSeries39);
        timeSeries19.clear();
        timeSeries19.setMaximumItemCount((int) (byte) 1);
        boolean boolean47 = timeSeries6.equals((java.lang.Object) (byte) 1);
        boolean boolean48 = timeSeries6.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries12);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        java.lang.Class<?> wildcardClass15 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeSeries16.getIndex(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.addChangeListener(seriesChangeListener14);
        int int16 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Overwritten values from: 4");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries2.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries7.getItemCount();
        java.util.Collection collection14 = timeSeries7.getTimePeriods();
        java.lang.Object obj15 = timeSeries7.clone();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(0);
        java.lang.String str9 = timeSeries2.getRangeDescription();
        timeSeries2.clear();
        timeSeries2.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str19 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener22);
        int int24 = timeSeries15.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries2.addAndOrUpdate(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null; // flaky: timeSeries25.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.List list7 = timeSeries4.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries4.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries4.getDescription();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        java.lang.Class<?> wildcardClass26 = timeSeries15.getClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, (java.lang.Class) wildcardClass26);
        boolean boolean29 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = timeSeries4.getIndex(regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.addChangeListener(seriesChangeListener14);
        int int16 = timeSeries2.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries2.addChangeListener(seriesChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) (byte) 0, (java.lang.Number) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.clear();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries2.createCopy((int) (short) 10, (int) '4');
        boolean boolean14 = timeSeries13.isEmpty();
        java.lang.Comparable comparable15 = timeSeries13.getKey();
        int int16 = timeSeries13.getMaximumItemCount();
        int int17 = timeSeries13.getMaximumItemCount();
        java.lang.Comparable comparable18 = timeSeries13.getKey();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + '4' + "'", comparable15, '4');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + '4' + "'", comparable18, '4');
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        boolean boolean10 = timeSeries4.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        timeSeries4.setKey((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!");
        timeSeries1.setRangeDescription("Value");
        java.util.List list4 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) (-1.0f));
        timeSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null; // flaky: timeSeries1.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemCount(1);
        timeSeries4.fireSeriesChanged();
        java.util.Collection collection10 = timeSeries4.getTimePeriods();
        timeSeries4.setMaximumItemCount((int) '#');
        timeSeries4.setNotify(true);
        int int15 = timeSeries4.getItemCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries32.addChangeListener(seriesChangeListener33);
        boolean boolean35 = timeSeries19.equals((java.lang.Object) timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries12.addAndOrUpdate(timeSeries32);
        timeSeries12.clear();
        timeSeries12.setMaximumItemCount((int) (byte) 1);
        int int40 = timeSeries12.getItemCount();
        timeSeries12.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener43);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update((int) ' ', (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class8);
        java.util.Collection collection10 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        boolean boolean11 = timeSeries9.getNotify();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class15);
        java.util.List list17 = timeSeries16.getItems();
        timeSeries16.setDomainDescription("Time");
        java.lang.String str20 = timeSeries16.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries9.addAndOrUpdate(timeSeries16);
        java.lang.Object obj22 = timeSeries16.clone();
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        boolean boolean17 = timeSeries12.isEmpty();
        java.util.Collection collection18 = timeSeries12.getTimePeriods();
        java.lang.Comparable comparable19 = timeSeries12.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.createCopy((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Overwritten values from: 4" + "'", comparable19, "Overwritten values from: 4");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        java.lang.Class<?> wildcardClass27 = timeSeries16.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "", "hi!", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Overwritten values from: 4", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "Overwritten values from: 4", (java.lang.Class) wildcardClass27);
        boolean boolean34 = timeSeries33.getNotify();
        java.lang.Comparable comparable35 = timeSeries33.getKey();
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + '4' + "'", comparable35, '4');
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries7.addAndOrUpdate(timeSeries16);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        java.lang.Class<?> wildcardClass19 = timeSeries17.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "", "Value", (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass19);
        timeSeries22.setMaximumItemCount(97);
        timeSeries22.setDomainDescription("Value");
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        java.lang.String str13 = timeSeries2.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries2.createCopy((int) (short) 0, 100);
        java.util.List list17 = timeSeries16.getItems();
        java.lang.String str18 = timeSeries16.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        timeSeries11.setDomainDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries11.createCopy((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        boolean boolean2 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        boolean boolean17 = timeSeries15.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries15.removeChangeListener(seriesChangeListener18);
        boolean boolean20 = timeSeries15.isEmpty();
        java.lang.Class<?> wildcardClass21 = timeSeries15.getClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "hi!", "Overwritten values from: 4", (java.lang.Class) wildcardClass21);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries2.addChangeListener(seriesChangeListener29);
        java.lang.String str31 = timeSeries2.getDomainDescription();
        boolean boolean32 = timeSeries2.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries2.addChangeListener(seriesChangeListener35);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Time" + "'", str31, "Time");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
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
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
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
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener42);
        boolean boolean45 = timeSeries35.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries26.addAndOrUpdate(timeSeries35);
        timeSeries26.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries26.addChangeListener(seriesChangeListener49);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries26.removeChangeListener(seriesChangeListener51);
        java.lang.String str53 = timeSeries26.getDescription();
        timeSeries26.clear();
        java.util.Collection collection55 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        boolean boolean56 = timeSeries26.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries26.removeChangeListener(seriesChangeListener57);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        boolean boolean6 = timeSeries2.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener7);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount(0);
        java.lang.String str18 = timeSeries11.getRangeDescription();
        timeSeries11.clear();
        boolean boolean20 = timeSeries2.equals((java.lang.Object) timeSeries11);
        timeSeries11.fireSeriesChanged();
        timeSeries11.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        timeSeries24.setDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries24.addPropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        java.util.Collection collection31 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries11.addAndOrUpdate(timeSeries30);
        java.lang.String str33 = timeSeries11.getDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNull(str33);
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
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        boolean boolean19 = timeSeries2.getNotify();
        boolean boolean20 = timeSeries2.isEmpty();
        java.lang.Object obj21 = timeSeries2.clone();
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        java.util.Collection collection29 = timeSeries26.getTimePeriods();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str36 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount((int) ' ');
        timeSeries32.setMaximumItemAge((long) (short) 100);
        timeSeries32.setMaximumItemCount(100);
        java.util.Collection collection43 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries2.addAndOrUpdate(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        boolean boolean47 = timeSeries46.isEmpty();
        java.util.Collection collection48 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries46);
        boolean boolean49 = timeSeries46.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        java.lang.String str31 = timeSeries25.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener32);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        int int27 = timeSeries2.getItemCount();
        java.lang.Class<?> wildcardClass28 = timeSeries2.getClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        long long7 = timeSeries2.getMaximumItemAge();
        boolean boolean8 = timeSeries2.getNotify();
        timeSeries2.setNotify(true);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.addChangeListener(seriesChangeListener14);
        int int16 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Overwritten values from: 4");
        boolean boolean19 = timeSeries2.getNotify();
        java.lang.Comparable comparable20 = timeSeries2.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod21, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + '4' + "'", comparable20, '4');
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        boolean boolean3 = timeSeries1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener19);
        boolean boolean22 = timeSeries12.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.addAndOrUpdate(timeSeries12);
        timeSeries3.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries3.addChangeListener(seriesChangeListener26);
        java.lang.Class<?> wildcardClass28 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass28);
        java.util.Collection collection30 = timeSeries29.getTimePeriods();
        long long31 = timeSeries29.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.List list7 = timeSeries4.getItems();
        timeSeries4.fireSeriesChanged();
        timeSeries4.setKey((java.lang.Comparable) 10);
        timeSeries4.setNotify(false);
        timeSeries4.setKey((java.lang.Comparable) 100.0f);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        long long9 = timeSeries8.getMaximumItemAge();
        timeSeries8.setDescription("hi!");
        boolean boolean12 = timeSeries8.getNotify();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries8.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        int int22 = timeSeries20.getMaximumItemCount();
        java.util.List list23 = timeSeries20.getItems();
        java.lang.Class class24 = timeSeries20.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries27 = timeSeries20.createCopy((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNull(class24);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        boolean boolean10 = timeSeries4.getNotify();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        boolean boolean18 = timeSeries13.isEmpty();
        timeSeries13.clear();
        java.lang.Object obj20 = timeSeries13.clone();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries4.addAndOrUpdate(timeSeries13);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str28 = timeSeries24.getRangeDescription();
        int int29 = timeSeries24.getMaximumItemCount();
        timeSeries24.setDomainDescription("Value");
        java.lang.Class class32 = timeSeries24.getTimePeriodClass();
        java.lang.String str33 = timeSeries24.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries24.removeChangeListener(seriesChangeListener34);
        timeSeries24.fireSeriesChanged();
        timeSeries24.setMaximumItemCount(100);
        java.lang.String str39 = timeSeries24.getDomainDescription();
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class41);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries42.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str46 = timeSeries42.getRangeDescription();
        int int47 = timeSeries42.getMaximumItemCount();
        timeSeries42.setDomainDescription("Value");
        java.lang.Class class50 = timeSeries42.getTimePeriodClass();
        java.lang.String str51 = timeSeries42.getDomainDescription();
        boolean boolean52 = timeSeries42.getNotify();
        java.util.Collection collection53 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        boolean boolean54 = timeSeries21.equals((java.lang.Object) timeSeries24);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNull(class32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value" + "'", str46, "Value");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertNull(class50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value" + "'", str51, "Value");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
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
        timeSeries2.setMaximumItemAge((long) (short) 100);
        java.lang.Comparable comparable11 = timeSeries2.getKey();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener12);
        java.lang.Class class14 = timeSeries2.getTimePeriodClass();
        int int15 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod16, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + '4' + "'", comparable11, '4');
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
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
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.clear();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries2.createCopy((int) (short) 10, (int) '4');
        timeSeries13.setNotify(false);
        timeSeries13.setKey((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        timeSeries12.setDomainDescription("Value");
        java.util.List list19 = timeSeries12.getItems();
        int int20 = timeSeries12.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        timeSeries2.fireSeriesChanged();
        timeSeries2.setRangeDescription("");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries13.addAndOrUpdate(timeSeries22);
        java.lang.Class<?> wildcardClass24 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "", "hi!", (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Overwritten values from: 4", (java.lang.Class) wildcardClass24);
        java.lang.Comparable comparable30 = timeSeries29.getKey();
        java.util.List list31 = timeSeries29.getItems();
        timeSeries29.setRangeDescription("Overwritten values from: 4");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries29.add(regularTimePeriod34, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + "Value" + "'", comparable30, "Value");
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries5.addChangeListener(seriesChangeListener6);
        java.lang.Class<?> wildcardClass8 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass8);
        int int10 = timeSeries9.getItemCount();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        timeSeries13.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener20);
        timeSeries13.setNotify(false);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class25);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries26.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries35);
        boolean boolean38 = timeSeries36.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries36.removeChangeListener(seriesChangeListener39);
        java.util.Collection collection41 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        java.util.Collection collection42 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class46);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries47.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str51 = timeSeries47.getRangeDescription();
        timeSeries47.setMaximumItemCount((int) ' ');
        java.lang.Class class55 = null;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class55);
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries56.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str60 = timeSeries56.getRangeDescription();
        timeSeries56.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        timeSeries56.removePropertyChangeListener(propertyChangeListener63);
        boolean boolean66 = timeSeries56.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries47.addAndOrUpdate(timeSeries56);
        timeSeries47.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener70 = null;
        timeSeries47.addChangeListener(seriesChangeListener70);
        java.lang.Class<?> wildcardClass72 = timeSeries47.getClass();
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, (java.lang.Class) wildcardClass72);
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, (java.lang.Class) wildcardClass72);
        long long75 = timeSeries74.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries9.addAndOrUpdate(timeSeries74);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value" + "'", str51, "Value");
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Value" + "'", str60, "Value");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 9223372036854775807L + "'", long75 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries76);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        java.lang.String str8 = timeSeries4.getRangeDescription();
        timeSeries4.setDescription("Overwritten values from: 4");
        timeSeries4.fireSeriesChanged();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries32.addChangeListener(seriesChangeListener33);
        boolean boolean35 = timeSeries19.equals((java.lang.Object) timeSeries32);
        timeSeries19.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass38 = timeSeries19.getClass();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass38);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass38);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass38);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries4.addAndOrUpdate(timeSeries41);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number44 = timeSeries42.getValue(regularTimePeriod43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (java.lang.Number) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setDescription("Time");
        timeSeries2.setKey((java.lang.Comparable) (byte) 1);
        long long15 = timeSeries2.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems((long) 52, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        java.lang.String str10 = timeSeries5.getDomainDescription();
        timeSeries5.setDomainDescription("hi!");
        int int13 = timeSeries5.getItemCount();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str20 = timeSeries16.getRangeDescription();
        int int21 = timeSeries16.getMaximumItemCount();
        timeSeries16.setDomainDescription("Value");
        java.lang.Class class24 = timeSeries16.getTimePeriodClass();
        java.lang.String str25 = timeSeries16.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries16.removeChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries16.createCopy((int) (byte) 0, (int) 'a');
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries5.addAndOrUpdate(timeSeries30);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(timeSeriesDataItem32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        boolean boolean17 = timeSeries12.isEmpty();
        java.util.Collection collection18 = timeSeries12.getTimePeriods();
        java.lang.Object obj19 = timeSeries12.clone();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.addChangeListener(seriesChangeListener14);
        int int16 = timeSeries2.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries2.addChangeListener(seriesChangeListener17);
        java.util.Collection collection19 = timeSeries2.getTimePeriods();
        int int20 = timeSeries2.getItemCount();
        java.util.Collection collection21 = timeSeries2.getTimePeriods();
        java.util.Collection collection22 = timeSeries2.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        timeSeries5.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass24 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, (java.lang.Class) wildcardClass24);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.removeChangeListener(seriesChangeListener12);
        java.util.Collection collection14 = timeSeries2.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries2.addAndOrUpdate(timeSeries16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries2.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener12);
        timeSeries2.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod16, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        java.lang.String str11 = timeSeries2.getDomainDescription();
        timeSeries2.setDomainDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries2.createCopy(0, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries2.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod19, (java.lang.Number) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setDescription("Time");
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str19 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount((int) ' ');
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str28 = timeSeries24.getRangeDescription();
        timeSeries24.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener31);
        boolean boolean34 = timeSeries24.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries15.addAndOrUpdate(timeSeries24);
        java.util.Collection collection36 = timeSeries15.getTimePeriods();
        java.util.Collection collection37 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        int int38 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod39, (java.lang.Number) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        timeSeries12.setMaximumItemAge((long) (byte) 100);
        java.lang.String str19 = timeSeries12.getRangeDescription();
        timeSeries12.setRangeDescription("Time");
        int int22 = timeSeries12.getMaximumItemCount();
        java.lang.Object obj23 = timeSeries12.clone();
        timeSeries12.fireSeriesChanged();
        long long25 = timeSeries12.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        long long18 = timeSeries11.getMaximumItemAge();
        timeSeries11.setNotify(true);
        java.util.Collection collection21 = timeSeries11.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries11);
        timeSeries4.setDescription("hi!");
        timeSeries4.clear();
        timeSeries4.setKey((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        boolean boolean17 = timeSeries12.isEmpty();
        java.lang.Class class18 = timeSeries12.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries12.addChangeListener(seriesChangeListener19);
        timeSeries12.setDomainDescription("Value");
        timeSeries12.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update(regularTimePeriod24, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(class18);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemAge((long) (short) 1);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy((int) (byte) 0, 100);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(0);
        java.lang.String str9 = timeSeries2.getRangeDescription();
        timeSeries2.clear();
        boolean boolean11 = timeSeries2.getNotify();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries23);
        int int25 = timeSeries23.getMaximumItemCount();
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
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries37.removePropertyChangeListener(propertyChangeListener44);
        boolean boolean47 = timeSeries37.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries28.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries23.addAndOrUpdate(timeSeries48);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries2.addAndOrUpdate(timeSeries23);
        long long51 = timeSeries2.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value" + "'", str41, "Value");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 9223372036854775807L + "'", long51 == 9223372036854775807L);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "Time", "Value", (java.lang.Class) wildcardClass34);
        timeSeries35.fireSeriesChanged();
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class38);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries39.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class44);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries45.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries39.addAndOrUpdate(timeSeries48);
        boolean boolean51 = timeSeries49.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries49.removeChangeListener(seriesChangeListener52);
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
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries49.addAndOrUpdate(timeSeries69);
        java.lang.Class class77 = null;
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class77);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener79 = null;
        timeSeries78.addChangeListener(seriesChangeListener79);
        java.util.Collection collection81 = timeSeries78.getTimePeriods();
        timeSeries78.setDomainDescription("Time");
        java.util.Collection collection84 = timeSeries69.getTimePeriodsUniqueToOtherSeries(timeSeries78);
        org.jfree.data.time.TimeSeries timeSeries85 = timeSeries35.addAndOrUpdate(timeSeries69);
        java.lang.String str86 = timeSeries35.getDomainDescription();
        java.lang.Class<?> wildcardClass87 = timeSeries35.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Value" + "'", str60, "Value");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(timeSeries85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Time" + "'", str86, "Time");
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemAge((long) (short) 1);
        java.lang.String str4 = timeSeries1.getDomainDescription();
        java.lang.String str5 = timeSeries1.getDescription();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 1 + "'", comparable6, (byte) 1);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries25.addChangeListener(seriesChangeListener31);
        int int33 = timeSeries25.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class3);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str8 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        boolean boolean20 = timeSeries4.equals((java.lang.Object) timeSeries17);
        timeSeries4.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass23 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, (java.lang.Class) wildcardClass23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.delete(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f);
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
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        long long7 = timeSeries2.getMaximumItemAge();
        int int8 = timeSeries2.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
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
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries2.addChangeListener(seriesChangeListener29);
        java.util.List list31 = timeSeries2.getItems();
        timeSeries2.setDescription("Overwritten values from: 4");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries2.addChangeListener(seriesChangeListener34);
        timeSeries2.setDomainDescription("");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str19 = timeSeries15.getRangeDescription();
        int int20 = timeSeries15.getMaximumItemCount();
        timeSeries15.setDomainDescription("Value");
        java.lang.Class class23 = timeSeries15.getTimePeriodClass();
        java.lang.String str24 = timeSeries15.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries15.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries15.addChangeListener(seriesChangeListener27);
        int int29 = timeSeries15.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries15.addChangeListener(seriesChangeListener30);
        java.util.Collection collection32 = timeSeries15.getTimePeriods();
        int int33 = timeSeries15.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries12.addAndOrUpdate(timeSeries15);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNull(class23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.util.List list18 = timeSeries17.getItems();
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        java.util.List list20 = timeSeries17.getItems();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener21);
        timeSeries17.setMaximumItemAge(32L);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(0);
        java.lang.String str9 = timeSeries2.getRangeDescription();
        timeSeries2.clear();
        timeSeries2.setNotify(true);
        timeSeries2.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        boolean boolean10 = timeSeries4.getNotify();
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
        java.util.Collection collection34 = timeSeries13.getTimePeriods();
        boolean boolean35 = timeSeries4.equals((java.lang.Object) collection34);
        java.util.Collection collection36 = timeSeries4.getTimePeriods();
        java.lang.Comparable comparable37 = timeSeries4.getKey();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener38);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 1 + "'", comparable37, 1);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        java.util.List list2 = timeSeries1.getItems();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount(2147483647);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.removeAgedItems(true);
        timeSeries2.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries2.update((-1), (java.lang.Number) 1.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries19);
        java.lang.Class<?> wildcardClass21 = timeSeries10.getClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass21);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass21);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Value", "", (java.lang.Class) wildcardClass21);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.removeChangeListener(seriesChangeListener26);
        timeSeries25.setMaximumItemCount(0);
        int int30 = timeSeries25.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.delete(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        boolean boolean2 = timeSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = timeSeries1.getTimePeriod(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setDomainDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.removeChangeListener(seriesChangeListener6);
        timeSeries1.removeAgedItems((long) (short) 100, false);
        java.lang.String str11 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        boolean boolean3 = timeSeries2.isEmpty();
        java.util.List list4 = timeSeries2.getItems();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries7.addAndOrUpdate(timeSeries16);
        java.lang.Class<?> wildcardClass18 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass18);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass18);
        timeSeries21.setKey((java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable24 = timeSeries21.getKey();
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (byte) 100 + "'", comparable24, (byte) 100);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries12.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener14);
        timeSeries12.clear();
        timeSeries12.setMaximumItemAge(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        boolean boolean23 = timeSeries22.getNotify();
        timeSeries22.clear();
        boolean boolean25 = timeSeries22.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        timeSeries2.removeAgedItems(false);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener14);
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.List list18 = timeSeries2.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class3);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.addAndOrUpdate(timeSeries13);
        java.lang.Class<?> wildcardClass15 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, (java.lang.Class) wildcardClass15);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries17.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries2.getDescription();
        java.util.List list30 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries2.removeChangeListener(seriesChangeListener31);
        java.util.Collection collection33 = timeSeries2.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries2.removeChangeListener(seriesChangeListener34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener36);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries12.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        timeSeries12.removeAgedItems(true);
        long long18 = timeSeries12.getMaximumItemAge();
        timeSeries12.setRangeDescription("Value");
        int int21 = timeSeries12.getItemCount();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        int int6 = timeSeries2.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener7);
        java.util.List list9 = timeSeries2.getItems();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries7.addAndOrUpdate(timeSeries16);
        java.lang.Class<?> wildcardClass18 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass18);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass18);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) '4', (int) (byte) 100);
        timeSeries21.fireSeriesChanged();
        java.lang.Comparable comparable26 = timeSeries21.getKey();
        timeSeries21.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(timeSeriesDataItem28, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (short) 10 + "'", comparable26, (short) 10);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener19);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class24);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.addChangeListener(seriesChangeListener26);
        boolean boolean28 = timeSeries12.equals((java.lang.Object) timeSeries25);
        timeSeries12.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass31 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass31);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass31);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Overwritten values from: 4", "hi!", (java.lang.Class) wildcardClass31);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "hi!", (java.lang.Class) wildcardClass31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries35.add(regularTimePeriod36, (double) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries32.addChangeListener(seriesChangeListener33);
        boolean boolean35 = timeSeries19.equals((java.lang.Object) timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries12.addAndOrUpdate(timeSeries32);
        int int37 = timeSeries12.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete(regularTimePeriod38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.addChangeListener(seriesChangeListener14);
        int int16 = timeSeries2.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries2.addChangeListener(seriesChangeListener17);
        java.util.Collection collection19 = timeSeries2.getTimePeriods();
        int int20 = timeSeries2.getItemCount();
        java.util.Collection collection21 = timeSeries2.getTimePeriods();
        int int22 = timeSeries2.getItemCount();
        java.lang.Class<?> wildcardClass23 = timeSeries2.getClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries12);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        java.lang.Class<?> wildcardClass15 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass15);
        timeSeries16.setDomainDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = timeSeries16.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        boolean boolean10 = timeSeries4.getNotify();
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
        java.util.Collection collection34 = timeSeries13.getTimePeriods();
        boolean boolean35 = timeSeries4.equals((java.lang.Object) collection34);
        java.util.Collection collection36 = timeSeries4.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod39, (java.lang.Number) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class1);
        timeSeries2.setRangeDescription("");
        timeSeries2.removeAgedItems(true);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        long long10 = timeSeries9.getMaximumItemAge();
        timeSeries9.setDescription("hi!");
        boolean boolean13 = timeSeries9.getNotify();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class17);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.addChangeListener(seriesChangeListener19);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Object obj22 = timeSeries18.clone();
        java.lang.String str23 = timeSeries18.getRangeDescription();
        boolean boolean24 = timeSeries2.equals((java.lang.Object) str23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries2.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries17);
        java.lang.Class<?> wildcardClass19 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = timeSeries20.getClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, (java.lang.Class) wildcardClass21);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", (java.lang.Class) wildcardClass21);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str31 = timeSeries27.getRangeDescription();
        timeSeries27.setMaximumItemCount((int) ' ');
        boolean boolean34 = timeSeries27.getNotify();
        timeSeries27.clear();
        long long36 = timeSeries27.getMaximumItemAge();
        timeSeries27.setNotify(false);
        java.util.Collection collection39 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9223372036854775807L + "'", long36 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        boolean boolean6 = timeSeries2.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries2.addChangeListener(seriesChangeListener9);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        timeSeries2.setMaximumItemCount((int) (byte) 1);
        timeSeries2.clear();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener12);
        int int14 = timeSeries2.getItemCount();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener11);
        java.lang.String str13 = timeSeries4.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L);
        java.util.List list2 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries1.createCopy((int) (short) 10, (int) 'a');
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        timeSeries5.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(0);
        java.lang.String str9 = timeSeries2.getRangeDescription();
        int int10 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Time");
        timeSeries2.removeAgedItems(true);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.removeChangeListener(seriesChangeListener12);
        timeSeries2.fireSeriesChanged();
        timeSeries2.setMaximumItemCount(100);
        java.lang.String str17 = timeSeries2.getDomainDescription();
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str24 = timeSeries20.getRangeDescription();
        int int25 = timeSeries20.getMaximumItemCount();
        timeSeries20.setDomainDescription("Value");
        java.lang.Class class28 = timeSeries20.getTimePeriodClass();
        java.lang.String str29 = timeSeries20.getDomainDescription();
        boolean boolean30 = timeSeries20.getNotify();
        java.util.Collection collection31 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        boolean boolean32 = timeSeries20.isEmpty();
        long long33 = timeSeries20.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timeSeries2.getKey();
        timeSeries2.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries2.addOrUpdate(regularTimePeriod11, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + '4' + "'", comparable8, '4');
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        timeSeries1.setDescription("Value");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        timeSeries2.setNotify(true);
        java.lang.String str12 = timeSeries2.getRangeDescription();
        timeSeries2.clear();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        int int8 = timeSeries5.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries5.createCopy(0, 100);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries11.createCopy(regularTimePeriod14, regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries4.equals((java.lang.Object) timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener21);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class26);
        timeSeries27.setRangeDescription("hi!");
        timeSeries27.setNotify(true);
        java.lang.Comparable comparable32 = timeSeries27.getKey();
        java.lang.String str33 = timeSeries27.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.lang.Class class38 = timeSeries35.getTimePeriodClass();
        boolean boolean39 = timeSeries27.equals((java.lang.Object) class38);
        java.util.Collection collection40 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 1 + "'", comparable32, 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        boolean boolean19 = timeSeries2.getNotify();
        boolean boolean20 = timeSeries2.isEmpty();
        java.lang.Object obj21 = timeSeries2.clone();
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        java.util.Collection collection29 = timeSeries26.getTimePeriods();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str36 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount((int) ' ');
        timeSeries32.setMaximumItemAge((long) (short) 100);
        timeSeries32.setMaximumItemCount(100);
        java.util.Collection collection43 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries2.addAndOrUpdate(timeSeries26);
        boolean boolean45 = timeSeries2.getNotify();
        java.lang.Class class46 = timeSeries2.getTimePeriodClass();
        boolean boolean47 = timeSeries2.getNotify();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(class46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries7.getItemCount();
        boolean boolean14 = timeSeries7.isEmpty();
        int int15 = timeSeries7.getMaximumItemCount();
        timeSeries7.setRangeDescription("Overwritten values from: 4");
        timeSeries7.setMaximumItemCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.removeChangeListener(seriesChangeListener12);
        java.util.Collection collection14 = timeSeries2.getTimePeriods();
        int int15 = timeSeries2.getMaximumItemCount();
        int int16 = timeSeries2.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        java.lang.Object obj23 = timeSeries22.clone();
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class25);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries26.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str30 = timeSeries26.getRangeDescription();
        timeSeries26.setMaximumItemCount(0);
        java.lang.String str33 = timeSeries26.getRangeDescription();
        timeSeries26.clear();
        boolean boolean35 = timeSeries26.getNotify();
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class37);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries38.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class43);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries44.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries38.addAndOrUpdate(timeSeries47);
        int int49 = timeSeries47.getMaximumItemCount();
        java.lang.Class class51 = null;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class51);
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries52.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str56 = timeSeries52.getRangeDescription();
        timeSeries52.setMaximumItemCount((int) ' ');
        java.lang.Class class60 = null;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class60);
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries61.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str65 = timeSeries61.getRangeDescription();
        timeSeries61.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        timeSeries61.removePropertyChangeListener(propertyChangeListener68);
        boolean boolean71 = timeSeries61.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries52.addAndOrUpdate(timeSeries61);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries47.addAndOrUpdate(timeSeries72);
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries26.addAndOrUpdate(timeSeries47);
        timeSeries26.setDomainDescription("Time");
        java.util.Collection collection77 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries22.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Value" + "'", str56, "Value");
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Value" + "'", str65, "Value");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(timeSeries72);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertNotNull(timeSeries74);
        org.junit.Assert.assertNotNull(collection77);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!");
        timeSeries1.setRangeDescription("Value");
        java.util.List list4 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) (-1.0f));
        timeSeries1.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        java.lang.Number number10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, number10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.addChangeListener(seriesChangeListener14);
        int int16 = timeSeries2.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries2.addChangeListener(seriesChangeListener17);
        java.util.Collection collection19 = timeSeries2.getTimePeriods();
        int int20 = timeSeries2.getItemCount();
        timeSeries2.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod22, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        timeSeries6.setMaximumItemCount((int) ' ');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str19 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener22);
        boolean boolean25 = timeSeries15.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries6.addAndOrUpdate(timeSeries15);
        boolean boolean27 = timeSeries26.getNotify();
        java.lang.Class<?> wildcardClass28 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "hi!", "", (java.lang.Class) wildcardClass28);
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class38);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries39.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries42);
        boolean boolean45 = timeSeries43.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries43.removeChangeListener(seriesChangeListener46);
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class49);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries50.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str54 = timeSeries50.getRangeDescription();
        timeSeries50.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        timeSeries50.addPropertyChangeListener(propertyChangeListener57);
        java.lang.Class class62 = null;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class62);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener64 = null;
        timeSeries63.addChangeListener(seriesChangeListener64);
        boolean boolean66 = timeSeries50.equals((java.lang.Object) timeSeries63);
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries43.addAndOrUpdate(timeSeries63);
        java.lang.Class class71 = null;
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class71);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener73 = null;
        timeSeries72.addChangeListener(seriesChangeListener73);
        java.lang.String str75 = timeSeries72.getDescription();
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries43.addAndOrUpdate(timeSeries72);
        java.lang.String str77 = timeSeries76.getDescription();
        java.lang.String str78 = timeSeries76.getDescription();
        org.jfree.data.time.TimeSeries timeSeries79 = timeSeries30.addAndOrUpdate(timeSeries76);
        java.util.List list80 = timeSeries30.getItems();
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value" + "'", str54, "Value");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(timeSeries76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(timeSeries79);
        org.junit.Assert.assertNotNull(list80);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        long long18 = timeSeries11.getMaximumItemAge();
        timeSeries11.setNotify(true);
        java.util.Collection collection21 = timeSeries11.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.lang.Class class23 = timeSeries11.getTimePeriodClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(class23);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        timeSeries1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        java.lang.Object obj6 = timeSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        java.lang.Object obj9 = timeSeries1.clone();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str11 = timeSeries7.getRangeDescription();
        timeSeries7.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener14);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class19);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries20.addChangeListener(seriesChangeListener21);
        boolean boolean23 = timeSeries7.equals((java.lang.Object) timeSeries20);
        timeSeries7.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass26 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries29.add(regularTimePeriod30, (java.lang.Number) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries2.getDescription();
        java.util.List list30 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries2.removeChangeListener(seriesChangeListener31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries2.addChangeListener(seriesChangeListener33);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod35, (java.lang.Number) 97L, true);
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        java.lang.String str8 = timeSeries4.getRangeDescription();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount(0);
        java.lang.String str18 = timeSeries11.getRangeDescription();
        timeSeries11.clear();
        timeSeries11.removeAgedItems(true);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str28 = timeSeries24.getRangeDescription();
        timeSeries24.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries24.addPropertyChangeListener(propertyChangeListener31);
        int int33 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries11.addAndOrUpdate(timeSeries24);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class36);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries37.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class42);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries43.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries37.addAndOrUpdate(timeSeries46);
        boolean boolean48 = timeSeries46.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries34.addAndOrUpdate(timeSeries46);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries4.addAndOrUpdate(timeSeries34);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        timeSeries34.addPropertyChangeListener(propertyChangeListener51);
        long long53 = timeSeries34.getMaximumItemAge();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 9223372036854775807L + "'", long53 == 9223372036854775807L);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        timeSeries5.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries5.addChangeListener(seriesChangeListener28);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries5.removeChangeListener(seriesChangeListener30);
        java.lang.String str32 = timeSeries5.getDescription();
        java.util.List list33 = timeSeries5.getItems();
        timeSeries5.clear();
        timeSeries5.setMaximumItemAge((long) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener39);
        java.lang.Class class41 = timeSeries38.getTimePeriodClass();
        boolean boolean42 = timeSeries5.equals((java.lang.Object) class41);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "", "", class41);
        java.lang.Class class59 = null;
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class59);
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries60.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class65 = null;
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class65);
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries66.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries60.addAndOrUpdate(timeSeries69);
        java.lang.Class<?> wildcardClass71 = timeSeries60.getClass();
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass71);
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass71);
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass71);
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "", "hi!", (java.lang.Class) wildcardClass71);
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Overwritten values from: 4", (java.lang.Class) wildcardClass71);
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, "Overwritten values from: 4", "Overwritten values from: 4", (java.lang.Class) wildcardClass71);
        org.jfree.data.time.TimeSeries timeSeries78 = timeSeries43.addAndOrUpdate(timeSeries77);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod79 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int80 = timeSeries78.getIndex(regularTimePeriod79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertNotNull(timeSeries69);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(timeSeries78);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries2.getDescription();
        java.util.List list30 = timeSeries2.getItems();
        timeSeries2.clear();
        timeSeries2.setMaximumItemAge((long) (byte) 10);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class41);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries42.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries36.addAndOrUpdate(timeSeries45);
        boolean boolean48 = timeSeries46.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries46.removeChangeListener(seriesChangeListener49);
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class52);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries53.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str57 = timeSeries53.getRangeDescription();
        timeSeries53.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        timeSeries53.addPropertyChangeListener(propertyChangeListener60);
        java.lang.Class class65 = null;
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class65);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        timeSeries66.addChangeListener(seriesChangeListener67);
        boolean boolean69 = timeSeries53.equals((java.lang.Object) timeSeries66);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries46.addAndOrUpdate(timeSeries66);
        java.lang.Class class74 = null;
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class74);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener76 = null;
        timeSeries75.addChangeListener(seriesChangeListener76);
        java.lang.String str78 = timeSeries75.getDescription();
        org.jfree.data.time.TimeSeries timeSeries79 = timeSeries46.addAndOrUpdate(timeSeries75);
        java.lang.String str80 = timeSeries79.getDescription();
        org.jfree.data.time.TimeSeries timeSeries81 = timeSeries2.addAndOrUpdate(timeSeries79);
        java.lang.Comparable comparable82 = timeSeries2.getKey();
        java.lang.Class class86 = null;
        org.jfree.data.time.TimeSeries timeSeries87 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class86);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener88 = null;
        timeSeries87.addChangeListener(seriesChangeListener88);
        java.lang.String str90 = timeSeries87.getDescription();
        timeSeries87.clear();
        org.jfree.data.time.TimeSeries timeSeries92 = timeSeries2.addAndOrUpdate(timeSeries87);
        java.lang.Object obj93 = timeSeries87.clone();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Value" + "'", str57, "Value");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(timeSeries79);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(timeSeries81);
        org.junit.Assert.assertEquals("'" + comparable82 + "' != '" + '4' + "'", comparable82, '4');
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNotNull(timeSeries92);
        org.junit.Assert.assertNotNull(obj93);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        timeSeries2.setDomainDescription("Value");
        timeSeries2.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener23);
        boolean boolean25 = timeSeries2.getNotify();
        java.lang.String str26 = timeSeries2.getRangeDescription();
        int int27 = timeSeries2.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries1.removeAgedItems((long) 32, false);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        boolean boolean23 = timeSeries22.getNotify();
        timeSeries22.clear();
        timeSeries22.setRangeDescription("Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        boolean boolean6 = timeSeries2.getNotify();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries11.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries2.createCopy((int) (short) 0, (-1));
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class19);
        boolean boolean21 = timeSeries2.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        timeSeries11.removeAgedItems(false);
        timeSeries11.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries11.removeChangeListener(seriesChangeListener26);
        java.lang.String str28 = timeSeries11.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, (java.lang.Class) wildcardClass16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass16);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj9 = timeSeries8.clone();
        java.lang.String str10 = timeSeries8.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener11);
        java.lang.String str13 = timeSeries8.getDomainDescription();
        timeSeries8.setDescription("");
        java.lang.Class<?> wildcardClass16 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "Value", "Overwritten values from: 4", (java.lang.Class) wildcardClass16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries17.getValue(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        timeSeries2.setDomainDescription("Value");
        timeSeries2.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener23);
        boolean boolean25 = timeSeries2.getNotify();
        timeSeries2.setRangeDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod30, (double) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        java.lang.String str31 = timeSeries2.getDescription();
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class33);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries34.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str38 = timeSeries34.getRangeDescription();
        timeSeries34.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries34.addPropertyChangeListener(propertyChangeListener41);
        int int43 = timeSeries34.getMaximumItemCount();
        int int44 = timeSeries34.getMaximumItemCount();
        long long45 = timeSeries34.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries2.addAndOrUpdate(timeSeries34);
        java.lang.Class class47 = timeSeries34.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 9223372036854775807L + "'", long45 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNull(class47);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries32.addChangeListener(seriesChangeListener33);
        boolean boolean35 = timeSeries19.equals((java.lang.Object) timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries12.addAndOrUpdate(timeSeries32);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class40);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries41.addChangeListener(seriesChangeListener42);
        java.util.Collection collection44 = timeSeries41.getTimePeriods();
        timeSeries41.setDomainDescription("Time");
        java.util.Collection collection47 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries41.removePropertyChangeListener(propertyChangeListener48);
        java.lang.Class<?> wildcardClass50 = timeSeries41.getClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setDescription("Time");
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str19 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount((int) ' ');
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str28 = timeSeries24.getRangeDescription();
        timeSeries24.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener31);
        boolean boolean34 = timeSeries24.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries15.addAndOrUpdate(timeSeries24);
        java.util.Collection collection36 = timeSeries15.getTimePeriods();
        java.util.Collection collection37 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener38);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class9);
        timeSeries10.removeAgedItems(false);
        java.lang.String str13 = timeSeries10.getDomainDescription();
        boolean boolean14 = timeSeries5.equals((java.lang.Object) str13);
        timeSeries5.setNotify(false);
        timeSeries5.setRangeDescription("Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        timeSeries12.setMaximumItemAge(1L);
        long long19 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = timeSeries12.getIndex(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        boolean boolean12 = timeSeries2.getNotify();
        long long13 = timeSeries2.getMaximumItemAge();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class17);
        java.util.List list19 = timeSeries18.getItems();
        java.lang.String str20 = timeSeries18.getRangeDescription();
        java.util.Collection collection21 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        timeSeries2.setMaximumItemAge((long) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = timeSeries2.getIndex(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f);
        timeSeries1.setDescription("");
        java.lang.Object obj4 = timeSeries1.clone();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str11 = timeSeries7.getRangeDescription();
        timeSeries7.setMaximumItemCount((int) ' ');
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str20 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener23);
        boolean boolean26 = timeSeries16.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries7.addAndOrUpdate(timeSeries16);
        timeSeries16.removeAgedItems(false);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str36 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount(0);
        java.lang.String str39 = timeSeries32.getRangeDescription();
        timeSeries32.clear();
        boolean boolean41 = timeSeries16.equals((java.lang.Object) timeSeries32);
        java.util.Collection collection42 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        int int43 = timeSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener44);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        long long7 = timeSeries2.getMaximumItemAge();
        timeSeries2.clear();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries2.createCopy(10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class8);
        java.util.Collection collection10 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        boolean boolean11 = timeSeries9.getNotify();
        boolean boolean12 = timeSeries9.isEmpty();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str19 = timeSeries15.getRangeDescription();
        timeSeries15.removeAgedItems(true);
        boolean boolean22 = timeSeries9.equals((java.lang.Object) true);
        timeSeries9.setMaximumItemAge((long) (short) 100);
        java.lang.Object obj25 = timeSeries9.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries9.addOrUpdate(regularTimePeriod26, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        java.lang.String str10 = timeSeries5.getDomainDescription();
        timeSeries5.setDomainDescription("hi!");
        long long13 = timeSeries5.getMaximumItemAge();
        timeSeries5.clear();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class16);
        java.lang.String str18 = timeSeries17.getDomainDescription();
        boolean boolean19 = timeSeries5.equals((java.lang.Object) timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod20, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        int int27 = timeSeries2.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener28);
        timeSeries2.setKey((java.lang.Comparable) 10L);
        java.util.List list32 = timeSeries2.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        java.lang.Number number34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod33, number34, false);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        timeSeries2.setDomainDescription("Value");
        java.lang.Comparable comparable21 = timeSeries2.getKey();
        java.lang.Class class22 = timeSeries2.getTimePeriodClass();
        timeSeries2.setRangeDescription("Time");
        java.util.Collection collection25 = timeSeries2.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + '4' + "'", comparable21, '4');
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class22);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries23.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries17.addAndOrUpdate(timeSeries26);
        java.lang.Class<?> wildcardClass28 = timeSeries17.getClass();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "", "hi!", (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Overwritten values from: 4", (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, "Overwritten values from: 4", "Overwritten values from: 4", (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries35.delete(regularTimePeriod36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.clear();
        long long11 = timeSeries2.getMaximumItemAge();
        timeSeries2.removeAgedItems(false);
        timeSeries2.setKey((java.lang.Comparable) (-1L));
        boolean boolean16 = timeSeries2.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries7.getItemCount();
        boolean boolean14 = timeSeries7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.removeAgedItems((long) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.util.List list10 = timeSeries9.getItems();
        timeSeries9.removeAgedItems(false);
        java.lang.Class<?> wildcardClass13 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "Value", "Time", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass13);
        int int16 = timeSeries15.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.removeChangeListener(seriesChangeListener12);
        timeSeries2.fireSeriesChanged();
        timeSeries2.setMaximumItemCount(100);
        java.lang.String str17 = timeSeries2.getDomainDescription();
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str24 = timeSeries20.getRangeDescription();
        int int25 = timeSeries20.getMaximumItemCount();
        timeSeries20.setDomainDescription("Value");
        java.lang.Class class28 = timeSeries20.getTimePeriodClass();
        java.lang.String str29 = timeSeries20.getDomainDescription();
        boolean boolean30 = timeSeries20.getNotify();
        java.util.Collection collection31 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        timeSeries2.clear();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setNotify(true);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        timeSeries12.setMaximumItemCount((int) 'a');
        long long17 = timeSeries12.getMaximumItemAge();
        java.util.Collection collection18 = timeSeries12.getTimePeriods();
        timeSeries12.removeAgedItems(true);
        java.lang.String str21 = timeSeries12.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        timeSeries2.setDomainDescription("Value");
        timeSeries2.setDescription("Value");
        timeSeries2.setNotify(true);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        java.lang.String str10 = timeSeries5.getDomainDescription();
        timeSeries5.setDomainDescription("hi!");
        long long13 = timeSeries5.getMaximumItemAge();
        timeSeries5.clear();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class16);
        java.lang.String str18 = timeSeries17.getDomainDescription();
        boolean boolean19 = timeSeries5.equals((java.lang.Object) timeSeries17);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        int int27 = timeSeries22.getMaximumItemCount();
        timeSeries22.setDomainDescription("Value");
        java.lang.Class class30 = timeSeries22.getTimePeriodClass();
        java.lang.String str31 = timeSeries22.getDomainDescription();
        timeSeries22.removeAgedItems(false);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries22.removePropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries37.removePropertyChangeListener(propertyChangeListener38);
        java.lang.Class class40 = timeSeries37.getTimePeriodClass();
        boolean boolean41 = timeSeries22.equals((java.lang.Object) timeSeries37);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries43.removeChangeListener(seriesChangeListener44);
        timeSeries43.removeAgedItems(true);
        java.lang.String str48 = timeSeries43.getDescription();
        java.util.Collection collection49 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries43);
        boolean boolean50 = timeSeries17.equals((java.lang.Object) collection49);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertNotNull(class40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str12 = timeSeries8.getRangeDescription();
        java.lang.Class<?> wildcardClass13 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "Overwritten values from: 4", "Value", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "Time", "Value", (java.lang.Class) wildcardClass13);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries25.addAndOrUpdate(timeSeries34);
        java.lang.Class<?> wildcardClass36 = timeSeries25.getClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass36);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass36);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass36);
        timeSeries39.setMaximumItemAge((long) 10);
        java.lang.Class class42 = timeSeries39.getTimePeriodClass();
        java.util.Collection collection43 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        java.lang.Comparable comparable44 = timeSeries39.getKey();
        timeSeries39.fireSeriesChanged();
        java.util.Collection collection46 = timeSeries39.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + 10 + "'", comparable44, 10);
        org.junit.Assert.assertNotNull(collection46);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
        timeSeries12.setMaximumItemAge((long) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries12.addChangeListener(seriesChangeListener19);
        java.lang.Object obj21 = timeSeries12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries12.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        timeSeries2.removeAgedItems(false);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener14);
        timeSeries2.clear();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        java.util.Collection collection14 = timeSeries2.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries2.addChangeListener(seriesChangeListener15);
        timeSeries2.clear();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setKey((java.lang.Comparable) true);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries31);
        java.lang.Class<?> wildcardClass33 = timeSeries22.getClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass33);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass33);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "hi!", (java.lang.Class) wildcardClass33);
        int int37 = timeSeries36.getItemCount();
        java.lang.String str38 = timeSeries36.getRangeDescription();
        java.lang.Class<?> wildcardClass39 = timeSeries36.getClass();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, (java.lang.Class) wildcardClass39);
        java.lang.Class<?> wildcardClass41 = timeSeries40.getClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, (java.lang.Class) wildcardClass41);
        boolean boolean43 = timeSeries2.equals((java.lang.Object) timeSeries42);
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class45);
        long long47 = timeSeries46.getMaximumItemAge();
        timeSeries46.fireSeriesChanged();
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class50);
        long long52 = timeSeries51.getMaximumItemAge();
        timeSeries51.setDescription("hi!");
        boolean boolean55 = timeSeries51.getNotify();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries46.addAndOrUpdate(timeSeries51);
        int int57 = timeSeries56.getMaximumItemCount();
        boolean boolean58 = timeSeries42.equals((java.lang.Object) int57);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 9223372036854775807L + "'", long47 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 9223372036854775807L + "'", long52 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        timeSeries12.setDomainDescription("Value");
        int int15 = timeSeries12.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener16);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        timeSeries12.setMaximumItemCount((int) 'a');
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod19, (double) ' ');
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
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        timeSeries2.setDomainDescription("Value");
        timeSeries2.setDescription("Value");
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class33);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries34.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries28.addAndOrUpdate(timeSeries37);
        java.lang.Class<?> wildcardClass39 = timeSeries28.getClass();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass39);
        java.util.List list41 = timeSeries40.getItems();
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class43);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries44.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str48 = timeSeries44.getRangeDescription();
        boolean boolean49 = timeSeries40.equals((java.lang.Object) timeSeries44);
        java.util.Collection collection50 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries2.removeChangeListener(seriesChangeListener51);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Value" + "'", str48, "Value");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries6.addAndOrUpdate(timeSeries15);
        java.lang.Class<?> wildcardClass17 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass17);
        boolean boolean20 = timeSeries19.getNotify();
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = timeSeries19.getIndex(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timeSeries2.getKey();
        java.lang.String str9 = timeSeries2.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4");
        java.util.Collection collection12 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + '4' + "'", comparable8, '4');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        timeSeries2.setNotify(true);
        java.lang.String str12 = timeSeries2.getRangeDescription();
        timeSeries2.clear();
        java.lang.String str14 = timeSeries2.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        boolean boolean26 = timeSeries25.getNotify();
        java.lang.Class<?> wildcardClass27 = timeSeries25.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "", "Value", (java.lang.Class) wildcardClass27);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        timeSeries12.fireSeriesChanged();
        timeSeries12.setNotify(true);
        timeSeries12.setRangeDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener18);
        long long20 = timeSeries12.getMaximumItemAge();
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class22);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries23.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str27 = timeSeries23.getRangeDescription();
        int int28 = timeSeries23.getMaximumItemCount();
        timeSeries23.setDomainDescription("Value");
        java.lang.Class class31 = timeSeries23.getTimePeriodClass();
        java.lang.String str32 = timeSeries23.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries23.addChangeListener(seriesChangeListener33);
        timeSeries23.setMaximumItemCount((int) (byte) 1);
        java.util.List list37 = timeSeries23.getItems();
        boolean boolean38 = timeSeries12.equals((java.lang.Object) timeSeries23);
        java.lang.String str39 = timeSeries23.getDescription();
        java.lang.String str40 = timeSeries23.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        long long9 = timeSeries8.getMaximumItemAge();
        timeSeries8.setDescription("hi!");
        boolean boolean12 = timeSeries8.getNotify();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries8.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        int int22 = timeSeries20.getMaximumItemCount();
        java.util.List list23 = timeSeries20.getItems();
        timeSeries20.setMaximumItemAge((long) (byte) 100);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        timeSeries2.fireSeriesChanged();
        int int7 = timeSeries2.getItemCount();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.setMaximumItemAge(0L);
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str14 = timeSeries10.getRangeDescription();
        timeSeries10.setMaximumItemCount((int) ' ');
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener26);
        boolean boolean29 = timeSeries19.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries10.addAndOrUpdate(timeSeries19);
        timeSeries10.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries10.addChangeListener(seriesChangeListener33);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries10.removeChangeListener(seriesChangeListener35);
        java.lang.String str37 = timeSeries10.getDescription();
        timeSeries10.clear();
        timeSeries10.setRangeDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries10.removeChangeListener(seriesChangeListener41);
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class44);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries45.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class50);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries51.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries45.addAndOrUpdate(timeSeries54);
        boolean boolean57 = timeSeries55.equals((java.lang.Object) 0);
        timeSeries55.setMaximumItemCount((int) 'a');
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        timeSeries55.removePropertyChangeListener(propertyChangeListener60);
        java.util.Collection collection62 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        boolean boolean63 = timeSeries5.equals((java.lang.Object) collection62);
        java.lang.Class class64 = timeSeries5.getTimePeriodClass();
        java.util.List list65 = timeSeries5.getItems();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(class64);
        org.junit.Assert.assertNotNull(list65);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        timeSeries2.setDomainDescription("Time");
        timeSeries2.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries2.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries12.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        timeSeries12.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener18);
        timeSeries12.delete((int) (short) -1, 2147483647);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries12.addChangeListener(seriesChangeListener23);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str31 = timeSeries27.getRangeDescription();
        int int32 = timeSeries27.getMaximumItemCount();
        timeSeries27.setDomainDescription("Value");
        java.lang.Class class35 = timeSeries27.getTimePeriodClass();
        java.lang.String str36 = timeSeries27.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries27.removeChangeListener(seriesChangeListener37);
        timeSeries27.fireSeriesChanged();
        timeSeries27.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries27.addChangeListener(seriesChangeListener42);
        java.lang.Object obj44 = timeSeries27.clone();
        boolean boolean45 = timeSeries12.equals((java.lang.Object) timeSeries27);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries27.removeChangeListener(seriesChangeListener46);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries27.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
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
        timeSeries15.fireSeriesChanged();
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        long long23 = timeSeries22.getMaximumItemAge();
        timeSeries22.fireSeriesChanged();
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        long long28 = timeSeries27.getMaximumItemAge();
        timeSeries27.setDescription("hi!");
        boolean boolean31 = timeSeries27.getNotify();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries27);
        int int33 = timeSeries27.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries15.addAndOrUpdate(timeSeries27);
        int int35 = timeSeries27.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = timeSeries27.getValue(regularTimePeriod36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9223372036854775807L + "'", long28 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setDescription("Time");
        timeSeries2.removeAgedItems(true);
        timeSeries2.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries2.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = timeSeries2.getNotify();
        boolean boolean15 = timeSeries2.getNotify();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        long long18 = timeSeries11.getMaximumItemAge();
        timeSeries11.setNotify(true);
        java.util.Collection collection21 = timeSeries11.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries11);
        timeSeries11.setRangeDescription("Value");
        timeSeries11.setRangeDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod27, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        int int6 = timeSeries2.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener7);
        timeSeries2.setMaximumItemAge((long) '4');
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries13.addAndOrUpdate(timeSeries22);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries23.removeChangeListener(seriesChangeListener24);
        java.util.Collection collection26 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod27, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        timeSeries6.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries6.equals((java.lang.Object) timeSeries19);
        timeSeries6.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass25 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, (java.lang.Class) wildcardClass25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.addChangeListener(seriesChangeListener28);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries2.getDescription();
        java.util.List list30 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries2.removeChangeListener(seriesChangeListener31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries2.addChangeListener(seriesChangeListener33);
        timeSeries2.setNotify(false);
        timeSeries2.setDescription("");
        int int39 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries42 = timeSeries2.createCopy(regularTimePeriod40, regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        long long18 = timeSeries11.getMaximumItemAge();
        timeSeries11.setNotify(true);
        java.util.Collection collection21 = timeSeries11.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries11);
        timeSeries11.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod24, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries2.addChangeListener(seriesChangeListener29);
        java.lang.String str31 = timeSeries2.getDomainDescription();
        boolean boolean32 = timeSeries2.getNotify();
        timeSeries2.setRangeDescription("");
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class41);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries42.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class47);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries48.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries42.addAndOrUpdate(timeSeries51);
        java.lang.Class<?> wildcardClass53 = timeSeries42.getClass();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass53);
        java.lang.Class<?> wildcardClass55 = timeSeries54.getClass();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, (java.lang.Class) wildcardClass55);
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass55);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries2.addAndOrUpdate(timeSeries57);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Time" + "'", str31, "Time");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(timeSeries58);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        timeSeries10.removeAgedItems(false);
        timeSeries10.setRangeDescription("Value");
        timeSeries10.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries2.addAndOrUpdate(timeSeries10);
        timeSeries17.setDescription("Overwritten values from: 4");
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount((int) ' ');
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str35 = timeSeries31.getRangeDescription();
        timeSeries31.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries31.removePropertyChangeListener(propertyChangeListener38);
        boolean boolean41 = timeSeries31.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries22.addAndOrUpdate(timeSeries31);
        boolean boolean43 = timeSeries42.getNotify();
        timeSeries42.setMaximumItemCount((int) '#');
        timeSeries42.fireSeriesChanged();
        timeSeries42.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries17.addAndOrUpdate(timeSeries42);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(timeSeriesDataItem50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(timeSeries49);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        java.lang.Comparable comparable11 = timeSeries2.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) (byte) 10, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + '4' + "'", comparable11, '4');
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries2.addChangeListener(seriesChangeListener10);
        java.lang.String str12 = timeSeries2.getDomainDescription();
        boolean boolean13 = timeSeries2.getNotify();
        java.util.List list14 = timeSeries2.getItems();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.addChangeListener(seriesChangeListener14);
        int int16 = timeSeries2.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries2.addChangeListener(seriesChangeListener17);
        timeSeries2.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries2.removeChangeListener(seriesChangeListener21);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        boolean boolean23 = timeSeries22.isEmpty();
        java.lang.Object obj24 = timeSeries22.clone();
        java.util.Collection collection25 = timeSeries22.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener26);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.String str13 = timeSeries2.getDescription();
        int int14 = timeSeries2.getItemCount();
        timeSeries2.setDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries2.addChangeListener(seriesChangeListener17);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class22);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries23.addChangeListener(seriesChangeListener24);
        java.lang.String str26 = timeSeries23.getDescription();
        java.lang.String str27 = timeSeries23.getRangeDescription();
        java.util.Collection collection28 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        long long29 = timeSeries23.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.removeAgedItems((long) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
        timeSeries2.setDomainDescription("Value");
        java.lang.Comparable comparable21 = timeSeries2.getKey();
        java.lang.Class class22 = timeSeries2.getTimePeriodClass();
        timeSeries2.setRangeDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener25);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + '4' + "'", comparable21, '4');
        org.junit.Assert.assertNull(class22);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.clear();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries2.createCopy((int) (short) 10, (int) '4');
        boolean boolean14 = timeSeries13.isEmpty();
        java.lang.Comparable comparable15 = timeSeries13.getKey();
        java.lang.String str16 = timeSeries13.getRangeDescription();
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class25);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries26.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries35);
        java.lang.Class<?> wildcardClass37 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass37);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass37);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "hi!", (java.lang.Class) wildcardClass37);
        timeSeries40.setRangeDescription("Overwritten values from: 4");
        java.lang.String str43 = timeSeries40.getRangeDescription();
        java.lang.Object obj44 = timeSeries40.clone();
        java.lang.String str45 = timeSeries40.getRangeDescription();
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class47);
        long long49 = timeSeries48.getMaximumItemAge();
        timeSeries48.fireSeriesChanged();
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class52);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries53.createCopy((int) (byte) 10, (int) '#');
        timeSeries56.removeAgedItems(false);
        timeSeries56.setRangeDescription("Value");
        timeSeries56.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries48.addAndOrUpdate(timeSeries56);
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries40.addAndOrUpdate(timeSeries48);
        java.lang.Class class66 = null;
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class66);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries67.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str71 = timeSeries67.getRangeDescription();
        int int72 = timeSeries67.getMaximumItemCount();
        timeSeries67.setDomainDescription("Value");
        java.lang.Class class75 = timeSeries67.getTimePeriodClass();
        java.lang.String str76 = timeSeries67.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener77 = null;
        timeSeries67.addChangeListener(seriesChangeListener77);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener79 = null;
        timeSeries67.addChangeListener(seriesChangeListener79);
        int int81 = timeSeries67.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener82 = null;
        timeSeries67.addChangeListener(seriesChangeListener82);
        java.util.Collection collection84 = timeSeries67.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener85 = null;
        timeSeries67.removePropertyChangeListener(propertyChangeListener85);
        java.util.Collection collection87 = timeSeries64.getTimePeriodsUniqueToOtherSeries(timeSeries67);
        boolean boolean88 = timeSeries13.equals((java.lang.Object) collection87);
        java.lang.Class class89 = timeSeries13.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod90 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod90, (double) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + '4' + "'", comparable15, '4');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Overwritten values from: 4" + "'", str43, "Overwritten values from: 4");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Overwritten values from: 4" + "'", str45, "Overwritten values from: 4");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 9223372036854775807L + "'", long49 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Value" + "'", str71, "Value");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2147483647 + "'", int72 == 2147483647);
        org.junit.Assert.assertNull(class75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Value" + "'", str76, "Value");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2147483647 + "'", int81 == 2147483647);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(class89);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries12.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries12.addChangeListener(seriesChangeListener20);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str28 = timeSeries24.getRangeDescription();
        timeSeries24.setMaximumItemCount((int) ' ');
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str37 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries33.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean43 = timeSeries33.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries24.addAndOrUpdate(timeSeries33);
        timeSeries33.removeAgedItems(false);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class48);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries49.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str53 = timeSeries49.getRangeDescription();
        timeSeries49.setMaximumItemCount(0);
        java.lang.String str56 = timeSeries49.getRangeDescription();
        timeSeries49.clear();
        boolean boolean58 = timeSeries33.equals((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries12.addAndOrUpdate(timeSeries33);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        timeSeries33.addPropertyChangeListener(propertyChangeListener60);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = timeSeries33.addOrUpdate(regularTimePeriod62, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value" + "'", str53, "Value");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Value" + "'", str56, "Value");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        boolean boolean6 = timeSeries2.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener7);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount(0);
        java.lang.String str18 = timeSeries11.getRangeDescription();
        timeSeries11.clear();
        boolean boolean20 = timeSeries2.equals((java.lang.Object) timeSeries11);
        timeSeries11.fireSeriesChanged();
        timeSeries11.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        timeSeries24.setDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries24.addPropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        java.util.Collection collection31 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries11.addAndOrUpdate(timeSeries30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update(regularTimePeriod33, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(timeSeries32);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.List list7 = timeSeries4.getItems();
        timeSeries4.fireSeriesChanged();
        timeSeries4.setKey((java.lang.Comparable) 10);
        java.lang.Class class11 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries4.getDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.removeAgedItems(true);
        java.lang.String str12 = timeSeries5.getRangeDescription();
        timeSeries5.setNotify(true);
        java.lang.Class<?> wildcardClass15 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Value", "Time", (java.lang.Class) wildcardClass15);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries12.removeChangeListener(seriesChangeListener13);
        java.lang.String str15 = timeSeries12.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries12.removeChangeListener(seriesChangeListener16);
        java.lang.Comparable comparable18 = timeSeries12.getKey();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Overwritten values from: 4" + "'", comparable18, "Overwritten values from: 4");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries2.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = timeSeries2.getNotify();
        int int15 = timeSeries2.getMaximumItemCount();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str22 = timeSeries18.getRangeDescription();
        timeSeries18.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener25);
        timeSeries18.setDescription("Time");
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str35 = timeSeries31.getRangeDescription();
        timeSeries31.setMaximumItemCount((int) ' ');
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries40.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str44 = timeSeries40.getRangeDescription();
        timeSeries40.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        timeSeries40.removePropertyChangeListener(propertyChangeListener47);
        boolean boolean50 = timeSeries40.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries31.addAndOrUpdate(timeSeries40);
        java.util.Collection collection52 = timeSeries31.getTimePeriods();
        java.util.Collection collection53 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        boolean boolean54 = timeSeries2.equals((java.lang.Object) timeSeries31);
        java.lang.Comparable comparable55 = timeSeries2.getKey();
        boolean boolean56 = timeSeries2.getNotify();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Value" + "'", str44, "Value");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + comparable55 + "' != '" + '4' + "'", comparable55, '4');
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
            timeSeries11.delete((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries25.addAndOrUpdate(timeSeries34);
        java.lang.Class<?> wildcardClass36 = timeSeries25.getClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass36);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass36);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass36);
        timeSeries39.setMaximumItemAge((long) 10);
        java.lang.Class class42 = timeSeries39.getTimePeriodClass();
        java.util.Collection collection43 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries39.getDataItem(regularTimePeriod44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "", "Value", (java.lang.Class) wildcardClass34);
        timeSeries35.setDomainDescription("Overwritten values from: 4");
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
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries32.addChangeListener(seriesChangeListener33);
        boolean boolean35 = timeSeries19.equals((java.lang.Object) timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries12.addAndOrUpdate(timeSeries32);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class40);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries41.addChangeListener(seriesChangeListener42);
        java.util.Collection collection44 = timeSeries41.getTimePeriods();
        timeSeries41.setDomainDescription("Time");
        java.util.Collection collection47 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number49 = timeSeries41.getValue(regularTimePeriod48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(collection47);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.Comparable comparable4 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, (double) 52, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + ' ' + "'", comparable4, ' ');
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timeSeries2.getKey();
        timeSeries2.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod11, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + '4' + "'", comparable8, '4');
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timeSeries2.getKey();
        java.lang.String str9 = timeSeries2.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.removeChangeListener(seriesChangeListener12);
        timeSeries2.clear();
        boolean boolean15 = timeSeries2.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + '4' + "'", comparable8, '4');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries2.getDescription();
        timeSeries2.clear();
        timeSeries2.setRangeDescription("");
        timeSeries2.setNotify(true);
        timeSeries2.setDescription("Overwritten values from: 4");
        java.lang.Comparable comparable37 = timeSeries2.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = timeSeries2.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + '4' + "'", comparable37, '4');
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
        boolean boolean23 = timeSeries22.getNotify();
        timeSeries22.setMaximumItemCount((int) '#');
        timeSeries22.fireSeriesChanged();
        timeSeries22.setDomainDescription("");
        boolean boolean29 = timeSeries22.getNotify();
        java.lang.String str30 = timeSeries22.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        boolean boolean7 = timeSeries4.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener8);
        java.lang.Object obj10 = timeSeries4.clone();
        timeSeries4.setMaximumItemAge(97L);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        long long18 = timeSeries11.getMaximumItemAge();
        timeSeries11.setNotify(true);
        java.util.Collection collection21 = timeSeries11.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries22.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries2.getDescription();
        java.util.List list30 = timeSeries2.getItems();
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str37 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount((int) ' ');
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class41);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries42.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str46 = timeSeries42.getRangeDescription();
        timeSeries42.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries42.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean52 = timeSeries42.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries33.addAndOrUpdate(timeSeries42);
        timeSeries33.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries33.addChangeListener(seriesChangeListener56);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        timeSeries33.removeChangeListener(seriesChangeListener58);
        java.lang.String str60 = timeSeries33.getDescription();
        java.util.List list61 = timeSeries33.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries33.removeChangeListener(seriesChangeListener62);
        timeSeries33.setRangeDescription("hi!");
        java.lang.Object obj66 = timeSeries33.clone();
        java.util.Collection collection67 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries33);
        java.util.Collection collection68 = timeSeries2.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value" + "'", str46, "Value");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timeSeries2.getKey();
        timeSeries2.setKey((java.lang.Comparable) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener11);
        timeSeries2.setKey((java.lang.Comparable) "");
        java.lang.Comparable comparable15 = timeSeries2.getKey();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + '4' + "'", comparable8, '4');
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "" + "'", comparable15, "");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount(0);
        java.lang.String str10 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        timeSeries3.setNotify(true);
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass14);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        boolean boolean26 = timeSeries19.getNotify();
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries15.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(timeSeriesDataItem29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        int int9 = timeSeries2.getMaximumItemCount();
        timeSeries2.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = null; // flaky: timeSeries2.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries2.addChangeListener(seriesChangeListener14);
        int int16 = timeSeries2.getMaximumItemCount();
        java.util.List list17 = timeSeries2.getItems();
        java.lang.Class class18 = timeSeries2.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries2.removeChangeListener(seriesChangeListener19);
        java.lang.String str21 = timeSeries2.getDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        timeSeries13.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener20);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        boolean boolean29 = timeSeries13.equals((java.lang.Object) timeSeries26);
        timeSeries13.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass32 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "", (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "Value", "Overwritten values from: 4", (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, (java.lang.Class) wildcardClass32);
        java.util.List list38 = timeSeries37.getItems();
        java.util.List list39 = timeSeries37.getItems();
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Comparable comparable7 = timeSeries4.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries4.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        timeSeries5.setRangeDescription("Value");
        timeSeries5.removeAgedItems(false);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener12);
        java.lang.String str14 = timeSeries5.getDescription();
        boolean boolean15 = timeSeries5.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        timeSeries2.setDomainDescription("Time");
        timeSeries2.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod16, (double) 2147483647, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.removeChangeListener(seriesChangeListener12);
        timeSeries2.fireSeriesChanged();
        timeSeries2.setMaximumItemCount(100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod17, (java.lang.Number) 97L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        boolean boolean6 = timeSeries2.getNotify();
        timeSeries2.setMaximumItemAge((long) (short) 10);
        int int9 = timeSeries2.getItemCount();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        timeSeries12.fireSeriesChanged();
        timeSeries12.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries12.removeChangeListener(seriesChangeListener16);
        timeSeries12.clear();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.removeChangeListener(seriesChangeListener12);
        timeSeries2.fireSeriesChanged();
        timeSeries2.setMaximumItemCount(100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod17, (double) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        boolean boolean12 = timeSeries2.getNotify();
        long long13 = timeSeries2.getMaximumItemAge();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class17);
        java.util.List list19 = timeSeries18.getItems();
        java.lang.String str20 = timeSeries18.getRangeDescription();
        java.util.Collection collection21 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        int int22 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries2.addOrUpdate(regularTimePeriod23, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries2.getDescription();
        java.util.List list30 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries2.removeChangeListener(seriesChangeListener31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries2.addChangeListener(seriesChangeListener33);
        timeSeries2.setNotify(false);
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class42);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries43.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class48);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries49.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries43.addAndOrUpdate(timeSeries52);
        java.lang.Class<?> wildcardClass54 = timeSeries43.getClass();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass54);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "Value", "Overwritten values from: 4", (java.lang.Class) wildcardClass54);
        boolean boolean57 = timeSeries2.equals((java.lang.Object) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries2.createCopy(0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(timeSeries60);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        java.lang.String str12 = timeSeries2.getRangeDescription();
        timeSeries2.setRangeDescription("Value");
        timeSeries2.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class6);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.String str9 = timeSeries7.getRangeDescription();
        timeSeries7.setMaximumItemCount(1);
        java.lang.Class<?> wildcardClass12 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "Overwritten values from: 4", "hi!", (java.lang.Class) wildcardClass12);
        int int14 = timeSeries13.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries2.getDescription();
        java.util.List list30 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries2.removeChangeListener(seriesChangeListener31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries2.addChangeListener(seriesChangeListener33);
        java.lang.String str35 = timeSeries2.getDescription();
        java.lang.String str36 = timeSeries2.getDomainDescription();
        java.lang.String str37 = timeSeries2.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Time" + "'", str36, "Time");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        boolean boolean19 = timeSeries2.getNotify();
        boolean boolean20 = timeSeries2.isEmpty();
        java.lang.Object obj21 = timeSeries2.clone();
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        java.util.Collection collection29 = timeSeries26.getTimePeriods();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str36 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount((int) ' ');
        timeSeries32.setMaximumItemAge((long) (short) 100);
        timeSeries32.setMaximumItemCount(100);
        java.util.Collection collection43 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries2.addAndOrUpdate(timeSeries26);
        int int45 = timeSeries44.getMaximumItemCount();
        long long46 = timeSeries44.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 9223372036854775807L + "'", long46 == 9223372036854775807L);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemAge((long) (short) 1);
        java.lang.String str4 = timeSeries1.getDomainDescription();
        java.lang.Class class5 = timeSeries1.getTimePeriodClass();
        java.lang.Object obj6 = timeSeries1.clone();
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        java.lang.Class<?> wildcardClass17 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "Overwritten values from: 4", "Value", (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.addAndOrUpdate(timeSeries18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries4.equals((java.lang.Object) timeSeries18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries4.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        boolean boolean17 = timeSeries12.isEmpty();
        java.lang.Class class18 = timeSeries12.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries12.addChangeListener(seriesChangeListener19);
        timeSeries12.setKey((java.lang.Comparable) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener23);
        java.lang.Class class25 = timeSeries12.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(class18);
        org.junit.Assert.assertNull(class25);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        timeSeries2.setDomainDescription("Value");
        java.lang.Comparable comparable21 = timeSeries2.getKey();
        java.util.Collection collection22 = timeSeries2.getTimePeriods();
        timeSeries2.fireSeriesChanged();
        long long24 = timeSeries2.getMaximumItemAge();
        java.lang.String str25 = timeSeries2.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + '4' + "'", comparable21, '4');
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        long long18 = timeSeries11.getMaximumItemAge();
        timeSeries11.setNotify(true);
        java.util.Collection collection21 = timeSeries11.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries11);
        timeSeries11.setRangeDescription("Value");
        timeSeries11.setRangeDescription("Time");
        timeSeries11.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries11.createCopy(32, 32);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
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
        boolean boolean19 = timeSeries2.getNotify();
        boolean boolean20 = timeSeries2.isEmpty();
        java.lang.Object obj21 = timeSeries2.clone();
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        java.util.Collection collection29 = timeSeries26.getTimePeriods();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str36 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount((int) ' ');
        timeSeries32.setMaximumItemAge((long) (short) 100);
        timeSeries32.setMaximumItemCount(100);
        java.util.Collection collection43 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries2.addAndOrUpdate(timeSeries26);
        boolean boolean45 = timeSeries2.getNotify();
        java.lang.Class class46 = timeSeries2.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = timeSeries2.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(class46);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
        timeSeries12.setMaximumItemAge((long) (byte) 100);
        java.lang.String str19 = timeSeries12.getRangeDescription();
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener31);
        java.lang.Class class33 = timeSeries30.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries22.addAndOrUpdate(timeSeries30);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries12.addAndOrUpdate(timeSeries22);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries35.removeChangeListener(seriesChangeListener36);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries35);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean7 = timeSeries2.isEmpty();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        long long11 = timeSeries10.getMaximumItemAge();
        timeSeries10.fireSeriesChanged();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        long long16 = timeSeries15.getMaximumItemAge();
        timeSeries15.setDescription("hi!");
        boolean boolean19 = timeSeries15.getNotify();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries15);
        int int21 = timeSeries20.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        timeSeries20.removeAgedItems(false);
        boolean boolean26 = timeSeries2.equals((java.lang.Object) false);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener27);
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str35 = timeSeries31.getRangeDescription();
        int int36 = timeSeries31.getMaximumItemCount();
        timeSeries31.setDomainDescription("Value");
        java.lang.Class class39 = timeSeries31.getTimePeriodClass();
        java.lang.String str40 = timeSeries31.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries31.removeChangeListener(seriesChangeListener41);
        timeSeries31.fireSeriesChanged();
        timeSeries31.clear();
        java.util.Collection collection45 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class47);
        long long49 = timeSeries48.getMaximumItemAge();
        timeSeries48.setDescription("hi!");
        boolean boolean52 = timeSeries48.getNotify();
        boolean boolean53 = timeSeries48.getNotify();
        timeSeries48.setDomainDescription("");
        timeSeries48.setNotify(false);
        java.util.List list58 = timeSeries48.getItems();
        int int59 = timeSeries48.getMaximumItemCount();
        java.util.Collection collection60 = timeSeries31.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNull(class39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 9223372036854775807L + "'", long49 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
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
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "Time", "Value", (java.lang.Class) wildcardClass34);
        timeSeries35.fireSeriesChanged();
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class38);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries39.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class44);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries45.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries39.addAndOrUpdate(timeSeries48);
        boolean boolean51 = timeSeries49.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries49.removeChangeListener(seriesChangeListener52);
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
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries49.addAndOrUpdate(timeSeries69);
        java.lang.Class class77 = null;
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class77);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener79 = null;
        timeSeries78.addChangeListener(seriesChangeListener79);
        java.util.Collection collection81 = timeSeries78.getTimePeriods();
        timeSeries78.setDomainDescription("Time");
        java.util.Collection collection84 = timeSeries69.getTimePeriodsUniqueToOtherSeries(timeSeries78);
        org.jfree.data.time.TimeSeries timeSeries85 = timeSeries35.addAndOrUpdate(timeSeries69);
        timeSeries85.setDescription("hi!");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Value" + "'", str60, "Value");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(timeSeries85);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        timeSeries25.setDomainDescription("Value");
        timeSeries25.fireSeriesChanged();
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
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.util.List list18 = timeSeries17.getItems();
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        java.util.List list20 = timeSeries17.getItems();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener21);
        timeSeries17.setMaximumItemCount((int) '4');
        java.lang.Comparable comparable25 = timeSeries17.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries17.addChangeListener(seriesChangeListener26);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + '#' + "'", comparable25, '#');
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        int int10 = timeSeries2.getItemCount();
        java.lang.Object obj11 = null;
        boolean boolean12 = timeSeries2.equals(obj11);
        long long13 = timeSeries2.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries32.addChangeListener(seriesChangeListener33);
        boolean boolean35 = timeSeries19.equals((java.lang.Object) timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries12.addAndOrUpdate(timeSeries32);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class40);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries41.addChangeListener(seriesChangeListener42);
        java.lang.String str44 = timeSeries41.getDescription();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries12.addAndOrUpdate(timeSeries41);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener48);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem51 = timeSeries12.getDataItem(regularTimePeriod50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(timeSeries45);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.removeChangeListener(seriesChangeListener12);
        timeSeries2.fireSeriesChanged();
        timeSeries2.setDescription("Time");
        timeSeries2.setMaximumItemAge((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = timeSeries2.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        java.lang.Class<?> wildcardClass21 = timeSeries19.getClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass21);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "Overwritten values from: 4", "Overwritten values from: 4", (java.lang.Class) wildcardClass21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Overwritten values from: 4", "", (java.lang.Class) wildcardClass21);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        long long28 = timeSeries27.getMaximumItemAge();
        timeSeries27.fireSeriesChanged();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        long long33 = timeSeries32.getMaximumItemAge();
        timeSeries32.setDescription("hi!");
        boolean boolean36 = timeSeries32.getNotify();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries32);
        int int38 = timeSeries32.getItemCount();
        boolean boolean39 = timeSeries32.isEmpty();
        java.util.Collection collection40 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        timeSeries24.clear();
        java.lang.String str42 = timeSeries24.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9223372036854775807L + "'", long28 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        boolean boolean10 = timeSeries4.getNotify();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        boolean boolean18 = timeSeries13.isEmpty();
        timeSeries13.clear();
        java.lang.Object obj20 = timeSeries13.clone();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries4.addAndOrUpdate(timeSeries13);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        java.util.Collection collection29 = timeSeries26.getTimePeriods();
        timeSeries26.setDomainDescription("Time");
        java.lang.Class class32 = timeSeries26.getTimePeriodClass();
        java.util.Collection collection33 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries4.addOrUpdate(regularTimePeriod34, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(class32);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        timeSeries2.setDomainDescription("Overwritten values from: 4");
        java.lang.String str15 = timeSeries2.getRangeDescription();
        boolean boolean16 = timeSeries2.getNotify();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L);
        timeSeries1.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str12 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount((int) ' ');
        timeSeries8.setMaximumItemAge((long) (short) 100);
        java.lang.String str17 = timeSeries8.getDomainDescription();
        timeSeries8.setMaximumItemAge((long) 100);
        java.lang.String str20 = timeSeries8.getDescription();
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str14 = timeSeries10.getRangeDescription();
        timeSeries10.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener17);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class22);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries23.addChangeListener(seriesChangeListener24);
        boolean boolean26 = timeSeries10.equals((java.lang.Object) timeSeries23);
        timeSeries10.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass29 = timeSeries10.getClass();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass29);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass29);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass29);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "Time", (java.lang.Class) wildcardClass29);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = timeSeries33.getIndex(regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        timeSeries2.setRangeDescription("hi!");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        timeSeries1.setMaximumItemCount((int) (byte) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str12 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount((int) ' ');
        timeSeries8.setMaximumItemAge((long) (short) 100);
        int int17 = timeSeries8.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.addAndOrUpdate(timeSeries8);
        timeSeries1.setDomainDescription("Value");
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!");
        timeSeries1.setRangeDescription("Value");
        java.util.List list4 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) (-1.0f));
        timeSeries1.setNotify(false);
        java.util.List list9 = timeSeries1.getItems();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries2.getDescription();
        timeSeries2.clear();
        int int31 = timeSeries2.getItemCount();
        int int32 = timeSeries2.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "", "Overwritten values from: 4", (java.lang.Class) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null; // flaky: timeSeries17.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.lang.Comparable comparable0 = null;
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries17);
        java.lang.Class<?> wildcardClass19 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries(comparable0, (java.lang.Class) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        timeSeries12.setMaximumItemAge((long) (byte) 100);
        java.lang.String str19 = timeSeries12.getRangeDescription();
        timeSeries12.setRangeDescription("Time");
        int int22 = timeSeries12.getMaximumItemCount();
        java.util.Collection collection23 = timeSeries12.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = timeSeries12.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        timeSeries2.setNotify(true);
        java.util.Collection collection12 = timeSeries2.getTimePeriods();
        java.lang.Class class13 = timeSeries2.getTimePeriodClass();
        boolean boolean14 = timeSeries2.getNotify();
        java.util.Collection collection15 = timeSeries2.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        java.lang.String str8 = timeSeries2.getRangeDescription();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.Object obj5 = timeSeries1.clone();
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class10);
        java.util.List list12 = timeSeries11.getItems();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        long long16 = timeSeries15.getMaximumItemAge();
        timeSeries15.setDescription("hi!");
        boolean boolean19 = timeSeries15.getNotify();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class23);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries24.addChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries15.addAndOrUpdate(timeSeries24);
        java.util.Collection collection28 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        int int29 = timeSeries27.getMaximumItemCount();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str36 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries32.addPropertyChangeListener(propertyChangeListener39);
        timeSeries32.setDescription("Time");
        timeSeries32.setMaximumItemAge((long) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries27.addAndOrUpdate(timeSeries32);
        timeSeries45.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries1.addAndOrUpdate(timeSeries45);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries45.add(timeSeriesDataItem49, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(timeSeries48);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        boolean boolean7 = timeSeries4.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener8);
        java.lang.Object obj10 = timeSeries4.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.createCopy(regularTimePeriod11, regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        int int8 = timeSeries5.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries5.createCopy(0, 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.setKey((java.lang.Comparable) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries2.removeChangeListener(seriesChangeListener15);
        boolean boolean17 = timeSeries2.isEmpty();
        java.util.List list18 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries2.removeChangeListener(seriesChangeListener19);
        timeSeries2.clear();
        java.lang.String str22 = timeSeries2.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries2.getDescription();
        timeSeries2.clear();
        timeSeries2.setRangeDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries2.removeChangeListener(seriesChangeListener33);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class36);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries37.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class42);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries43.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries37.addAndOrUpdate(timeSeries46);
        boolean boolean49 = timeSeries47.equals((java.lang.Object) 0);
        timeSeries47.setMaximumItemCount((int) 'a');
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        timeSeries47.removePropertyChangeListener(propertyChangeListener52);
        java.util.Collection collection54 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries47);
        java.lang.String str55 = timeSeries2.getDomainDescription();
        timeSeries2.setMaximumItemCount(1);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Time" + "'", str55, "Time");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj14 = timeSeries13.clone();
        java.lang.String str15 = timeSeries13.getDescription();
        int int16 = timeSeries13.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries13.createCopy(0, 100);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries4.addAndOrUpdate(timeSeries13);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems((long) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries20);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        int int8 = timeSeries5.getItemCount();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class12);
        java.util.List list14 = timeSeries13.getItems();
        timeSeries13.setDomainDescription("Time");
        timeSeries13.fireSeriesChanged();
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str24 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount((int) ' ');
        long long27 = timeSeries20.getMaximumItemAge();
        timeSeries20.setNotify(true);
        java.util.Collection collection30 = timeSeries20.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries13.addAndOrUpdate(timeSeries20);
        timeSeries13.setDescription("hi!");
        java.util.Collection collection34 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection34);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.util.List list18 = timeSeries17.getItems();
        java.util.Collection collection19 = timeSeries17.getTimePeriods();
        timeSeries17.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries17.addChangeListener(seriesChangeListener21);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        timeSeries13.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener20);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        boolean boolean29 = timeSeries13.equals((java.lang.Object) timeSeries26);
        timeSeries13.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass32 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "", (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "Value", "Overwritten values from: 4", (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, (java.lang.Class) wildcardClass32);
        java.lang.String str38 = timeSeries37.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, class1);
        timeSeries2.fireSeriesChanged();
        java.lang.String str4 = timeSeries2.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        boolean boolean7 = timeSeries4.isEmpty();
        int int8 = timeSeries4.getItemCount();
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getMaximumItemCount();
        boolean boolean11 = timeSeries4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.createCopy((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries2.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = timeSeries2.getNotify();
        int int15 = timeSeries2.getMaximumItemCount();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str22 = timeSeries18.getRangeDescription();
        timeSeries18.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener25);
        timeSeries18.setDescription("Time");
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str35 = timeSeries31.getRangeDescription();
        timeSeries31.setMaximumItemCount((int) ' ');
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries40.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str44 = timeSeries40.getRangeDescription();
        timeSeries40.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        timeSeries40.removePropertyChangeListener(propertyChangeListener47);
        boolean boolean50 = timeSeries40.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries31.addAndOrUpdate(timeSeries40);
        java.util.Collection collection52 = timeSeries31.getTimePeriods();
        java.util.Collection collection53 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        boolean boolean54 = timeSeries2.equals((java.lang.Object) timeSeries31);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem55, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Value" + "'", str44, "Value");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        boolean boolean17 = timeSeries12.isEmpty();
        java.util.Collection collection18 = timeSeries12.getTimePeriods();
        java.lang.Comparable comparable19 = timeSeries12.getKey();
        java.lang.String str20 = timeSeries12.getDomainDescription();
        boolean boolean21 = timeSeries12.getNotify();
        java.lang.Class class22 = timeSeries12.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Overwritten values from: 4" + "'", comparable19, "Overwritten values from: 4");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(class22);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        long long9 = timeSeries8.getMaximumItemAge();
        timeSeries8.setDescription("hi!");
        boolean boolean12 = timeSeries8.getNotify();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries8.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        java.lang.Class class22 = timeSeries4.getTimePeriodClass();
        timeSeries4.clear();
        java.lang.Comparable comparable24 = timeSeries4.getKey();
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class33);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries34.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries40.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries34.addAndOrUpdate(timeSeries43);
        java.lang.Class<?> wildcardClass45 = timeSeries34.getClass();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "hi!", (java.lang.Class) wildcardClass45);
        int int49 = timeSeries48.getItemCount();
        java.lang.String str50 = timeSeries48.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries48.removeChangeListener(seriesChangeListener51);
        java.util.Collection collection53 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 1 + "'", comparable24, 1);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries12.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        boolean boolean16 = timeSeries12.isEmpty();
        long long17 = timeSeries12.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries12.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries12.addChangeListener(seriesChangeListener20);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str28 = timeSeries24.getRangeDescription();
        timeSeries24.setMaximumItemCount((int) ' ');
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str37 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries33.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean43 = timeSeries33.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries24.addAndOrUpdate(timeSeries33);
        timeSeries33.removeAgedItems(false);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class48);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries49.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str53 = timeSeries49.getRangeDescription();
        timeSeries49.setMaximumItemCount(0);
        java.lang.String str56 = timeSeries49.getRangeDescription();
        timeSeries49.clear();
        boolean boolean58 = timeSeries33.equals((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries12.addAndOrUpdate(timeSeries33);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete(52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value" + "'", str53, "Value");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Value" + "'", str56, "Value");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.util.List list18 = timeSeries17.getItems();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str25 = timeSeries21.getRangeDescription();
        boolean boolean26 = timeSeries17.equals((java.lang.Object) timeSeries21);
        timeSeries17.setMaximumItemCount(1);
        int int29 = timeSeries17.getMaximumItemCount();
        java.lang.Object obj30 = timeSeries17.clone();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries2.addChangeListener(seriesChangeListener29);
        java.lang.String str31 = timeSeries2.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        timeSeries33.setDomainDescription("hi!");
        boolean boolean36 = timeSeries2.equals((java.lang.Object) "hi!");
        int int37 = timeSeries2.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Time" + "'", str31, "Time");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(0);
        java.lang.String str9 = timeSeries2.getRangeDescription();
        timeSeries2.clear();
        boolean boolean11 = timeSeries2.getNotify();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries23);
        int int25 = timeSeries23.getMaximumItemCount();
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
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries37.removePropertyChangeListener(propertyChangeListener44);
        boolean boolean47 = timeSeries37.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries28.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries23.addAndOrUpdate(timeSeries48);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries2.addAndOrUpdate(timeSeries23);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        timeSeries50.removePropertyChangeListener(propertyChangeListener51);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value" + "'", str41, "Value");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(timeSeries50);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str14 = timeSeries10.getRangeDescription();
        timeSeries10.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener17);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class22);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries23.addChangeListener(seriesChangeListener24);
        boolean boolean26 = timeSeries10.equals((java.lang.Object) timeSeries23);
        timeSeries10.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass29 = timeSeries10.getClass();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Value", "Time", (java.lang.Class) wildcardClass29);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass29);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass29);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "Time", (java.lang.Class) wildcardClass29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries33.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        java.util.Collection collection17 = timeSeries12.getTimePeriods();
        timeSeries12.setDomainDescription("Time");
        java.lang.Class class20 = timeSeries12.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries22.removePropertyChangeListener(propertyChangeListener23);
        int int25 = timeSeries22.getMaximumItemCount();
        timeSeries22.setKey((java.lang.Comparable) 10.0f);
        java.util.Collection collection28 = timeSeries22.getTimePeriods();
        java.util.Collection collection29 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        boolean boolean30 = timeSeries12.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update((int) (byte) 0, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries17);
        java.lang.Class<?> wildcardClass19 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass19);
        java.util.List list21 = timeSeries20.getItems();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str28 = timeSeries24.getRangeDescription();
        boolean boolean29 = timeSeries20.equals((java.lang.Object) timeSeries24);
        java.lang.Class<?> wildcardClass30 = timeSeries24.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "", "", (java.lang.Class) wildcardClass30);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries7.addAndOrUpdate(timeSeries16);
        java.lang.Class<?> wildcardClass18 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass18);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass18);
        timeSeries21.fireSeriesChanged();
        java.lang.String str23 = timeSeries21.getDescription();
        boolean boolean24 = timeSeries21.isEmpty();
        java.lang.String str25 = timeSeries21.getDomainDescription();
        long long26 = timeSeries21.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener8);
        timeSeries5.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries5.createCopy((int) (byte) 10, (int) '4');
        boolean boolean15 = timeSeries14.getNotify();
        timeSeries14.setRangeDescription("Overwritten values from: 4");
        boolean boolean18 = timeSeries14.getNotify();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class8);
        java.util.Collection collection10 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        java.lang.String str11 = timeSeries9.getDescription();
        int int12 = timeSeries9.getItemCount();
        java.lang.String str13 = timeSeries9.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries9.addOrUpdate(regularTimePeriod14, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class8);
        java.util.Collection collection10 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        timeSeries13.setMaximumItemCount(0);
        java.lang.String str20 = timeSeries13.getRangeDescription();
        timeSeries13.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries9.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries13.addOrUpdate(regularTimePeriod23, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        timeSeries2.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod15, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries5.addChangeListener(seriesChangeListener6);
        java.lang.Class<?> wildcardClass8 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass8);
        int int10 = timeSeries9.getItemCount();
        timeSeries9.setRangeDescription("");
        timeSeries9.removeAgedItems(true);
        timeSeries9.setNotify(false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "hi!", (java.lang.Class) wildcardClass20);
        int int24 = timeSeries23.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries23.removeChangeListener(seriesChangeListener25);
        java.lang.String str27 = timeSeries23.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries23.getDataItem(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) ' ');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener19);
        boolean boolean22 = timeSeries12.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.addAndOrUpdate(timeSeries12);
        timeSeries3.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries3.addChangeListener(seriesChangeListener26);
        java.lang.Class<?> wildcardClass28 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass28);
        java.util.Collection collection30 = timeSeries29.getTimePeriods();
        int int31 = timeSeries29.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        java.lang.String str10 = timeSeries5.getDomainDescription();
        timeSeries5.setDescription("");
        java.lang.Class class13 = timeSeries5.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.delete((int) (byte) 1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        boolean boolean10 = timeSeries4.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null; // flaky: timeSeries4.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
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
        timeSeries2.setDomainDescription("Value");
        java.lang.Comparable comparable21 = timeSeries2.getKey();
        java.lang.Class class22 = timeSeries2.getTimePeriodClass();
        timeSeries2.setRangeDescription("Time");
        long long25 = timeSeries2.getMaximumItemAge();
        timeSeries2.setRangeDescription("");
        boolean boolean28 = timeSeries2.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + '4' + "'", comparable21, '4');
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9223372036854775807L + "'", long25 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        timeSeries2.setDomainDescription("Overwritten values from: 4");
        timeSeries2.setNotify(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries2.addChangeListener(seriesChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        java.lang.Class<?> wildcardClass27 = timeSeries16.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "", "hi!", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Overwritten values from: 4", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, "Overwritten values from: 4", "Overwritten values from: 4", (java.lang.Class) wildcardClass27);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries33.addPropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries33.add(timeSeriesDataItem36, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
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
        timeSeries12.setMaximumItemAge((long) (byte) 100);
        java.lang.String str19 = timeSeries12.getRangeDescription();
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener31);
        java.lang.Class class33 = timeSeries30.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries22.addAndOrUpdate(timeSeries30);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries12.addAndOrUpdate(timeSeries22);
        java.lang.String str36 = timeSeries12.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        boolean boolean6 = timeSeries2.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener7);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount(0);
        java.lang.String str18 = timeSeries11.getRangeDescription();
        timeSeries11.clear();
        boolean boolean20 = timeSeries2.equals((java.lang.Object) timeSeries11);
        timeSeries11.fireSeriesChanged();
        timeSeries11.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str12 = timeSeries8.getRangeDescription();
        java.lang.Class<?> wildcardClass13 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "Overwritten values from: 4", "Value", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, "Overwritten values from: 4", "Value", (java.lang.Class) wildcardClass13);
        java.lang.Class class16 = timeSeries15.getTimePeriodClass();
        timeSeries15.setDescription("Value");
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(class16);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries12.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        timeSeries12.removeAgedItems(true);
        timeSeries12.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries12.addChangeListener(seriesChangeListener20);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str28 = timeSeries24.getRangeDescription();
        timeSeries24.setMaximumItemCount((int) ' ');
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str37 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries33.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean43 = timeSeries33.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries24.addAndOrUpdate(timeSeries33);
        timeSeries33.removeAgedItems(false);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class48);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries49.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str53 = timeSeries49.getRangeDescription();
        timeSeries49.setMaximumItemCount(0);
        java.lang.String str56 = timeSeries49.getRangeDescription();
        timeSeries49.clear();
        boolean boolean58 = timeSeries33.equals((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries12.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries33.update(regularTimePeriod60, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value" + "'", str53, "Value");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Value" + "'", str56, "Value");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries32.addChangeListener(seriesChangeListener33);
        boolean boolean35 = timeSeries19.equals((java.lang.Object) timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries12.addAndOrUpdate(timeSeries32);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class40);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries41.addChangeListener(seriesChangeListener42);
        java.lang.String str44 = timeSeries41.getDescription();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries12.addAndOrUpdate(timeSeries41);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener48);
        java.lang.String str50 = timeSeries12.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Time" + "'", str50, "Time");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        boolean boolean11 = timeSeries2.isEmpty();
        java.lang.String str12 = timeSeries2.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod13, (java.lang.Number) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries12.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener14);
        java.lang.String str16 = timeSeries12.getDomainDescription();
        java.lang.String str17 = timeSeries12.getDomainDescription();
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class21);
        timeSeries22.setRangeDescription("hi!");
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class26);
        java.util.Collection collection28 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        java.lang.String str29 = timeSeries27.getDescription();
        java.lang.Comparable comparable30 = timeSeries27.getKey();
        java.util.Collection collection31 = timeSeries27.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries12.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries32.addOrUpdate(regularTimePeriod33, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + true + "'", comparable30, true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(timeSeries32);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.removeAgedItems(true);
        boolean boolean9 = timeSeries2.isEmpty();
        java.lang.String str10 = timeSeries2.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod11, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj7 = timeSeries6.clone();
        java.lang.String str8 = timeSeries6.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timeSeries6.getDomainDescription();
        timeSeries6.setDescription("");
        java.lang.Class<?> wildcardClass14 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, (java.lang.Class) wildcardClass14);
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
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class34);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries35.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str39 = timeSeries35.getRangeDescription();
        timeSeries35.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries35.addPropertyChangeListener(propertyChangeListener42);
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class47);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries48.addChangeListener(seriesChangeListener49);
        boolean boolean51 = timeSeries35.equals((java.lang.Object) timeSeries48);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries28.addAndOrUpdate(timeSeries48);
        java.lang.Class class56 = null;
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class56);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        timeSeries57.addChangeListener(seriesChangeListener58);
        java.lang.String str60 = timeSeries57.getDescription();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries28.addAndOrUpdate(timeSeries57);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries15.addAndOrUpdate(timeSeries61);
        timeSeries61.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries62);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.removeAgedItems(true);
        java.lang.String str9 = timeSeries2.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null; // flaky: timeSeries2.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.setMaximumItemAge(0L);
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str14 = timeSeries10.getRangeDescription();
        timeSeries10.setMaximumItemCount((int) ' ');
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener26);
        boolean boolean29 = timeSeries19.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries10.addAndOrUpdate(timeSeries19);
        timeSeries10.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries10.addChangeListener(seriesChangeListener33);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries10.removeChangeListener(seriesChangeListener35);
        java.lang.String str37 = timeSeries10.getDescription();
        timeSeries10.clear();
        timeSeries10.setRangeDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries10.removeChangeListener(seriesChangeListener41);
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class44);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries45.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class50);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries51.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries45.addAndOrUpdate(timeSeries54);
        boolean boolean57 = timeSeries55.equals((java.lang.Object) 0);
        timeSeries55.setMaximumItemCount((int) 'a');
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        timeSeries55.removePropertyChangeListener(propertyChangeListener60);
        java.util.Collection collection62 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        boolean boolean63 = timeSeries5.equals((java.lang.Object) collection62);
        java.util.Collection collection64 = timeSeries5.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = timeSeries5.getDataItem(regularTimePeriod65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries7.addAndOrUpdate(timeSeries16);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        java.lang.Class<?> wildcardClass19 = timeSeries17.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "", "Value", (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass19);
        int int23 = timeSeries22.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.delete(2147483647, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.Object obj5 = timeSeries1.clone();
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class10);
        java.util.List list12 = timeSeries11.getItems();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        long long16 = timeSeries15.getMaximumItemAge();
        timeSeries15.setDescription("hi!");
        boolean boolean19 = timeSeries15.getNotify();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class23);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries24.addChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries15.addAndOrUpdate(timeSeries24);
        java.util.Collection collection28 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        int int29 = timeSeries27.getMaximumItemCount();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str36 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries32.addPropertyChangeListener(propertyChangeListener39);
        timeSeries32.setDescription("Time");
        timeSeries32.setMaximumItemAge((long) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries27.addAndOrUpdate(timeSeries32);
        timeSeries45.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries1.addAndOrUpdate(timeSeries45);
        timeSeries48.setKey((java.lang.Comparable) 100.0f);
        java.lang.String str51 = timeSeries48.getDescription();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries2.addChangeListener(seriesChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries2.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries2.getDescription();
        java.util.List list30 = timeSeries2.getItems();
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str37 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount((int) ' ');
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class41);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries42.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str46 = timeSeries42.getRangeDescription();
        timeSeries42.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries42.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean52 = timeSeries42.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries33.addAndOrUpdate(timeSeries42);
        timeSeries33.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries33.addChangeListener(seriesChangeListener56);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        timeSeries33.removeChangeListener(seriesChangeListener58);
        java.lang.String str60 = timeSeries33.getDescription();
        java.util.List list61 = timeSeries33.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries33.removeChangeListener(seriesChangeListener62);
        timeSeries33.setRangeDescription("hi!");
        java.lang.Object obj66 = timeSeries33.clone();
        java.util.Collection collection67 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries33);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem68 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem68);
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value" + "'", str46, "Value");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f);
        timeSeries1.setDescription("");
        java.lang.String str4 = timeSeries1.getDescription();
        timeSeries1.setDomainDescription("Overwritten values from: 4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        timeSeries2.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod5, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        boolean boolean17 = timeSeries12.isEmpty();
        java.lang.Class class18 = timeSeries12.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries12.addChangeListener(seriesChangeListener19);
        timeSeries12.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener23);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(class18);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.List list7 = timeSeries4.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries4.addChangeListener(seriesChangeListener8);
        java.util.Collection collection10 = timeSeries4.getTimePeriods();
        timeSeries4.setMaximumItemCount(32);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        timeSeries1.setNotify(false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        long long9 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        timeSeries10.removeAgedItems(false);
        timeSeries10.setRangeDescription("Value");
        timeSeries10.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries2.addAndOrUpdate(timeSeries10);
        boolean boolean18 = timeSeries2.getNotify();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries2.createCopy((int) (short) 1, (int) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod22, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries6.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries32.addChangeListener(seriesChangeListener33);
        boolean boolean35 = timeSeries19.equals((java.lang.Object) timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries12.addAndOrUpdate(timeSeries32);
        java.lang.String str37 = timeSeries36.getDomainDescription();
        java.util.Collection collection38 = timeSeries36.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Time" + "'", str37, "Time");
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        long long8 = timeSeries7.getMaximumItemAge();
        timeSeries7.setDescription("hi!");
        boolean boolean11 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int13 = timeSeries12.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        timeSeries12.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries12.createCopy(10, (int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries20.addOrUpdate(regularTimePeriod21, (double) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries20);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class3);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str8 = timeSeries4.getRangeDescription();
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setDomainDescription("Value");
        java.lang.Class class12 = timeSeries4.getTimePeriodClass();
        java.lang.String str13 = timeSeries4.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries4.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries4.createCopy((int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass19 = timeSeries18.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass19);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        java.lang.Object obj24 = timeSeries21.clone();
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        long long18 = timeSeries11.getMaximumItemAge();
        timeSeries11.setNotify(true);
        java.util.Collection collection21 = timeSeries11.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod23, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        timeSeries4.clear();
        timeSeries4.setKey((java.lang.Comparable) (byte) 10);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        long long13 = timeSeries12.getMaximumItemAge();
        timeSeries12.fireSeriesChanged();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        long long18 = timeSeries17.getMaximumItemAge();
        timeSeries17.setDescription("hi!");
        boolean boolean21 = timeSeries17.getNotify();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries17);
        int int23 = timeSeries22.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries22.addChangeListener(seriesChangeListener24);
        timeSeries22.setRangeDescription("Overwritten values from: 4");
        boolean boolean28 = timeSeries4.equals((java.lang.Object) timeSeries22);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries22.addChangeListener(seriesChangeListener29);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemCount(1);
        timeSeries4.fireSeriesChanged();
        java.util.Collection collection10 = timeSeries4.getTimePeriods();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        timeSeries13.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener20);
        timeSeries13.setDescription("Time");
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
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener42);
        boolean boolean45 = timeSeries35.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries26.addAndOrUpdate(timeSeries35);
        java.util.Collection collection47 = timeSeries26.getTimePeriods();
        java.util.Collection collection48 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        boolean boolean49 = timeSeries4.equals((java.lang.Object) collection48);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }
}
