import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        boolean boolean2 = timeSeries1.isEmpty();
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
        java.util.Collection collection26 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class28);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries29.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str33 = timeSeries29.getRangeDescription();
        timeSeries29.setMaximumItemCount((int) ' ');
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class37);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries38.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str42 = timeSeries38.getRangeDescription();
        timeSeries38.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean48 = timeSeries38.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries29.addAndOrUpdate(timeSeries38);
        timeSeries29.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries29.addChangeListener(seriesChangeListener52);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener54 = null;
        timeSeries29.removeChangeListener(seriesChangeListener54);
        java.lang.String str56 = timeSeries29.getDescription();
        java.util.List list57 = timeSeries29.getItems();
        timeSeries29.clear();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries14.addAndOrUpdate(timeSeries29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries8", timeSeries1.equals(timeSeries8) ? timeSeries1.hashCode() == timeSeries8.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        boolean boolean2 = timeSeries1.isEmpty();
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
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Value", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "", "hi!", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, (java.lang.Class) wildcardClass27);
        java.lang.String str33 = timeSeries32.getDescription();
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class38);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries39.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class44);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries45.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries39.addAndOrUpdate(timeSeries48);
        java.lang.Class<?> wildcardClass50 = timeSeries39.getClass();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass50);
        java.util.List list52 = timeSeries51.getItems();
        java.lang.Comparable comparable53 = timeSeries51.getKey();
        long long54 = timeSeries51.getMaximumItemAge();
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class58);
        java.util.List list60 = timeSeries59.getItems();
        timeSeries59.setDomainDescription("Time");
        java.lang.String str63 = timeSeries59.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries59.createCopy(0, (int) ' ');
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries51.addAndOrUpdate(timeSeries66);
        timeSeries51.removeAgedItems(false);
        java.util.Collection collection70 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        org.jfree.data.time.TimeSeries timeSeries71 = timeSeries1.addAndOrUpdate(timeSeries32);
        timeSeries71.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries16", timeSeries1.equals(timeSeries16) ? timeSeries1.hashCode() == timeSeries16.hashCode() : true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
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
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries30.addAndOrUpdate(timeSeries39);
        java.lang.Class<?> wildcardClass41 = timeSeries30.getClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass41);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass41);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Value", (java.lang.Class) wildcardClass41);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "", "hi!", (java.lang.Class) wildcardClass41);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, (java.lang.Class) wildcardClass41);
        boolean boolean47 = timeSeries46.getNotify();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries2.addAndOrUpdate(timeSeries46);
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class50);
        long long52 = timeSeries51.getMaximumItemAge();
        timeSeries51.fireSeriesChanged();
        long long54 = timeSeries51.getMaximumItemAge();
        long long55 = timeSeries51.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries51.addChangeListener(seriesChangeListener56);
        java.util.List list58 = timeSeries51.getItems();
        java.util.Collection collection59 = timeSeries46.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries40 and timeSeries48", timeSeries40.equals(timeSeries48) ? timeSeries40.hashCode() == timeSeries48.hashCode() : true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
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
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class29);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class35);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries36.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries30.addAndOrUpdate(timeSeries39);
        java.lang.Class<?> wildcardClass41 = timeSeries30.getClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass41);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass41);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Value", (java.lang.Class) wildcardClass41);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "", "hi!", (java.lang.Class) wildcardClass41);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, (java.lang.Class) wildcardClass41);
        boolean boolean47 = timeSeries46.getNotify();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries2.addAndOrUpdate(timeSeries46);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries46.createCopy((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries40 and timeSeries48", timeSeries40.equals(timeSeries48) ? timeSeries40.hashCode() == timeSeries48.hashCode() : true);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
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
        timeSeries47.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries47.createCopy((int) ' ', 100);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries2.addAndOrUpdate(timeSeries47);
        timeSeries2.setKey((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries26 and timeSeries53", timeSeries26.equals(timeSeries53) ? timeSeries26.hashCode() == timeSeries53.hashCode() : true);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
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
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class47);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries48.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class53 = null;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class53);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries54.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries48.addAndOrUpdate(timeSeries57);
        java.lang.Class<?> wildcardClass59 = timeSeries48.getClass();
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass59);
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, (java.lang.Class) wildcardClass59);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass59);
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass59);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "Time", "Overwritten values from: Overwritten values from: 4", (java.lang.Class) wildcardClass59);
        timeSeries64.clear();
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries2.addAndOrUpdate(timeSeries64);
        java.lang.String str67 = timeSeries64.getDomainDescription();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries22 and timeSeries66", timeSeries22.equals(timeSeries66) ? timeSeries22.hashCode() == timeSeries66.hashCode() : true);
    }
}

