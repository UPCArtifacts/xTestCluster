import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        java.lang.Object obj34 = timeSeries13.clone();
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
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        int int13 = timeSeries12.getItemCount();
        java.lang.Class<?> wildcardClass14 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, (java.lang.Class) wildcardClass14);
        java.util.List list16 = timeSeries15.getItems();
        java.lang.String str17 = timeSeries15.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        timeSeries13.clear();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class18);
        timeSeries19.setDescription("hi!");
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str28 = timeSeries24.getRangeDescription();
        timeSeries24.setMaximumItemCount((int) ' ');
        timeSeries24.setMaximumItemAge((long) (short) 100);
        java.lang.String str33 = timeSeries24.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries19.addAndOrUpdate(timeSeries24);
        java.lang.Object obj35 = timeSeries19.clone();
        java.lang.String str36 = timeSeries19.getDescription();
        int int37 = timeSeries19.getItemCount();
        timeSeries19.setNotify(true);
        boolean boolean40 = timeSeries13.equals((java.lang.Object) timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str12 = timeSeries8.getRangeDescription();
        java.lang.Class<?> wildcardClass13 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "Value", "Value", (java.lang.Class) wildcardClass13);
        timeSeries15.clear();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.addAndOrUpdate(timeSeries28);
        boolean boolean31 = timeSeries29.equals((java.lang.Object) 0);
        boolean boolean32 = timeSeries29.isEmpty();
        timeSeries29.fireSeriesChanged();
        java.util.List list34 = timeSeries29.getItems();
        int int35 = timeSeries29.getMaximumItemCount();
        int int36 = timeSeries29.getMaximumItemCount();
        java.lang.String str37 = timeSeries29.getDescription();
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class41);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries42.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str46 = timeSeries42.getRangeDescription();
        timeSeries42.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener49);
        timeSeries42.setNotify(false);
        java.lang.Class<?> wildcardClass53 = timeSeries42.getClass();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass53);
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), (java.lang.Class) wildcardClass53);
        boolean boolean56 = timeSeries29.equals((java.lang.Object) timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries15.addAndOrUpdate(timeSeries29);
        java.lang.Object obj58 = timeSeries57.clone();
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value" + "'", str46, "Value");
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries2.addChangeListener(seriesChangeListener9);
        int int11 = timeSeries2.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.addChangeListener(seriesChangeListener12);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) 1);
        timeSeries2.setNotify(true);
        int int13 = timeSeries2.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.lang.String str2 = timeSeries1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = timeSeries19.getIndex(regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        long long32 = timeSeries13.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener33);
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9223372036854775807L + "'", long32 == 9223372036854775807L);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        timeSeries13.setKey((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        int int13 = timeSeries12.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries12.createCopy(1, (int) (short) 0);
        timeSeries16.setMaximumItemCount(100);
        java.lang.String str19 = timeSeries16.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries16.createCopy((int) (byte) 1, (int) (byte) 10);
        long long23 = timeSeries16.getMaximumItemAge();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class27);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.addChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries28.getTimePeriods();
        timeSeries28.setNotify(true);
        java.util.Collection collection34 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        java.lang.Class<?> wildcardClass35 = collection34.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, (java.lang.Class) wildcardClass35);
        java.util.List list37 = timeSeries36.getItems();
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries2.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries2.createCopy((int) (short) 10, 2147483647);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        java.lang.String str23 = timeSeries2.getDescription();
        java.lang.Class class24 = timeSeries2.getTimePeriodClass();
        timeSeries2.fireSeriesChanged();
        timeSeries2.removeAgedItems(false);
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        java.lang.Comparable comparable34 = timeSeries33.getKey();
        timeSeries33.setRangeDescription("Overwritten values from: 4");
        timeSeries33.clear();
        java.lang.String str38 = timeSeries33.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries2.addAndOrUpdate(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + '4' + "'", comparable34, '4');
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Time" + "'", str38, "Time");
        org.junit.Assert.assertNotNull(timeSeries39);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) '4', (int) (byte) 10);
        java.lang.Object obj13 = timeSeries2.clone();
        timeSeries2.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(2147483647, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        long long10 = timeSeries2.getMaximumItemAge();
        boolean boolean11 = timeSeries2.getNotify();
        java.util.List list12 = timeSeries2.getItems();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries2.createCopy(0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        boolean boolean4 = timeSeries2.equals((java.lang.Object) (-1.0f));
        java.util.List list5 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.removeChangeListener(seriesChangeListener6);
        timeSeries2.setMaximumItemAge(0L);
        java.lang.String str10 = timeSeries2.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        java.lang.Number number12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod11, number12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        boolean boolean41 = timeSeries35.isEmpty();
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class45);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries46.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str50 = timeSeries46.getRangeDescription();
        timeSeries46.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        timeSeries46.addPropertyChangeListener(propertyChangeListener53);
        timeSeries46.setNotify(false);
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class58);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries59.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class64 = null;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class64);
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries65.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries59.addAndOrUpdate(timeSeries68);
        boolean boolean71 = timeSeries69.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener72 = null;
        timeSeries69.removeChangeListener(seriesChangeListener72);
        java.util.Collection collection74 = timeSeries46.getTimePeriodsUniqueToOtherSeries(timeSeries69);
        java.lang.Class<?> wildcardClass75 = collection74.getClass();
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass75);
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, (java.lang.Class) wildcardClass75);
        long long78 = timeSeries77.getMaximumItemAge();
        java.lang.String str79 = timeSeries77.getRangeDescription();
        boolean boolean80 = timeSeries77.getNotify();
        java.util.Collection collection81 = timeSeries35.getTimePeriodsUniqueToOtherSeries(timeSeries77);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value" + "'", str50, "Value");
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertNotNull(timeSeries68);
        org.junit.Assert.assertNotNull(timeSeries69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 9223372036854775807L + "'", long78 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Value" + "'", str79, "Value");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(collection81);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        java.lang.String str43 = timeSeries33.getDomainDescription();
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class45);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries46.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str50 = timeSeries46.getRangeDescription();
        timeSeries46.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        timeSeries46.addPropertyChangeListener(propertyChangeListener53);
        timeSeries46.setNotify(false);
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class58);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries59.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class64 = null;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class64);
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries65.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries59.addAndOrUpdate(timeSeries68);
        boolean boolean71 = timeSeries69.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener72 = null;
        timeSeries69.removeChangeListener(seriesChangeListener72);
        java.util.Collection collection74 = timeSeries46.getTimePeriodsUniqueToOtherSeries(timeSeries69);
        boolean boolean76 = timeSeries69.equals((java.lang.Object) 100L);
        timeSeries69.clear();
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        timeSeries69.removePropertyChangeListener(propertyChangeListener78);
        timeSeries69.fireSeriesChanged();
        java.util.Collection collection81 = timeSeries33.getTimePeriodsUniqueToOtherSeries(timeSeries69);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Time" + "'", str43, "Time");
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value" + "'", str50, "Value");
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertNotNull(timeSeries68);
        org.junit.Assert.assertNotNull(timeSeries69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(collection81);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.List list10 = timeSeries2.getItems();
        timeSeries2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries2.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        timeSeries2.clear();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str23 = timeSeries19.getRangeDescription();
        java.lang.Class<?> wildcardClass24 = timeSeries19.getClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass24);
        int int26 = timeSeries25.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries25.createCopy(1, (int) (short) 0);
        timeSeries29.setMaximumItemCount(100);
        java.lang.String str32 = timeSeries29.getDomainDescription();
        java.util.Collection collection33 = timeSeries29.getTimePeriods();
        boolean boolean34 = timeSeries29.getNotify();
        java.util.Collection collection35 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries29.add(timeSeriesDataItem36, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        timeSeries12.removeAgedItems(false);
        java.util.List list23 = timeSeries12.getItems();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        long long20 = timeSeries12.getMaximumItemAge();
        timeSeries12.setRangeDescription("Value");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        timeSeries2.setDomainDescription("");
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str24 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount((int) ' ');
        java.util.Collection collection27 = timeSeries20.getTimePeriods();
        java.util.List list28 = timeSeries20.getItems();
        java.util.List list29 = timeSeries20.getItems();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener30);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries2.addAndOrUpdate(timeSeries20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries2.addOrUpdate(regularTimePeriod33, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(timeSeries32);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.createCopy((int) (short) 0, (int) ' ');
        timeSeries36.setMaximumItemCount(0);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class40);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries41.createCopy((int) (byte) 10, (int) '#');
        timeSeries44.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries44.createCopy(0, (int) (short) 0);
        timeSeries44.setNotify(true);
        timeSeries44.fireSeriesChanged();
        java.util.Collection collection53 = timeSeries36.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        java.util.List list54 = timeSeries44.getItems();
        boolean boolean55 = timeSeries44.isEmpty();
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
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.update(100, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        java.lang.String str10 = timeSeries2.getDomainDescription();
        java.lang.Object obj11 = timeSeries2.clone();
        java.lang.String str12 = timeSeries2.getDomainDescription();
        timeSeries2.setKey((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        timeSeries15.fireSeriesChanged();
        long long22 = timeSeries15.getMaximumItemAge();
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
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries34.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean44 = timeSeries34.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries25.addAndOrUpdate(timeSeries34);
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class47);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries48.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str52 = timeSeries48.getRangeDescription();
        timeSeries48.setMaximumItemCount((int) ' ');
        timeSeries48.setMaximumItemAge((long) (short) 100);
        timeSeries48.setRangeDescription("");
        timeSeries48.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries34.addAndOrUpdate(timeSeries48);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries15.addAndOrUpdate(timeSeries34);
        timeSeries15.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod65 = null; // flaky: timeSeries15.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value" + "'", str52, "Value");
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries62);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries15.addOrUpdate(regularTimePeriod33, (double) 97);
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
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        java.lang.String str23 = timeSeries2.getDescription();
        java.lang.Class class24 = timeSeries2.getTimePeriodClass();
        java.util.Collection collection25 = timeSeries2.getTimePeriods();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str36 = timeSeries32.getRangeDescription();
        java.lang.Class<?> wildcardClass37 = timeSeries32.getClass();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass37);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass37);
        timeSeries39.clear();
        long long41 = timeSeries39.getMaximumItemAge();
        java.lang.String str42 = timeSeries39.getDescription();
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class44);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries45.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str49 = timeSeries45.getRangeDescription();
        timeSeries45.setMaximumItemCount((int) ' ');
        long long52 = timeSeries45.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries45.createCopy((int) '4', (int) (byte) 10);
        long long56 = timeSeries45.getMaximumItemAge();
        java.util.Collection collection57 = timeSeries39.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        boolean boolean58 = timeSeries39.getNotify();
        java.util.Collection collection59 = timeSeries39.getTimePeriods();
        boolean boolean60 = timeSeries2.equals((java.lang.Object) collection59);
        java.lang.Object obj61 = timeSeries2.clone();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 9223372036854775807L + "'", long41 == 9223372036854775807L);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value" + "'", str49, "Value");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 9223372036854775807L + "'", long52 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 9223372036854775807L + "'", long56 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries2.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        java.lang.Class<?> wildcardClass18 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass18);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass18);
        timeSeries20.clear();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        int int24 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries20.addAndOrUpdate(timeSeries23);
        java.lang.Class<?> wildcardClass26 = timeSeries23.getClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Value", "", (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "hi!", "Value", (java.lang.Class) wildcardClass26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries29.add(regularTimePeriod30, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.lang.String str2 = timeSeries1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.removeChangeListener(seriesChangeListener3);
        timeSeries1.setNotify(false);
        java.lang.Class<?> wildcardClass7 = timeSeries1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries38.getDataItem(regularTimePeriod39);
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
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        timeSeries5.fireSeriesChanged();
        java.lang.String str8 = timeSeries5.getRangeDescription();
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener19);
        timeSeries12.setNotify(false);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries25.addAndOrUpdate(timeSeries34);
        boolean boolean37 = timeSeries35.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries35.removeChangeListener(seriesChangeListener38);
        java.util.Collection collection40 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        java.lang.Class<?> wildcardClass41 = timeSeries35.getClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass41);
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class44);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries45.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str49 = timeSeries45.getRangeDescription();
        timeSeries45.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        timeSeries45.addPropertyChangeListener(propertyChangeListener52);
        timeSeries45.setNotify(false);
        java.lang.Class class57 = null;
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class57);
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries58.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class63 = null;
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class63);
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries64.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries58.addAndOrUpdate(timeSeries67);
        boolean boolean70 = timeSeries68.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener71 = null;
        timeSeries68.removeChangeListener(seriesChangeListener71);
        java.util.Collection collection73 = timeSeries45.getTimePeriodsUniqueToOtherSeries(timeSeries68);
        java.lang.Class<?> wildcardClass74 = collection73.getClass();
        boolean boolean75 = timeSeries42.equals((java.lang.Object) collection73);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener76 = null;
        timeSeries42.removeChangeListener(seriesChangeListener76);
        java.lang.Class class81 = null;
        org.jfree.data.time.TimeSeries timeSeries82 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class81);
        timeSeries82.setRangeDescription("hi!");
        int int85 = timeSeries82.getMaximumItemCount();
        java.lang.String str86 = timeSeries82.getDescription();
        boolean boolean87 = timeSeries42.equals((java.lang.Object) str86);
        java.util.Collection collection88 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        java.beans.PropertyChangeListener propertyChangeListener89 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener89);
        java.lang.String str91 = timeSeries42.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + '4' + "'", comparable6, '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value" + "'", str49, "Value");
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertNotNull(timeSeries68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2147483647 + "'", int85 == 2147483647);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Time" + "'", str91, "Time");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        timeSeries13.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener20);
        timeSeries13.setNotify(false);
        java.lang.Class<?> wildcardClass24 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Time", (java.lang.Class) wildcardClass24);
        java.lang.Class<?> wildcardClass27 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Time", "hi!", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "Value", "hi!", (java.lang.Class) wildcardClass27);
        timeSeries29.setKey((java.lang.Comparable) (byte) 1);
        java.lang.Class<?> wildcardClass32 = timeSeries29.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, (java.lang.Class) wildcardClass32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = timeSeries33.getIndex(regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        java.util.List list7 = timeSeries2.getItems();
        int int8 = timeSeries2.getMaximumItemCount();
        java.lang.Comparable comparable9 = timeSeries2.getKey();
        java.lang.String str10 = timeSeries2.getDescription();
        java.lang.String str11 = timeSeries2.getDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + '4' + "'", comparable9, '4');
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        timeSeries9.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries9.getDataItem(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        int int18 = timeSeries2.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str9 = timeSeries5.getRangeDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass10);
        int int12 = timeSeries11.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener13);
        timeSeries11.setRangeDescription("Overwritten values from: 4");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod17, (double) 10, false);
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
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener16);
        timeSeries9.setNotify(false);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "hi!", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 1", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "", "Time", (java.lang.Class) wildcardClass20);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        timeSeries5.setNotify(true);
        timeSeries5.setNotify(true);
        timeSeries5.fireSeriesChanged();
        java.lang.Object obj16 = timeSeries5.clone();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        timeSeries10.setRangeDescription("Overwritten values from: 4");
        java.util.Collection collection13 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        timeSeries2.setKey((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        boolean boolean9 = timeSeries2.getNotify();
        timeSeries2.setDescription("Value");
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str18 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount((int) ' ');
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class22);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries23.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str27 = timeSeries23.getRangeDescription();
        timeSeries23.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries23.removePropertyChangeListener(propertyChangeListener30);
        boolean boolean33 = timeSeries23.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries14.addAndOrUpdate(timeSeries23);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class36);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries37.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str41 = timeSeries37.getRangeDescription();
        timeSeries37.setMaximumItemCount((int) ' ');
        timeSeries37.setMaximumItemAge((long) (short) 100);
        timeSeries37.setRangeDescription("");
        timeSeries37.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries23.addAndOrUpdate(timeSeries37);
        timeSeries23.setDescription("");
        java.lang.Class class54 = null;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class54);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries55.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str59 = timeSeries55.getRangeDescription();
        timeSeries55.setMaximumItemCount((int) ' ');
        timeSeries55.setMaximumItemAge((long) (short) 100);
        timeSeries55.setRangeDescription("");
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        timeSeries55.addPropertyChangeListener(propertyChangeListener66);
        java.util.List list68 = timeSeries55.getItems();
        boolean boolean69 = timeSeries55.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries23.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries71 = timeSeries2.addAndOrUpdate(timeSeries70);
        timeSeries71.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value" + "'", str41, "Value");
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Value" + "'", str59, "Value");
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertNotNull(timeSeries71);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        java.lang.Comparable comparable28 = timeSeries27.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries27.addChangeListener(seriesChangeListener29);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "Overwritten values from: 1" + "'", comparable28, "Overwritten values from: 1");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        java.lang.String str17 = timeSeries2.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries2.removeChangeListener(seriesChangeListener18);
        timeSeries2.setRangeDescription("Overwritten values from: 1");
        timeSeries2.clear();
        java.lang.Class class23 = timeSeries2.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(class23);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setMaximumItemAge((long) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod10, (java.lang.Number) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        java.util.Collection collection16 = timeSeries12.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        java.util.Collection collection19 = timeSeries15.getTimePeriods();
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries22.removePropertyChangeListener(propertyChangeListener29);
        boolean boolean32 = timeSeries22.equals((java.lang.Object) ' ');
        java.lang.String str33 = timeSeries22.getDescription();
        int int34 = timeSeries22.getMaximumItemCount();
        java.util.Collection collection35 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = timeSeries15.getIndex(regularTimePeriod36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str12 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener15);
        timeSeries8.setNotify(false);
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
        java.util.Collection collection36 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.lang.Class<?> wildcardClass37 = timeSeries31.getClass();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, (java.lang.Class) wildcardClass37);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass37);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass37);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 97, "", "", (java.lang.Class) wildcardClass37);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        java.lang.Comparable comparable43 = timeSeries33.getKey();
        timeSeries33.setNotify(false);
        java.util.List list46 = timeSeries33.getItems();
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
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + (short) 10 + "'", comparable43, (short) 10);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        java.util.List list17 = timeSeries2.getItems();
        long long18 = timeSeries2.getMaximumItemAge();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str25 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries21.addPropertyChangeListener(propertyChangeListener28);
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class33);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries34.addChangeListener(seriesChangeListener35);
        boolean boolean37 = timeSeries21.equals((java.lang.Object) timeSeries34);
        timeSeries21.setMaximumItemCount((int) '4');
        timeSeries21.setDomainDescription("Value");
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class43);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries44.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str48 = timeSeries44.getRangeDescription();
        timeSeries44.setMaximumItemCount((int) ' ');
        timeSeries44.setMaximumItemAge((long) (short) 100);
        java.lang.String str53 = timeSeries44.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries21.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries2.addAndOrUpdate(timeSeries54);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Value" + "'", str48, "Value");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value" + "'", str53, "Value");
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(timeSeries55);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        timeSeries11.setDomainDescription("hi!");
        java.lang.Comparable comparable25 = timeSeries11.getKey();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + '4' + "'", comparable25, '4');
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
            timeSeries25.update(regularTimePeriod34, (java.lang.Number) (byte) 0);
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
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
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
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str37 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount((int) ' ');
        timeSeries33.setMaximumItemAge((long) (short) 100);
        timeSeries33.setRangeDescription("");
        timeSeries33.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries19.addAndOrUpdate(timeSeries33);
        timeSeries19.setDescription("");
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class50);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries51.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str55 = timeSeries51.getRangeDescription();
        timeSeries51.setMaximumItemCount((int) ' ');
        timeSeries51.setMaximumItemAge((long) (short) 100);
        timeSeries51.setRangeDescription("");
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        timeSeries51.addPropertyChangeListener(propertyChangeListener62);
        java.util.List list64 = timeSeries51.getItems();
        boolean boolean65 = timeSeries51.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries19.addAndOrUpdate(timeSeries51);
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries5.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod68 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int69 = timeSeries19.getIndex(regularTimePeriod68);
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
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Value" + "'", str55, "Value");
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertNotNull(timeSeries67);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "", "Time", class3);
        boolean boolean5 = timeSeries4.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries4.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        boolean boolean4 = timeSeries2.equals((java.lang.Object) (-1.0f));
        java.util.List list5 = timeSeries2.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.removeChangeListener(seriesChangeListener6);
        timeSeries2.setMaximumItemAge(0L);
        int int10 = timeSeries2.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        java.util.Collection collection23 = timeSeries22.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        timeSeries5.setNotify(true);
        timeSeries5.fireSeriesChanged();
        java.lang.String str14 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemAge((long) (byte) 0);
        timeSeries5.setKey((java.lang.Comparable) '4');
        java.util.List list19 = timeSeries5.getItems();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        java.lang.Class<?> wildcardClass35 = timeSeries29.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass35);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Value", "Value", (java.lang.Class) wildcardClass35);
        boolean boolean38 = timeSeries37.isEmpty();
        java.util.Collection collection39 = timeSeries37.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) '#', 0);
        java.lang.Class<?> wildcardClass6 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update(regularTimePeriod8, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries17.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        long long5 = timeSeries4.getMaximumItemAge();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries4.addChangeListener(seriesChangeListener7);
        timeSeries4.setKey((java.lang.Comparable) false);
        timeSeries4.clear();
        java.util.List list12 = timeSeries4.getItems();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        int int18 = timeSeries12.getMaximumItemCount();
        int int19 = timeSeries12.getMaximumItemCount();
        java.lang.String str20 = timeSeries12.getDescription();
        timeSeries12.removeAgedItems(false);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        java.lang.Class class18 = timeSeries17.getTimePeriodClass();
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries17.addOrUpdate(regularTimePeriod20, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1 + "'", comparable19, 1);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass11);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries21.addAndOrUpdate(timeSeries30);
        java.lang.Class<?> wildcardClass32 = timeSeries21.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Overwritten values from: 4", "Overwritten values from: 4", (java.lang.Class) wildcardClass32);
        timeSeries35.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries13.addAndOrUpdate(timeSeries35);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries13.removePropertyChangeListener(propertyChangeListener39);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries18.addAndOrUpdate(timeSeries27);
        java.lang.Class<?> wildcardClass29 = timeSeries18.getClass();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "hi!", "Value", (java.lang.Class) wildcardClass29);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "Value", (java.lang.Class) wildcardClass29);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "Overwritten values from: 4", (java.lang.Class) wildcardClass29);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass29);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: Overwritten values from: 4", "", "", (java.lang.Class) wildcardClass29);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, "Overwritten values from: 4", "Overwritten values from: 1", (java.lang.Class) wildcardClass29);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        timeSeries5.setRangeDescription("Overwritten values from: 4");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries5.addChangeListener(seriesChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener11);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str19 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount((int) ' ');
        long long22 = timeSeries15.getMaximumItemAge();
        long long23 = timeSeries15.getMaximumItemAge();
        boolean boolean24 = timeSeries15.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries15.addChangeListener(seriesChangeListener25);
        long long27 = timeSeries15.getMaximumItemAge();
        java.util.Collection collection28 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.removeAgedItems(100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + '4' + "'", comparable6, '4');
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        long long18 = timeSeries2.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        long long16 = timeSeries2.getMaximumItemAge();
        java.lang.Class class17 = timeSeries2.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertNull(class17);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        java.lang.String str24 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemAge(1L);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries33.addChangeListener(seriesChangeListener34);
        timeSeries33.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries40 = timeSeries33.createCopy(regularTimePeriod38, regularTimePeriod39);
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
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Comparable comparable13 = timeSeries2.getKey();
        timeSeries2.setMaximumItemAge((long) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries2.removeChangeListener(seriesChangeListener16);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        java.lang.Object obj23 = timeSeries11.clone();
        timeSeries11.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries11.removeChangeListener(seriesChangeListener26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = timeSeries11.getValue(regularTimePeriod28);
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
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        timeSeries15.setMaximumItemAge((long) (short) 100);
        timeSeries15.setRangeDescription("");
        java.util.List list26 = timeSeries15.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries15.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries6.addAndOrUpdate(timeSeries15);
        java.util.Collection collection30 = timeSeries29.getTimePeriods();
        timeSeries29.setDomainDescription("hi!");
        timeSeries29.removeAgedItems(true);
        java.lang.Class<?> wildcardClass35 = timeSeries29.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Time", "Overwritten values from: 4", (java.lang.Class) wildcardClass35);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass35);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        timeSeries33.setKey((java.lang.Comparable) 1.0f);
        java.lang.String str36 = timeSeries33.getRangeDescription();
        java.lang.String str37 = timeSeries33.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries33.add(regularTimePeriod38, (double) '4', true);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Time" + "'", str37, "Time");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        timeSeries15.setDomainDescription("hi!");
        java.lang.String str22 = timeSeries15.getDomainDescription();
        java.lang.Object obj23 = timeSeries15.clone();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        int int7 = timeSeries4.getMaximumItemCount();
        timeSeries4.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems(0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener20);
        int int22 = timeSeries4.getItemCount();
        int int23 = timeSeries4.getMaximumItemCount();
        java.lang.Object obj24 = timeSeries4.clone();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener25);
        java.lang.Comparable comparable27 = timeSeries4.getKey();
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str34 = timeSeries30.getRangeDescription();
        timeSeries30.setMaximumItemCount((int) ' ');
        timeSeries30.setMaximumItemAge((long) 1);
        long long39 = timeSeries30.getMaximumItemAge();
        timeSeries30.setDomainDescription("Overwritten values from: 1");
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries4.addAndOrUpdate(timeSeries30);
        long long43 = timeSeries30.getMaximumItemAge();
        int int44 = timeSeries30.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 1 + "'", comparable27, 1);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        java.lang.Object obj29 = timeSeries15.clone();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        timeSeries2.setDomainDescription("Value");
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
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass54);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "hi!", (java.lang.Class) wildcardClass54);
        java.util.Collection collection57 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries56);
        java.util.List list58 = timeSeries56.getItems();
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        timeSeries56.removePropertyChangeListener(propertyChangeListener59);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(list58);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
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
        timeSeries25.setKey((java.lang.Comparable) (-1));
        timeSeries25.setMaximumItemAge(10L);
        timeSeries25.removeAgedItems(true);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (short) 1, (int) ' ');
        java.lang.Object obj10 = timeSeries4.clone();
        java.lang.String str11 = timeSeries4.getRangeDescription();
        java.lang.String str12 = timeSeries4.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        java.lang.Object obj24 = timeSeries4.clone();
        timeSeries4.setDescription("Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str14 = timeSeries10.getRangeDescription();
        java.lang.Class<?> wildcardClass15 = timeSeries10.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass15);
        timeSeries17.clear();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        int int21 = timeSeries20.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries17.addAndOrUpdate(timeSeries20);
        java.lang.Class<?> wildcardClass23 = timeSeries20.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, "Overwritten values from: 4", "hi!", (java.lang.Class) wildcardClass23);
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str32 = timeSeries28.getRangeDescription();
        timeSeries28.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries28.addPropertyChangeListener(propertyChangeListener35);
        timeSeries28.setNotify(false);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class40);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries41.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class46);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries47.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries41.addAndOrUpdate(timeSeries50);
        boolean boolean53 = timeSeries51.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener54 = null;
        timeSeries51.removeChangeListener(seriesChangeListener54);
        java.util.Collection collection56 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        boolean boolean58 = timeSeries51.equals((java.lang.Object) 100L);
        timeSeries51.clear();
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        timeSeries51.removePropertyChangeListener(propertyChangeListener60);
        java.lang.Comparable comparable62 = timeSeries51.getKey();
        java.lang.Class class64 = null;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class64);
        boolean boolean67 = timeSeries65.equals((java.lang.Object) (-1.0f));
        java.lang.Comparable comparable68 = timeSeries65.getKey();
        java.lang.String str69 = timeSeries65.getDescription();
        java.lang.Class class71 = null;
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class71);
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries72.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class77 = null;
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class77);
        org.jfree.data.time.TimeSeries timeSeries81 = timeSeries78.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries72.addAndOrUpdate(timeSeries81);
        java.lang.Comparable comparable83 = timeSeries72.getKey();
        java.util.Collection collection84 = timeSeries65.getTimePeriodsUniqueToOtherSeries(timeSeries72);
        java.util.Collection collection85 = timeSeries51.getTimePeriodsUniqueToOtherSeries(timeSeries65);
        java.util.Collection collection86 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        timeSeries51.setNotify(true);
        java.util.List list89 = timeSeries51.getItems();
        int int90 = timeSeries51.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + comparable62 + "' != '" + "Overwritten values from: 4" + "'", comparable62, "Overwritten values from: 4");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + comparable68 + "' != '" + '4' + "'", comparable68, '4');
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(timeSeries75);
        org.junit.Assert.assertNotNull(timeSeries81);
        org.junit.Assert.assertNotNull(timeSeries82);
        org.junit.Assert.assertEquals("'" + comparable83 + "' != '" + '4' + "'", comparable83, '4');
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNotNull(list89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2147483647 + "'", int90 == 2147483647);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.util.Collection collection9 = timeSeries2.getTimePeriods();
        java.util.List list10 = timeSeries2.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeSeries2.getIndex(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        java.lang.Class<?> wildcardClass17 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass17);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        int int23 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries19.addAndOrUpdate(timeSeries22);
        java.lang.Class<?> wildcardClass25 = timeSeries22.getClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Value", "", (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, (java.lang.Class) wildcardClass25);
        java.lang.Comparable comparable30 = timeSeries29.getKey();
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + 1.0f + "'", comparable30, 1.0f);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        java.lang.Class class20 = timeSeries18.getTimePeriodClass();
        timeSeries18.setKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(class20);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod56 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries55.update(regularTimePeriod56, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
            timeSeries4.update(32, (java.lang.Number) 97);
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
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        java.util.List list8 = timeSeries5.getItems();
        java.util.List list9 = timeSeries5.getItems();
        long long10 = timeSeries5.getMaximumItemAge();
        boolean boolean11 = timeSeries5.getNotify();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str18 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount((int) ' ');
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class22);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries23.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str27 = timeSeries23.getRangeDescription();
        timeSeries23.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries23.removePropertyChangeListener(propertyChangeListener30);
        boolean boolean33 = timeSeries23.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries14.addAndOrUpdate(timeSeries23);
        java.lang.Object obj35 = timeSeries23.clone();
        java.lang.String str36 = timeSeries23.getRangeDescription();
        java.util.List list37 = timeSeries23.getItems();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries5.addAndOrUpdate(timeSeries23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries41 = timeSeries5.createCopy(regularTimePeriod39, regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        timeSeries26.setMaximumItemAge((long) 1);
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
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass11);
        int int13 = timeSeries12.getItemCount();
        java.lang.Class<?> wildcardClass14 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, (java.lang.Class) wildcardClass14);
        java.util.List list16 = timeSeries15.getItems();
        java.lang.String str17 = timeSeries15.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        java.lang.Number number19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.update(regularTimePeriod18, number19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries17.createCopy((int) '4', (int) (short) -1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.update(regularTimePeriod22, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
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
        java.lang.String str19 = timeSeries17.getDescription();
        java.lang.Comparable comparable20 = timeSeries17.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = timeSeries17.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1 + "'", comparable20, 1);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setDescription("hi!");
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str18 = timeSeries14.getRangeDescription();
        java.lang.Class<?> wildcardClass19 = timeSeries14.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass19);
        int int21 = timeSeries20.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries20.createCopy(1, (int) (short) 0);
        timeSeries24.setMaximumItemCount(100);
        java.lang.String str27 = timeSeries24.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries24.createCopy((int) (byte) 1, (int) (byte) 10);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class34);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries35.addChangeListener(seriesChangeListener36);
        java.util.Collection collection38 = timeSeries35.getTimePeriods();
        timeSeries35.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries24.addAndOrUpdate(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries4.addAndOrUpdate(timeSeries35);
        java.lang.Object obj43 = timeSeries35.clone();
        timeSeries35.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.createCopy(0, (int) (short) 0);
        java.lang.String str11 = timeSeries5.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(regularTimePeriod12, (double) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        long long32 = timeSeries13.getMaximumItemAge();
        long long33 = timeSeries13.getMaximumItemAge();
        java.lang.Comparable comparable34 = timeSeries13.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod35, (java.lang.Number) 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9223372036854775807L + "'", long32 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (-1.0f) + "'", comparable34, (-1.0f));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        long long5 = timeSeries4.getMaximumItemAge();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries4.addChangeListener(seriesChangeListener7);
        timeSeries4.setKey((java.lang.Comparable) false);
        timeSeries4.clear();
        java.util.Collection collection12 = timeSeries4.getTimePeriods();
        int int13 = timeSeries4.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries2.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries2.createCopy((int) (short) 10, 2147483647);
        int int11 = timeSeries2.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        java.lang.Object obj51 = timeSeries49.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number53 = timeSeries49.getValue(regularTimePeriod52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.Object obj7 = timeSeries5.clone();
        java.lang.String str8 = timeSeries5.getDescription();
        java.lang.String str9 = timeSeries5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries5.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) 1);
        java.util.List list11 = timeSeries2.getItems();
        java.lang.String str12 = timeSeries2.getDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        boolean boolean30 = timeSeries27.isEmpty();
        timeSeries27.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener32);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        java.lang.String str24 = timeSeries2.getRangeDescription();
        java.lang.String str25 = timeSeries2.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Comparable comparable13 = timeSeries2.getKey();
        timeSeries2.setMaximumItemAge((long) ' ');
        boolean boolean16 = timeSeries2.getNotify();
        java.lang.String str17 = timeSeries2.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1);
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries1.createCopy(0, (int) (short) -1);
        java.lang.String str6 = timeSeries5.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries5.addOrUpdate(regularTimePeriod7, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str40 = timeSeries36.getRangeDescription();
        boolean boolean42 = timeSeries36.equals((java.lang.Object) 10L);
        boolean boolean43 = timeSeries36.getNotify();
        timeSeries36.setDescription("Time");
        java.lang.Comparable comparable46 = timeSeries36.getKey();
        timeSeries36.fireSeriesChanged();
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class49);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries50.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str54 = timeSeries50.getRangeDescription();
        timeSeries50.setMaximumItemCount((int) ' ');
        long long57 = timeSeries50.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries50.createCopy((int) '4', (int) (byte) 10);
        java.util.Collection collection61 = timeSeries36.getTimePeriodsUniqueToOtherSeries(timeSeries60);
        java.util.List list62 = timeSeries36.getItems();
        java.util.Collection collection63 = timeSeries33.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener64 = null;
        timeSeries36.removeChangeListener(seriesChangeListener64);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + '4' + "'", comparable46, '4');
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value" + "'", str54, "Value");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 9223372036854775807L + "'", long57 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
            timeSeries2.add(regularTimePeriod13, (java.lang.Number) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        timeSeries2.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries2.createCopy(0, (int) (byte) 1);
        java.lang.Class class8 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', class8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.update(regularTimePeriod10, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        int int29 = timeSeries25.getMaximumItemCount();
        java.lang.Object obj30 = timeSeries25.clone();
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
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries23);
        java.lang.Class<?> wildcardClass25 = timeSeries14.getClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "hi!", "Value", (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "Value", (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "Overwritten values from: 4", (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, (java.lang.Class) wildcardClass25);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.lang.Class<?> wildcardClass3 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass3);
        java.lang.String str5 = timeSeries4.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries4.getValue(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(str5);
    }
}
