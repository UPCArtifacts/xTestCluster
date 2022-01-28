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
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class1);
        timeSeries2.setRangeDescription("");
        timeSeries2.removeAgedItems(true);
        timeSeries2.setNotify(false);
        timeSeries2.fireSeriesChanged();
        java.lang.String str10 = timeSeries2.getDescription();
        java.lang.Object obj11 = timeSeries2.clone();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class8);
        java.util.Collection collection10 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        boolean boolean11 = timeSeries4.getNotify();
        int int12 = timeSeries4.getItemCount();
        timeSeries4.setKey((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        int int20 = timeSeries2.getMaximumItemCount();
        timeSeries2.setMaximumItemCount((int) (byte) 1);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class41);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries42.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries36.addAndOrUpdate(timeSeries45);
        java.lang.Class<?> wildcardClass47 = timeSeries36.getClass();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass47);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass47);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "hi!", (java.lang.Class) wildcardClass47);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass47);
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Time", "", (java.lang.Class) wildcardClass47);
        java.lang.String str53 = timeSeries52.getDescription();
        timeSeries52.setDomainDescription("Time");
        timeSeries52.removeAgedItems(false);
        boolean boolean58 = timeSeries2.equals((java.lang.Object) false);
        long long59 = timeSeries2.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 9223372036854775807L + "'", long59 == 9223372036854775807L);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        timeSeries12.setMaximumItemCount((int) 'a');
        java.lang.String str17 = timeSeries12.getDomainDescription();
        timeSeries12.setNotify(true);
        java.util.List list20 = timeSeries12.getItems();
        timeSeries12.setDomainDescription("Overwritten values from: -1");
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener23);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        timeSeries17.setRangeDescription("hi!");
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        timeSeries26.removeAgedItems(false);
        java.util.Collection collection29 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener30);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries17.addChangeListener(seriesChangeListener32);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemCount(1);
        timeSeries4.setDomainDescription("Value");
        int int11 = timeSeries4.getMaximumItemCount();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries23);
        boolean boolean26 = timeSeries24.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries24.removeChangeListener(seriesChangeListener27);
        timeSeries24.setMaximumItemAge((long) (byte) 100);
        boolean boolean31 = timeSeries4.equals((java.lang.Object) timeSeries24);
        java.lang.Class class32 = timeSeries24.getTimePeriodClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(class32);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        boolean boolean7 = timeSeries4.isEmpty();
        java.util.List list8 = timeSeries4.getItems();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str24 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener27);
        boolean boolean30 = timeSeries20.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries11.addAndOrUpdate(timeSeries20);
        timeSeries11.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries11.addChangeListener(seriesChangeListener34);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries11.removeChangeListener(seriesChangeListener36);
        java.lang.String str38 = timeSeries11.getDescription();
        timeSeries11.clear();
        java.lang.Comparable comparable40 = timeSeries11.getKey();
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries4.addAndOrUpdate(timeSeries11);
        timeSeries4.setMaximumItemCount((int) (byte) 100);
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class45);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries46.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str50 = timeSeries46.getRangeDescription();
        boolean boolean52 = timeSeries46.equals((java.lang.Object) 10L);
        java.lang.String str53 = timeSeries46.getDomainDescription();
        java.util.Collection collection54 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries46);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries46.removeChangeListener(seriesChangeListener55);
        timeSeries46.setRangeDescription("Time");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + '4' + "'", comparable40, '4');
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value" + "'", str50, "Value");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Time" + "'", str53, "Time");
        org.junit.Assert.assertNotNull(collection54);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries2.createCopy((int) (byte) 1, (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries2.addChangeListener(seriesChangeListener35);
        timeSeries2.setKey((java.lang.Comparable) 35);
        boolean boolean40 = timeSeries2.equals((java.lang.Object) "Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null; // flaky: timeSeries2.getNextTimePeriod();
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        timeSeries2.setNotify(true);
        timeSeries2.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod14, (java.lang.Number) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L);
        timeSeries1.removeAgedItems(false);
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
        java.lang.Comparable comparable35 = timeSeries6.getKey();
        java.util.Collection collection36 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class38);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries39.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str43 = timeSeries39.getRangeDescription();
        timeSeries39.setMaximumItemCount((int) ' ');
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class47);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries48.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str52 = timeSeries48.getRangeDescription();
        timeSeries48.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        timeSeries48.removePropertyChangeListener(propertyChangeListener55);
        boolean boolean58 = timeSeries48.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries39.addAndOrUpdate(timeSeries48);
        boolean boolean60 = timeSeries59.isEmpty();
        java.lang.Class class61 = timeSeries59.getTimePeriodClass();
        java.lang.Class class63 = null;
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class63);
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries64.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str68 = timeSeries64.getRangeDescription();
        timeSeries64.setMaximumItemCount(0);
        boolean boolean71 = timeSeries59.equals((java.lang.Object) timeSeries64);
        java.lang.Object obj72 = timeSeries64.clone();
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries1.addAndOrUpdate(timeSeries64);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod74 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod74, (java.lang.Number) 35);
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
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + '4' + "'", comparable35, '4');
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Value" + "'", str43, "Value");
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value" + "'", str52, "Value");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(class61);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Value" + "'", str68, "Value");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(timeSeries73);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        java.lang.Class<?> wildcardClass30 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass30);
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class33);
        timeSeries34.setRangeDescription("");
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class38);
        timeSeries39.setRangeDescription("");
        java.util.Collection collection42 = timeSeries34.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        boolean boolean43 = timeSeries31.equals((java.lang.Object) timeSeries39);
        java.lang.Class<?> wildcardClass44 = timeSeries31.getClass();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass44);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass44);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod13, (double) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries11.addChangeListener(seriesChangeListener25);
        java.lang.Class class27 = timeSeries11.getTimePeriodClass();
        timeSeries11.setDescription("Value");
        java.lang.Class class30 = timeSeries11.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class30);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timeSeries2.getKey();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str24 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener27);
        boolean boolean30 = timeSeries20.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries11.addAndOrUpdate(timeSeries20);
        java.util.List list32 = timeSeries20.getItems();
        timeSeries20.setRangeDescription("Overwritten values from: -1");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries20.createCopy((int) (short) 0, 0);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries2.addAndOrUpdate(timeSeries37);
        boolean boolean39 = timeSeries37.getNotify();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + '4' + "'", comparable8, '4');
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
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
        java.lang.Class class24 = timeSeries22.getTimePeriodClass();
        java.lang.Class class25 = timeSeries22.getTimePeriodClass();
        timeSeries22.clear();
        java.lang.String str27 = timeSeries22.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Time" + "'", str27, "Time");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class<?> wildcardClass6 = timeSeries4.getClass();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        timeSeries12.setMaximumItemCount((int) 'a');
        java.lang.Class class17 = timeSeries12.getTimePeriodClass();
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries20.addChangeListener(seriesChangeListener24);
        java.lang.Comparable comparable26 = timeSeries20.getKey();
        java.lang.String str27 = timeSeries20.getDescription();
        timeSeries20.clear();
        java.lang.Comparable comparable29 = timeSeries20.getKey();
        int int30 = timeSeries20.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries12.addAndOrUpdate(timeSeries20);
        java.lang.Comparable comparable32 = timeSeries20.getKey();
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener33);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + '4' + "'", comparable26, '4');
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + '4' + "'", comparable29, '4');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + '4' + "'", comparable32, '4');
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        timeSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        boolean boolean6 = timeSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getRangeDescription();
        int int10 = timeSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        timeSeries1.setDescription("");
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
        timeSeries6.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries6.addChangeListener(seriesChangeListener29);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries6.removeChangeListener(seriesChangeListener31);
        java.lang.String str33 = timeSeries6.getDescription();
        java.util.List list34 = timeSeries6.getItems();
        java.util.Collection collection35 = timeSeries6.getTimePeriods();
        boolean boolean36 = timeSeries1.equals((java.lang.Object) collection35);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class38);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries39.removeChangeListener(seriesChangeListener40);
        boolean boolean42 = timeSeries39.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries1.addAndOrUpdate(timeSeries39);
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class50);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries51.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class56 = null;
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class56);
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries57.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries51.addAndOrUpdate(timeSeries60);
        java.lang.Class<?> wildcardClass62 = timeSeries51.getClass();
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass62);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass62);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass62);
        boolean boolean66 = timeSeries65.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries43.addAndOrUpdate(timeSeries65);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(timeSeries67);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        java.lang.String str25 = timeSeries23.getRangeDescription();
        java.util.List list26 = timeSeries23.getItems();
        java.util.Collection collection27 = timeSeries23.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries6.addChangeListener(seriesChangeListener7);
        java.util.Collection collection9 = timeSeries6.getTimePeriods();
        timeSeries6.setDomainDescription("Time");
        timeSeries6.fireSeriesChanged();
        java.lang.Class<?> wildcardClass13 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, (java.lang.Class) wildcardClass13);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.removeAgedItems((long) 35, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class1);
        timeSeries2.setRangeDescription("");
        timeSeries2.removeAgedItems(true);
        timeSeries2.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        java.util.Collection collection11 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        timeSeries10.setDomainDescription("Overwritten values from: Overwritten values from: 4");
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        timeSeries2.clear();
        timeSeries2.setDescription("Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        timeSeries24.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries24.addChangeListener(seriesChangeListener27);
        boolean boolean29 = timeSeries24.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries24.removeChangeListener(seriesChangeListener30);
        java.lang.Class<?> wildcardClass32 = timeSeries24.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "hi!", "Overwritten values from: -1", (java.lang.Class) wildcardClass32);
        boolean boolean35 = timeSeries17.equals((java.lang.Object) timeSeries34);
        timeSeries17.removeAgedItems(false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
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
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        timeSeries4.removeAgedItems(true);
        java.lang.Class class9 = timeSeries4.getTimePeriodClass();
        int int10 = timeSeries4.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeSeries4.getIndex(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
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
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.util.List list23 = timeSeries11.getItems();
        int int24 = timeSeries11.getItemCount();
        java.lang.String str25 = timeSeries11.getDescription();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class35);
        timeSeries36.setRangeDescription("hi!");
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class40);
        java.util.Collection collection42 = timeSeries36.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        java.util.Collection collection43 = timeSeries31.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        java.util.Collection collection44 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries31.clear();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(collection44);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        java.lang.Class class20 = timeSeries17.getTimePeriodClass();
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class22);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries23.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str27 = timeSeries23.getRangeDescription();
        timeSeries23.setMaximumItemCount((int) ' ');
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str36 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries32.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean42 = timeSeries32.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries23.addAndOrUpdate(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries43.createCopy(1, (int) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries17.addAndOrUpdate(timeSeries43);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        timeSeries43.removeChangeListener(seriesChangeListener48);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number51 = timeSeries43.getValue(regularTimePeriod50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries47);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass35);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "", "Time", (java.lang.Class) wildcardClass35);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = timeSeries37.getDataItem(regularTimePeriod38);
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
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        java.util.List list15 = timeSeries12.getItems();
        timeSeries12.removeAgedItems(false);
        java.lang.String str18 = timeSeries12.getDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener22);
        timeSeries21.setMaximumItemAge((long) (short) 0);
        long long26 = timeSeries21.getMaximumItemAge();
        java.lang.Class class27 = timeSeries21.getTimePeriodClass();
        java.lang.Class class28 = timeSeries21.getTimePeriodClass();
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj35 = timeSeries34.clone();
        timeSeries34.setMaximumItemAge(0L);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries21.addAndOrUpdate(timeSeries34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null; // flaky: timeSeries34.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod3, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries33.removePropertyChangeListener(propertyChangeListener34);
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
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        timeSeries2.removeAgedItems(false);
        java.lang.String str14 = timeSeries2.getRangeDescription();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        java.util.Collection collection22 = timeSeries19.getTimePeriods();
        timeSeries19.setDomainDescription("Time");
        timeSeries19.fireSeriesChanged();
        java.util.Collection collection26 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class28);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries29.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class36);
        timeSeries37.setRangeDescription("hi!");
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class41);
        java.util.Collection collection43 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        java.util.Collection collection44 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class46);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries47.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class52);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries53.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries47.addAndOrUpdate(timeSeries56);
        boolean boolean59 = timeSeries57.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries57.removeChangeListener(seriesChangeListener60);
        java.lang.Class class63 = null;
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class63);
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries64.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str68 = timeSeries64.getRangeDescription();
        timeSeries64.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        timeSeries64.addPropertyChangeListener(propertyChangeListener71);
        java.lang.Class class76 = null;
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class76);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener78 = null;
        timeSeries77.addChangeListener(seriesChangeListener78);
        boolean boolean80 = timeSeries64.equals((java.lang.Object) timeSeries77);
        org.jfree.data.time.TimeSeries timeSeries81 = timeSeries57.addAndOrUpdate(timeSeries77);
        java.lang.String str82 = timeSeries57.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries83 = timeSeries32.addAndOrUpdate(timeSeries57);
        timeSeries83.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries86 = timeSeries2.addAndOrUpdate(timeSeries83);
        java.beans.PropertyChangeListener propertyChangeListener87 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener87);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Value" + "'", str68, "Value");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(timeSeries81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Value" + "'", str82, "Value");
        org.junit.Assert.assertNotNull(timeSeries83);
        org.junit.Assert.assertNotNull(timeSeries86);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        timeSeries2.fireSeriesChanged();
        timeSeries2.setMaximumItemAge((long) ' ');
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
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        java.lang.Comparable comparable21 = timeSeries19.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries24 = timeSeries19.createCopy(regularTimePeriod22, regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 0.0f + "'", comparable21, 0.0f);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class16);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries14.addAndOrUpdate(timeSeries17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener19);
        java.lang.Class class21 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.createCopy(regularTimePeriod22, regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNull(class21);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.setMaximumItemCount((int) (short) 0);
        timeSeries4.setRangeDescription("Overwritten values from: -1");
        timeSeries4.setMaximumItemCount(10);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries21);
        java.lang.Class<?> wildcardClass23 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "Time", "Overwritten values from: Overwritten values from: 4", (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass23);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class16);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries14.addAndOrUpdate(timeSeries17);
        timeSeries14.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener21);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod9, 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        boolean boolean25 = timeSeries2.getNotify();
        java.lang.Object obj26 = timeSeries2.clone();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj26);
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
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy(1, (int) (byte) 1);
        timeSeries22.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener28);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.util.Collection collection36 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries32.removeAgedItems((long) '#', true);
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
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        timeSeries12.fireSeriesChanged();
        timeSeries12.clear();
        java.lang.String str15 = timeSeries12.getDescription();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj22 = timeSeries21.clone();
        java.lang.String str23 = timeSeries21.getDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries12.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries12.getDataItem(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.lang.String str18 = timeSeries17.getDescription();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str25 = timeSeries21.getRangeDescription();
        int int26 = timeSeries21.getMaximumItemCount();
        boolean boolean27 = timeSeries17.equals((java.lang.Object) int26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class31);
        java.util.List list33 = timeSeries32.getItems();
        java.lang.String str34 = timeSeries32.getRangeDescription();
        boolean boolean35 = timeSeries32.isEmpty();
        int int36 = timeSeries32.getItemCount();
        int int37 = timeSeries32.getMaximumItemCount();
        boolean boolean38 = timeSeries17.equals((java.lang.Object) int37);
        timeSeries17.setDescription("Time");
        java.lang.Comparable comparable41 = timeSeries17.getKey();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + '#' + "'", comparable41, '#');
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        int int9 = timeSeries2.getMaximumItemCount();
        timeSeries2.setMaximumItemCount(100);
        int int12 = timeSeries2.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.util.List list6 = timeSeries5.getItems();
        long long7 = timeSeries5.getMaximumItemAge();
        timeSeries5.setNotify(false);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class13);
        timeSeries14.setRangeDescription("hi!");
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class18);
        java.util.Collection collection20 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str21 = timeSeries14.getRangeDescription();
        java.util.Collection collection22 = timeSeries14.getTimePeriods();
        timeSeries14.setRangeDescription("Value");
        timeSeries14.setRangeDescription("Time");
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class28);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries29.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str33 = timeSeries29.getRangeDescription();
        int int34 = timeSeries29.getMaximumItemCount();
        timeSeries29.setDomainDescription("Value");
        java.lang.Class class37 = timeSeries29.getTimePeriodClass();
        java.util.Collection collection38 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.util.Collection collection39 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        timeSeries14.setKey((java.lang.Comparable) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = timeSeries14.getIndex(regularTimePeriod42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        boolean boolean7 = timeSeries4.isEmpty();
        java.util.List list8 = timeSeries4.getItems();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str24 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener27);
        boolean boolean30 = timeSeries20.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries11.addAndOrUpdate(timeSeries20);
        timeSeries11.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries11.addChangeListener(seriesChangeListener34);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries11.removeChangeListener(seriesChangeListener36);
        java.lang.String str38 = timeSeries11.getDescription();
        timeSeries11.clear();
        java.lang.Comparable comparable40 = timeSeries11.getKey();
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries4.addAndOrUpdate(timeSeries11);
        timeSeries4.setMaximumItemCount((int) (byte) 100);
        timeSeries4.setDescription("Time");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + '4' + "'", comparable40, '4');
        org.junit.Assert.assertNotNull(timeSeries41);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        java.lang.String str25 = timeSeries2.getDomainDescription();
        int int26 = timeSeries2.getMaximumItemCount();
        int int27 = timeSeries2.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        timeSeries12.fireSeriesChanged();
        timeSeries12.clear();
        java.lang.String str15 = timeSeries12.getDescription();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj22 = timeSeries21.clone();
        java.lang.String str23 = timeSeries21.getDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries12.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = timeSeries21.getIndex(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class1);
        timeSeries2.setRangeDescription("");
        timeSeries2.removeAgedItems(true);
        java.lang.String str7 = timeSeries2.getDomainDescription();
        timeSeries2.setRangeDescription("Overwritten values from: 4");
        timeSeries2.setDomainDescription("Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        int int6 = timeSeries2.getMaximumItemCount();
        int int7 = timeSeries2.getItemCount();
        java.util.Collection collection8 = timeSeries2.getTimePeriods();
        java.lang.Class class9 = timeSeries2.getTimePeriodClass();
        java.lang.Class<?> wildcardClass10 = timeSeries2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setNotify(true);
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        java.lang.String str10 = timeSeries4.getDomainDescription();
        timeSeries4.setRangeDescription("Overwritten values from: 4");
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        java.util.Collection collection20 = timeSeries17.getTimePeriods();
        timeSeries17.setDomainDescription("Time");
        timeSeries17.setMaximumItemCount((int) (byte) 1);
        timeSeries17.setDomainDescription("Overwritten values from: 1");
        java.util.Collection collection27 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 1 + "'", comparable9, 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.util.List list6 = timeSeries2.getItems();
        java.lang.String str7 = timeSeries2.getRangeDescription();
        timeSeries2.setNotify(false);
        java.util.Collection collection10 = timeSeries2.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class8);
        java.util.Collection collection10 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.addAndOrUpdate(timeSeries28);
        java.lang.Class<?> wildcardClass30 = timeSeries19.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass30);
        java.util.List list32 = timeSeries31.getItems();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class34);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries35.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str39 = timeSeries35.getRangeDescription();
        boolean boolean40 = timeSeries31.equals((java.lang.Object) timeSeries35);
        timeSeries31.setMaximumItemCount(1);
        java.lang.Class<?> wildcardClass43 = timeSeries31.getClass();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "", "hi!", (java.lang.Class) wildcardClass43);
        boolean boolean45 = timeSeries44.getNotify();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries9.addAndOrUpdate(timeSeries44);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries44.update((int) (short) -1, (java.lang.Number) 1L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(timeSeries46);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setMaximumItemCount((int) (short) 10);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class11);
        java.util.List list13 = timeSeries12.getItems();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.addAndOrUpdate(timeSeries12);
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
        java.lang.Object obj46 = timeSeries40.clone();
        timeSeries40.setDomainDescription("Value");
        timeSeries40.setDescription("Time");
        java.util.Collection collection51 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries14.delete((-1), (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.setDescription("");
        int int8 = timeSeries5.getItemCount();
        java.util.List list9 = timeSeries5.getItems();
        timeSeries5.setKey((java.lang.Comparable) 1);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod3, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries20);
        java.lang.Class<?> wildcardClass22 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass22);
        java.util.List list24 = timeSeries23.getItems();
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str31 = timeSeries27.getRangeDescription();
        boolean boolean32 = timeSeries23.equals((java.lang.Object) timeSeries27);
        java.lang.Class<?> wildcardClass33 = timeSeries27.getClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "Time", "Time", (java.lang.Class) wildcardClass33);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "", "Overwritten values from: -1", (java.lang.Class) wildcardClass33);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        timeSeries4.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries4.createCopy((int) (short) 10, (int) '4');
        org.jfree.data.time.TimeSeries timeSeries12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries11.addAndOrUpdate(timeSeries12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        java.util.Collection collection20 = timeSeries17.getTimePeriods();
        timeSeries17.setDomainDescription("Time");
        java.util.Collection collection23 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        timeSeries17.setNotify(true);
        boolean boolean26 = timeSeries17.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod27, (java.lang.Number) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        java.lang.Object obj34 = timeSeries28.clone();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Overwritten values from: 4", "Overwritten values from: Overwritten values from: 4", (java.lang.Class) wildcardClass35);
        int int37 = timeSeries36.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class16);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries14.addAndOrUpdate(timeSeries17);
        timeSeries14.setNotify(false);
        timeSeries14.setKey((java.lang.Comparable) (byte) 0);
        int int23 = timeSeries14.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass28);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class31);
        timeSeries32.setRangeDescription("");
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class36);
        timeSeries37.setRangeDescription("");
        java.util.Collection collection40 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        boolean boolean41 = timeSeries29.equals((java.lang.Object) timeSeries37);
        timeSeries29.setDomainDescription("Overwritten values from: 1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number45 = timeSeries29.getValue(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        long long7 = timeSeries2.getMaximumItemAge();
        java.lang.String str8 = timeSeries2.getDescription();
        int int9 = timeSeries2.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries2.removeChangeListener(seriesChangeListener10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.removeChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries2.getDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        java.util.List list15 = timeSeries12.getItems();
        timeSeries12.removeAgedItems(false);
        java.lang.String str18 = timeSeries12.getDescription();
        int int19 = timeSeries12.getMaximumItemCount();
        int int20 = timeSeries12.getMaximumItemCount();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class24);
        timeSeries25.setRangeDescription("hi!");
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class29);
        java.util.Collection collection31 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries40.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class45);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries46.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries40.addAndOrUpdate(timeSeries49);
        java.lang.Class<?> wildcardClass51 = timeSeries40.getClass();
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass51);
        java.util.List list53 = timeSeries52.getItems();
        java.lang.Class class55 = null;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class55);
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries56.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str60 = timeSeries56.getRangeDescription();
        boolean boolean61 = timeSeries52.equals((java.lang.Object) timeSeries56);
        timeSeries52.setMaximumItemCount(1);
        java.lang.Class<?> wildcardClass64 = timeSeries52.getClass();
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "", "hi!", (java.lang.Class) wildcardClass64);
        boolean boolean66 = timeSeries65.getNotify();
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries30.addAndOrUpdate(timeSeries65);
        java.util.Collection collection68 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries65);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener69);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Value" + "'", str60, "Value");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class8);
        java.util.Collection collection10 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        boolean boolean11 = timeSeries9.getNotify();
        long long12 = timeSeries9.getMaximumItemAge();
        long long13 = timeSeries9.getMaximumItemAge();
        timeSeries9.setKey((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
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
        long long9 = timeSeries2.getMaximumItemAge();
        timeSeries2.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries2.addOrUpdate(regularTimePeriod12, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.fireSeriesChanged();
        long long5 = timeSeries2.getMaximumItemAge();
        long long6 = timeSeries2.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries2.addChangeListener(seriesChangeListener7);
        boolean boolean9 = timeSeries2.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) (byte) 0, (int) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries2.removeChangeListener(seriesChangeListener13);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        timeSeries1.setDomainDescription("Time");
        timeSeries1.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) 97, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class16);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries14.addAndOrUpdate(timeSeries17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update(regularTimePeriod21, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        boolean boolean30 = timeSeries2.getNotify();
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
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries12.addChangeListener(seriesChangeListener13);
        java.lang.Class<?> wildcardClass15 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Overwritten values from: -1", "hi!", (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", "Overwritten values from: 4", "Overwritten values from: -1", (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", (java.lang.Class) wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        java.util.Collection collection23 = timeSeries2.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = timeSeries2.getValue(regularTimePeriod28);
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
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries2.addChangeListener(seriesChangeListener23);
        boolean boolean25 = timeSeries2.getNotify();
        int int26 = timeSeries2.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + '4' + "'", comparable21, '4');
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        timeSeries1.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.clear();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.setNotify(false);
        int int13 = timeSeries2.getItemCount();
        timeSeries2.setMaximumItemCount(0);
        timeSeries2.clear();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries5.addChangeListener(seriesChangeListener6);
        java.util.Collection collection8 = timeSeries5.getTimePeriods();
        timeSeries5.setDomainDescription("Time");
        timeSeries5.fireSeriesChanged();
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, (java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null; // flaky: timeSeries13.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        java.util.List list15 = timeSeries12.getItems();
        timeSeries12.removeAgedItems(false);
        java.lang.String str18 = timeSeries12.getDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener22);
        timeSeries21.setMaximumItemAge((long) (short) 0);
        timeSeries21.setMaximumItemAge(1L);
        timeSeries21.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.delete(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries17);
        java.lang.Class<?> wildcardClass19 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries23.addOrUpdate(regularTimePeriod24, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(wildcardClass19);
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
        timeSeries2.removeAgedItems(true);
        java.lang.Comparable comparable27 = timeSeries2.getKey();
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str34 = timeSeries30.getRangeDescription();
        timeSeries30.setMaximumItemCount((int) ' ');
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class38);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries39.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str43 = timeSeries39.getRangeDescription();
        timeSeries39.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        timeSeries39.removePropertyChangeListener(propertyChangeListener46);
        boolean boolean49 = timeSeries39.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries30.addAndOrUpdate(timeSeries39);
        timeSeries30.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries30.addChangeListener(seriesChangeListener53);
        int int55 = timeSeries30.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries30.addChangeListener(seriesChangeListener56);
        java.util.Collection collection58 = timeSeries30.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries2.addAndOrUpdate(timeSeries30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number61 = timeSeries2.getValue(regularTimePeriod60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + '4' + "'", comparable27, '4');
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Value" + "'", str43, "Value");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.addChangeListener(seriesChangeListener6);
        timeSeries2.fireSeriesChanged();
        boolean boolean9 = timeSeries2.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries2.addOrUpdate(regularTimePeriod10, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.util.List list6 = timeSeries2.getItems();
        java.util.List list7 = timeSeries2.getItems();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        java.lang.Class class20 = timeSeries17.getTimePeriodClass();
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class22);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries23.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str27 = timeSeries23.getRangeDescription();
        timeSeries23.setMaximumItemCount((int) ' ');
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class31);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str36 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries32.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean42 = timeSeries32.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries23.addAndOrUpdate(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries43.createCopy(1, (int) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries17.addAndOrUpdate(timeSeries43);
        timeSeries17.setKey((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number51 = timeSeries17.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries47);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        int int8 = timeSeries5.getItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        long long18 = timeSeries11.getMaximumItemAge();
        timeSeries11.setNotify(true);
        java.util.Collection collection21 = timeSeries11.getTimePeriods();
        boolean boolean22 = timeSeries5.equals((java.lang.Object) timeSeries11);
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class38);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries39.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries42);
        java.lang.Class<?> wildcardClass44 = timeSeries33.getClass();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass44);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "hi!", (java.lang.Class) wildcardClass44);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass44);
        java.util.Collection collection49 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem52 = timeSeries11.addOrUpdate(regularTimePeriod50, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class47);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries48.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries48.addChangeListener(seriesChangeListener52);
        java.lang.Comparable comparable54 = timeSeries48.getKey();
        java.lang.String str55 = timeSeries48.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries48.addChangeListener(seriesChangeListener56);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        timeSeries48.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = timeSeries41.equals((java.lang.Object) timeSeries48);
        java.lang.Object obj61 = timeSeries48.clone();
        java.lang.Class class63 = null;
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class63);
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries64.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str68 = timeSeries64.getRangeDescription();
        timeSeries64.setMaximumItemCount((int) ' ');
        java.lang.Class class72 = null;
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class72);
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries73.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str77 = timeSeries73.getRangeDescription();
        timeSeries73.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener80 = null;
        timeSeries73.removePropertyChangeListener(propertyChangeListener80);
        boolean boolean83 = timeSeries73.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries84 = timeSeries64.addAndOrUpdate(timeSeries73);
        timeSeries64.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener87 = null;
        timeSeries64.addChangeListener(seriesChangeListener87);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener89 = null;
        timeSeries64.removeChangeListener(seriesChangeListener89);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener91 = null;
        timeSeries64.removeChangeListener(seriesChangeListener91);
        boolean boolean93 = timeSeries64.getNotify();
        java.util.List list94 = timeSeries64.getItems();
        boolean boolean95 = timeSeries48.equals((java.lang.Object) list94);
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
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + '4' + "'", comparable54, '4');
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Time" + "'", str55, "Time");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Value" + "'", str68, "Value");
        org.junit.Assert.assertNotNull(timeSeries76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Value" + "'", str77, "Value");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(timeSeries84);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(list94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        long long12 = timeSeries11.getMaximumItemAge();
        timeSeries11.fireSeriesChanged();
        java.util.Collection collection14 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        java.util.List list15 = timeSeries4.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries4.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries4.isEmpty();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
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
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries2.equals((java.lang.Object) timeSeries15);
        timeSeries2.setDomainDescription("Value");
        timeSeries2.setDescription("Value");
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount(0);
        java.lang.String str32 = timeSeries25.getRangeDescription();
        boolean boolean33 = timeSeries25.getNotify();
        timeSeries25.fireSeriesChanged();
        boolean boolean35 = timeSeries2.equals((java.lang.Object) timeSeries25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries2.removeChangeListener(seriesChangeListener36);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class9);
        timeSeries10.setRangeDescription("hi!");
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class14);
        java.util.Collection collection16 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.util.Collection collection17 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod18, (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        timeSeries2.fireSeriesChanged();
        java.lang.String str34 = timeSeries2.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = timeSeries2.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
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
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        boolean boolean13 = timeSeries2.getNotify();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str20 = timeSeries16.getRangeDescription();
        int int21 = timeSeries16.getMaximumItemCount();
        timeSeries16.setDomainDescription("Value");
        java.lang.Class class24 = timeSeries16.getTimePeriodClass();
        java.lang.String str25 = timeSeries16.getDomainDescription();
        java.lang.String str26 = timeSeries16.getRangeDescription();
        timeSeries16.removeAgedItems(false);
        java.lang.Comparable comparable29 = timeSeries16.getKey();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries2.addAndOrUpdate(timeSeries16);
        java.lang.Class class31 = timeSeries2.getTimePeriodClass();
        timeSeries2.clear();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + '4' + "'", comparable29, '4');
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(class31);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        timeSeries2.setKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        timeSeries4.setDomainDescription("");
        timeSeries4.setDomainDescription("Overwritten values from: 4");
        boolean boolean17 = timeSeries4.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries4.removeChangeListener(seriesChangeListener18);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) (short) 0, (int) (short) 1);
        timeSeries2.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod15, (java.lang.Number) (short) 10);
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
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        timeSeries1.setDescription("");
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
        timeSeries6.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries6.addChangeListener(seriesChangeListener29);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries6.removeChangeListener(seriesChangeListener31);
        java.lang.String str33 = timeSeries6.getDescription();
        java.util.List list34 = timeSeries6.getItems();
        java.util.Collection collection35 = timeSeries6.getTimePeriods();
        boolean boolean36 = timeSeries1.equals((java.lang.Object) collection35);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class38);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries39.removeChangeListener(seriesChangeListener40);
        boolean boolean42 = timeSeries39.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries1.addAndOrUpdate(timeSeries39);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number45 = timeSeries1.getValue(regularTimePeriod44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(timeSeries43);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        timeSeries2.clear();
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries2.addAndOrUpdate(timeSeries12);
        boolean boolean24 = timeSeries23.getNotify();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        java.lang.String str2 = timeSeries1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setRangeDescription("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj21 = timeSeries20.clone();
        java.lang.String str22 = timeSeries20.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener23);
        java.lang.String str25 = timeSeries20.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries12.addAndOrUpdate(timeSeries20);
        java.lang.String str27 = timeSeries26.getDescription();
        timeSeries26.clear();
        java.util.List list29 = timeSeries26.getItems();
        timeSeries26.setMaximumItemAge((long) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries26.addOrUpdate(regularTimePeriod32, (double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        timeSeries5.setRangeDescription("Value");
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class13);
        java.util.List list15 = timeSeries14.getItems();
        java.lang.String str16 = timeSeries14.getRangeDescription();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.addAndOrUpdate(timeSeries28);
        boolean boolean30 = timeSeries14.equals((java.lang.Object) timeSeries28);
        int int31 = timeSeries28.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries5.addAndOrUpdate(timeSeries28);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries32.setMaximumItemAge((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries32);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        timeSeries2.fireSeriesChanged();
        timeSeries2.clear();
        boolean boolean35 = timeSeries2.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod36, (double) ' ', true);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries2.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries2.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(0);
        java.lang.String str9 = timeSeries2.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries2.removeChangeListener(seriesChangeListener10);
        int int12 = timeSeries2.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        java.lang.String str13 = timeSeries4.getDescription();
        long long14 = timeSeries4.getMaximumItemAge();
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(0);
        java.lang.String str9 = timeSeries2.getDescription();
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        timeSeries2.clear();
        int int12 = timeSeries2.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
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
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        java.util.List list15 = timeSeries12.getItems();
        timeSeries12.removeAgedItems(false);
        java.lang.String str18 = timeSeries12.getDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener22);
        timeSeries21.setMaximumItemAge((long) (short) 0);
        timeSeries21.setMaximumItemAge(1L);
        timeSeries21.setKey((java.lang.Comparable) "Overwritten values from: 1");
        boolean boolean30 = timeSeries21.getNotify();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Comparable comparable7 = timeSeries4.getKey();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems(10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        timeSeries8.removeAgedItems(false);
        java.lang.Class<?> wildcardClass11 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Value", "", (java.lang.Class) wildcardClass11);
        timeSeries12.setMaximumItemAge((long) (byte) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod15, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setMaximumItemCount((int) (short) 10);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class11);
        java.util.List list13 = timeSeries12.getItems();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.addAndOrUpdate(timeSeries12);
        java.lang.String str15 = timeSeries4.getRangeDescription();
        timeSeries4.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod18, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        timeSeries2.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        timeSeries2.setDescription("");
        timeSeries2.setDomainDescription("Time");
        java.lang.Class<?> wildcardClass14 = timeSeries2.getClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        java.lang.String str8 = timeSeries4.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries4.createCopy(0, (int) ' ');
        timeSeries4.clear();
        timeSeries4.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries4.createCopy((int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.lang.String str7 = timeSeries4.getDescription();
        timeSeries4.setKey((java.lang.Comparable) 10L);
        boolean boolean10 = timeSeries4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        timeSeries2.setDescription("Overwritten values from: Overwritten values from: 4");
        long long33 = timeSeries2.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        timeSeries1.setMaximumItemCount((int) ' ');
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        int int8 = timeSeries5.getItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str15 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount((int) ' ');
        long long18 = timeSeries11.getMaximumItemAge();
        timeSeries11.setNotify(true);
        java.util.Collection collection21 = timeSeries11.getTimePeriods();
        boolean boolean22 = timeSeries5.equals((java.lang.Object) timeSeries11);
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class38);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries39.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries42);
        java.lang.Class<?> wildcardClass44 = timeSeries33.getClass();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass44);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "hi!", (java.lang.Class) wildcardClass44);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass44);
        java.util.Collection collection49 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        int int50 = timeSeries11.getMaximumItemCount();
        timeSeries11.removeAgedItems(false);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        java.lang.String str30 = timeSeries27.getDomainDescription();
        boolean boolean31 = timeSeries22.equals((java.lang.Object) timeSeries27);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.add(regularTimePeriod34, (double) (short) 1);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
        java.lang.String str14 = timeSeries2.getDescription();
        timeSeries2.setRangeDescription("Overwritten values from: -1");
        int int17 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod18, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        long long27 = timeSeries17.getMaximumItemAge();
        timeSeries17.setNotify(false);
        java.lang.String str30 = timeSeries17.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener31);
        java.lang.Class<?> wildcardClass33 = timeSeries17.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        timeSeries2.setRangeDescription("Time");
        boolean boolean14 = timeSeries2.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries2.createCopy((int) (short) 0, 97);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        boolean boolean31 = timeSeries22.equals((java.lang.Object) timeSeries27);
        java.lang.Comparable comparable32 = timeSeries27.getKey();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class34);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries35.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class40);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries41.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str45 = timeSeries41.getRangeDescription();
        timeSeries41.setMaximumItemCount((int) ' ');
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class49);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries50.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str54 = timeSeries50.getRangeDescription();
        timeSeries50.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        timeSeries50.removePropertyChangeListener(propertyChangeListener57);
        boolean boolean60 = timeSeries50.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries41.addAndOrUpdate(timeSeries50);
        boolean boolean62 = timeSeries61.getNotify();
        timeSeries61.setDomainDescription("hi!");
        java.util.Collection collection65 = timeSeries35.getTimePeriodsUniqueToOtherSeries(timeSeries61);
        timeSeries61.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries27.addAndOrUpdate(timeSeries61);
        timeSeries61.removeAgedItems(false);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 1 + "'", comparable32, 1);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value" + "'", str45, "Value");
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value" + "'", str54, "Value");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(timeSeries68);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        java.lang.String str8 = timeSeries4.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries4.createCopy(0, (int) ' ');
        java.lang.Comparable comparable12 = timeSeries4.getKey();
        int int13 = timeSeries4.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 1 + "'", comparable12, 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.lang.String str7 = timeSeries4.getDomainDescription();
        int int8 = timeSeries4.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries4.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener25);
        timeSeries11.setMaximumItemCount(100);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        timeSeries17.setRangeDescription("hi!");
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        timeSeries26.removeAgedItems(false);
        java.util.Collection collection29 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries17.createCopy((int) (short) 0, 100);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries34.addPropertyChangeListener(propertyChangeListener35);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj21 = timeSeries20.clone();
        java.lang.String str22 = timeSeries20.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener23);
        java.lang.String str25 = timeSeries20.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries12.addAndOrUpdate(timeSeries20);
        java.lang.String str27 = timeSeries26.getDescription();
        java.lang.Comparable comparable28 = timeSeries26.getKey();
        timeSeries26.clear();
        java.util.List list30 = timeSeries26.getItems();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "Overwritten values from: Overwritten values from: 4" + "'", comparable28, "Overwritten values from: Overwritten values from: 4");
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        boolean boolean9 = timeSeries2.getNotify();
        int int10 = timeSeries2.getItemCount();
        java.lang.Object obj11 = timeSeries2.clone();
        timeSeries2.setRangeDescription("Overwritten values from: 4");
        boolean boolean14 = timeSeries2.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) 'a', (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        boolean boolean9 = timeSeries2.getNotify();
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.removeAgedItems(true);
        java.util.Collection collection19 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        java.lang.Class class20 = timeSeries12.getTimePeriodClass();
        java.util.List list21 = timeSeries12.getItems();
        long long22 = timeSeries12.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update((int) (short) 100, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        java.lang.Class<?> wildcardClass26 = timeSeries15.getClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "hi!", (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "hi!", "Time", (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, "Overwritten values from: Overwritten values from: 4", "Value", (java.lang.Class) wildcardClass26);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Overwritten values from: -1");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod8, (java.lang.Number) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str40 = timeSeries36.getRangeDescription();
        timeSeries36.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener43);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class48);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries49.addChangeListener(seriesChangeListener50);
        boolean boolean52 = timeSeries36.equals((java.lang.Object) timeSeries49);
        timeSeries36.setDomainDescription("Value");
        timeSeries36.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener57);
        timeSeries36.removeAgedItems(true);
        java.util.Collection collection61 = timeSeries36.getTimePeriods();
        boolean boolean62 = timeSeries25.equals((java.lang.Object) collection61);
        int int63 = timeSeries25.getMaximumItemCount();
        java.lang.Class<?> wildcardClass64 = timeSeries25.getClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        timeSeries2.setRangeDescription("Time");
        boolean boolean14 = timeSeries2.isEmpty();
        java.lang.Object obj15 = timeSeries2.clone();
        int int16 = timeSeries2.getItemCount();
        timeSeries2.setDescription("Overwritten values from: Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class1);
        timeSeries2.fireSeriesChanged();
        timeSeries2.setDomainDescription("");
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setNotify(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.lang.String str18 = timeSeries17.getDescription();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries24.addAndOrUpdate(timeSeries33);
        java.lang.Class<?> wildcardClass35 = timeSeries24.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass35);
        java.lang.String str37 = timeSeries36.getDescription();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries17.addAndOrUpdate(timeSeries36);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class40);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries41.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str45 = timeSeries41.getRangeDescription();
        timeSeries41.setMaximumItemCount((int) ' ');
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class49);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries50.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str54 = timeSeries50.getRangeDescription();
        timeSeries50.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        timeSeries50.removePropertyChangeListener(propertyChangeListener57);
        boolean boolean60 = timeSeries50.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries41.addAndOrUpdate(timeSeries50);
        timeSeries41.removeAgedItems(true);
        boolean boolean64 = timeSeries41.isEmpty();
        boolean boolean65 = timeSeries17.equals((java.lang.Object) boolean64);
        java.util.Collection collection66 = timeSeries17.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        timeSeries17.removeChangeListener(seriesChangeListener67);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener69 = null;
        timeSeries17.addChangeListener(seriesChangeListener69);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value" + "'", str45, "Value");
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value" + "'", str54, "Value");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(collection66);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        timeSeries5.setMaximumItemAge(0L);
        java.lang.Class<?> wildcardClass9 = timeSeries5.getClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj21 = timeSeries20.clone();
        java.lang.String str22 = timeSeries20.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener23);
        java.lang.String str25 = timeSeries20.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries12.addAndOrUpdate(timeSeries20);
        java.lang.String str27 = timeSeries26.getDescription();
        timeSeries26.clear();
        boolean boolean29 = timeSeries26.getNotify();
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class33);
        java.util.List list35 = timeSeries34.getItems();
        timeSeries34.setMaximumItemCount((int) (short) 10);
        timeSeries34.removeAgedItems(true);
        timeSeries34.fireSeriesChanged();
        java.lang.Object obj41 = timeSeries34.clone();
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class43);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries44.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class49);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries50.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str54 = timeSeries50.getRangeDescription();
        timeSeries50.setMaximumItemCount((int) ' ');
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class58);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries59.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str63 = timeSeries59.getRangeDescription();
        timeSeries59.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        timeSeries59.removePropertyChangeListener(propertyChangeListener66);
        boolean boolean69 = timeSeries59.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries50.addAndOrUpdate(timeSeries59);
        boolean boolean71 = timeSeries70.getNotify();
        timeSeries70.setDomainDescription("hi!");
        java.util.Collection collection74 = timeSeries44.getTimePeriodsUniqueToOtherSeries(timeSeries70);
        timeSeries70.setDescription("Value");
        boolean boolean77 = timeSeries34.equals((java.lang.Object) timeSeries70);
        org.jfree.data.time.TimeSeries timeSeries78 = timeSeries26.addAndOrUpdate(timeSeries70);
        java.beans.PropertyChangeListener propertyChangeListener79 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener79);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value" + "'", str54, "Value");
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Value" + "'", str63, "Value");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(timeSeries78);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        java.lang.String str12 = timeSeries2.getRangeDescription();
        timeSeries2.removeAgedItems(false);
        int int15 = timeSeries2.getMaximumItemCount();
        timeSeries2.fireSeriesChanged();
        timeSeries2.setRangeDescription("Overwritten values from: -1");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        java.lang.Number number20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod19, number20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, class1);
        int int3 = timeSeries2.getMaximumItemCount();
        java.lang.String str4 = timeSeries2.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        java.util.Collection collection23 = timeSeries2.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener26);
        java.lang.String str28 = timeSeries2.getRangeDescription();
        timeSeries2.removeAgedItems(false);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        java.lang.String str25 = timeSeries23.getRangeDescription();
        timeSeries23.setNotify(true);
        boolean boolean28 = timeSeries23.getNotify();
        timeSeries23.setNotify(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.add(timeSeriesDataItem31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries20);
        java.lang.Class<?> wildcardClass22 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "Time", "Overwritten values from: Overwritten values from: 4", (java.lang.Class) wildcardClass22);
        timeSeries27.clear();
        timeSeries27.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Value", "", class3);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str11 = timeSeries7.getRangeDescription();
        timeSeries7.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener14);
        timeSeries7.setNotify(false);
        java.util.Collection collection18 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        long long17 = timeSeries16.getMaximumItemAge();
        timeSeries16.fireSeriesChanged();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        long long22 = timeSeries21.getMaximumItemAge();
        timeSeries21.setDescription("hi!");
        boolean boolean25 = timeSeries21.getNotify();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries21);
        java.util.Collection collection27 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        timeSeries21.setKey((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        timeSeries5.setRangeDescription("Value");
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class13);
        java.util.List list15 = timeSeries14.getItems();
        java.lang.String str16 = timeSeries14.getRangeDescription();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.addAndOrUpdate(timeSeries28);
        boolean boolean30 = timeSeries14.equals((java.lang.Object) timeSeries28);
        int int31 = timeSeries28.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries5.addAndOrUpdate(timeSeries28);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.update((int) '4', (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries32);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        timeSeries12.setMaximumItemCount((int) 'a');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class20);
        java.util.List list22 = timeSeries21.getItems();
        timeSeries21.setMaximumItemCount((int) (short) 10);
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class28);
        java.util.List list30 = timeSeries29.getItems();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries21.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        timeSeries12.setNotify(false);
        int int35 = timeSeries12.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries12.removeChangeListener(seriesChangeListener36);
        int int38 = timeSeries12.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class1);
        timeSeries2.setRangeDescription("");
        timeSeries2.setMaximumItemCount((int) '#');
        timeSeries2.setRangeDescription("");
        java.lang.Class class9 = timeSeries2.getTimePeriodClass();
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        timeSeries2.removeAgedItems(true);
        int int27 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries4.createCopy(32, 100);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        timeSeries18.setMaximumItemAge(1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries18.addChangeListener(seriesChangeListener23);
        timeSeries18.setDescription("");
        timeSeries18.setMaximumItemCount((int) 'a');
        int int29 = timeSeries18.getItemCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        long long20 = timeSeries17.getMaximumItemAge();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class24);
        java.util.List list26 = timeSeries25.getItems();
        timeSeries25.setDomainDescription("Time");
        java.lang.String str29 = timeSeries25.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.createCopy(0, (int) ' ');
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries17.addAndOrUpdate(timeSeries32);
        int int34 = timeSeries32.getMaximumItemCount();
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class36);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries37.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str41 = timeSeries37.getRangeDescription();
        timeSeries37.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener44);
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class49);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries50.addChangeListener(seriesChangeListener51);
        boolean boolean53 = timeSeries37.equals((java.lang.Object) timeSeries50);
        timeSeries37.setDomainDescription("Value");
        timeSeries37.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener58);
        timeSeries37.removeAgedItems(true);
        java.util.Collection collection62 = timeSeries37.getTimePeriods();
        java.lang.String str63 = timeSeries37.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries32.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod65 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries32.update(regularTimePeriod65, (java.lang.Number) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value" + "'", str41, "Value");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Value" + "'", str63, "Value");
        org.junit.Assert.assertNotNull(timeSeries64);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener16);
        timeSeries9.setNotify(false);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries31);
        boolean boolean34 = timeSeries32.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries32.removeChangeListener(seriesChangeListener35);
        java.util.Collection collection37 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        java.lang.Object obj38 = timeSeries32.clone();
        timeSeries32.setDomainDescription("Value");
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class42);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries43.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str47 = timeSeries43.getRangeDescription();
        timeSeries43.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        timeSeries43.addPropertyChangeListener(propertyChangeListener50);
        java.lang.Class class55 = null;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class55);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries56.addChangeListener(seriesChangeListener57);
        boolean boolean59 = timeSeries43.equals((java.lang.Object) timeSeries56);
        timeSeries43.setDomainDescription("Value");
        timeSeries43.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        timeSeries43.addPropertyChangeListener(propertyChangeListener64);
        timeSeries43.removeAgedItems(true);
        java.util.Collection collection68 = timeSeries43.getTimePeriods();
        boolean boolean69 = timeSeries32.equals((java.lang.Object) collection68);
        boolean boolean70 = timeSeries4.equals((java.lang.Object) timeSeries32);
        timeSeries32.setNotify(true);
        java.util.Collection collection73 = timeSeries32.getTimePeriods();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value" + "'", str47, "Value");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(collection73);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        long long7 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        timeSeries2.removeAgedItems(true);
        long long12 = timeSeries2.getMaximumItemAge();
        java.lang.Comparable comparable13 = timeSeries2.getKey();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Value", "", class3);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str11 = timeSeries7.getRangeDescription();
        timeSeries7.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener14);
        timeSeries7.setNotify(false);
        java.util.Collection collection18 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries7.addChangeListener(seriesChangeListener19);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class24);
        java.util.List list26 = timeSeries25.getItems();
        timeSeries25.setDomainDescription("Time");
        java.lang.String str29 = timeSeries25.getRangeDescription();
        java.util.Collection collection30 = timeSeries25.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries7.addAndOrUpdate(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        java.util.Collection collection23 = timeSeries2.getTimePeriods();
        boolean boolean24 = timeSeries2.getNotify();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries2.createCopy(0, (int) (short) 1);
        timeSeries2.setMaximumItemCount((int) (short) 100);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries6.addAndOrUpdate(timeSeries15);
        java.lang.Class<?> wildcardClass17 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass17);
        timeSeries19.setNotify(false);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        java.util.List list27 = timeSeries26.getItems();
        java.lang.String str28 = timeSeries26.getRangeDescription();
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class36);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries37.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries31.addAndOrUpdate(timeSeries40);
        boolean boolean42 = timeSeries26.equals((java.lang.Object) timeSeries40);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries19.addAndOrUpdate(timeSeries40);
        timeSeries43.setMaximumItemCount(97);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeSeries43);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        timeSeries4.setRangeDescription("hi!");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class8);
        java.util.Collection collection10 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        long long11 = timeSeries9.getMaximumItemAge();
        timeSeries9.setDescription("Overwritten values from: 4");
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str20 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount((int) ' ');
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean35 = timeSeries25.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries16.addAndOrUpdate(timeSeries25);
        java.util.Collection collection37 = timeSeries16.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries16.addPropertyChangeListener(propertyChangeListener38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener40);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries9.addAndOrUpdate(timeSeries16);
        int int43 = timeSeries42.getItemCount();
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries23);
        java.lang.Class<?> wildcardClass25 = timeSeries14.getClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Value", (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "", "hi!", (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), (java.lang.Class) wildcardClass25);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timeSeries2.getKey();
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod10, (java.lang.Number) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + '4' + "'", comparable8, '4');
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.lang.String str7 = timeSeries4.getDescription();
        timeSeries4.setKey((java.lang.Comparable) 10L);
        timeSeries4.setRangeDescription("Time");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Value", (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "", "hi!", (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, (java.lang.Class) wildcardClass24);
        boolean boolean30 = timeSeries29.getNotify();
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
        java.util.List list54 = timeSeries42.getItems();
        timeSeries42.setRangeDescription("Overwritten values from: -1");
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries42.createCopy((int) (short) 0, 0);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries42.createCopy((int) (short) 0, 32);
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries29.addAndOrUpdate(timeSeries42);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener64 = null;
        timeSeries63.removeChangeListener(seriesChangeListener64);
        int int66 = timeSeries63.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value" + "'", str46, "Value");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries12);
        boolean boolean15 = timeSeries13.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries13.removeChangeListener(seriesChangeListener16);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str24 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener27);
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class32);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries33.addChangeListener(seriesChangeListener34);
        boolean boolean36 = timeSeries20.equals((java.lang.Object) timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries13.addAndOrUpdate(timeSeries33);
        java.lang.Class<?> wildcardClass38 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, (java.lang.Class) wildcardClass38);
        boolean boolean40 = timeSeries39.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries39.add(timeSeriesDataItem41, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(timeSeriesDataItem29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
        java.lang.String str14 = timeSeries2.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries2.removeChangeListener(seriesChangeListener15);
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
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries42.removePropertyChangeListener(propertyChangeListener48);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries2.addAndOrUpdate(timeSeries42);
        timeSeries2.fireSeriesChanged();
        timeSeries2.setRangeDescription("");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(timeSeries50);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener31);
        timeSeries2.setMaximumItemAge((long) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod35, (-1.0d), false);
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
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        timeSeries1.setDomainDescription("Time");
        timeSeries1.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries6.addChangeListener(seriesChangeListener7);
        java.util.Collection collection9 = timeSeries6.getTimePeriods();
        timeSeries6.setDomainDescription("Time");
        timeSeries6.fireSeriesChanged();
        java.lang.Class<?> wildcardClass13 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, (java.lang.Class) wildcardClass13);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        boolean boolean14 = timeSeries12.equals((java.lang.Object) 0);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj21 = timeSeries20.clone();
        java.lang.String str22 = timeSeries20.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener23);
        java.lang.String str25 = timeSeries20.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries12.addAndOrUpdate(timeSeries20);
        java.lang.String str27 = timeSeries20.getDomainDescription();
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str34 = timeSeries30.getRangeDescription();
        long long35 = timeSeries30.getMaximumItemAge();
        timeSeries30.clear();
        int int37 = timeSeries30.getItemCount();
        java.util.Collection collection38 = timeSeries30.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries20.addAndOrUpdate(timeSeries30);
        java.lang.String str40 = timeSeries39.getDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Time" + "'", str27, "Time");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries2.removeChangeListener(seriesChangeListener13);
        java.lang.Object obj15 = timeSeries2.clone();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.lang.String str18 = timeSeries17.getDescription();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str25 = timeSeries21.getRangeDescription();
        int int26 = timeSeries21.getMaximumItemCount();
        boolean boolean27 = timeSeries17.equals((java.lang.Object) int26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class31);
        java.util.List list33 = timeSeries32.getItems();
        java.lang.String str34 = timeSeries32.getRangeDescription();
        boolean boolean35 = timeSeries32.isEmpty();
        int int36 = timeSeries32.getItemCount();
        int int37 = timeSeries32.getMaximumItemCount();
        boolean boolean38 = timeSeries17.equals((java.lang.Object) int37);
        timeSeries17.setDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries17.removeChangeListener(seriesChangeListener41);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        timeSeries2.removeAgedItems(true);
        java.util.Collection collection27 = timeSeries2.getTimePeriods();
        java.lang.String str28 = timeSeries2.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries2.addChangeListener(seriesChangeListener29);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
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
        long long20 = timeSeries17.getMaximumItemAge();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class24);
        java.util.List list26 = timeSeries25.getItems();
        timeSeries25.setDomainDescription("Time");
        java.lang.String str29 = timeSeries25.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.createCopy(0, (int) ' ');
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries17.addAndOrUpdate(timeSeries32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        java.lang.String str35 = timeSeries33.getRangeDescription();
        int int36 = timeSeries33.getItemCount();
        java.lang.String str37 = timeSeries33.getDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class3);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str8 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemCount((int) ' ');
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        timeSeries13.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean23 = timeSeries13.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries4.addAndOrUpdate(timeSeries13);
        timeSeries4.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries4.addChangeListener(seriesChangeListener27);
        java.lang.Class<?> wildcardClass29 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass29);
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class32);
        timeSeries33.setRangeDescription("");
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class37);
        timeSeries38.setRangeDescription("");
        java.util.Collection collection41 = timeSeries33.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        boolean boolean42 = timeSeries30.equals((java.lang.Object) timeSeries38);
        java.lang.Class<?> wildcardClass43 = timeSeries30.getClass();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass43);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries44.add(regularTimePeriod45, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        timeSeries12.setRangeDescription("Time");
        timeSeries12.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries12.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries2.removeChangeListener(seriesChangeListener3);
        timeSeries2.setMaximumItemCount((int) 'a');
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        int int29 = timeSeries2.getMaximumItemCount();
        timeSeries2.setNotify(false);
        timeSeries2.setDomainDescription("Overwritten values from: 1");
        java.lang.Class class34 = timeSeries2.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener35);
        java.lang.Comparable comparable37 = timeSeries2.getKey();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + '4' + "'", comparable37, '4');
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener16);
        timeSeries9.setNotify(false);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries31);
        boolean boolean34 = timeSeries32.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries32.removeChangeListener(seriesChangeListener35);
        java.util.Collection collection37 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        java.lang.Object obj38 = timeSeries32.clone();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Overwritten values from: 4", "Overwritten values from: Overwritten values from: 4", (java.lang.Class) wildcardClass39);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "Overwritten values from: -1", (java.lang.Class) wildcardClass39);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, (java.lang.Class) wildcardClass39);
        java.lang.Object obj43 = timeSeries42.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries42.add(regularTimePeriod44, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        timeSeries2.removeAgedItems(false);
        int int14 = timeSeries2.getMaximumItemCount();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries2.equals(obj15);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class23);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries24.addAndOrUpdate(timeSeries33);
        java.lang.Class<?> wildcardClass35 = timeSeries24.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass35);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass35);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass35);
        timeSeries38.clear();
        timeSeries38.setMaximumItemAge(100L);
        java.util.Collection collection42 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        timeSeries38.setMaximumItemAge((long) '4');
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.setDescription("Time");
        timeSeries5.setRangeDescription("Overwritten values from: 1");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries5.removeChangeListener(seriesChangeListener10);
        org.junit.Assert.assertNotNull(timeSeries5);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries2.addOrUpdate(regularTimePeriod13, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        long long7 = timeSeries2.getMaximumItemAge();
        java.lang.String str8 = timeSeries2.getDescription();
        timeSeries2.fireSeriesChanged();
        java.util.List list10 = timeSeries2.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        java.lang.Comparable comparable24 = timeSeries22.getKey();
        java.util.List list25 = timeSeries22.getItems();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class34);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries35.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class40);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries41.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries35.addAndOrUpdate(timeSeries44);
        java.lang.Class<?> wildcardClass46 = timeSeries35.getClass();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass46);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Value", (java.lang.Class) wildcardClass46);
        boolean boolean50 = timeSeries22.equals((java.lang.Object) timeSeries49);
        timeSeries22.setDescription("Overwritten values from: 4");
        int int53 = timeSeries22.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = timeSeries22.getTimePeriod(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + "Overwritten values from: 4" + "'", comparable24, "Overwritten values from: 4");
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.String str10 = timeSeries2.getDomainDescription();
        timeSeries2.removeAgedItems(true);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        java.lang.Comparable comparable22 = timeSeries20.getKey();
        java.lang.Class class23 = timeSeries20.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "Overwritten values from: 4", "Time", class23);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + '#' + "'", comparable22, '#');
        org.junit.Assert.assertNotNull(class23);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        int int6 = timeSeries2.getMaximumItemCount();
        int int7 = timeSeries2.getItemCount();
        java.util.Collection collection8 = timeSeries2.getTimePeriods();
        timeSeries2.setMaximumItemCount((int) (byte) 10);
        java.lang.Object obj11 = timeSeries2.clone();
        timeSeries2.setNotify(true);
        int int14 = timeSeries2.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class6);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries7.addAndOrUpdate(timeSeries16);
        java.lang.Class<?> wildcardClass18 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass18);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, (java.lang.Class) wildcardClass18);
        java.lang.Object obj22 = null;
        boolean boolean23 = timeSeries21.equals(obj22);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.delete((int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) ' ');
        boolean boolean13 = timeSeries2.getNotify();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str20 = timeSeries16.getRangeDescription();
        int int21 = timeSeries16.getMaximumItemCount();
        timeSeries16.setDomainDescription("Value");
        java.lang.Class class24 = timeSeries16.getTimePeriodClass();
        java.lang.String str25 = timeSeries16.getDomainDescription();
        java.lang.String str26 = timeSeries16.getRangeDescription();
        timeSeries16.removeAgedItems(false);
        java.lang.Comparable comparable29 = timeSeries16.getKey();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries2.addAndOrUpdate(timeSeries16);
        java.lang.String str31 = timeSeries2.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems((long) 2147483647, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + '4' + "'", comparable29, '4');
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Time" + "'", str31, "Time");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener14);
        java.lang.Class class16 = timeSeries2.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        java.lang.String str12 = timeSeries2.getRangeDescription();
        timeSeries2.removeAgedItems(false);
        int int15 = timeSeries2.getMaximumItemCount();
        timeSeries2.fireSeriesChanged();
        timeSeries2.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) (byte) 0, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        java.lang.String str9 = timeSeries2.getDomainDescription();
        timeSeries2.setMaximumItemCount(1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries2.removeChangeListener(seriesChangeListener12);
        timeSeries2.setDescription("");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        timeSeries12.setRangeDescription("");
        java.lang.String str22 = timeSeries12.getRangeDescription();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount((int) ' ');
        long long32 = timeSeries25.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries25.createCopy((int) (short) 0, (int) (short) 1);
        boolean boolean36 = timeSeries25.getNotify();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries12.addAndOrUpdate(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Overwritten values from: 4" + "'", comparable19, "Overwritten values from: 4");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9223372036854775807L + "'", long32 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setMaximumItemCount((int) (short) 10);
        timeSeries4.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries4.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.removeAgedItems(false);
        java.lang.String str8 = timeSeries5.getDomainDescription();
        timeSeries5.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        java.util.Collection collection31 = timeSeries2.getTimePeriods();
        java.util.List list32 = timeSeries2.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod33, (java.lang.Number) 1.0d, true);
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
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        java.lang.Comparable comparable24 = timeSeries22.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries22.getDataItem(regularTimePeriod25);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + "Overwritten values from: 4" + "'", comparable24, "Overwritten values from: 4");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Comparable comparable7 = timeSeries4.getKey();
        timeSeries4.removeAgedItems(true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean8 = timeSeries2.equals((java.lang.Object) 10L);
        int int9 = timeSeries2.getMaximumItemCount();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class15);
        java.util.List list17 = timeSeries16.getItems();
        timeSeries16.setDomainDescription("Time");
        java.lang.String str20 = timeSeries16.getRangeDescription();
        boolean boolean21 = timeSeries2.equals((java.lang.Object) str20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        boolean boolean20 = timeSeries17.isEmpty();
        timeSeries17.setKey((java.lang.Comparable) 1L);
        timeSeries17.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        timeSeries12.setNotify(true);
        timeSeries12.setDescription("Overwritten values from: -1");
        timeSeries12.removeAgedItems(false);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(class18);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener31);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class36);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.addChangeListener(seriesChangeListener38);
        java.util.Collection collection40 = timeSeries37.getTimePeriods();
        timeSeries37.setDomainDescription("Time");
        timeSeries37.fireSeriesChanged();
        boolean boolean44 = timeSeries2.equals((java.lang.Object) timeSeries37);
        int int45 = timeSeries2.getMaximumItemCount();
        boolean boolean46 = timeSeries2.getNotify();
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class48);
        long long50 = timeSeries49.getMaximumItemAge();
        timeSeries49.fireSeriesChanged();
        java.util.Collection collection52 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries49);
        java.lang.Class class56 = null;
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class56);
        java.util.List list58 = timeSeries57.getItems();
        java.lang.String str59 = timeSeries57.getRangeDescription();
        timeSeries57.removeAgedItems(true);
        java.lang.Class class62 = timeSeries57.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries57.createCopy((int) (byte) 1, (int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries2.addAndOrUpdate(timeSeries65);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem69 = timeSeries2.addOrUpdate(regularTimePeriod67, (double) (-1L));
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
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 32 + "'", int45 == 32);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 9223372036854775807L + "'", long50 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(class62);
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(timeSeries66);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        int int11 = timeSeries4.getItemCount();
        boolean boolean12 = timeSeries4.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeSeries4.getIndex(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
        timeSeries2.fireSeriesChanged();
        timeSeries2.clear();
        timeSeries2.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        timeSeries37.fireSeriesChanged();
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class43);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries44.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class49);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries50.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries44.addAndOrUpdate(timeSeries53);
        java.lang.Class<?> wildcardClass55 = timeSeries44.getClass();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass55);
        java.util.List list57 = timeSeries56.getItems();
        java.lang.Comparable comparable58 = timeSeries56.getKey();
        java.lang.Class class59 = timeSeries56.getTimePeriodClass();
        java.lang.Class class61 = null;
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class61);
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries62.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str66 = timeSeries62.getRangeDescription();
        timeSeries62.setMaximumItemCount((int) ' ');
        java.lang.Class class70 = null;
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class70);
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries71.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str75 = timeSeries71.getRangeDescription();
        timeSeries71.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        timeSeries71.removePropertyChangeListener(propertyChangeListener78);
        boolean boolean81 = timeSeries71.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries62.addAndOrUpdate(timeSeries71);
        org.jfree.data.time.TimeSeries timeSeries85 = timeSeries82.createCopy(1, (int) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries86 = timeSeries56.addAndOrUpdate(timeSeries82);
        boolean boolean87 = timeSeries37.equals((java.lang.Object) timeSeries86);
        org.jfree.data.time.TimeSeries timeSeries88 = timeSeries2.addAndOrUpdate(timeSeries86);
        java.beans.PropertyChangeListener propertyChangeListener89 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener89);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertEquals("'" + comparable58 + "' != '" + '#' + "'", comparable58, '#');
        org.junit.Assert.assertNotNull(class59);
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Value" + "'", str66, "Value");
        org.junit.Assert.assertNotNull(timeSeries74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Value" + "'", str75, "Value");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(timeSeries82);
        org.junit.Assert.assertNotNull(timeSeries85);
        org.junit.Assert.assertNotNull(timeSeries86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(timeSeries88);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Value", (java.lang.Class) wildcardClass20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries23.getDataItem(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
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
        boolean boolean29 = timeSeries28.getNotify();
        timeSeries28.setDomainDescription("hi!");
        java.util.Collection collection32 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        timeSeries28.setDescription("Value");
        timeSeries28.fireSeriesChanged();
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class37);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries38.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str42 = timeSeries38.getRangeDescription();
        timeSeries38.removeAgedItems(true);
        boolean boolean45 = timeSeries38.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries38.removeChangeListener(seriesChangeListener46);
        boolean boolean48 = timeSeries28.equals((java.lang.Object) timeSeries38);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value" + "'", str42, "Value");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        java.util.Collection collection20 = timeSeries17.getTimePeriods();
        timeSeries17.setDomainDescription("Time");
        java.util.Collection collection23 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries12.removeChangeListener(seriesChangeListener24);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L);
        timeSeries1.removeAgedItems(false);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass20);
        java.util.List list22 = timeSeries21.getItems();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        boolean boolean30 = timeSeries21.equals((java.lang.Object) timeSeries25);
        timeSeries25.setMaximumItemCount((int) (byte) 0);
        timeSeries25.setRangeDescription("Time");
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class36);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries37.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class42);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries43.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str47 = timeSeries43.getRangeDescription();
        timeSeries43.setMaximumItemCount((int) ' ');
        java.lang.Class class51 = null;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class51);
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries52.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str56 = timeSeries52.getRangeDescription();
        timeSeries52.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        timeSeries52.removePropertyChangeListener(propertyChangeListener59);
        boolean boolean62 = timeSeries52.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries43.addAndOrUpdate(timeSeries52);
        boolean boolean64 = timeSeries63.isEmpty();
        java.lang.Class class65 = timeSeries63.getTimePeriodClass();
        java.lang.Class class66 = timeSeries63.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries37.addAndOrUpdate(timeSeries63);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        timeSeries63.removePropertyChangeListener(propertyChangeListener68);
        java.util.Collection collection70 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries63);
        org.jfree.data.time.TimeSeries timeSeries71 = timeSeries1.addAndOrUpdate(timeSeries25);
        boolean boolean72 = timeSeries71.isEmpty();
        java.lang.String str73 = timeSeries71.getDomainDescription();
        boolean boolean74 = timeSeries71.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value" + "'", str47, "Value");
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Value" + "'", str56, "Value");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(class65);
        org.junit.Assert.assertNull(class66);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(timeSeries71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Time" + "'", str73, "Time");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        java.lang.String str25 = timeSeries23.getRangeDescription();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj32 = timeSeries31.clone();
        java.lang.String str33 = timeSeries31.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries31.removePropertyChangeListener(propertyChangeListener34);
        java.util.Collection collection36 = timeSeries23.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.List list37 = timeSeries23.getItems();
        java.lang.Class class38 = timeSeries23.getTimePeriodClass();
        boolean boolean39 = timeSeries23.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.update(regularTimePeriod40, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        boolean boolean31 = timeSeries22.equals((java.lang.Object) timeSeries27);
        java.lang.Comparable comparable32 = timeSeries27.getKey();
        timeSeries27.setRangeDescription("Value");
        long long35 = timeSeries27.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 1 + "'", comparable32, 1);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries5.addChangeListener(seriesChangeListener6);
        java.util.Collection collection8 = timeSeries5.getTimePeriods();
        timeSeries5.setDomainDescription("Time");
        timeSeries5.fireSeriesChanged();
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass12);
        int int14 = timeSeries13.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        java.lang.Number number16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod15, number16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setMaximumItemCount((int) (short) 10);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class11);
        java.util.List list13 = timeSeries12.getItems();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.addAndOrUpdate(timeSeries12);
        timeSeries4.clear();
        java.lang.Class class16 = timeSeries4.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update((int) 'a', (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        java.lang.Class<?> wildcardClass6 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "", "Overwritten values from: 1", (java.lang.Class) wildcardClass6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, (java.lang.Class) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        timeSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        boolean boolean6 = timeSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        boolean boolean9 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class9);
        timeSeries10.setRangeDescription("hi!");
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class14);
        java.util.Collection collection16 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.util.Collection collection17 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries15);
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
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class36);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries37.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str41 = timeSeries37.getRangeDescription();
        timeSeries37.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener44);
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class49);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries50.addChangeListener(seriesChangeListener51);
        boolean boolean53 = timeSeries37.equals((java.lang.Object) timeSeries50);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries30.addAndOrUpdate(timeSeries50);
        java.lang.String str55 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries5.addAndOrUpdate(timeSeries30);
        timeSeries56.setKey((java.lang.Comparable) (byte) 10);
        timeSeries56.setMaximumItemAge((long) 0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem61 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries56.add(timeSeriesDataItem61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value" + "'", str41, "Value");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Value" + "'", str55, "Value");
        org.junit.Assert.assertNotNull(timeSeries56);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        java.lang.Object obj37 = timeSeries31.clone();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Overwritten values from: 4", "Overwritten values from: Overwritten values from: 4", (java.lang.Class) wildcardClass38);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "Overwritten values from: -1", (java.lang.Class) wildcardClass38);
        timeSeries40.clear();
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj6 = timeSeries5.clone();
        java.lang.String str7 = timeSeries5.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener8);
        timeSeries5.setDomainDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries5.removeChangeListener(seriesChangeListener12);
        timeSeries5.fireSeriesChanged();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class18);
        java.util.List list20 = timeSeries19.getItems();
        timeSeries19.setMaximumItemCount((int) (short) 10);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class26);
        java.util.List list28 = timeSeries27.getItems();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.addAndOrUpdate(timeSeries27);
        long long30 = timeSeries29.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries29.createCopy(0, 10);
        timeSeries33.setDescription("");
        java.lang.Comparable comparable36 = timeSeries33.getKey();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        timeSeries39.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries39.addChangeListener(seriesChangeListener42);
        boolean boolean44 = timeSeries39.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        timeSeries39.removeChangeListener(seriesChangeListener45);
        java.lang.Class<?> wildcardClass47 = timeSeries39.getClass();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass47);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries33.addAndOrUpdate(timeSeries48);
        boolean boolean50 = timeSeries5.equals((java.lang.Object) timeSeries33);
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class52);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries53.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str57 = timeSeries53.getRangeDescription();
        timeSeries53.setMaximumItemCount((int) ' ');
        timeSeries53.setMaximumItemAge((long) (short) 100);
        timeSeries53.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries5.addAndOrUpdate(timeSeries53);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        timeSeries64.addPropertyChangeListener(propertyChangeListener65);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + "Overwritten values from: 1" + "'", comparable36, "Overwritten values from: 1");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Value" + "'", str57, "Value");
        org.junit.Assert.assertNotNull(timeSeries64);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        java.lang.String str22 = timeSeries20.getDescription();
        java.lang.Class class23 = timeSeries20.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Value", "hi!", class23);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj31 = timeSeries30.clone();
        java.lang.String str32 = timeSeries30.getDescription();
        int int33 = timeSeries30.getItemCount();
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str40 = timeSeries36.getRangeDescription();
        timeSeries36.setMaximumItemCount((int) ' ');
        long long43 = timeSeries36.getMaximumItemAge();
        timeSeries36.setNotify(true);
        java.util.Collection collection46 = timeSeries36.getTimePeriods();
        boolean boolean47 = timeSeries30.equals((java.lang.Object) timeSeries36);
        int int48 = timeSeries30.getMaximumItemCount();
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class52);
        java.util.List list54 = timeSeries53.getItems();
        java.lang.String str55 = timeSeries53.getRangeDescription();
        timeSeries53.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries53.createCopy((int) (short) 10, (int) '4');
        timeSeries60.setNotify(false);
        boolean boolean63 = timeSeries30.equals((java.lang.Object) timeSeries60);
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries24.addAndOrUpdate(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 9223372036854775807L + "'", long43 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(timeSeries64);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener16);
        timeSeries9.setNotify(false);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries31);
        boolean boolean34 = timeSeries32.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries32.removeChangeListener(seriesChangeListener35);
        java.util.Collection collection37 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        java.lang.Object obj38 = timeSeries32.clone();
        timeSeries32.setDomainDescription("Value");
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class42);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries43.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str47 = timeSeries43.getRangeDescription();
        timeSeries43.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        timeSeries43.addPropertyChangeListener(propertyChangeListener50);
        java.lang.Class class55 = null;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class55);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries56.addChangeListener(seriesChangeListener57);
        boolean boolean59 = timeSeries43.equals((java.lang.Object) timeSeries56);
        timeSeries43.setDomainDescription("Value");
        timeSeries43.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        timeSeries43.addPropertyChangeListener(propertyChangeListener64);
        timeSeries43.removeAgedItems(true);
        java.util.Collection collection68 = timeSeries43.getTimePeriods();
        boolean boolean69 = timeSeries32.equals((java.lang.Object) collection68);
        boolean boolean70 = timeSeries4.equals((java.lang.Object) timeSeries32);
        timeSeries4.removeAgedItems(true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value" + "'", str47, "Value");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        java.lang.Class class24 = timeSeries22.getTimePeriodClass();
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str31 = timeSeries27.getRangeDescription();
        timeSeries27.setMaximumItemCount(0);
        boolean boolean34 = timeSeries22.equals((java.lang.Object) timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries22.addOrUpdate(regularTimePeriod35, (double) 35);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.createCopy((int) (short) 0, (int) (short) 1);
        java.lang.Comparable comparable13 = timeSeries12.getKey();
        java.lang.Class class14 = timeSeries12.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries2.removeChangeListener(seriesChangeListener11);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        java.util.Collection collection26 = timeSeries25.getTimePeriods();
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class28);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries29.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class34);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries35.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries29.addAndOrUpdate(timeSeries38);
        boolean boolean41 = timeSeries39.equals((java.lang.Object) 0);
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class43);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries44.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj48 = timeSeries47.clone();
        java.lang.String str49 = timeSeries47.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        timeSeries47.removePropertyChangeListener(propertyChangeListener50);
        java.lang.String str52 = timeSeries47.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries39.addAndOrUpdate(timeSeries47);
        java.lang.String str54 = timeSeries53.getDescription();
        timeSeries53.clear();
        java.util.List list56 = timeSeries53.getItems();
        timeSeries53.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries25.addAndOrUpdate(timeSeries53);
        java.util.Collection collection60 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Time" + "'", str52, "Time");
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass20);
        java.util.List list22 = timeSeries21.getItems();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        timeSeries21.setRangeDescription("hi!");
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class29);
        timeSeries30.removeAgedItems(false);
        java.util.Collection collection33 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries2.addAndOrUpdate(timeSeries30);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        java.util.List list36 = timeSeries34.getItems();
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class38);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries39.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj43 = timeSeries42.clone();
        java.lang.String str44 = timeSeries42.getDescription();
        int int45 = timeSeries42.getItemCount();
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class47);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries48.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str52 = timeSeries48.getRangeDescription();
        timeSeries48.setMaximumItemCount((int) ' ');
        long long55 = timeSeries48.getMaximumItemAge();
        timeSeries48.setNotify(true);
        java.util.Collection collection58 = timeSeries48.getTimePeriods();
        boolean boolean59 = timeSeries42.equals((java.lang.Object) timeSeries48);
        int int60 = timeSeries42.getMaximumItemCount();
        java.lang.Class class64 = null;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class64);
        java.util.List list66 = timeSeries65.getItems();
        java.lang.String str67 = timeSeries65.getRangeDescription();
        timeSeries65.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries65.createCopy((int) (short) 10, (int) '4');
        timeSeries72.setNotify(false);
        boolean boolean75 = timeSeries42.equals((java.lang.Object) timeSeries72);
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries34.addAndOrUpdate(timeSeries72);
        java.beans.PropertyChangeListener propertyChangeListener77 = null;
        timeSeries34.removePropertyChangeListener(propertyChangeListener77);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + '#' + "'", comparable23, '#');
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value" + "'", str52, "Value");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 9223372036854775807L + "'", long55 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(timeSeries72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(timeSeries76);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        int int21 = timeSeries18.getMaximumItemCount();
        java.lang.Object obj22 = timeSeries18.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        java.lang.String str25 = timeSeries23.getRangeDescription();
        timeSeries23.setNotify(true);
        boolean boolean28 = timeSeries23.getNotify();
        java.util.Collection collection29 = timeSeries23.getTimePeriods();
        int int30 = timeSeries23.getMaximumItemCount();
        timeSeries23.clear();
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        long long37 = timeSeries36.getMaximumItemAge();
        timeSeries36.fireSeriesChanged();
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class40);
        long long42 = timeSeries41.getMaximumItemAge();
        timeSeries41.setDescription("hi!");
        boolean boolean45 = timeSeries41.getNotify();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries36.addAndOrUpdate(timeSeries41);
        timeSeries46.fireSeriesChanged();
        timeSeries46.clear();
        java.lang.Class<?> wildcardClass49 = timeSeries46.getClass();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, (java.lang.Class) wildcardClass49);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass49);
        timeSeries51.setKey((java.lang.Comparable) 10.0f);
        java.lang.Object obj54 = timeSeries51.clone();
        boolean boolean55 = timeSeries23.equals((java.lang.Object) timeSeries51);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 9223372036854775807L + "'", long37 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        java.lang.String str5 = timeSeries1.getDomainDescription();
        java.util.List list6 = timeSeries1.getItems();
        boolean boolean7 = timeSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null; // flaky: timeSeries1.getDataItem((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timeSeries2.getKey();
        java.lang.String str9 = timeSeries2.getDescription();
        java.lang.String str10 = timeSeries2.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries2.removeChangeListener(seriesChangeListener11);
        timeSeries2.setDescription("Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + '4' + "'", comparable8, '4');
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        timeSeries4.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Comparable comparable7 = timeSeries4.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries4.addChangeListener(seriesChangeListener8);
        int int10 = timeSeries4.getMaximumItemCount();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str17 = timeSeries13.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries4.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        int int22 = timeSeries20.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries13.addAndOrUpdate(timeSeries20);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries14);
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass16);
        java.lang.Object obj18 = timeSeries17.clone();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries3.removeChangeListener(seriesChangeListener28);
        java.lang.String str30 = timeSeries3.getDescription();
        timeSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener32);
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class37);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries38.addChangeListener(seriesChangeListener39);
        java.util.Collection collection41 = timeSeries38.getTimePeriods();
        timeSeries38.setDomainDescription("Time");
        timeSeries38.fireSeriesChanged();
        boolean boolean45 = timeSeries3.equals((java.lang.Object) timeSeries38);
        java.lang.Class<?> wildcardClass46 = timeSeries38.getClass();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: Overwritten values from: 4", (java.lang.Class) wildcardClass46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        boolean boolean50 = timeSeries49.isEmpty();
        java.lang.String str51 = timeSeries49.getDescription();
        java.util.Collection collection52 = timeSeries47.getTimePeriodsUniqueToOtherSeries(timeSeries49);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(collection52);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        boolean boolean2 = timeSeries1.isEmpty();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        int int4 = timeSeries1.getItemCount();
        java.lang.Class class5 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + '4' + "'", comparable3, '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener31);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class36);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.addChangeListener(seriesChangeListener38);
        java.util.Collection collection40 = timeSeries37.getTimePeriods();
        timeSeries37.setDomainDescription("Time");
        timeSeries37.fireSeriesChanged();
        boolean boolean44 = timeSeries2.equals((java.lang.Object) timeSeries37);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem45, false);
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
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        java.lang.Class class16 = timeSeries2.getTimePeriodClass();
        int int17 = timeSeries2.getMaximumItemCount();
        java.lang.Comparable comparable18 = timeSeries2.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod19, (java.lang.Number) 97, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + '4' + "'", comparable18, '4');
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(0);
        java.lang.String str9 = timeSeries2.getDescription();
        int int10 = timeSeries2.getMaximumItemCount();
        boolean boolean11 = timeSeries2.isEmpty();
        timeSeries2.setMaximumItemAge((long) (byte) 1);
        timeSeries2.setDescription("");
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        timeSeries4.setDomainDescription("Time");
        timeSeries4.setMaximumItemCount((int) (byte) 1);
        timeSeries4.setDomainDescription("Overwritten values from: 1");
        timeSeries4.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str35 = timeSeries31.getRangeDescription();
        timeSeries31.setMaximumItemCount((int) ' ');
        timeSeries31.setMaximumItemAge((long) (short) 100);
        java.lang.Comparable comparable40 = timeSeries31.getKey();
        timeSeries31.setNotify(true);
        boolean boolean43 = timeSeries2.equals((java.lang.Object) timeSeries31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = timeSeries31.getIndex(regularTimePeriod44);
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
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + '4' + "'", comparable40, '4');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.setDescription("Time");
        java.lang.String str8 = timeSeries5.getDescription();
        java.lang.Class class9 = timeSeries5.getTimePeriodClass();
        java.lang.Class class10 = timeSeries5.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNull(class10);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries20);
        java.lang.Class<?> wildcardClass22 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass22);
        java.util.List list24 = timeSeries23.getItems();
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str31 = timeSeries27.getRangeDescription();
        boolean boolean32 = timeSeries23.equals((java.lang.Object) timeSeries27);
        java.lang.Class class33 = timeSeries23.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Overwritten values from: -1", "", class33);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "Overwritten values from: 1", "Value", class33);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries35.addChangeListener(seriesChangeListener36);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(class33);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.Object obj6 = timeSeries4.clone();
        timeSeries4.setDomainDescription("");
        java.util.List list9 = timeSeries4.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries4.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        java.lang.String str21 = timeSeries18.getDescription();
        java.lang.Class class22 = timeSeries18.getTimePeriodClass();
        java.util.Collection collection23 = timeSeries18.getTimePeriods();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f);
        java.lang.String str2 = timeSeries1.getRangeDescription();
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
        java.lang.Object obj34 = timeSeries28.clone();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries28.removePropertyChangeListener(propertyChangeListener35);
        long long37 = timeSeries28.getMaximumItemAge();
        java.util.Collection collection38 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        timeSeries1.setDomainDescription("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 9223372036854775807L + "'", long37 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
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
        timeSeries12.setNotify(true);
        java.lang.String str21 = timeSeries12.getRangeDescription();
        timeSeries12.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries12.addChangeListener(seriesChangeListener23);
        timeSeries12.setMaximumItemCount((int) (short) 1);
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class30);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries31.addChangeListener(seriesChangeListener32);
        java.util.Collection collection34 = timeSeries31.getTimePeriods();
        timeSeries31.setDomainDescription("Time");
        java.lang.String str37 = timeSeries31.getRangeDescription();
        java.util.Collection collection38 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        java.lang.Number number40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries31.addOrUpdate(regularTimePeriod39, number40);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class1);
        timeSeries2.setMaximumItemAge((long) 1);
        java.lang.Object obj5 = timeSeries2.clone();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener9);
        timeSeries2.removeAgedItems(true);
        java.util.List list13 = timeSeries2.getItems();
        long long14 = timeSeries2.getMaximumItemAge();
        timeSeries2.setNotify(true);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setDescription("hi!");
        timeSeries2.setKey((java.lang.Comparable) (-1L));
        timeSeries2.setMaximumItemCount((int) (byte) 1);
        timeSeries2.setKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener31);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class36);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.addChangeListener(seriesChangeListener38);
        java.util.Collection collection40 = timeSeries37.getTimePeriods();
        timeSeries37.setDomainDescription("Time");
        timeSeries37.fireSeriesChanged();
        boolean boolean44 = timeSeries2.equals((java.lang.Object) timeSeries37);
        java.lang.Comparable comparable45 = timeSeries37.getKey();
        java.lang.Comparable comparable46 = timeSeries37.getKey();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + 1 + "'", comparable45, 1);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + 1 + "'", comparable46, 1);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class4);
        long long6 = timeSeries5.getMaximumItemAge();
        timeSeries5.fireSeriesChanged();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        long long11 = timeSeries10.getMaximumItemAge();
        timeSeries10.setDescription("hi!");
        boolean boolean14 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries10);
        timeSeries15.fireSeriesChanged();
        timeSeries15.clear();
        java.lang.Class<?> wildcardClass18 = timeSeries15.getClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "Time", "Overwritten values from: 4", (java.lang.Class) wildcardClass18);
        long long20 = timeSeries19.getMaximumItemAge();
        timeSeries19.setKey((java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.setMaximumItemCount((int) (short) 10);
        timeSeries4.removeAgedItems(true);
        timeSeries4.fireSeriesChanged();
        java.lang.Object obj11 = timeSeries4.clone();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries20.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str24 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount((int) ' ');
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class28);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries29.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str33 = timeSeries29.getRangeDescription();
        timeSeries29.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries29.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean39 = timeSeries29.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries20.addAndOrUpdate(timeSeries29);
        boolean boolean41 = timeSeries40.getNotify();
        timeSeries40.setDomainDescription("hi!");
        java.util.Collection collection44 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        timeSeries40.setDescription("Value");
        boolean boolean47 = timeSeries4.equals((java.lang.Object) timeSeries40);
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class49);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries50.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj54 = timeSeries53.clone();
        java.lang.String str55 = timeSeries53.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries53.removePropertyChangeListener(propertyChangeListener56);
        java.lang.String str58 = timeSeries53.getDomainDescription();
        java.util.Collection collection59 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries53);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries62 = timeSeries53.createCopy((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Time" + "'", str58, "Time");
        org.junit.Assert.assertNotNull(collection59);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        java.lang.String str25 = timeSeries23.getRangeDescription();
        java.util.List list26 = timeSeries23.getItems();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries23.addPropertyChangeListener(propertyChangeListener27);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class34);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries35.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class40);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries41.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries35.addAndOrUpdate(timeSeries44);
        java.lang.Class<?> wildcardClass46 = timeSeries35.getClass();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass46);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass46);
        boolean boolean49 = timeSeries48.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries48.addChangeListener(seriesChangeListener50);
        timeSeries48.setRangeDescription("Overwritten values from: 4");
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries23.addAndOrUpdate(timeSeries48);
        java.lang.Class class56 = null;
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class56);
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries57.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str61 = timeSeries57.getRangeDescription();
        timeSeries57.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        timeSeries57.addPropertyChangeListener(propertyChangeListener64);
        timeSeries57.setNotify(false);
        java.lang.Class class69 = null;
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class69);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries70.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class75 = null;
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class75);
        org.jfree.data.time.TimeSeries timeSeries79 = timeSeries76.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries70.addAndOrUpdate(timeSeries79);
        boolean boolean82 = timeSeries80.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener83 = null;
        timeSeries80.removeChangeListener(seriesChangeListener83);
        java.util.Collection collection85 = timeSeries57.getTimePeriodsUniqueToOtherSeries(timeSeries80);
        java.lang.Object obj86 = timeSeries80.clone();
        timeSeries80.setDomainDescription("Value");
        boolean boolean89 = timeSeries23.equals((java.lang.Object) "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Value" + "'", str61, "Value");
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertNotNull(timeSeries79);
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries6.addChangeListener(seriesChangeListener7);
        java.util.Collection collection9 = timeSeries6.getTimePeriods();
        timeSeries6.setDomainDescription("Time");
        timeSeries6.fireSeriesChanged();
        java.lang.Class<?> wildcardClass13 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, (java.lang.Class) wildcardClass13);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries21.addAndOrUpdate(timeSeries30);
        java.lang.Class<?> wildcardClass32 = timeSeries21.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass32);
        java.util.List list34 = timeSeries33.getItems();
        java.lang.Comparable comparable35 = timeSeries33.getKey();
        timeSeries33.setRangeDescription("hi!");
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class41);
        timeSeries42.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries33.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        timeSeries42.setDescription("Value");
        timeSeries42.setMaximumItemAge(1L);
        java.util.Collection collection50 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        java.lang.Class<?> wildcardClass51 = collection50.getClass();
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + '#' + "'", comparable35, '#');
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.util.List list13 = timeSeries2.getItems();
        timeSeries2.setDescription("Value");
        timeSeries2.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod18, (double) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        boolean boolean7 = timeSeries4.isEmpty();
        int int8 = timeSeries4.getItemCount();
        int int9 = timeSeries4.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod10, (double) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        boolean boolean28 = timeSeries26.equals((java.lang.Object) 0);
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.Object obj35 = timeSeries34.clone();
        java.lang.String str36 = timeSeries34.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries34.removePropertyChangeListener(propertyChangeListener37);
        java.lang.String str39 = timeSeries34.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries26.addAndOrUpdate(timeSeries34);
        java.lang.String str41 = timeSeries40.getDescription();
        timeSeries40.clear();
        java.util.List list43 = timeSeries40.getItems();
        timeSeries40.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries12.addAndOrUpdate(timeSeries40);
        timeSeries12.setKey((java.lang.Comparable) 32);
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class50);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries51.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries51.addChangeListener(seriesChangeListener55);
        java.lang.Comparable comparable57 = timeSeries51.getKey();
        timeSeries51.fireSeriesChanged();
        java.lang.Class class60 = null;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class60);
        long long62 = timeSeries61.getMaximumItemAge();
        java.lang.Class class67 = null;
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class67);
        org.jfree.data.time.TimeSeries timeSeries71 = timeSeries68.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class73 = null;
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class73);
        org.jfree.data.time.TimeSeries timeSeries77 = timeSeries74.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries78 = timeSeries68.addAndOrUpdate(timeSeries77);
        java.lang.Class<?> wildcardClass79 = timeSeries68.getClass();
        org.jfree.data.time.TimeSeries timeSeries80 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass79);
        java.util.List list81 = timeSeries80.getItems();
        java.lang.Comparable comparable82 = timeSeries80.getKey();
        timeSeries80.setRangeDescription("hi!");
        java.lang.Class class88 = null;
        org.jfree.data.time.TimeSeries timeSeries89 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class88);
        timeSeries89.removeAgedItems(false);
        java.util.Collection collection92 = timeSeries80.getTimePeriodsUniqueToOtherSeries(timeSeries89);
        org.jfree.data.time.TimeSeries timeSeries93 = timeSeries61.addAndOrUpdate(timeSeries89);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener94 = null;
        timeSeries61.removeChangeListener(seriesChangeListener94);
        org.jfree.data.time.TimeSeries timeSeries96 = timeSeries51.addAndOrUpdate(timeSeries61);
        java.util.Collection collection97 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries96);
        java.util.List list98 = timeSeries96.getItems();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Time" + "'", str39, "Time");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + '4' + "'", comparable57, '4');
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 9223372036854775807L + "'", long62 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries71);
        org.junit.Assert.assertNotNull(timeSeries77);
        org.junit.Assert.assertNotNull(timeSeries78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertEquals("'" + comparable82 + "' != '" + '#' + "'", comparable82, '#');
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertNotNull(timeSeries93);
        org.junit.Assert.assertNotNull(timeSeries96);
        org.junit.Assert.assertNotNull(collection97);
        org.junit.Assert.assertNotNull(list98);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        timeSeries19.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries19.removeChangeListener(seriesChangeListener24);
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class36);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries37.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries31.addAndOrUpdate(timeSeries40);
        java.lang.Class<?> wildcardClass42 = timeSeries31.getClass();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass42);
        java.util.List list44 = timeSeries43.getItems();
        java.lang.Comparable comparable45 = timeSeries43.getKey();
        java.util.Collection collection46 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries43);
        java.lang.Object obj47 = timeSeries43.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        java.lang.Number number49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries43.addOrUpdate(regularTimePeriod48, number49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + '#' + "'", comparable45, '#');
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries3.removeChangeListener(seriesChangeListener28);
        java.lang.String str30 = timeSeries3.getDescription();
        timeSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener32);
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class37);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries38.addChangeListener(seriesChangeListener39);
        java.util.Collection collection41 = timeSeries38.getTimePeriods();
        timeSeries38.setDomainDescription("Time");
        timeSeries38.fireSeriesChanged();
        boolean boolean45 = timeSeries3.equals((java.lang.Object) timeSeries38);
        java.lang.Class<?> wildcardClass46 = timeSeries38.getClass();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", (java.lang.Class) wildcardClass46);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        timeSeries2.setMaximumItemAge((long) (short) 100);
        java.lang.Comparable comparable11 = timeSeries2.getKey();
        java.lang.String str12 = timeSeries2.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null; // flaky: timeSeries2.getDataItem((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + '4' + "'", comparable11, '4');
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries6.addAndOrUpdate(timeSeries15);
        java.lang.Class<?> wildcardClass17 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass17);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str26 = timeSeries22.getRangeDescription();
        boolean boolean28 = timeSeries22.equals((java.lang.Object) 10L);
        java.lang.String str29 = timeSeries22.getDomainDescription();
        timeSeries22.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries19.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries22.addOrUpdate(regularTimePeriod33, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Time" + "'", str29, "Time");
        org.junit.Assert.assertNotNull(timeSeries32);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        java.lang.String str27 = timeSeries2.getRangeDescription();
        boolean boolean28 = timeSeries2.getNotify();
        java.lang.String str29 = timeSeries2.getDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.setDescription("");
        int int8 = timeSeries5.getItemCount();
        timeSeries5.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(regularTimePeriod10, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
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
        timeSeries20.setMaximumItemCount(1);
        java.lang.Class<?> wildcardClass32 = timeSeries20.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "", "hi!", (java.lang.Class) wildcardClass32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries33.addOrUpdate(regularTimePeriod34, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries24);
        java.lang.Class<?> wildcardClass26 = timeSeries15.getClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "Time", "Overwritten values from: Overwritten values from: 4", (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, (java.lang.Class) wildcardClass26);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Overwritten values from: -1", "Overwritten values from: Overwritten values from: 4", (java.lang.Class) wildcardClass26);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean2 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(0);
        java.lang.String str9 = timeSeries2.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod10, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        timeSeries5.setDescription("Time");
        java.lang.String str8 = timeSeries5.getDescription();
        java.lang.Class class9 = timeSeries5.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = null; // flaky: timeSeries5.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("Value");
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        java.lang.String str11 = timeSeries2.getDomainDescription();
        timeSeries2.removeAgedItems(false);
        java.lang.String str14 = timeSeries2.getRangeDescription();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        java.util.Collection collection22 = timeSeries19.getTimePeriods();
        timeSeries19.setDomainDescription("Time");
        timeSeries19.fireSeriesChanged();
        java.util.Collection collection26 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class28);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries29.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class36);
        timeSeries37.setRangeDescription("hi!");
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class41);
        java.util.Collection collection43 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        java.util.Collection collection44 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class46);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries47.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class52);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries53.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries47.addAndOrUpdate(timeSeries56);
        boolean boolean59 = timeSeries57.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries57.removeChangeListener(seriesChangeListener60);
        java.lang.Class class63 = null;
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class63);
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries64.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str68 = timeSeries64.getRangeDescription();
        timeSeries64.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        timeSeries64.addPropertyChangeListener(propertyChangeListener71);
        java.lang.Class class76 = null;
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class76);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener78 = null;
        timeSeries77.addChangeListener(seriesChangeListener78);
        boolean boolean80 = timeSeries64.equals((java.lang.Object) timeSeries77);
        org.jfree.data.time.TimeSeries timeSeries81 = timeSeries57.addAndOrUpdate(timeSeries77);
        java.lang.String str82 = timeSeries57.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries83 = timeSeries32.addAndOrUpdate(timeSeries57);
        timeSeries83.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries86 = timeSeries2.addAndOrUpdate(timeSeries83);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod87 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Value" + "'", str68, "Value");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(timeSeries81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Value" + "'", str82, "Value");
        org.junit.Assert.assertNotNull(timeSeries83);
        org.junit.Assert.assertNotNull(timeSeries86);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        timeSeries12.fireSeriesChanged();
        timeSeries12.clear();
        int int15 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod16, (double) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
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
        boolean boolean21 = timeSeries15.getNotify();
        java.lang.String str22 = timeSeries15.getDescription();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        java.util.Collection collection31 = timeSeries2.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries2.addChangeListener(seriesChangeListener32);
        java.lang.Class class34 = timeSeries2.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(class34);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L);
        timeSeries1.removeAgedItems(false);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass20);
        java.util.List list22 = timeSeries21.getItems();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        boolean boolean30 = timeSeries21.equals((java.lang.Object) timeSeries25);
        timeSeries25.setMaximumItemCount((int) (byte) 0);
        timeSeries25.setRangeDescription("Time");
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class36);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries37.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class42);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries43.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str47 = timeSeries43.getRangeDescription();
        timeSeries43.setMaximumItemCount((int) ' ');
        java.lang.Class class51 = null;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class51);
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries52.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str56 = timeSeries52.getRangeDescription();
        timeSeries52.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        timeSeries52.removePropertyChangeListener(propertyChangeListener59);
        boolean boolean62 = timeSeries52.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries43.addAndOrUpdate(timeSeries52);
        boolean boolean64 = timeSeries63.isEmpty();
        java.lang.Class class65 = timeSeries63.getTimePeriodClass();
        java.lang.Class class66 = timeSeries63.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries37.addAndOrUpdate(timeSeries63);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        timeSeries63.removePropertyChangeListener(propertyChangeListener68);
        java.util.Collection collection70 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries63);
        org.jfree.data.time.TimeSeries timeSeries71 = timeSeries1.addAndOrUpdate(timeSeries25);
        boolean boolean72 = timeSeries71.isEmpty();
        long long73 = timeSeries71.getMaximumItemAge();
        timeSeries71.setRangeDescription("Overwritten values from: 4");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value" + "'", str47, "Value");
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Value" + "'", str56, "Value");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(class65);
        org.junit.Assert.assertNull(class66);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(timeSeries71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 9223372036854775807L + "'", long73 == 9223372036854775807L);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Comparable comparable7 = timeSeries4.getKey();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener8);
        timeSeries4.removeAgedItems(true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries6.addAndOrUpdate(timeSeries15);
        java.lang.Class<?> wildcardClass17 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass17);
        timeSeries19.setNotify(false);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        java.util.List list27 = timeSeries26.getItems();
        java.lang.String str28 = timeSeries26.getRangeDescription();
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries31.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class36);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries37.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries31.addAndOrUpdate(timeSeries40);
        boolean boolean42 = timeSeries26.equals((java.lang.Object) timeSeries40);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries19.addAndOrUpdate(timeSeries40);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries43.delete(regularTimePeriod44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeSeries43);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        timeSeries17.setRangeDescription("hi!");
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class25);
        timeSeries26.removeAgedItems(false);
        java.util.Collection collection29 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener30);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries17.createCopy((int) (short) 0, 100);
        timeSeries17.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        java.util.Collection collection23 = timeSeries2.getTimePeriods();
        timeSeries2.clear();
        timeSeries2.setNotify(true);
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class47);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries48.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries48.addChangeListener(seriesChangeListener52);
        java.lang.Comparable comparable54 = timeSeries48.getKey();
        java.lang.String str55 = timeSeries48.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries48.addChangeListener(seriesChangeListener56);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        timeSeries48.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = timeSeries41.equals((java.lang.Object) timeSeries48);
        java.lang.Object obj61 = timeSeries48.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem63 = timeSeries48.getDataItem((int) ' ');
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
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + '4' + "'", comparable54, '4');
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Time" + "'", str55, "Time");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(0);
        java.lang.String str9 = timeSeries2.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener10);
        timeSeries2.setKey((java.lang.Comparable) '#');
        java.lang.String str14 = timeSeries2.getRangeDescription();
        int int15 = timeSeries2.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class1);
        timeSeries2.fireSeriesChanged();
        timeSeries2.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null; // flaky: timeSeries2.getTimePeriod((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        timeSeries15.setMaximumItemAge((long) (short) 10);
        java.util.List list23 = timeSeries15.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Value", (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "", "hi!", (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, (java.lang.Class) wildcardClass24);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries29.removePropertyChangeListener(propertyChangeListener30);
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class33);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries34.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries34.addChangeListener(seriesChangeListener38);
        java.lang.Comparable comparable40 = timeSeries34.getKey();
        java.lang.String str41 = timeSeries34.getDescription();
        timeSeries34.setDescription("Value");
        java.util.Collection collection44 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + '4' + "'", comparable40, '4');
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(collection44);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
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
        boolean boolean37 = timeSeries12.getNotify();
        org.junit.Assert.assertNotNull(timeSeries5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "", "Overwritten values from: -1", (java.lang.Class) wildcardClass20);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries23.removeChangeListener(seriesChangeListener24);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
        timeSeries11.setMaximumItemCount((int) (short) 1);
        java.util.List list17 = timeSeries11.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update(0, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
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
        long long20 = timeSeries17.getMaximumItemAge();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class24);
        java.util.List list26 = timeSeries25.getItems();
        timeSeries25.setDomainDescription("Time");
        java.lang.String str29 = timeSeries25.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.createCopy(0, (int) ' ');
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries17.addAndOrUpdate(timeSeries32);
        timeSeries17.setMaximumItemCount((int) (byte) 1);
        timeSeries17.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + '#' + "'", comparable19, '#');
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries33);
    }
}
