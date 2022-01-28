import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class3);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str8 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        timeSeries4.setNotify(false);
        java.lang.Class<?> wildcardClass15 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, (java.lang.Class) wildcardClass15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries7 and timeSeries16", timeSeries7.equals(timeSeries16) ? timeSeries7.hashCode() == timeSeries16.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class5);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str10 = timeSeries6.getRangeDescription();
        timeSeries6.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener13);
        timeSeries6.setNotify(false);
        java.lang.Class<?> wildcardClass17 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "", "Value", (java.lang.Class) wildcardClass17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries9 and timeSeries18", timeSeries9.equals(timeSeries18) ? timeSeries9.hashCode() == timeSeries18.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        timeSeries1.removeAgedItems(9223372036854775807L, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        boolean boolean26 = timeSeries25.getNotify();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.lang.Class<?> wildcardClass33 = timeSeries32.getClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass33);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Overwritten values from: 4", "hi!", (java.lang.Class) wildcardClass33);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries25.addAndOrUpdate(timeSeries35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries5 and timeSeries32", timeSeries5.equals(timeSeries32) ? timeSeries5.hashCode() == timeSeries32.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries25.createCopy(0, 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries25.addChangeListener(seriesChangeListener35);
        java.util.Collection collection37 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class40);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries41.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class46);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries47.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries41.addAndOrUpdate(timeSeries50);
        java.lang.Class<?> wildcardClass52 = timeSeries41.getClass();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass52);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener54 = null;
        timeSeries53.addChangeListener(seriesChangeListener54);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries25.addAndOrUpdate(timeSeries53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries19 and timeSeries51", timeSeries19.equals(timeSeries51) ? timeSeries19.hashCode() == timeSeries51.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        java.lang.Comparable comparable17 = timeSeries13.getKey();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str25 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries21.addPropertyChangeListener(propertyChangeListener28);
        timeSeries21.setNotify(false);
        java.lang.Class<?> wildcardClass32 = timeSeries21.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass32);
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class37);
        timeSeries38.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries38.createCopy((int) (short) 1, (int) ' ');
        java.lang.Object obj44 = timeSeries38.clone();
        java.util.Collection collection45 = timeSeries33.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries13.addAndOrUpdate(timeSeries33);
        java.lang.Class<?> wildcardClass47 = timeSeries13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries6 and timeSeries33", timeSeries6.equals(timeSeries33) ? timeSeries6.hashCode() == timeSeries33.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.lang.Class<?> wildcardClass3 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        timeSeries4.removeAgedItems(10L, true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        java.lang.Class class57 = null;
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class57);
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries58.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str62 = timeSeries58.getRangeDescription();
        timeSeries58.setMaximumItemCount((int) ' ');
        timeSeries58.setMaximumItemAge((long) 1);
        java.lang.Class class68 = null;
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class68);
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries69.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str73 = timeSeries69.getRangeDescription();
        timeSeries69.setMaximumItemCount((int) ' ');
        java.lang.Class class77 = null;
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class77);
        org.jfree.data.time.TimeSeries timeSeries81 = timeSeries78.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str82 = timeSeries78.getRangeDescription();
        timeSeries78.setMaximumItemCount((int) ' ');
        timeSeries78.setMaximumItemAge((long) (short) 100);
        timeSeries78.setRangeDescription("");
        java.util.List list89 = timeSeries78.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener90 = null;
        timeSeries78.addChangeListener(seriesChangeListener90);
        org.jfree.data.time.TimeSeries timeSeries92 = timeSeries69.addAndOrUpdate(timeSeries78);
        long long93 = timeSeries92.getMaximumItemAge();
        java.lang.String str94 = timeSeries92.getRangeDescription();
        java.util.List list95 = timeSeries92.getItems();
        org.jfree.data.time.TimeSeries timeSeries96 = timeSeries58.addAndOrUpdate(timeSeries92);
        java.util.Collection collection97 = timeSeries55.getTimePeriodsUniqueToOtherSeries(timeSeries58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries19 and timeSeries92", timeSeries19.equals(timeSeries92) ? timeSeries19.hashCode() == timeSeries92.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class49);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries50.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str54 = timeSeries50.getRangeDescription();
        java.lang.Class<?> wildcardClass55 = timeSeries50.getClass();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass55);
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), (java.lang.Class) wildcardClass55);
        timeSeries57.clear();
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        int int61 = timeSeries60.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries57.addAndOrUpdate(timeSeries60);
        java.lang.Class<?> wildcardClass63 = timeSeries60.getClass();
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", (java.lang.Class) wildcardClass63);
        boolean boolean65 = timeSeries36.equals((java.lang.Object) wildcardClass63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries26 and timeSeries64", timeSeries26.equals(timeSeries64) ? timeSeries26.hashCode() == timeSeries64.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class20);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries21.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str25 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries21.addPropertyChangeListener(propertyChangeListener28);
        timeSeries21.setNotify(false);
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class33);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries34.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries40.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries34.addAndOrUpdate(timeSeries43);
        boolean boolean46 = timeSeries44.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        timeSeries44.removeChangeListener(seriesChangeListener47);
        java.util.Collection collection49 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        java.lang.Class<?> wildcardClass50 = timeSeries44.getClass();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass50);
        java.lang.Class class53 = null;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class53);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries54.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str58 = timeSeries54.getRangeDescription();
        java.util.List list59 = timeSeries54.getItems();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries51.addAndOrUpdate(timeSeries54);
        java.lang.Class class63 = null;
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class63);
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries64.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str68 = timeSeries64.getRangeDescription();
        timeSeries64.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        timeSeries64.addPropertyChangeListener(propertyChangeListener71);
        timeSeries64.setNotify(false);
        java.lang.Class<?> wildcardClass75 = timeSeries64.getClass();
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass75);
        timeSeries76.removeAgedItems(false);
        long long79 = timeSeries76.getMaximumItemAge();
        java.util.Collection collection80 = timeSeries76.getTimePeriods();
        java.util.Collection collection81 = timeSeries60.getTimePeriodsUniqueToOtherSeries(timeSeries76);
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries2.addAndOrUpdate(timeSeries60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries5 and timeSeries76", timeSeries5.equals(timeSeries76) ? timeSeries5.hashCode() == timeSeries76.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        boolean boolean30 = timeSeries2.isEmpty();
        java.util.List list31 = timeSeries2.getItems();
        long long32 = timeSeries2.getMaximumItemAge();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class34);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries35.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str39 = timeSeries35.getRangeDescription();
        timeSeries35.setMaximumItemCount((int) ' ');
        long long42 = timeSeries35.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries35.createCopy((int) '4', (int) (byte) 10);
        timeSeries45.removeAgedItems(true);
        timeSeries45.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries45.addAndOrUpdate(timeSeries51);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries2.addAndOrUpdate(timeSeries51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries12 and timeSeries52", timeSeries12.equals(timeSeries52) ? timeSeries12.hashCode() == timeSeries52.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.lang.Class<?> wildcardClass3 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass3);
        java.lang.String str5 = timeSeries4.getDescription();
        long long6 = timeSeries4.getMaximumItemAge();
        int int7 = timeSeries4.getItemCount();
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class17);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries21);
        java.lang.Class<?> wildcardClass23 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass23);
        boolean boolean26 = timeSeries25.isEmpty();
        boolean boolean27 = timeSeries4.equals((java.lang.Object) timeSeries25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries12", timeSeries2.equals(timeSeries12) ? timeSeries2.hashCode() == timeSeries12.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.lang.Class<?> wildcardClass30 = timeSeries29.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass30);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Overwritten values from: 4", "", (java.lang.Class) wildcardClass30);
        java.lang.Object obj33 = timeSeries32.clone();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries32.addPropertyChangeListener(propertyChangeListener34);
        java.util.Collection collection36 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries29", timeSeries2.equals(timeSeries29) ? timeSeries2.hashCode() == timeSeries29.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount((int) ' ');
        long long9 = timeSeries2.getMaximumItemAge();
        long long10 = timeSeries2.getMaximumItemAge();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries14.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str18 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener21);
        timeSeries14.setNotify(false);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class32);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries36);
        boolean boolean39 = timeSeries37.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries37.removeChangeListener(seriesChangeListener40);
        java.util.Collection collection42 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        java.lang.Class<?> wildcardClass43 = timeSeries37.getClass();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass43);
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class46);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries47.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str51 = timeSeries47.getRangeDescription();
        java.util.List list52 = timeSeries47.getItems();
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries44.addAndOrUpdate(timeSeries47);
        java.lang.Class class56 = null;
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class56);
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries57.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str61 = timeSeries57.getRangeDescription();
        timeSeries57.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        timeSeries57.addPropertyChangeListener(propertyChangeListener64);
        timeSeries57.setNotify(false);
        java.lang.Class<?> wildcardClass68 = timeSeries57.getClass();
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass68);
        timeSeries69.removeAgedItems(false);
        long long72 = timeSeries69.getMaximumItemAge();
        java.util.Collection collection73 = timeSeries69.getTimePeriods();
        java.util.Collection collection74 = timeSeries53.getTimePeriodsUniqueToOtherSeries(timeSeries69);
        boolean boolean75 = timeSeries2.equals((java.lang.Object) collection74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries5 and timeSeries69", timeSeries5.equals(timeSeries69) ? timeSeries5.hashCode() == timeSeries69.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        timeSeries12.clear();
        boolean boolean19 = timeSeries12.isEmpty();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class24);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries25.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str29 = timeSeries25.getRangeDescription();
        java.lang.Class<?> wildcardClass30 = timeSeries25.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "hi!", (java.lang.Class) wildcardClass30);
        int int32 = timeSeries31.getItemCount();
        java.lang.String str33 = timeSeries31.getDomainDescription();
        timeSeries31.setRangeDescription("Value");
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class37);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries38.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str42 = timeSeries38.getRangeDescription();
        timeSeries38.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean48 = timeSeries38.equals((java.lang.Object) ' ');
        java.lang.String str49 = timeSeries38.getDescription();
        java.lang.Object obj50 = timeSeries38.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries38.removeChangeListener(seriesChangeListener51);
        java.lang.String str53 = timeSeries38.getDomainDescription();
        timeSeries38.fireSeriesChanged();
        boolean boolean55 = timeSeries31.equals((java.lang.Object) timeSeries38);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries12.addAndOrUpdate(timeSeries31);
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries31.createCopy(0, 0);
        java.lang.Class class62 = null;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class62);
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries63.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str67 = timeSeries63.getRangeDescription();
        timeSeries63.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        timeSeries63.addPropertyChangeListener(propertyChangeListener70);
        timeSeries63.setNotify(false);
        java.lang.Class class75 = null;
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class75);
        org.jfree.data.time.TimeSeries timeSeries79 = timeSeries76.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class81 = null;
        org.jfree.data.time.TimeSeries timeSeries82 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class81);
        org.jfree.data.time.TimeSeries timeSeries85 = timeSeries82.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries86 = timeSeries76.addAndOrUpdate(timeSeries85);
        boolean boolean88 = timeSeries86.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener89 = null;
        timeSeries86.removeChangeListener(seriesChangeListener89);
        java.util.Collection collection91 = timeSeries63.getTimePeriodsUniqueToOtherSeries(timeSeries86);
        java.lang.Class<?> wildcardClass92 = timeSeries86.getClass();
        org.jfree.data.time.TimeSeries timeSeries93 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass92);
        boolean boolean94 = timeSeries31.equals((java.lang.Object) wildcardClass92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries56 and timeSeries86", timeSeries56.equals(timeSeries86) ? timeSeries56.hashCode() == timeSeries86.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), (java.lang.Class) wildcardClass15);
        timeSeries17.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.lang.Class<?> wildcardClass28 = timeSeries27.getClass();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Overwritten values from: 4", "", (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "Overwritten values from: 1", "Overwritten values from: 1", (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries17.addAndOrUpdate(timeSeries31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries7 and timeSeries27", timeSeries7.equals(timeSeries27) ? timeSeries7.hashCode() == timeSeries27.hashCode() : true);
    }
}

