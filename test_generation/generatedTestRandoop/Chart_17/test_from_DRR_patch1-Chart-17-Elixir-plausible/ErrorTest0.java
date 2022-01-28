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
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        java.lang.Class<?> wildcardClass27 = timeSeries16.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries11.addAndOrUpdate(timeSeries28);
        timeSeries28.setNotify(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries12 and timeSeries29", timeSeries12.equals(timeSeries29) ? timeSeries12.hashCode() == timeSeries29.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        java.lang.Class<?> wildcardClass27 = timeSeries16.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries11.addAndOrUpdate(timeSeries28);
        java.lang.Class<?> wildcardClass30 = timeSeries11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries12 and timeSeries29", timeSeries12.equals(timeSeries29) ? timeSeries12.hashCode() == timeSeries29.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class39);
        java.util.List list41 = timeSeries40.getItems();
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class43);
        long long45 = timeSeries44.getMaximumItemAge();
        timeSeries44.setDescription("hi!");
        boolean boolean48 = timeSeries44.getNotify();
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class52);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener54 = null;
        timeSeries53.addChangeListener(seriesChangeListener54);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries44.addAndOrUpdate(timeSeries53);
        java.util.Collection collection57 = timeSeries40.getTimePeriodsUniqueToOtherSeries(timeSeries56);
        int int58 = timeSeries56.getMaximumItemCount();
        java.lang.Class class60 = null;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class60);
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries61.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str65 = timeSeries61.getRangeDescription();
        timeSeries61.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        timeSeries61.addPropertyChangeListener(propertyChangeListener68);
        timeSeries61.setDescription("Time");
        timeSeries61.setMaximumItemAge((long) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries56.addAndOrUpdate(timeSeries61);
        timeSeries74.setRangeDescription("");
        java.util.Collection collection77 = timeSeries35.getTimePeriodsUniqueToOtherSeries(timeSeries74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries34 and timeSeries56", timeSeries34.equals(timeSeries56) ? timeSeries34.hashCode() == timeSeries56.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class37);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries38.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class43);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries44.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries38.addAndOrUpdate(timeSeries47);
        timeSeries47.setDomainDescription("Value");
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class52);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries53.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class58);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries59.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries53.addAndOrUpdate(timeSeries62);
        boolean boolean65 = timeSeries63.equals((java.lang.Object) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener66 = null;
        timeSeries63.removeChangeListener(seriesChangeListener66);
        java.util.Collection collection68 = timeSeries63.getTimePeriods();
        java.lang.Class class70 = null;
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class70);
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries71.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str75 = timeSeries71.getRangeDescription();
        timeSeries71.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        timeSeries71.addPropertyChangeListener(propertyChangeListener78);
        timeSeries71.setDescription("Time");
        timeSeries71.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries83 = timeSeries63.addAndOrUpdate(timeSeries71);
        org.jfree.data.time.TimeSeries timeSeries84 = timeSeries47.addAndOrUpdate(timeSeries63);
        org.jfree.data.time.TimeSeries timeSeries87 = timeSeries63.createCopy((int) (byte) 10, (int) '#');
        java.util.Collection collection88 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries34 and timeSeries48", timeSeries34.equals(timeSeries48) ? timeSeries34.hashCode() == timeSeries48.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class10);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class16);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries20);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        java.lang.Class<?> wildcardClass23 = timeSeries21.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "Overwritten values from: 4", "Overwritten values from: 4", (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Overwritten values from: 4", "", (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass23);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries11 and timeSeries27", timeSeries11.equals(timeSeries27) ? timeSeries11.hashCode() == timeSeries27.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        boolean boolean47 = timeSeries42.isEmpty();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries38 and timeSeries46", timeSeries38.equals(timeSeries46) ? timeSeries38.hashCode() == timeSeries46.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        timeSeries2.setMaximumItemCount((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries38 and timeSeries46", timeSeries38.equals(timeSeries46) ? timeSeries38.hashCode() == timeSeries46.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class1);
        org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class7);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries11);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries25);
        java.lang.Class<?> wildcardClass27 = timeSeries16.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries11.addAndOrUpdate(timeSeries28);
        java.lang.String str30 = timeSeries11.getRangeDescription();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries12 and timeSeries29", timeSeries12.equals(timeSeries29) ? timeSeries12.hashCode() == timeSeries29.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class50);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries51.addChangeListener(seriesChangeListener52);
        java.util.List list54 = timeSeries51.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries51.addChangeListener(seriesChangeListener55);
        java.util.Collection collection57 = timeSeries51.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries2.addAndOrUpdate(timeSeries51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries38 and timeSeries46", timeSeries38.equals(timeSeries46) ? timeSeries38.hashCode() == timeSeries46.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class8);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries18);
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!", (java.lang.Class) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = timeSeries21.getClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 4", (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", (java.lang.Class) wildcardClass22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries19 and timeSeries25", timeSeries19.equals(timeSeries25) ? timeSeries19.hashCode() == timeSeries25.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy((int) (byte) 10, (int) '#');
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class15);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries16.createCopy((int) (byte) 10, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries19);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        java.lang.Class<?> wildcardClass22 = timeSeries20.getClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "Overwritten values from: 4", "Overwritten values from: 4", (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Overwritten values from: 4", "", (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.removeChangeListener(seriesChangeListener29);
        long long31 = timeSeries28.getMaximumItemAge();
        java.lang.Object obj32 = timeSeries28.clone();
        java.util.Collection collection33 = timeSeries28.getTimePeriods();
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class37);
        java.util.List list39 = timeSeries38.getItems();
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class41);
        long long43 = timeSeries42.getMaximumItemAge();
        timeSeries42.setDescription("hi!");
        boolean boolean46 = timeSeries42.getNotify();
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "", class50);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries51.addChangeListener(seriesChangeListener52);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries42.addAndOrUpdate(timeSeries51);
        java.util.Collection collection55 = timeSeries38.getTimePeriodsUniqueToOtherSeries(timeSeries54);
        int int56 = timeSeries54.getMaximumItemCount();
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class58);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries59.createCopy((int) (byte) 10, (int) '#');
        java.lang.String str63 = timeSeries59.getRangeDescription();
        timeSeries59.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        timeSeries59.addPropertyChangeListener(propertyChangeListener66);
        timeSeries59.setDescription("Time");
        timeSeries59.setMaximumItemAge((long) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries54.addAndOrUpdate(timeSeries59);
        timeSeries72.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries28.addAndOrUpdate(timeSeries72);
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries26.addAndOrUpdate(timeSeries72);
        boolean boolean77 = timeSeries72.isEmpty();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries10 and timeSeries26", timeSeries10.equals(timeSeries26) ? timeSeries10.hashCode() == timeSeries26.hashCode() : true);
    }
}

