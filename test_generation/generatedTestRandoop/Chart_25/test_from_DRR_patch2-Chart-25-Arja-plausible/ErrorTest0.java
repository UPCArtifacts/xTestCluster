import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Class<?> wildcardClass12 = datasetGroup10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset6", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset6) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) ' ', (java.lang.Comparable) 0L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number7 = defaultStatisticalCategoryDataset4.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double9 = defaultStatisticalCategoryDataset4.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int11 = defaultStatisticalCategoryDataset10.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset10.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset10.getGroup();
        defaultStatisticalCategoryDataset4.setGroup(datasetGroup14);
        java.util.List list16 = defaultStatisticalCategoryDataset4.getColumnKeys();
        int int18 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 0);
        boolean boolean19 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset10", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset10) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.util.List list15 = defaultStatisticalCategoryDataset11.getColumnKeys();
        java.lang.Number number18 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int20 = defaultStatisticalCategoryDataset11.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list21 = defaultStatisticalCategoryDataset11.getColumnKeys();
        boolean boolean22 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset23.hasListener(eventListener24);
        defaultStatisticalCategoryDataset23.validateObject();
        java.lang.Number number29 = defaultStatisticalCategoryDataset23.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        boolean boolean30 = defaultStatisticalCategoryDataset11.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.util.List list15 = defaultStatisticalCategoryDataset11.getColumnKeys();
        java.lang.Number number18 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int20 = defaultStatisticalCategoryDataset11.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list21 = defaultStatisticalCategoryDataset11.getColumnKeys();
        boolean boolean22 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset23.hasListener(eventListener24);
        java.util.List list26 = defaultStatisticalCategoryDataset23.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset27.addChangeListener(datasetChangeListener28);
        int int30 = defaultStatisticalCategoryDataset27.getColumnCount();
        java.util.List list31 = defaultStatisticalCategoryDataset27.getColumnKeys();
        java.lang.Number number34 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int36 = defaultStatisticalCategoryDataset27.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean37 = defaultStatisticalCategoryDataset23.equals((java.lang.Object) defaultStatisticalCategoryDataset27);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset11 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset11.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset11.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) '#');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number17 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int19 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) -1);
        int int21 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset14.setGroup(datasetGroup26);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset14", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset14) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        defaultStatisticalCategoryDataset7.validateObject();
        java.util.List list11 = defaultStatisticalCategoryDataset7.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset7.getGroup();
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset0.hasListener(eventListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset7", obj6.equals(defaultStatisticalCategoryDataset7) ? obj6.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        java.util.List list13 = defaultStatisticalCategoryDataset8.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset8.getRowCount();
        java.lang.Object obj15 = defaultStatisticalCategoryDataset8.clone();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup16", datasetGroup4.equals(datasetGroup16) ? datasetGroup4.hashCode() == datasetGroup16.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass9 = datasetGroup8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj7", defaultStatisticalCategoryDataset0.equals(obj7) ? defaultStatisticalCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number14 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int16 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) -1);
        int int18 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        int int22 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset11.setGroup(datasetGroup23);
        defaultStatisticalCategoryDataset11.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset11.getGroup();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup23", datasetGroup4.equals(datasetGroup23) ? datasetGroup4.hashCode() == datasetGroup23.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) -1);
        int int20 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int22 = defaultStatisticalCategoryDataset21.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup25);
        defaultStatisticalCategoryDataset13.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        defaultStatisticalCategoryDataset12.validateObject();
        java.util.List list16 = defaultStatisticalCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset12", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset12) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((double) (byte) -1, Double.NaN, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number22 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double24 = defaultStatisticalCategoryDataset19.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int26 = defaultStatisticalCategoryDataset25.getColumnCount();
        int int28 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset19.setGroup(datasetGroup29);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset19 and defaultStatisticalCategoryDataset25", defaultStatisticalCategoryDataset19.equals(defaultStatisticalCategoryDataset25) ? defaultStatisticalCategoryDataset19.hashCode() == defaultStatisticalCategoryDataset25.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int3 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        int int8 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list9 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset4.clone();
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals(obj10);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj10", defaultStatisticalCategoryDataset4.equals(obj10) ? defaultStatisticalCategoryDataset4.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int3 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        int int8 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list9 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset4.clone();
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals(obj10);
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj10", defaultStatisticalCategoryDataset4.equals(obj10) ? defaultStatisticalCategoryDataset4.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int19 = defaultStatisticalCategoryDataset18.getColumnCount();
        int int21 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and defaultStatisticalCategoryDataset18", obj13.equals(defaultStatisticalCategoryDataset18) ? obj13.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset6.hasListener(eventListener7);
        defaultStatisticalCategoryDataset6.validateObject();
        java.lang.Number number12 = defaultStatisticalCategoryDataset6.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset6.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number17 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int19 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) -1);
        int int21 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset14.removeChangeListener(datasetChangeListener22);
        boolean boolean24 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset14", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset14) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int5 = defaultStatisticalCategoryDataset4.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset4.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset4.getColumnKeys();
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup11", datasetGroup8.equals(datasetGroup11) ? datasetGroup8.hashCode() == datasetGroup11.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number8 = defaultStatisticalCategoryDataset5.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double10 = defaultStatisticalCategoryDataset5.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int12 = defaultStatisticalCategoryDataset11.getColumnCount();
        int int14 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset5.setGroup(datasetGroup15);
        java.util.List list17 = defaultStatisticalCategoryDataset5.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset5.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list21 = defaultStatisticalCategoryDataset20.getRowKeys();
        defaultStatisticalCategoryDataset20.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int27 = defaultStatisticalCategoryDataset20.getColumnCount();
        java.lang.Number number30 = defaultStatisticalCategoryDataset20.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset20.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener36 = null;
        boolean boolean37 = defaultStatisticalCategoryDataset20.hasListener(eventListener36);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset5.setGroup(datasetGroup38);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset5 and defaultStatisticalCategoryDataset11", defaultStatisticalCategoryDataset5.equals(defaultStatisticalCategoryDataset11) ? defaultStatisticalCategoryDataset5.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        int int22 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset7.addChangeListener(datasetChangeListener8);
        int int10 = defaultStatisticalCategoryDataset7.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int12 = defaultStatisticalCategoryDataset11.getColumnCount();
        int int14 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset11.getGroup();
        java.util.List list16 = defaultStatisticalCategoryDataset11.getColumnKeys();
        boolean boolean17 = defaultStatisticalCategoryDataset7.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset7.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset7", obj6.equals(defaultStatisticalCategoryDataset7) ? obj6.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Object obj13 = defaultStatisticalCategoryDataset6.clone();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset6.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj13", defaultStatisticalCategoryDataset0.equals(obj13) ? defaultStatisticalCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int28 = defaultStatisticalCategoryDataset22.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset22.removeChangeListener(datasetChangeListener29);
        java.lang.Number number33 = defaultStatisticalCategoryDataset22.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int35 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list36 = defaultStatisticalCategoryDataset22.getRowKeys();
        boolean boolean37 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list16 = defaultStatisticalCategoryDataset15.getRowKeys();
        boolean boolean17 = defaultStatisticalCategoryDataset9.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset15.hasListener(eventListener18);
        boolean boolean20 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset9 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset9.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset9.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        defaultStatisticalCategoryDataset7.validateObject();
        java.util.List list11 = defaultStatisticalCategoryDataset7.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset7.getGroup();
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        defaultStatisticalCategoryDataset7.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset15.validateObject();
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset15.getRangeBounds(true);
        int int25 = defaultStatisticalCategoryDataset15.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener7);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset9.addChangeListener(datasetChangeListener10);
        boolean boolean12 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) defaultStatisticalCategoryDataset9);
        int int14 = defaultStatisticalCategoryDataset9.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset9.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset9.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset9", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset9) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset8.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset8.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener13);
        int int15 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.util.List list16 = defaultStatisticalCategoryDataset12.getColumnKeys();
        java.lang.Number number19 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int21 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean22 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset12", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset12) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getRowKey(0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) -1);
        int int20 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int22 = defaultStatisticalCategoryDataset21.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup25);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset7.addChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset10.addChangeListener(datasetChangeListener11);
        boolean boolean13 = defaultStatisticalCategoryDataset7.equals((java.lang.Object) defaultStatisticalCategoryDataset10);
        int int15 = defaultStatisticalCategoryDataset10.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset10.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and defaultStatisticalCategoryDataset10", defaultStatisticalCategoryDataset7.equals(defaultStatisticalCategoryDataset10) ? defaultStatisticalCategoryDataset7.hashCode() == defaultStatisticalCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals(obj9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        boolean boolean19 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        int int21 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        defaultStatisticalCategoryDataset7.validateObject();
        java.util.List list11 = defaultStatisticalCategoryDataset7.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset7.getGroup();
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset7", obj6.equals(defaultStatisticalCategoryDataset7) ? obj6.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        defaultStatisticalCategoryDataset17.validateObject();
        java.util.List list21 = defaultStatisticalCategoryDataset17.getRowKeys();
        int int22 = defaultStatisticalCategoryDataset17.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int26 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Number number29 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) false, (java.lang.Comparable) 100.0d);
        java.lang.Object obj30 = defaultStatisticalCategoryDataset12.clone();
        java.lang.Object obj31 = null;
        boolean boolean32 = defaultStatisticalCategoryDataset12.equals(obj31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj30", defaultStatisticalCategoryDataset18.equals(obj30) ? defaultStatisticalCategoryDataset18.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset8.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset8.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener13);
        int int15 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.util.List list16 = defaultStatisticalCategoryDataset12.getColumnKeys();
        java.lang.Number number19 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int21 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean22 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset8", obj6.equals(defaultStatisticalCategoryDataset8) ? obj6.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list12 = defaultStatisticalCategoryDataset11.getRowKeys();
        defaultStatisticalCategoryDataset11.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int18 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset11.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset11.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset11.hasListener(eventListener27);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset11.getGroup();
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup29", datasetGroup8.equals(datasetGroup29) ? datasetGroup8.hashCode() == datasetGroup29.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list16 = defaultStatisticalCategoryDataset15.getRowKeys();
        boolean boolean17 = defaultStatisticalCategoryDataset9.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        java.util.List list18 = defaultStatisticalCategoryDataset15.getRowKeys();
        boolean boolean19 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset9", obj6.equals(defaultStatisticalCategoryDataset9) ? obj6.hashCode() == defaultStatisticalCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) true);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list20 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset24.hasListener(eventListener25);
        defaultStatisticalCategoryDataset24.validateObject();
        java.util.List list28 = defaultStatisticalCategoryDataset24.getRowKeys();
        int int29 = defaultStatisticalCategoryDataset24.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset24", obj7.equals(defaultStatisticalCategoryDataset24) ? obj7.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        defaultStatisticalCategoryDataset8.add((java.lang.Number) (-1.0f), (java.lang.Number) (short) 1, (java.lang.Comparable) Double.NaN, (java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset24.hasListener(eventListener25);
        java.lang.Number number29 = defaultStatisticalCategoryDataset24.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int30 = defaultStatisticalCategoryDataset24.getRowCount();
        double double32 = defaultStatisticalCategoryDataset24.getRangeUpperBound(true);
        boolean boolean34 = defaultStatisticalCategoryDataset24.equals((java.lang.Object) (short) 10);
        double double36 = defaultStatisticalCategoryDataset24.getRangeLowerBound(false);
        java.lang.Number number39 = defaultStatisticalCategoryDataset24.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int40 = defaultStatisticalCategoryDataset24.getRowCount();
        int int41 = defaultStatisticalCategoryDataset24.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup42 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset8.setGroup(datasetGroup42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset24", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset24) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double13 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0f, (java.lang.Number) 100.0f, (java.lang.Comparable) Double.NaN, (java.lang.Comparable) Double.NaN);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener20);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener23);
        boolean boolean25 = defaultStatisticalCategoryDataset19.equals((java.lang.Object) defaultStatisticalCategoryDataset22);
        int int27 = defaultStatisticalCategoryDataset22.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset22.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset19", obj7.equals(defaultStatisticalCategoryDataset19) ? obj7.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int5 = defaultStatisticalCategoryDataset4.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset4.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset4.getColumnKeys();
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.add((double) (byte) 0, (double) (short) 0, (java.lang.Comparable) false, (java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup11", datasetGroup8.equals(datasetGroup11) ? datasetGroup8.hashCode() == datasetGroup11.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj14", defaultStatisticalCategoryDataset6.equals(obj14) ? defaultStatisticalCategoryDataset6.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener13);
        int int15 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.util.List list16 = defaultStatisticalCategoryDataset12.getColumnKeys();
        java.lang.Number number19 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset12", obj7.equals(defaultStatisticalCategoryDataset12) ? obj7.hashCode() == defaultStatisticalCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) "");
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset11.hasListener(eventListener12);
        defaultStatisticalCategoryDataset11.validateObject();
        java.lang.Number number17 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset11.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number22 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int24 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) -1);
        int int26 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset19.removeChangeListener(datasetChangeListener27);
        boolean boolean29 = defaultStatisticalCategoryDataset11.equals((java.lang.Object) defaultStatisticalCategoryDataset19);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset11 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset11.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset11.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int10 = defaultStatisticalCategoryDataset9.getColumnCount();
        int int12 = defaultStatisticalCategoryDataset9.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset9.getGroup();
        java.lang.Comparable comparable15 = null;
        java.lang.Number number16 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) 1L, comparable15);
        int int17 = defaultStatisticalCategoryDataset9.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        defaultStatisticalCategoryDataset18.validateObject();
        double double23 = defaultStatisticalCategoryDataset18.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset24.addChangeListener(datasetChangeListener25);
        int int27 = defaultStatisticalCategoryDataset24.getColumnCount();
        java.lang.Number number30 = defaultStatisticalCategoryDataset24.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset24.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup36);
        defaultStatisticalCategoryDataset9.setGroup(datasetGroup36);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset9 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset9.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset9.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) true);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list20 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 0);
        java.util.List list24 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Class<?> wildcardClass25 = list24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj7", defaultStatisticalCategoryDataset0.equals(obj7) ? defaultStatisticalCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        java.lang.Number number26 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) (byte) 1);
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset12.hasListener(eventListener27);
        java.lang.Number number31 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 100);
        java.util.List list32 = defaultStatisticalCategoryDataset12.getColumnKeys();
        java.lang.Class<?> wildcardClass33 = list32.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset6.getRowCount();
        defaultStatisticalCategoryDataset6.add((double) 0L, (double) 0, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        java.lang.Number number24 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list26 = defaultStatisticalCategoryDataset25.getRowKeys();
        boolean boolean27 = defaultStatisticalCategoryDataset19.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        java.util.List list28 = defaultStatisticalCategoryDataset19.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset6.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        java.lang.Comparable comparable18 = null;
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0d, comparable18);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list21 = defaultStatisticalCategoryDataset20.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener22);
        double double25 = defaultStatisticalCategoryDataset20.getRangeUpperBound(true);
        java.lang.Object obj26 = defaultStatisticalCategoryDataset20.clone();
        int int28 = defaultStatisticalCategoryDataset20.getRowIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener29);
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj26", defaultStatisticalCategoryDataset4.equals(obj26) ? defaultStatisticalCategoryDataset4.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.lang.Comparable comparable14 = null;
        defaultStatisticalCategoryDataset0.add((double) 100L, 0.0d, comparable14, (java.lang.Comparable) "");
        java.lang.Object obj17 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener19);
        int int21 = defaultStatisticalCategoryDataset18.getColumnCount();
        java.util.List list22 = defaultStatisticalCategoryDataset18.getColumnKeys();
        java.lang.Number number25 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int27 = defaultStatisticalCategoryDataset18.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list28 = defaultStatisticalCategoryDataset18.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset29.addChangeListener(datasetChangeListener30);
        int int32 = defaultStatisticalCategoryDataset29.getColumnCount();
        java.util.List list33 = defaultStatisticalCategoryDataset29.getColumnKeys();
        java.lang.Number number36 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int38 = defaultStatisticalCategoryDataset29.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list39 = defaultStatisticalCategoryDataset29.getColumnKeys();
        boolean boolean40 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        boolean boolean41 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) boolean40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset29", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset29) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset29.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        java.lang.Comparable comparable22 = null;
        java.lang.Number number24 = defaultStatisticalCategoryDataset0.getMeanValue(comparable22, (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int3 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        int int8 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list9 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset4.clone();
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals(obj10);
        double double13 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj10", defaultStatisticalCategoryDataset4.equals(obj10) ? defaultStatisticalCategoryDataset4.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int3 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        int int8 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list9 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset4.clone();
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals(obj10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj10", defaultStatisticalCategoryDataset4.equals(obj10) ? defaultStatisticalCategoryDataset4.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        java.lang.Comparable comparable19 = null;
        java.lang.Number number20 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1L, comparable19);
        int int21 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        defaultStatisticalCategoryDataset22.validateObject();
        double double27 = defaultStatisticalCategoryDataset22.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset28.addChangeListener(datasetChangeListener29);
        int int31 = defaultStatisticalCategoryDataset28.getColumnCount();
        java.lang.Number number34 = defaultStatisticalCategoryDataset28.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset28.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup40);
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup40);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup12 and datasetGroup17", datasetGroup12.equals(datasetGroup17) ? datasetGroup12.hashCode() == datasetGroup17.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset8.hasListener(eventListener9);
        java.lang.Number number13 = defaultStatisticalCategoryDataset8.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int14 = defaultStatisticalCategoryDataset8.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset8.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int21 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset8.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        defaultStatisticalCategoryDataset8.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 1);
        int int32 = defaultStatisticalCategoryDataset8.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultStatisticalCategoryDataset33.addChangeListener(datasetChangeListener34);
        int int36 = defaultStatisticalCategoryDataset33.getColumnCount();
        java.util.List list37 = defaultStatisticalCategoryDataset33.getColumnKeys();
        java.lang.Number number40 = defaultStatisticalCategoryDataset33.getValue((java.lang.Comparable) '#', (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener41 = null;
        defaultStatisticalCategoryDataset33.removeChangeListener(datasetChangeListener41);
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset33.getGroup();
        defaultStatisticalCategoryDataset8.setGroup(datasetGroup43);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup43);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset46 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener47 = null;
        boolean boolean48 = defaultStatisticalCategoryDataset46.hasListener(eventListener47);
        defaultStatisticalCategoryDataset46.validateObject();
        double double51 = defaultStatisticalCategoryDataset46.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset52 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener53 = null;
        defaultStatisticalCategoryDataset52.addChangeListener(datasetChangeListener53);
        int int55 = defaultStatisticalCategoryDataset52.getColumnCount();
        java.lang.Number number58 = defaultStatisticalCategoryDataset52.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset52.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup64 = defaultStatisticalCategoryDataset52.getGroup();
        defaultStatisticalCategoryDataset46.setGroup(datasetGroup64);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset33 and defaultStatisticalCategoryDataset46", defaultStatisticalCategoryDataset33.equals(defaultStatisticalCategoryDataset46) ? defaultStatisticalCategoryDataset33.hashCode() == defaultStatisticalCategoryDataset46.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        double double20 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 100L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset24.getGroup();
        java.lang.Comparable comparable30 = null;
        java.lang.Number number31 = defaultStatisticalCategoryDataset24.getMeanValue((java.lang.Comparable) 1L, comparable30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset24.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        double double36 = defaultStatisticalCategoryDataset24.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset37 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int38 = defaultStatisticalCategoryDataset37.getColumnCount();
        int int40 = defaultStatisticalCategoryDataset37.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset37.getGroup();
        defaultStatisticalCategoryDataset24.setGroup(datasetGroup41);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset24 and defaultStatisticalCategoryDataset37", defaultStatisticalCategoryDataset24.equals(defaultStatisticalCategoryDataset37) ? defaultStatisticalCategoryDataset24.hashCode() == defaultStatisticalCategoryDataset37.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number8 = defaultStatisticalCategoryDataset5.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double10 = defaultStatisticalCategoryDataset5.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int12 = defaultStatisticalCategoryDataset11.getColumnCount();
        int int14 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset5.setGroup(datasetGroup15);
        java.util.List list17 = defaultStatisticalCategoryDataset5.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset5.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset5.removeChangeListener(datasetChangeListener20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset5.removeChangeListener(datasetChangeListener22);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number27 = defaultStatisticalCategoryDataset24.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int29 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) -1);
        double double31 = defaultStatisticalCategoryDataset24.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset24.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset24.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        double double43 = defaultStatisticalCategoryDataset24.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup44 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset5.setGroup(datasetGroup44);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset5 and defaultStatisticalCategoryDataset11", defaultStatisticalCategoryDataset5.equals(defaultStatisticalCategoryDataset11) ? defaultStatisticalCategoryDataset5.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list9 = defaultStatisticalCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener10);
        double double13 = defaultStatisticalCategoryDataset8.getRangeUpperBound(true);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset8.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        defaultStatisticalCategoryDataset15.validateObject();
        java.util.List list19 = defaultStatisticalCategoryDataset15.getRowKeys();
        int int20 = defaultStatisticalCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset15.getGroup();
        boolean boolean22 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        defaultStatisticalCategoryDataset8.add((java.lang.Number) (short) 10, (java.lang.Number) 1, (java.lang.Comparable) 10, (java.lang.Comparable) (short) 10);
        double double29 = defaultStatisticalCategoryDataset8.getRangeLowerBound(false);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        java.lang.Number number33 = defaultStatisticalCategoryDataset8.getMeanValue((java.lang.Comparable) 1, (java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int3 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        int int8 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list9 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset4.clone();
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals(obj10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '#', (java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj10", defaultStatisticalCategoryDataset4.equals(obj10) ? defaultStatisticalCategoryDataset4.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10.0d, (java.lang.Number) 0.0d, (java.lang.Comparable) 1, (java.lang.Comparable) '4');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset23.hasListener(eventListener24);
        java.lang.Number number28 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int29 = defaultStatisticalCategoryDataset23.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset23.removeChangeListener(datasetChangeListener30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset23.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int36 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list37 = defaultStatisticalCategoryDataset23.getRowKeys();
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        java.lang.Object obj39 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset3.getGroup();
        java.util.List list10 = defaultStatisticalCategoryDataset3.getColumnKeys();
        int int11 = defaultStatisticalCategoryDataset3.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset12.getRangeBounds(false);
        boolean boolean17 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset3.hasListener(eventListener18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset12", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset12) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        defaultStatisticalCategoryDataset12.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        defaultStatisticalCategoryDataset25.validateObject();
        java.lang.Number number31 = defaultStatisticalCategoryDataset25.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj32 = defaultStatisticalCategoryDataset25.clone();
        org.jfree.data.Range range34 = defaultStatisticalCategoryDataset25.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultStatisticalCategoryDataset25.addChangeListener(datasetChangeListener35);
        defaultStatisticalCategoryDataset25.validateObject();
        java.lang.Number number40 = defaultStatisticalCategoryDataset25.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int42 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) true);
        double double44 = defaultStatisticalCategoryDataset25.getRangeUpperBound(true);
        java.util.List list45 = defaultStatisticalCategoryDataset25.getRowKeys();
        java.lang.Number number48 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 0);
        boolean boolean49 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj32", defaultStatisticalCategoryDataset18.equals(obj32) ? defaultStatisticalCategoryDataset18.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.util.List list21 = defaultStatisticalCategoryDataset18.getColumnKeys();
        java.util.List list22 = defaultStatisticalCategoryDataset18.getColumnKeys();
        java.lang.Number number25 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset26.hasListener(eventListener27);
        java.lang.Number number31 = defaultStatisticalCategoryDataset26.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int32 = defaultStatisticalCategoryDataset26.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultStatisticalCategoryDataset26.removeChangeListener(datasetChangeListener33);
        java.lang.Number number37 = defaultStatisticalCategoryDataset26.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int39 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset26.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        defaultStatisticalCategoryDataset26.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 1);
        int int50 = defaultStatisticalCategoryDataset26.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset51 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener52 = null;
        defaultStatisticalCategoryDataset51.addChangeListener(datasetChangeListener52);
        int int54 = defaultStatisticalCategoryDataset51.getColumnCount();
        java.util.List list55 = defaultStatisticalCategoryDataset51.getColumnKeys();
        java.lang.Number number58 = defaultStatisticalCategoryDataset51.getValue((java.lang.Comparable) '#', (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener59 = null;
        defaultStatisticalCategoryDataset51.removeChangeListener(datasetChangeListener59);
        org.jfree.data.general.DatasetGroup datasetGroup61 = defaultStatisticalCategoryDataset51.getGroup();
        defaultStatisticalCategoryDataset26.setGroup(datasetGroup61);
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup61);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset51", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset51) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset51.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        defaultStatisticalCategoryDataset7.validateObject();
        java.util.List list11 = defaultStatisticalCategoryDataset7.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset7.getGroup();
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset7.removeChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list16 = defaultStatisticalCategoryDataset15.getRowKeys();
        int int18 = defaultStatisticalCategoryDataset15.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener20);
        int int22 = defaultStatisticalCategoryDataset19.getColumnCount();
        int int23 = defaultStatisticalCategoryDataset19.getColumnCount();
        java.util.List list24 = defaultStatisticalCategoryDataset19.getColumnKeys();
        java.lang.Object obj25 = defaultStatisticalCategoryDataset19.clone();
        boolean boolean26 = defaultStatisticalCategoryDataset15.equals(obj25);
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset19 and obj25", defaultStatisticalCategoryDataset19.equals(obj25) ? defaultStatisticalCategoryDataset19.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number21 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double23 = defaultStatisticalCategoryDataset18.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup28);
        java.lang.Number number31 = null;
        defaultStatisticalCategoryDataset18.add((java.lang.Number) Double.NaN, number31, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        java.util.List list35 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset24", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset24) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int13 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int15 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset12.getGroup();
        java.lang.Comparable comparable18 = null;
        java.lang.Number number19 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 1L, comparable18);
        int int20 = defaultStatisticalCategoryDataset12.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset21.hasListener(eventListener22);
        defaultStatisticalCategoryDataset21.validateObject();
        double double26 = defaultStatisticalCategoryDataset21.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset27.addChangeListener(datasetChangeListener28);
        int int30 = defaultStatisticalCategoryDataset27.getColumnCount();
        java.lang.Number number33 = defaultStatisticalCategoryDataset27.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset27.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset21.setGroup(datasetGroup39);
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup39);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and defaultStatisticalCategoryDataset12", obj11.equals(defaultStatisticalCategoryDataset12) ? obj11.hashCode() == defaultStatisticalCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number27 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset12.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset29.addChangeListener(datasetChangeListener30);
        int int32 = defaultStatisticalCategoryDataset29.getColumnCount();
        java.util.List list33 = defaultStatisticalCategoryDataset29.getColumnKeys();
        java.lang.Number number36 = defaultStatisticalCategoryDataset29.getValue((java.lang.Comparable) '#', (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset29.removeChangeListener(datasetChangeListener37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset29.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset29", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset29) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset29.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset0.hasListener(eventListener11);
        java.lang.Comparable comparable16 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0f, (java.lang.Number) 1L, (java.lang.Comparable) (byte) 10, comparable16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener19);
        int int21 = defaultStatisticalCategoryDataset18.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset22.getGroup();
        java.util.List list27 = defaultStatisticalCategoryDataset22.getColumnKeys();
        boolean boolean28 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) defaultStatisticalCategoryDataset22);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup17);
        int int20 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup17", datasetGroup4.equals(datasetGroup17) ? datasetGroup4.hashCode() == datasetGroup17.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0L, (java.lang.Comparable) 1.0f);
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int19 = defaultStatisticalCategoryDataset18.getColumnCount();
        double double21 = defaultStatisticalCategoryDataset18.getRangeLowerBound(false);
        java.util.List list22 = defaultStatisticalCategoryDataset18.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset23.hasListener(eventListener24);
        java.lang.Number number28 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset23.validateObject();
        org.jfree.data.Range range31 = defaultStatisticalCategoryDataset23.getRangeBounds(true);
        int int32 = defaultStatisticalCategoryDataset23.getColumnCount();
        java.lang.Number number35 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int37 = defaultStatisticalCategoryDataset23.getRowIndex((java.lang.Comparable) (byte) 100);
        int int39 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) 0L);
        defaultStatisticalCategoryDataset23.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset41 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list42 = defaultStatisticalCategoryDataset41.getRowKeys();
        defaultStatisticalCategoryDataset41.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number50 = defaultStatisticalCategoryDataset41.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultStatisticalCategoryDataset41.getGroup();
        defaultStatisticalCategoryDataset23.setGroup(datasetGroup51);
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup51);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        java.lang.Number number25 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int26 = defaultStatisticalCategoryDataset20.getRowCount();
        double double28 = defaultStatisticalCategoryDataset20.getRangeUpperBound(true);
        java.util.List list29 = defaultStatisticalCategoryDataset20.getRowKeys();
        int int31 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) 1.0d);
        java.lang.Comparable comparable34 = null;
        defaultStatisticalCategoryDataset20.add((double) 100L, 0.0d, comparable34, (java.lang.Comparable) "");
        java.lang.Object obj37 = defaultStatisticalCategoryDataset20.clone();
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset20 and obj37", defaultStatisticalCategoryDataset20.equals(obj37) ? defaultStatisticalCategoryDataset20.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and obj7", defaultStatisticalCategoryDataset3.equals(obj7) ? defaultStatisticalCategoryDataset3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        java.lang.Number number26 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) (byte) 1);
        java.lang.Number number29 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list31 = defaultStatisticalCategoryDataset30.getRowKeys();
        defaultStatisticalCategoryDataset30.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int37 = defaultStatisticalCategoryDataset30.getColumnCount();
        int int38 = defaultStatisticalCategoryDataset30.getColumnCount();
        boolean boolean39 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) int38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset30", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset30) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset30.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number10 = defaultStatisticalCategoryDataset7.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int12 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) -1);
        double double14 = defaultStatisticalCategoryDataset7.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset7.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset7.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        double double26 = defaultStatisticalCategoryDataset7.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset7.getGroup();
        java.lang.Object obj28 = defaultStatisticalCategoryDataset7.clone();
        org.jfree.data.Range range30 = defaultStatisticalCategoryDataset7.getRangeBounds(true);
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) range30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and obj28", defaultStatisticalCategoryDataset7.equals(obj28) ? defaultStatisticalCategoryDataset7.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) 100L, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int28 = defaultStatisticalCategoryDataset22.getRowCount();
        double double30 = defaultStatisticalCategoryDataset22.getRangeUpperBound(true);
        boolean boolean32 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) (short) 10);
        double double34 = defaultStatisticalCategoryDataset22.getRangeLowerBound(false);
        boolean boolean35 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj16", obj13.equals(obj16) ? obj13.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int10 = defaultStatisticalCategoryDataset9.getColumnCount();
        int int12 = defaultStatisticalCategoryDataset9.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset9.getGroup();
        java.lang.Comparable comparable15 = null;
        java.lang.Number number16 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) 1L, comparable15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset9.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        double double21 = defaultStatisticalCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset9.setGroup(datasetGroup26);
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset9 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset9.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset9.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number27 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 100);
        java.util.List list28 = defaultStatisticalCategoryDataset12.getColumnKeys();
        java.lang.Object obj29 = defaultStatisticalCategoryDataset12.clone();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset10.hasListener(eventListener11);
        defaultStatisticalCategoryDataset10.validateObject();
        java.lang.Number number16 = defaultStatisticalCategoryDataset10.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset10.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list29 = defaultStatisticalCategoryDataset28.getRowKeys();
        boolean boolean30 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset28);
        boolean boolean31 = defaultStatisticalCategoryDataset10.equals((java.lang.Object) defaultStatisticalCategoryDataset22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener32);
        int int34 = defaultStatisticalCategoryDataset22.getColumnCount();
        java.lang.Number number37 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset22 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset22.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset22.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj14", defaultStatisticalCategoryDataset6.equals(obj14) ? defaultStatisticalCategoryDataset6.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable15 = null;
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1, comparable15);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup21);
        int int23 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup21", datasetGroup4.equals(datasetGroup21) ? datasetGroup4.hashCode() == datasetGroup21.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list12 = defaultStatisticalCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener13);
        double double16 = defaultStatisticalCategoryDataset11.getRangeUpperBound(true);
        java.lang.Object obj17 = defaultStatisticalCategoryDataset11.clone();
        java.util.List list18 = defaultStatisticalCategoryDataset11.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset11.getRowCount();
        boolean boolean20 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        int int22 = defaultStatisticalCategoryDataset11.getRowIndex((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj17", defaultStatisticalCategoryDataset0.equals(obj17) ? defaultStatisticalCategoryDataset0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list15 = defaultStatisticalCategoryDataset14.getRowKeys();
        defaultStatisticalCategoryDataset14.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int21 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.lang.Number number24 = defaultStatisticalCategoryDataset14.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset14.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset14.hasListener(eventListener30);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup32);
        java.lang.Number number36 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup12 and datasetGroup32", datasetGroup12.equals(datasetGroup32) ? datasetGroup12.hashCode() == datasetGroup32.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        defaultStatisticalCategoryDataset7.validateObject();
        java.util.List list11 = defaultStatisticalCategoryDataset7.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset7.getGroup();
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 10, (java.lang.Number) 1, (java.lang.Comparable) 10, (java.lang.Comparable) (short) 10);
        double double21 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number25 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double27 = defaultStatisticalCategoryDataset22.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int29 = defaultStatisticalCategoryDataset28.getColumnCount();
        int int31 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup32);
        java.util.List list34 = defaultStatisticalCategoryDataset22.getColumnKeys();
        int int36 = defaultStatisticalCategoryDataset22.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset22.removeChangeListener(datasetChangeListener37);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultStatisticalCategoryDataset22.removeChangeListener(datasetChangeListener39);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset41 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number44 = defaultStatisticalCategoryDataset41.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int46 = defaultStatisticalCategoryDataset41.getColumnIndex((java.lang.Comparable) (short) -1);
        double double48 = defaultStatisticalCategoryDataset41.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset41.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset41.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        double double60 = defaultStatisticalCategoryDataset41.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup61 = defaultStatisticalCategoryDataset41.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup61);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset7.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset7.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener21);
        int int23 = defaultStatisticalCategoryDataset20.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset24.getGroup();
        java.util.List list29 = defaultStatisticalCategoryDataset24.getColumnKeys();
        boolean boolean30 = defaultStatisticalCategoryDataset20.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset7.addChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset10.addChangeListener(datasetChangeListener11);
        boolean boolean13 = defaultStatisticalCategoryDataset7.equals((java.lang.Object) defaultStatisticalCategoryDataset10);
        int int15 = defaultStatisticalCategoryDataset10.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset10.getGroup();
        double double18 = defaultStatisticalCategoryDataset10.getRangeUpperBound(false);
        int int19 = defaultStatisticalCategoryDataset10.getRowCount();
        double double21 = defaultStatisticalCategoryDataset10.getRangeUpperBound(true);
        boolean boolean22 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup6 and datasetGroup16", datasetGroup6.equals(datasetGroup16) ? datasetGroup6.hashCode() == datasetGroup16.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset0.hasListener(eventListener20);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        java.util.List list25 = defaultStatisticalCategoryDataset22.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset26.addChangeListener(datasetChangeListener27);
        int int29 = defaultStatisticalCategoryDataset26.getColumnCount();
        java.util.List list30 = defaultStatisticalCategoryDataset26.getColumnKeys();
        java.lang.Number number33 = defaultStatisticalCategoryDataset26.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int35 = defaultStatisticalCategoryDataset26.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean36 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultStatisticalCategoryDataset26.getGroup();
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset39 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener40 = null;
        boolean boolean41 = defaultStatisticalCategoryDataset39.hasListener(eventListener40);
        java.lang.Number number44 = defaultStatisticalCategoryDataset39.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset45 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list46 = defaultStatisticalCategoryDataset45.getRowKeys();
        boolean boolean47 = defaultStatisticalCategoryDataset39.equals((java.lang.Object) defaultStatisticalCategoryDataset45);
        java.util.List list48 = defaultStatisticalCategoryDataset39.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup49 = defaultStatisticalCategoryDataset39.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset22 and defaultStatisticalCategoryDataset26", defaultStatisticalCategoryDataset22.equals(defaultStatisticalCategoryDataset26) ? defaultStatisticalCategoryDataset22.hashCode() == defaultStatisticalCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.lang.Number number9 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        defaultStatisticalCategoryDataset3.add((double) 0, (double) 0, (java.lang.Comparable) ' ', (java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset3.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int22 = defaultStatisticalCategoryDataset16.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset16.removeChangeListener(datasetChangeListener23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset16.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset3.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener17);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number22 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int24 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) -1);
        double double26 = defaultStatisticalCategoryDataset19.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset19.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset19.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        double double38 = defaultStatisticalCategoryDataset19.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        java.lang.Class<?> wildcardClass41 = datasetGroup39.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset6", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset6) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list12 = defaultStatisticalCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener13);
        double double16 = defaultStatisticalCategoryDataset11.getRangeUpperBound(true);
        java.lang.Object obj17 = defaultStatisticalCategoryDataset11.clone();
        java.util.List list18 = defaultStatisticalCategoryDataset11.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset11.getRowCount();
        boolean boolean20 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        java.lang.Class<?> wildcardClass21 = defaultStatisticalCategoryDataset11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj17", defaultStatisticalCategoryDataset0.equals(obj17) ? defaultStatisticalCategoryDataset0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset3.getGroup();
        java.util.List list10 = defaultStatisticalCategoryDataset3.getColumnKeys();
        int int11 = defaultStatisticalCategoryDataset3.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset12.getRangeBounds(false);
        boolean boolean17 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        java.lang.Number number20 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset3", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset3) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset3.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10.0d, (java.lang.Number) 0.0d, (java.lang.Comparable) 1, (java.lang.Comparable) '4');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number26 = defaultStatisticalCategoryDataset23.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int28 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (short) -1);
        int int30 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int32 = defaultStatisticalCategoryDataset31.getColumnCount();
        int int34 = defaultStatisticalCategoryDataset31.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset31.getGroup();
        defaultStatisticalCategoryDataset23.setGroup(datasetGroup35);
        defaultStatisticalCategoryDataset23.validateObject();
        java.util.List list38 = defaultStatisticalCategoryDataset23.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultStatisticalCategoryDataset23.addChangeListener(datasetChangeListener39);
        java.lang.Number number43 = defaultStatisticalCategoryDataset23.getValue((java.lang.Comparable) '#', (java.lang.Comparable) (-1L));
        java.util.List list44 = defaultStatisticalCategoryDataset23.getRowKeys();
        java.lang.Comparable comparable47 = null;
        defaultStatisticalCategoryDataset23.add((java.lang.Number) (-1.0f), (java.lang.Number) Double.NaN, comparable47, (java.lang.Comparable) 10L);
        boolean boolean50 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) Double.NaN);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset31", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset31) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset31.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.Range range12 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        defaultStatisticalCategoryDataset13.validateObject();
        java.util.List list17 = defaultStatisticalCategoryDataset13.getRowKeys();
        int int18 = defaultStatisticalCategoryDataset13.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset13", obj6.equals(defaultStatisticalCategoryDataset13) ? obj6.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup17);
        java.lang.Class<?> wildcardClass19 = datasetGroup17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number12 = defaultStatisticalCategoryDataset9.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int14 = defaultStatisticalCategoryDataset9.getColumnIndex((java.lang.Comparable) (short) -1);
        int int16 = defaultStatisticalCategoryDataset9.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset9.setGroup(datasetGroup21);
        defaultStatisticalCategoryDataset9.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset9.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup24", datasetGroup4.equals(datasetGroup24) ? datasetGroup4.hashCode() == datasetGroup24.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        boolean boolean19 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        int int21 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset16.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset16.getGroup();
        int int25 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (-1));
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        int int27 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number12 = defaultStatisticalCategoryDataset9.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double14 = defaultStatisticalCategoryDataset9.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int16 = defaultStatisticalCategoryDataset15.getColumnCount();
        int int18 = defaultStatisticalCategoryDataset15.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset9.setGroup(datasetGroup19);
        java.util.List list21 = defaultStatisticalCategoryDataset9.getColumnKeys();
        int int23 = defaultStatisticalCategoryDataset9.getRowIndex((java.lang.Comparable) 0);
        defaultStatisticalCategoryDataset9.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset9.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset9 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset9.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset9.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        double double20 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list22 = defaultStatisticalCategoryDataset21.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset21.addChangeListener(datasetChangeListener23);
        double double26 = defaultStatisticalCategoryDataset21.getRangeUpperBound(true);
        java.lang.Object obj27 = defaultStatisticalCategoryDataset21.clone();
        double double29 = defaultStatisticalCategoryDataset21.getRangeUpperBound(true);
        java.util.List list30 = defaultStatisticalCategoryDataset21.getRowKeys();
        int int31 = defaultStatisticalCategoryDataset21.getColumnCount();
        java.util.List list32 = defaultStatisticalCategoryDataset21.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset21 and obj27", defaultStatisticalCategoryDataset21.equals(obj27) ? defaultStatisticalCategoryDataset21.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.lang.Comparable comparable12 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10, (java.lang.Number) 2, comparable12, (java.lang.Comparable) ' ');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int16 = defaultStatisticalCategoryDataset15.getColumnCount();
        int int18 = defaultStatisticalCategoryDataset15.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj19 = defaultStatisticalCategoryDataset15.clone();
        defaultStatisticalCategoryDataset15.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset15.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and obj19", defaultStatisticalCategoryDataset15.equals(obj19) ? defaultStatisticalCategoryDataset15.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) Double.NaN);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int13 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int15 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset12.getGroup();
        java.util.List list17 = defaultStatisticalCategoryDataset12.getColumnKeys();
        int int18 = defaultStatisticalCategoryDataset12.getRowCount();
        java.lang.Object obj19 = defaultStatisticalCategoryDataset12.clone();
        boolean boolean20 = defaultStatisticalCategoryDataset0.equals(obj19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and obj19", defaultStatisticalCategoryDataset12.equals(obj19) ? defaultStatisticalCategoryDataset12.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable10 = null;
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '4', comparable10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        defaultStatisticalCategoryDataset12.validateObject();
        java.lang.Number number18 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset12.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number23 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int25 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (short) -1);
        int int27 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset20.removeChangeListener(datasetChangeListener28);
        boolean boolean30 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset20.validateObject();
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup31", datasetGroup4.equals(datasetGroup31) ? datasetGroup4.hashCode() == datasetGroup31.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) -1);
        int int20 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int22 = defaultStatisticalCategoryDataset21.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup25);
        defaultStatisticalCategoryDataset13.add((java.lang.Number) 1L, (java.lang.Number) Double.NaN, (java.lang.Comparable) 2, (java.lang.Comparable) 100.0d);
        boolean boolean32 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup6 and datasetGroup25", datasetGroup6.equals(datasetGroup25) ? datasetGroup6.hashCode() == datasetGroup25.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        java.lang.Object obj24 = defaultStatisticalCategoryDataset12.clone();
        int int25 = defaultStatisticalCategoryDataset12.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj24", defaultStatisticalCategoryDataset18.equals(obj24) ? defaultStatisticalCategoryDataset18.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset6.hasListener(eventListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset6.validateObject();
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset6.getRangeBounds(true);
        int int15 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Number number18 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int20 = defaultStatisticalCategoryDataset6.getRowIndex((java.lang.Comparable) (byte) 100);
        int int22 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) 0L);
        boolean boolean23 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and defaultStatisticalCategoryDataset6", obj5.equals(defaultStatisticalCategoryDataset6) ? obj5.hashCode() == defaultStatisticalCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        int int20 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, (java.lang.Number) 100.0f, (java.lang.Comparable) "hi!", (java.lang.Comparable) (short) 1);
        java.util.List list26 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset27.hasListener(eventListener28);
        defaultStatisticalCategoryDataset27.validateObject();
        java.lang.Number number33 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj34 = defaultStatisticalCategoryDataset27.clone();
        org.jfree.data.Range range36 = defaultStatisticalCategoryDataset27.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset27.addChangeListener(datasetChangeListener37);
        int int40 = defaultStatisticalCategoryDataset27.getRowIndex((java.lang.Comparable) (short) 1);
        int int41 = defaultStatisticalCategoryDataset27.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup42 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset27 and obj34", defaultStatisticalCategoryDataset27.equals(obj34) ? defaultStatisticalCategoryDataset27.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj21 = defaultStatisticalCategoryDataset17.clone();
        defaultStatisticalCategoryDataset17.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset17 and obj21", defaultStatisticalCategoryDataset17.equals(obj21) ? defaultStatisticalCategoryDataset17.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int15 = defaultStatisticalCategoryDataset9.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset9.removeChangeListener(datasetChangeListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset9.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int22 = defaultStatisticalCategoryDataset9.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list23 = defaultStatisticalCategoryDataset9.getRowKeys();
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset9", obj6.equals(defaultStatisticalCategoryDataset9) ? obj6.hashCode() == defaultStatisticalCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset10.addChangeListener(datasetChangeListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset10.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset10.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int24 = defaultStatisticalCategoryDataset18.getRowCount();
        double double26 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        boolean boolean28 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) (short) 10);
        double double30 = defaultStatisticalCategoryDataset18.getRangeLowerBound(false);
        java.lang.Number number33 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int34 = defaultStatisticalCategoryDataset18.getRowCount();
        int int35 = defaultStatisticalCategoryDataset18.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset10.setGroup(datasetGroup36);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset10 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset10.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset10.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj14", defaultStatisticalCategoryDataset6.equals(obj14) ? defaultStatisticalCategoryDataset6.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        java.util.List list22 = defaultStatisticalCategoryDataset19.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset23.addChangeListener(datasetChangeListener24);
        int int26 = defaultStatisticalCategoryDataset23.getColumnCount();
        java.util.List list27 = defaultStatisticalCategoryDataset23.getColumnKeys();
        java.lang.Number number30 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int32 = defaultStatisticalCategoryDataset23.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean33 = defaultStatisticalCategoryDataset19.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        java.lang.Number number36 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0.0f);
        java.lang.Number number39 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) 0L, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list15 = defaultStatisticalCategoryDataset14.getRowKeys();
        defaultStatisticalCategoryDataset14.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int21 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.lang.Number number24 = defaultStatisticalCategoryDataset14.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset14.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset14.hasListener(eventListener30);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup32);
        java.util.List list34 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup12 and datasetGroup32", datasetGroup12.equals(datasetGroup32) ? datasetGroup12.hashCode() == datasetGroup32.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) (-1), (java.lang.Comparable) ' ', (java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener21);
        int int23 = defaultStatisticalCategoryDataset20.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset20.getColumnCount();
        java.util.List list25 = defaultStatisticalCategoryDataset20.getColumnKeys();
        java.lang.Object obj26 = defaultStatisticalCategoryDataset20.clone();
        java.lang.Number number29 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        java.lang.Number number32 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) true);
        java.util.List list33 = defaultStatisticalCategoryDataset20.getRowKeys();
        int int34 = defaultStatisticalCategoryDataset20.getColumnCount();
        boolean boolean35 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj26", defaultStatisticalCategoryDataset6.equals(obj26) ? defaultStatisticalCategoryDataset6.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.lang.Number number9 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset3.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset3.getColumnIndex((java.lang.Comparable) '4');
        java.lang.Number number16 = defaultStatisticalCategoryDataset3.getStdDevValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1.0f);
        java.lang.Object obj17 = defaultStatisticalCategoryDataset3.clone();
        java.util.List list18 = defaultStatisticalCategoryDataset3.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj17", defaultStatisticalCategoryDataset0.equals(obj17) ? defaultStatisticalCategoryDataset0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj10", obj6.equals(obj10) ? obj6.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset0.hasListener(eventListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset0.hasListener(eventListener13);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.util.List list18 = defaultStatisticalCategoryDataset15.getColumnKeys();
        java.util.List list19 = defaultStatisticalCategoryDataset15.getColumnKeys();
        java.lang.Object obj20 = defaultStatisticalCategoryDataset15.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list22 = defaultStatisticalCategoryDataset21.getRowKeys();
        defaultStatisticalCategoryDataset21.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int28 = defaultStatisticalCategoryDataset21.getColumnCount();
        java.lang.Number number31 = defaultStatisticalCategoryDataset21.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset21.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener37 = null;
        boolean boolean38 = defaultStatisticalCategoryDataset21.hasListener(eventListener37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset21.add((java.lang.Number) (-1L), (java.lang.Number) (byte) 1, (java.lang.Comparable) true, (java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset15.setGroup(datasetGroup45);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and obj20", defaultStatisticalCategoryDataset15.equals(obj20) ? defaultStatisticalCategoryDataset15.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int18 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener20);
        int int22 = defaultStatisticalCategoryDataset19.getColumnCount();
        java.util.List list23 = defaultStatisticalCategoryDataset19.getColumnKeys();
        java.lang.Number number26 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int28 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) 100L);
        int int30 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = defaultStatisticalCategoryDataset31.hasListener(eventListener32);
        java.util.List list34 = defaultStatisticalCategoryDataset31.getColumnKeys();
        java.util.List list35 = defaultStatisticalCategoryDataset31.getColumnKeys();
        defaultStatisticalCategoryDataset31.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset31.getGroup();
        defaultStatisticalCategoryDataset19.setGroup(datasetGroup41);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and defaultStatisticalCategoryDataset19", obj13.equals(defaultStatisticalCategoryDataset19) ? obj13.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number17 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double19 = defaultStatisticalCategoryDataset14.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        defaultStatisticalCategoryDataset20.validateObject();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset20.hasListener(eventListener24);
        java.lang.Number number28 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset14.setGroup(datasetGroup29);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset14", obj7.equals(defaultStatisticalCategoryDataset14) ? obj7.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj11 = defaultStatisticalCategoryDataset7.clone();
        defaultStatisticalCategoryDataset7.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset7.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and obj11", defaultStatisticalCategoryDataset7.equals(obj11) ? defaultStatisticalCategoryDataset7.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int17 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int19 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset8.setGroup(datasetGroup20);
        int int23 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number9 = defaultStatisticalCategoryDataset6.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int11 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) -1);
        int int13 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int15 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int17 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset6.setGroup(datasetGroup18);
        defaultStatisticalCategoryDataset6.validateObject();
        java.util.List list21 = defaultStatisticalCategoryDataset6.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener22);
        java.lang.Number number26 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) "", (java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset14", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset14) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) -1, (java.lang.Number) 100L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int13 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int15 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset12.getGroup();
        java.lang.Comparable comparable18 = null;
        java.lang.Number number19 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 1L, comparable18);
        int int20 = defaultStatisticalCategoryDataset12.getColumnCount();
        defaultStatisticalCategoryDataset12.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable27 = null;
        java.lang.Number number28 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 1, comparable27);
        java.util.List list29 = defaultStatisticalCategoryDataset12.getRowKeys();
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup6 and datasetGroup16", datasetGroup6.equals(datasetGroup16) ? datasetGroup6.hashCode() == datasetGroup16.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list14 = defaultStatisticalCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener15);
        double double18 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        java.lang.Object obj19 = defaultStatisticalCategoryDataset13.clone();
        double double21 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        java.util.List list22 = defaultStatisticalCategoryDataset13.getRowKeys();
        java.lang.Object obj23 = defaultStatisticalCategoryDataset13.clone();
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj19", defaultStatisticalCategoryDataset6.equals(obj19) ? defaultStatisticalCategoryDataset6.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset17.getGroup();
        java.util.List list22 = defaultStatisticalCategoryDataset17.getColumnKeys();
        int int23 = defaultStatisticalCategoryDataset17.getRowCount();
        java.lang.Object obj24 = defaultStatisticalCategoryDataset17.clone();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset17.getGroup();
        int int26 = defaultStatisticalCategoryDataset17.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number25 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int27 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) -1);
        int int29 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int31 = defaultStatisticalCategoryDataset30.getColumnCount();
        int int33 = defaultStatisticalCategoryDataset30.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset30.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup34);
        defaultStatisticalCategoryDataset22.validateObject();
        java.util.List list37 = defaultStatisticalCategoryDataset22.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener38);
        java.lang.Number number42 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) '#', (java.lang.Comparable) (-1L));
        boolean boolean43 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int18 = defaultStatisticalCategoryDataset12.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int25 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        java.lang.Number number30 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0L);
        java.lang.Number number33 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) "hi!");
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset12", obj7.equals(defaultStatisticalCategoryDataset12) ? obj7.hashCode() == defaultStatisticalCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list14 = defaultStatisticalCategoryDataset13.getRowKeys();
        defaultStatisticalCategoryDataset13.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int20 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Number number23 = defaultStatisticalCategoryDataset13.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double25 = defaultStatisticalCategoryDataset13.getRangeLowerBound(false);
        java.lang.Number number28 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int29 = defaultStatisticalCategoryDataset13.getRowCount();
        int int30 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = defaultStatisticalCategoryDataset31.hasListener(eventListener32);
        defaultStatisticalCategoryDataset31.validateObject();
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset31.hasListener(eventListener35);
        java.lang.Number number39 = defaultStatisticalCategoryDataset31.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset31.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup40);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.lang.Number number9 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset3.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset3.getColumnIndex((java.lang.Comparable) '4');
        java.lang.Number number16 = defaultStatisticalCategoryDataset3.getStdDevValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1.0f);
        java.lang.Object obj17 = defaultStatisticalCategoryDataset3.clone();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset3.hasListener(eventListener18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj17", defaultStatisticalCategoryDataset0.equals(obj17) ? defaultStatisticalCategoryDataset0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list23 = defaultStatisticalCategoryDataset22.getRowKeys();
        boolean boolean24 = defaultStatisticalCategoryDataset16.equals((java.lang.Object) defaultStatisticalCategoryDataset22);
        java.util.List list25 = defaultStatisticalCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number14 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double16 = defaultStatisticalCategoryDataset11.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset11.setGroup(datasetGroup21);
        org.jfree.data.Range range24 = defaultStatisticalCategoryDataset11.getRangeBounds(false);
        java.util.List list25 = defaultStatisticalCategoryDataset11.getColumnKeys();
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset11.getRangeBounds(true);
        java.util.List list28 = defaultStatisticalCategoryDataset11.getColumnKeys();
        int int30 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list31 = defaultStatisticalCategoryDataset11.getRowKeys();
        boolean boolean32 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset11 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset11.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset11.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.hasListener(eventListener12);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        defaultStatisticalCategoryDataset15.validateObject();
        java.lang.Number number21 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset15.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number26 = defaultStatisticalCategoryDataset23.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int28 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (short) -1);
        int int30 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset23.removeChangeListener(datasetChangeListener31);
        boolean boolean33 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset15.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset15.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((double) '#', (double) 0L, (java.lang.Comparable) ' ', (java.lang.Comparable) true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener22);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset24.hasListener(eventListener25);
        defaultStatisticalCategoryDataset24.validateObject();
        java.lang.Number number30 = defaultStatisticalCategoryDataset24.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset24.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset36 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener37 = null;
        boolean boolean38 = defaultStatisticalCategoryDataset36.hasListener(eventListener37);
        java.lang.Number number41 = defaultStatisticalCategoryDataset36.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset42 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list43 = defaultStatisticalCategoryDataset42.getRowKeys();
        boolean boolean44 = defaultStatisticalCategoryDataset36.equals((java.lang.Object) defaultStatisticalCategoryDataset42);
        boolean boolean45 = defaultStatisticalCategoryDataset24.equals((java.lang.Object) defaultStatisticalCategoryDataset36);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset46 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list47 = defaultStatisticalCategoryDataset46.getRowKeys();
        defaultStatisticalCategoryDataset46.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number55 = defaultStatisticalCategoryDataset46.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup56 = defaultStatisticalCategoryDataset46.getGroup();
        defaultStatisticalCategoryDataset36.setGroup(datasetGroup56);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset36", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset36) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset36.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        java.lang.Number number24 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list26 = defaultStatisticalCategoryDataset25.getRowKeys();
        boolean boolean27 = defaultStatisticalCategoryDataset19.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset25.hasListener(eventListener28);
        java.util.List list30 = defaultStatisticalCategoryDataset25.getRowKeys();
        int int31 = defaultStatisticalCategoryDataset25.getColumnCount();
        int int32 = defaultStatisticalCategoryDataset25.getRowCount();
        int int33 = defaultStatisticalCategoryDataset25.getColumnCount();
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        defaultStatisticalCategoryDataset7.validateObject();
        java.util.List list11 = defaultStatisticalCategoryDataset7.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset7.getGroup();
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset7", obj6.equals(defaultStatisticalCategoryDataset7) ? obj6.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.validateObject();
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        double double11 = defaultStatisticalCategoryDataset8.getRangeLowerBound(false);
        java.util.List list12 = defaultStatisticalCategoryDataset8.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        java.lang.Number number18 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset13.validateObject();
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset13.getRangeBounds(true);
        int int22 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Number number25 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int27 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) (byte) 100);
        int int29 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) 0L);
        defaultStatisticalCategoryDataset13.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list32 = defaultStatisticalCategoryDataset31.getRowKeys();
        defaultStatisticalCategoryDataset31.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number40 = defaultStatisticalCategoryDataset31.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset31.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup41);
        defaultStatisticalCategoryDataset8.setGroup(datasetGroup41);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and defaultStatisticalCategoryDataset8", obj5.equals(defaultStatisticalCategoryDataset8) ? obj5.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) 2, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 0);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 10, (java.lang.Number) 10, (java.lang.Comparable) (-1), (java.lang.Comparable) (-1.0d));
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int19 = defaultStatisticalCategoryDataset18.getColumnCount();
        int int21 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset18.getRangeBounds(false);
        defaultStatisticalCategoryDataset18.validateObject();
        boolean boolean25 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list27 = defaultStatisticalCategoryDataset26.getRowKeys();
        double double29 = defaultStatisticalCategoryDataset26.getRangeUpperBound(false);
        double double31 = defaultStatisticalCategoryDataset26.getRangeUpperBound(true);
        int int32 = defaultStatisticalCategoryDataset26.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset26.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset26", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset26) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset8.hasListener(eventListener9);
        java.lang.Number number13 = defaultStatisticalCategoryDataset8.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int14 = defaultStatisticalCategoryDataset8.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset8.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int21 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset8.getRangeBounds(true);
        int int25 = defaultStatisticalCategoryDataset8.getRowIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset26.hasListener(eventListener27);
        defaultStatisticalCategoryDataset26.validateObject();
        java.util.List list30 = defaultStatisticalCategoryDataset26.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset26.removeChangeListener(datasetChangeListener31);
        java.util.List list33 = defaultStatisticalCategoryDataset26.getRowKeys();
        boolean boolean34 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        defaultStatisticalCategoryDataset26.add((java.lang.Number) 10.0f, (java.lang.Number) 2, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0d));
        java.lang.Object obj40 = defaultStatisticalCategoryDataset26.clone();
        boolean boolean41 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        int int43 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset26 and obj40", defaultStatisticalCategoryDataset26.equals(obj40) ? defaultStatisticalCategoryDataset26.hashCode() == obj40.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        java.util.List list18 = defaultStatisticalCategoryDataset13.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset13.getRowCount();
        java.lang.Object obj20 = defaultStatisticalCategoryDataset13.clone();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset13.getGroup();
        java.util.List list22 = defaultStatisticalCategoryDataset13.getRowKeys();
        int int23 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset13.removeChangeListener(datasetChangeListener24);
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and defaultStatisticalCategoryDataset13", obj9.equals(defaultStatisticalCategoryDataset13) ? obj9.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset3.getGroup();
        double double11 = defaultStatisticalCategoryDataset3.getRangeUpperBound(false);
        int int12 = defaultStatisticalCategoryDataset3.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset13.hasListener(eventListener16);
        java.util.List list18 = defaultStatisticalCategoryDataset13.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset3.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener20);
        double double23 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        int int25 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Class<?> wildcardClass26 = defaultStatisticalCategoryDataset18.getClass();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        int int28 = defaultStatisticalCategoryDataset18.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset6", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset6) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 1);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((double) (byte) 100, (double) 100.0f, (java.lang.Comparable) "hi!", (java.lang.Comparable) '#');
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1), (java.lang.Comparable) 1.0d);
        java.lang.Object obj23 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 97.0d, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj23", obj14.equals(obj23) ? obj14.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        defaultStatisticalCategoryDataset7.validateObject();
        java.util.List list11 = defaultStatisticalCategoryDataset7.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset7.getGroup();
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list16 = defaultStatisticalCategoryDataset15.getRowKeys();
        defaultStatisticalCategoryDataset15.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int22 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number25 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset15.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener31);
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset7", obj6.equals(defaultStatisticalCategoryDataset7) ? obj6.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset3.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset3.getGroup();
        int int12 = defaultStatisticalCategoryDataset3.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener13);
        defaultStatisticalCategoryDataset3.add((java.lang.Number) 10.0f, (java.lang.Number) 1, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 10.0f);
        java.lang.Number number22 = defaultStatisticalCategoryDataset3.getMeanValue(0, 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int24 = defaultStatisticalCategoryDataset23.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset23.removeChangeListener(datasetChangeListener25);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset23.addChangeListener(datasetChangeListener27);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset23.addChangeListener(datasetChangeListener29);
        java.util.EventListener eventListener31 = null;
        boolean boolean32 = defaultStatisticalCategoryDataset23.hasListener(eventListener31);
        int int34 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultStatisticalCategoryDataset23.removeChangeListener(datasetChangeListener35);
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset3.setGroup(datasetGroup37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int10);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and obj14", defaultStatisticalCategoryDataset7.equals(obj14) ? defaultStatisticalCategoryDataset7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset10.addChangeListener(datasetChangeListener11);
        int int13 = defaultStatisticalCategoryDataset10.getColumnCount();
        java.util.List list14 = defaultStatisticalCategoryDataset10.getColumnKeys();
        java.lang.Number number17 = defaultStatisticalCategoryDataset10.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int19 = defaultStatisticalCategoryDataset10.getColumnIndex((java.lang.Comparable) 100L);
        int int21 = defaultStatisticalCategoryDataset10.getColumnIndex((java.lang.Comparable) 10.0d);
        double double23 = defaultStatisticalCategoryDataset10.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset10.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj9", obj6.equals(obj9) ? obj6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup17);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup17", datasetGroup4.equals(datasetGroup17) ? datasetGroup4.hashCode() == datasetGroup17.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        defaultStatisticalCategoryDataset9.validateObject();
        double double14 = defaultStatisticalCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset15.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset9.setGroup(datasetGroup27);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        java.util.List list30 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup27", datasetGroup4.equals(datasetGroup27) ? datasetGroup4.hashCode() == datasetGroup27.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (short) 100);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 1, (java.lang.Number) Double.NaN, (java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) -1);
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 1L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset22.getGroup();
        java.lang.Comparable comparable28 = null;
        java.lang.Number number29 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) 1L, comparable28);
        java.lang.Number number32 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        java.lang.Number number35 = defaultStatisticalCategoryDataset22.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 1);
        java.lang.Object obj36 = defaultStatisticalCategoryDataset22.clone();
        java.util.List list37 = defaultStatisticalCategoryDataset22.getColumnKeys();
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup26", datasetGroup8.equals(datasetGroup26) ? datasetGroup8.hashCode() == datasetGroup26.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable15 = null;
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1, comparable15);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) -1, (java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) '#');
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int25 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list27 = defaultStatisticalCategoryDataset26.getRowKeys();
        defaultStatisticalCategoryDataset26.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int33 = defaultStatisticalCategoryDataset26.getColumnCount();
        java.lang.Number number36 = defaultStatisticalCategoryDataset26.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double38 = defaultStatisticalCategoryDataset26.getRangeLowerBound(false);
        java.lang.Number number41 = defaultStatisticalCategoryDataset26.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int42 = defaultStatisticalCategoryDataset26.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset26.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup43);
        java.util.List list45 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup43", datasetGroup4.equals(datasetGroup43) ? datasetGroup4.hashCode() == datasetGroup43.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0L, (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj14", defaultStatisticalCategoryDataset6.equals(obj14) ? defaultStatisticalCategoryDataset6.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list12 = defaultStatisticalCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener13);
        double double16 = defaultStatisticalCategoryDataset11.getRangeUpperBound(true);
        java.lang.Object obj17 = defaultStatisticalCategoryDataset11.clone();
        java.util.List list18 = defaultStatisticalCategoryDataset11.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset11.getRowCount();
        boolean boolean20 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset11.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj17", defaultStatisticalCategoryDataset0.equals(obj17) ? defaultStatisticalCategoryDataset0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (byte) 1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        java.lang.Number number25 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int26 = defaultStatisticalCategoryDataset20.getRowCount();
        double double28 = defaultStatisticalCategoryDataset20.getRangeUpperBound(true);
        double double30 = defaultStatisticalCategoryDataset20.getRangeUpperBound(false);
        java.util.EventListener eventListener31 = null;
        boolean boolean32 = defaultStatisticalCategoryDataset20.hasListener(eventListener31);
        java.lang.Number number35 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (byte) 10);
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) number35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        java.lang.Number number24 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number19 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double21 = defaultStatisticalCategoryDataset16.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup26);
        int int29 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) Double.NaN);
        double double31 = defaultStatisticalCategoryDataset16.getRangeUpperBound(true);
        java.lang.Comparable comparable33 = null;
        java.lang.Number number34 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) 1.0d, comparable33);
        boolean boolean35 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) number34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset16 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset16.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset16.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Comparable comparable17 = null;
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable17);
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener23);
        java.lang.Object obj25 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals(obj26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj25", defaultStatisticalCategoryDataset6.equals(obj25) ? defaultStatisticalCategoryDataset6.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int13 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int15 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset12.getGroup();
        java.util.List list17 = defaultStatisticalCategoryDataset12.getColumnKeys();
        int int18 = defaultStatisticalCategoryDataset12.getRowCount();
        java.lang.Object obj19 = defaultStatisticalCategoryDataset12.clone();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset12.getGroup();
        int int21 = defaultStatisticalCategoryDataset12.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and obj19", defaultStatisticalCategoryDataset12.equals(obj19) ? defaultStatisticalCategoryDataset12.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 1);
        int int24 = defaultStatisticalCategoryDataset0.getRowCount();
        int int26 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset27.hasListener(eventListener28);
        defaultStatisticalCategoryDataset27.validateObject();
        java.lang.Number number33 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset27.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset39 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener40 = null;
        boolean boolean41 = defaultStatisticalCategoryDataset39.hasListener(eventListener40);
        java.lang.Number number44 = defaultStatisticalCategoryDataset39.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset45 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list46 = defaultStatisticalCategoryDataset45.getRowKeys();
        boolean boolean47 = defaultStatisticalCategoryDataset39.equals((java.lang.Object) defaultStatisticalCategoryDataset45);
        boolean boolean48 = defaultStatisticalCategoryDataset27.equals((java.lang.Object) defaultStatisticalCategoryDataset39);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener49 = null;
        defaultStatisticalCategoryDataset39.addChangeListener(datasetChangeListener49);
        double double52 = defaultStatisticalCategoryDataset39.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup53 = defaultStatisticalCategoryDataset39.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset39 and defaultStatisticalCategoryDataset45", defaultStatisticalCategoryDataset39.equals(defaultStatisticalCategoryDataset45) ? defaultStatisticalCategoryDataset39.hashCode() == defaultStatisticalCategoryDataset45.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int10);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and obj14", defaultStatisticalCategoryDataset7.equals(obj14) ? defaultStatisticalCategoryDataset7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.lang.Number number9 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset3.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset3.getColumnIndex((java.lang.Comparable) '4');
        java.lang.Number number16 = defaultStatisticalCategoryDataset3.getStdDevValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener18);
        int int20 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.lang.Number number23 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset17.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset17.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int35 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range37 = defaultStatisticalCategoryDataset17.getRangeBounds(true);
        boolean boolean38 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) defaultStatisticalCategoryDataset17);
        java.lang.Object obj39 = defaultStatisticalCategoryDataset17.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset3", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset3) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset3.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number20 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double22 = defaultStatisticalCategoryDataset17.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int24 = defaultStatisticalCategoryDataset23.getColumnCount();
        int int26 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset17.setGroup(datasetGroup27);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass19 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and obj18", defaultStatisticalCategoryDataset8.equals(obj18) ? defaultStatisticalCategoryDataset8.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener20);
        boolean boolean22 = defaultStatisticalCategoryDataset16.equals((java.lang.Object) defaultStatisticalCategoryDataset19);
        int int24 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) (short) 0);
        java.util.List list25 = defaultStatisticalCategoryDataset19.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset16 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset16.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset16.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        java.util.List list22 = defaultStatisticalCategoryDataset19.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset23.addChangeListener(datasetChangeListener24);
        int int26 = defaultStatisticalCategoryDataset23.getColumnCount();
        java.util.List list27 = defaultStatisticalCategoryDataset23.getColumnKeys();
        java.lang.Number number30 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int32 = defaultStatisticalCategoryDataset23.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean33 = defaultStatisticalCategoryDataset19.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset19 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset19.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset19.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        defaultStatisticalCategoryDataset9.validateObject();
        double double14 = defaultStatisticalCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset15.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset9.setGroup(datasetGroup27);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup27", datasetGroup4.equals(datasetGroup27) ? datasetGroup4.hashCode() == datasetGroup27.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int7 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset8.hasListener(eventListener9);
        defaultStatisticalCategoryDataset8.validateObject();
        java.lang.Number number14 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset8.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        java.lang.Number number25 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list27 = defaultStatisticalCategoryDataset26.getRowKeys();
        boolean boolean28 = defaultStatisticalCategoryDataset20.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        boolean boolean29 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener30);
        int int32 = defaultStatisticalCategoryDataset20.getColumnCount();
        java.lang.Number number35 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 100);
        java.util.List list36 = defaultStatisticalCategoryDataset20.getColumnKeys();
        java.lang.Object obj37 = defaultStatisticalCategoryDataset20.clone();
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset26 and obj37", defaultStatisticalCategoryDataset26.equals(obj37) ? defaultStatisticalCategoryDataset26.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener20);
        double double23 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        int int25 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Class<?> wildcardClass26 = defaultStatisticalCategoryDataset18.getClass();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        defaultStatisticalCategoryDataset0.add((double) 0, (double) 10.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj14", defaultStatisticalCategoryDataset6.equals(obj14) ? defaultStatisticalCategoryDataset6.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.lang.Comparable comparable14 = null;
        defaultStatisticalCategoryDataset0.add((double) 100L, 0.0d, comparable14, (java.lang.Comparable) "");
        java.lang.Object obj17 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj19 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 100, (java.lang.Number) 0, (java.lang.Comparable) false, (java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj17 and obj19", obj17.equals(obj19) ? obj17.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.util.List list21 = defaultStatisticalCategoryDataset18.getColumnKeys();
        java.lang.Number number24 = defaultStatisticalCategoryDataset18.getStdDevValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener25);
        defaultStatisticalCategoryDataset18.add((double) 0L, 0.0d, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        int int32 = defaultStatisticalCategoryDataset18.getColumnCount();
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        defaultStatisticalCategoryDataset9.validateObject();
        double double14 = defaultStatisticalCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset15.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset9.setGroup(datasetGroup27);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup27", datasetGroup4.equals(datasetGroup27) ? datasetGroup4.hashCode() == datasetGroup27.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener19);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset21.addChangeListener(datasetChangeListener22);
        boolean boolean24 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        java.lang.Number number27 = defaultStatisticalCategoryDataset21.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        defaultStatisticalCategoryDataset21.add((double) 0, (double) 0, (java.lang.Comparable) ' ', (java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable12 = defaultStatisticalCategoryDataset0.getRowKey(0);
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        defaultStatisticalCategoryDataset0.add((double) 100L, (double) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number23 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int25 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (short) -1);
        int int27 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int29 = defaultStatisticalCategoryDataset28.getColumnCount();
        int int31 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset20.setGroup(datasetGroup32);
        defaultStatisticalCategoryDataset20.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset20.getGroup();
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset20 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset20.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset20.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset0.hasListener(eventListener20);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        java.util.List list25 = defaultStatisticalCategoryDataset22.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset26.addChangeListener(datasetChangeListener27);
        int int29 = defaultStatisticalCategoryDataset26.getColumnCount();
        java.util.List list30 = defaultStatisticalCategoryDataset26.getColumnKeys();
        java.lang.Number number33 = defaultStatisticalCategoryDataset26.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int35 = defaultStatisticalCategoryDataset26.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean36 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultStatisticalCategoryDataset26.getGroup();
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        java.util.List list39 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset22 and defaultStatisticalCategoryDataset26", defaultStatisticalCategoryDataset22.equals(defaultStatisticalCategoryDataset26) ? defaultStatisticalCategoryDataset22.hashCode() == defaultStatisticalCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable15 = null;
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1, comparable15);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) -1, (java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) '#');
        int int23 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0d, (java.lang.Number) 0, (java.lang.Comparable) Double.NaN, (java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset29.addChangeListener(datasetChangeListener30);
        int int32 = defaultStatisticalCategoryDataset29.getColumnCount();
        int int33 = defaultStatisticalCategoryDataset29.getColumnCount();
        java.util.List list34 = defaultStatisticalCategoryDataset29.getColumnKeys();
        java.lang.Object obj35 = defaultStatisticalCategoryDataset29.clone();
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset37 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int38 = defaultStatisticalCategoryDataset37.getColumnCount();
        int int40 = defaultStatisticalCategoryDataset37.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset37.getGroup();
        java.lang.Comparable comparable43 = null;
        java.lang.Number number44 = defaultStatisticalCategoryDataset37.getMeanValue((java.lang.Comparable) 1L, comparable43);
        int int45 = defaultStatisticalCategoryDataset37.getColumnCount();
        defaultStatisticalCategoryDataset37.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable52 = null;
        java.lang.Number number53 = defaultStatisticalCategoryDataset37.getMeanValue((java.lang.Comparable) 1, comparable52);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset54 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int55 = defaultStatisticalCategoryDataset54.getColumnCount();
        int int57 = defaultStatisticalCategoryDataset54.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup58 = defaultStatisticalCategoryDataset54.getGroup();
        defaultStatisticalCategoryDataset37.setGroup(datasetGroup58);
        defaultStatisticalCategoryDataset29.setGroup(datasetGroup58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup41", datasetGroup4.equals(datasetGroup41) ? datasetGroup4.hashCode() == datasetGroup41.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int7 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset12.validateObject();
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        int int22 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener23);
        java.lang.Object obj25 = defaultStatisticalCategoryDataset12.clone();
        java.lang.Number number27 = null;
        defaultStatisticalCategoryDataset12.add((java.lang.Number) (short) 0, number27, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and obj25", defaultStatisticalCategoryDataset12.equals(obj25) ? defaultStatisticalCategoryDataset12.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number10 = defaultStatisticalCategoryDataset7.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int12 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) -1);
        int int14 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset7.removeChangeListener(datasetChangeListener15);
        int int17 = defaultStatisticalCategoryDataset7.getRowCount();
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        java.lang.Number number21 = defaultStatisticalCategoryDataset7.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset3", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset3) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset3.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double21 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number25 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double27 = defaultStatisticalCategoryDataset22.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int29 = defaultStatisticalCategoryDataset28.getColumnCount();
        int int31 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup32);
        java.util.List list34 = defaultStatisticalCategoryDataset22.getRowKeys();
        defaultStatisticalCategoryDataset22.add((java.lang.Number) (byte) -1, (java.lang.Number) 10L, (java.lang.Comparable) 'a', (java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener40);
        org.jfree.data.Range range43 = defaultStatisticalCategoryDataset22.getRangeBounds(true);
        boolean boolean44 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        java.lang.Object obj24 = defaultStatisticalCategoryDataset12.clone();
        defaultStatisticalCategoryDataset12.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj24", defaultStatisticalCategoryDataset18.equals(obj24) ? defaultStatisticalCategoryDataset18.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Comparable comparable8 = null;
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue(comparable8, (java.lang.Comparable) true);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset15.getColumnCount();
        int int19 = defaultStatisticalCategoryDataset15.getRowCount();
        boolean boolean20 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj14", obj13.equals(obj14) ? obj13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Number number19 = defaultStatisticalCategoryDataset13.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset13.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset13.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int31 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range33 = defaultStatisticalCategoryDataset13.getRangeBounds(true);
        defaultStatisticalCategoryDataset13.validateObject();
        defaultStatisticalCategoryDataset13.validateObject();
        double double37 = defaultStatisticalCategoryDataset13.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup38);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset40 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener41 = null;
        boolean boolean42 = defaultStatisticalCategoryDataset40.hasListener(eventListener41);
        java.lang.Number number45 = defaultStatisticalCategoryDataset40.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int46 = defaultStatisticalCategoryDataset40.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener47 = null;
        defaultStatisticalCategoryDataset40.removeChangeListener(datasetChangeListener47);
        java.lang.Number number51 = defaultStatisticalCategoryDataset40.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int53 = defaultStatisticalCategoryDataset40.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list54 = defaultStatisticalCategoryDataset40.getRowKeys();
        java.util.List list55 = defaultStatisticalCategoryDataset40.getColumnKeys();
        boolean boolean56 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list55);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset57 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener58 = null;
        defaultStatisticalCategoryDataset57.addChangeListener(datasetChangeListener58);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset60 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener61 = null;
        defaultStatisticalCategoryDataset60.addChangeListener(datasetChangeListener61);
        boolean boolean63 = defaultStatisticalCategoryDataset57.equals((java.lang.Object) defaultStatisticalCategoryDataset60);
        org.jfree.data.Range range65 = defaultStatisticalCategoryDataset60.getRangeBounds(false);
        java.util.List list66 = defaultStatisticalCategoryDataset60.getColumnKeys();
        boolean boolean67 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset40 and defaultStatisticalCategoryDataset57", defaultStatisticalCategoryDataset40.equals(defaultStatisticalCategoryDataset57) ? defaultStatisticalCategoryDataset40.hashCode() == defaultStatisticalCategoryDataset57.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int12 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int21 = defaultStatisticalCategoryDataset15.getRowCount();
        double double23 = defaultStatisticalCategoryDataset15.getRangeUpperBound(true);
        boolean boolean25 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) (short) 10);
        double double27 = defaultStatisticalCategoryDataset15.getRangeLowerBound(false);
        java.lang.Number number30 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int31 = defaultStatisticalCategoryDataset15.getRowCount();
        int int32 = defaultStatisticalCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset15.getGroup();
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup33", datasetGroup4.equals(datasetGroup33) ? datasetGroup4.hashCode() == datasetGroup33.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double19 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number26 = defaultStatisticalCategoryDataset23.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int28 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (short) -1);
        int int30 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.EventListener eventListener31 = null;
        boolean boolean32 = defaultStatisticalCategoryDataset23.hasListener(eventListener31);
        java.util.List list33 = defaultStatisticalCategoryDataset23.getRowKeys();
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number20 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int22 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) -1);
        int int24 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset17.removeChangeListener(datasetChangeListener25);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset17.removeChangeListener(datasetChangeListener27);
        double double30 = defaultStatisticalCategoryDataset17.getRangeLowerBound(true);
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener33 = null;
        boolean boolean34 = defaultStatisticalCategoryDataset32.hasListener(eventListener33);
        defaultStatisticalCategoryDataset32.validateObject();
        java.lang.Number number38 = defaultStatisticalCategoryDataset32.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset32.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset44 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener45 = null;
        boolean boolean46 = defaultStatisticalCategoryDataset44.hasListener(eventListener45);
        java.lang.Number number49 = defaultStatisticalCategoryDataset44.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset50 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list51 = defaultStatisticalCategoryDataset50.getRowKeys();
        boolean boolean52 = defaultStatisticalCategoryDataset44.equals((java.lang.Object) defaultStatisticalCategoryDataset50);
        boolean boolean53 = defaultStatisticalCategoryDataset32.equals((java.lang.Object) defaultStatisticalCategoryDataset44);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener54 = null;
        defaultStatisticalCategoryDataset44.addChangeListener(datasetChangeListener54);
        int int56 = defaultStatisticalCategoryDataset44.getColumnCount();
        double double58 = defaultStatisticalCategoryDataset44.getRangeUpperBound(true);
        boolean boolean59 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) double58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset17 and defaultStatisticalCategoryDataset44", defaultStatisticalCategoryDataset17.equals(defaultStatisticalCategoryDataset44) ? defaultStatisticalCategoryDataset17.hashCode() == defaultStatisticalCategoryDataset44.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int26 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Number number29 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) false, (java.lang.Comparable) 100.0d);
        java.lang.Object obj30 = defaultStatisticalCategoryDataset12.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = defaultStatisticalCategoryDataset31.hasListener(eventListener32);
        defaultStatisticalCategoryDataset31.validateObject();
        java.lang.Number number37 = defaultStatisticalCategoryDataset31.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultStatisticalCategoryDataset31.removeChangeListener(datasetChangeListener38);
        java.lang.Number number42 = defaultStatisticalCategoryDataset31.getValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset31.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj30", defaultStatisticalCategoryDataset18.equals(obj30) ? defaultStatisticalCategoryDataset18.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list9 = defaultStatisticalCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener10);
        double double13 = defaultStatisticalCategoryDataset8.getRangeUpperBound(true);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset8.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        defaultStatisticalCategoryDataset15.validateObject();
        java.util.List list19 = defaultStatisticalCategoryDataset15.getRowKeys();
        int int20 = defaultStatisticalCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset15.getGroup();
        boolean boolean22 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        defaultStatisticalCategoryDataset8.add((java.lang.Number) (short) 10, (java.lang.Number) 1, (java.lang.Comparable) 10, (java.lang.Comparable) (short) 10);
        double double29 = defaultStatisticalCategoryDataset8.getRangeLowerBound(false);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        java.util.List list31 = defaultStatisticalCategoryDataset8.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number27 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 100);
        java.util.List list28 = defaultStatisticalCategoryDataset12.getColumnKeys();
        java.lang.Object obj29 = defaultStatisticalCategoryDataset12.clone();
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset12.hasListener(eventListener30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj29", defaultStatisticalCategoryDataset18.equals(obj29) ? defaultStatisticalCategoryDataset18.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) 10, Double.NaN, (java.lang.Comparable) Double.NaN, (java.lang.Comparable) 1L);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) 10.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list29 = defaultStatisticalCategoryDataset28.getRowKeys();
        boolean boolean30 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset28);
        int int31 = defaultStatisticalCategoryDataset28.getColumnCount();
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = defaultStatisticalCategoryDataset28.hasListener(eventListener32);
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) boolean33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset22 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset22.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset22.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset7.addChangeListener(datasetChangeListener8);
        int int10 = defaultStatisticalCategoryDataset7.getColumnCount();
        java.util.List list11 = defaultStatisticalCategoryDataset7.getColumnKeys();
        java.lang.Number number14 = defaultStatisticalCategoryDataset7.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset7.getGroup();
        int int16 = defaultStatisticalCategoryDataset7.getColumnCount();
        java.lang.Number number19 = defaultStatisticalCategoryDataset7.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (short) 100);
        java.util.List list20 = defaultStatisticalCategoryDataset7.getRowKeys();
        int int22 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) 0.0f);
        boolean boolean23 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup6 and datasetGroup15", datasetGroup6.equals(datasetGroup15) ? datasetGroup6.hashCode() == datasetGroup15.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset10.hasListener(eventListener11);
        defaultStatisticalCategoryDataset10.validateObject();
        java.util.List list14 = defaultStatisticalCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset10.removeChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        boolean boolean21 = defaultStatisticalCategoryDataset10.equals((java.lang.Object) int20);
        int int22 = defaultStatisticalCategoryDataset10.getRowCount();
        int int23 = defaultStatisticalCategoryDataset10.getRowCount();
        java.lang.Comparable comparable27 = null;
        defaultStatisticalCategoryDataset10.add((java.lang.Number) Double.NaN, (java.lang.Number) (short) -1, (java.lang.Comparable) "hi!", comparable27);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset17", obj6.equals(defaultStatisticalCategoryDataset17) ? obj6.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        defaultStatisticalCategoryDataset0.add((double) (short) -1, (-1.0d), (java.lang.Comparable) (short) 1, (java.lang.Comparable) "");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset21.hasListener(eventListener22);
        defaultStatisticalCategoryDataset21.validateObject();
        java.lang.Number number27 = defaultStatisticalCategoryDataset21.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset21.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener34 = null;
        boolean boolean35 = defaultStatisticalCategoryDataset33.hasListener(eventListener34);
        java.lang.Number number38 = defaultStatisticalCategoryDataset33.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset39 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list40 = defaultStatisticalCategoryDataset39.getRowKeys();
        boolean boolean41 = defaultStatisticalCategoryDataset33.equals((java.lang.Object) defaultStatisticalCategoryDataset39);
        boolean boolean42 = defaultStatisticalCategoryDataset21.equals((java.lang.Object) defaultStatisticalCategoryDataset33);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener43 = null;
        defaultStatisticalCategoryDataset33.addChangeListener(datasetChangeListener43);
        double double46 = defaultStatisticalCategoryDataset33.getRangeUpperBound(true);
        boolean boolean47 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset33);
        int int48 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset33 and defaultStatisticalCategoryDataset39", defaultStatisticalCategoryDataset33.equals(defaultStatisticalCategoryDataset39) ? defaultStatisticalCategoryDataset33.hashCode() == defaultStatisticalCategoryDataset39.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener20);
        double double23 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        int int25 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Class<?> wildcardClass26 = defaultStatisticalCategoryDataset18.getClass();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        java.util.List list28 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        int int11 = defaultStatisticalCategoryDataset3.getColumnCount();
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset3.clone();
        java.lang.Number number17 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj14", defaultStatisticalCategoryDataset0.equals(obj14) ? defaultStatisticalCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1L));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset15.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset23.hasListener(eventListener24);
        java.lang.Number number28 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int29 = defaultStatisticalCategoryDataset23.getRowCount();
        double double31 = defaultStatisticalCategoryDataset23.getRangeUpperBound(true);
        boolean boolean33 = defaultStatisticalCategoryDataset23.equals((java.lang.Object) (short) 10);
        double double35 = defaultStatisticalCategoryDataset23.getRangeLowerBound(false);
        java.lang.Number number38 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int39 = defaultStatisticalCategoryDataset23.getRowCount();
        int int40 = defaultStatisticalCategoryDataset23.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset15.setGroup(datasetGroup41);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset8.getGroup();
        java.util.List list20 = defaultStatisticalCategoryDataset8.getRowKeys();
        java.lang.Class<?> wildcardClass21 = list20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) true);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int21 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset22.getGroup();
        int int28 = defaultStatisticalCategoryDataset22.getRowIndex((java.lang.Comparable) 10.0f);
        double double30 = defaultStatisticalCategoryDataset22.getRangeUpperBound(false);
        java.lang.Comparable comparable32 = null;
        java.lang.Number number33 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) '4', comparable32);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset22", obj7.equals(defaultStatisticalCategoryDataset22) ? obj7.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (short) 100);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int23 = defaultStatisticalCategoryDataset17.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset17.removeChangeListener(datasetChangeListener24);
        java.lang.Number number28 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int30 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset17.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        double double37 = defaultStatisticalCategoryDataset17.getRangeLowerBound(true);
        java.lang.Number number40 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 100L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset41 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int42 = defaultStatisticalCategoryDataset41.getColumnCount();
        int int44 = defaultStatisticalCategoryDataset41.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset41.getGroup();
        java.util.List list46 = defaultStatisticalCategoryDataset41.getColumnKeys();
        int int47 = defaultStatisticalCategoryDataset41.getRowCount();
        boolean boolean49 = defaultStatisticalCategoryDataset41.equals((java.lang.Object) "");
        int int51 = defaultStatisticalCategoryDataset41.getRowIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup52 = defaultStatisticalCategoryDataset41.getGroup();
        defaultStatisticalCategoryDataset17.setGroup(datasetGroup52);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup52", datasetGroup8.equals(datasetGroup52) ? datasetGroup8.hashCode() == datasetGroup52.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener20);
        double double23 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        int int25 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Class<?> wildcardClass26 = defaultStatisticalCategoryDataset18.getClass();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list21 = defaultStatisticalCategoryDataset20.getRowKeys();
        boolean boolean22 = defaultStatisticalCategoryDataset14.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset20.hasListener(eventListener23);
        java.util.List list25 = defaultStatisticalCategoryDataset20.getRowKeys();
        int int26 = defaultStatisticalCategoryDataset20.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset20.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener28);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset14.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset14.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Class<?> wildcardClass12 = list11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int26 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Number number29 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) false, (java.lang.Comparable) 100.0d);
        java.lang.Object obj30 = defaultStatisticalCategoryDataset12.clone();
        int int31 = defaultStatisticalCategoryDataset12.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj30", defaultStatisticalCategoryDataset18.equals(obj30) ? defaultStatisticalCategoryDataset18.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable15 = null;
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1, comparable15);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) -1, (java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) '#');
        int int23 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0d, (java.lang.Number) 0, (java.lang.Comparable) Double.NaN, (java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset29.addChangeListener(datasetChangeListener30);
        int int32 = defaultStatisticalCategoryDataset29.getColumnCount();
        int int33 = defaultStatisticalCategoryDataset29.getColumnCount();
        java.util.List list34 = defaultStatisticalCategoryDataset29.getColumnKeys();
        java.lang.Object obj35 = defaultStatisticalCategoryDataset29.clone();
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset29 and obj35", defaultStatisticalCategoryDataset29.equals(obj35) ? defaultStatisticalCategoryDataset29.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        defaultStatisticalCategoryDataset7.validateObject();
        java.util.List list11 = defaultStatisticalCategoryDataset7.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset7.getGroup();
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset7.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset14.validateObject();
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset14.getRangeBounds(true);
        int int24 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset14.removeChangeListener(datasetChangeListener25);
        java.lang.Object obj27 = defaultStatisticalCategoryDataset14.clone();
        java.lang.Number number29 = null;
        defaultStatisticalCategoryDataset14.add((java.lang.Number) (short) 0, number29, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        java.util.List list33 = defaultStatisticalCategoryDataset14.getRowKeys();
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and obj27", defaultStatisticalCategoryDataset14.equals(obj27) ? defaultStatisticalCategoryDataset14.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset10.hasListener(eventListener11);
        java.util.List list13 = defaultStatisticalCategoryDataset10.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener15);
        int int17 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.util.List list18 = defaultStatisticalCategoryDataset14.getColumnKeys();
        java.lang.Number number21 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int23 = defaultStatisticalCategoryDataset14.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean24 = defaultStatisticalCategoryDataset10.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset10.getGroup();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset10 and defaultStatisticalCategoryDataset14", defaultStatisticalCategoryDataset10.equals(defaultStatisticalCategoryDataset14) ? defaultStatisticalCategoryDataset10.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset0.hasListener(eventListener17);
        int int19 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number23 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int25 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (short) -1);
        int int27 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int29 = defaultStatisticalCategoryDataset28.getColumnCount();
        int int31 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset20.setGroup(datasetGroup32);
        int int35 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset20.validateObject();
        defaultStatisticalCategoryDataset20.add((double) '#', (double) 0L, (java.lang.Comparable) ' ', (java.lang.Comparable) true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener42 = null;
        defaultStatisticalCategoryDataset20.removeChangeListener(datasetChangeListener42);
        int int44 = defaultStatisticalCategoryDataset20.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        java.lang.Comparable comparable18 = null;
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0d, comparable18);
        java.util.List list20 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Class<?> wildcardClass21 = list20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset4", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset4) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double19 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int24 = defaultStatisticalCategoryDataset23.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset23.removeChangeListener(datasetChangeListener25);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset23.addChangeListener(datasetChangeListener27);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset23.addChangeListener(datasetChangeListener29);
        java.util.EventListener eventListener31 = null;
        boolean boolean32 = defaultStatisticalCategoryDataset23.hasListener(eventListener31);
        int int34 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultStatisticalCategoryDataset23.removeChangeListener(datasetChangeListener35);
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((double) '#', (double) 0L, (java.lang.Comparable) ' ', (java.lang.Comparable) true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        defaultStatisticalCategoryDataset25.validateObject();
        java.util.List list29 = defaultStatisticalCategoryDataset25.getRowKeys();
        int int30 = defaultStatisticalCategoryDataset25.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset25", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset25) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset25.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset3.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset3.getGroup();
        int int12 = defaultStatisticalCategoryDataset3.getColumnIndex((java.lang.Comparable) (-1));
        int int14 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) '#');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int21 = defaultStatisticalCategoryDataset15.getRowCount();
        double double23 = defaultStatisticalCategoryDataset15.getRangeUpperBound(true);
        boolean boolean25 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) (short) 10);
        double double27 = defaultStatisticalCategoryDataset15.getRangeLowerBound(false);
        java.lang.Number number30 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int31 = defaultStatisticalCategoryDataset15.getRowCount();
        int int32 = defaultStatisticalCategoryDataset15.getRowCount();
        java.util.EventListener eventListener33 = null;
        boolean boolean34 = defaultStatisticalCategoryDataset15.hasListener(eventListener33);
        boolean boolean35 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) eventListener33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list9 = defaultStatisticalCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener10);
        double double13 = defaultStatisticalCategoryDataset8.getRangeUpperBound(true);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset8.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        defaultStatisticalCategoryDataset15.validateObject();
        java.util.List list19 = defaultStatisticalCategoryDataset15.getRowKeys();
        int int20 = defaultStatisticalCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset15.getGroup();
        boolean boolean22 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        defaultStatisticalCategoryDataset8.add((java.lang.Number) (short) 10, (java.lang.Number) 1, (java.lang.Comparable) 10, (java.lang.Comparable) (short) 10);
        double double29 = defaultStatisticalCategoryDataset8.getRangeLowerBound(false);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset8.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int15 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int17 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset14.getGroup();
        java.util.List list19 = defaultStatisticalCategoryDataset14.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset14.getRowCount();
        boolean boolean22 = defaultStatisticalCategoryDataset14.equals((java.lang.Object) "");
        int int24 = defaultStatisticalCategoryDataset14.getRowIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset14.getGroup();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and defaultStatisticalCategoryDataset14", obj13.equals(defaultStatisticalCategoryDataset14) ? obj13.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        java.lang.Comparable comparable17 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) 10, comparable17, (java.lang.Comparable) (-1));
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0f);
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number29 = defaultStatisticalCategoryDataset26.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int31 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) (short) -1);
        int int33 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int35 = defaultStatisticalCategoryDataset34.getColumnCount();
        int int37 = defaultStatisticalCategoryDataset34.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset34.getGroup();
        defaultStatisticalCategoryDataset26.setGroup(datasetGroup38);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset40 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list41 = defaultStatisticalCategoryDataset40.getRowKeys();
        defaultStatisticalCategoryDataset40.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int47 = defaultStatisticalCategoryDataset40.getColumnCount();
        java.lang.Number number50 = defaultStatisticalCategoryDataset40.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset40.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener56 = null;
        boolean boolean57 = defaultStatisticalCategoryDataset40.hasListener(eventListener56);
        org.jfree.data.general.DatasetGroup datasetGroup58 = defaultStatisticalCategoryDataset40.getGroup();
        defaultStatisticalCategoryDataset26.setGroup(datasetGroup58);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset26", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset26) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset10.hasListener(eventListener11);
        defaultStatisticalCategoryDataset10.validateObject();
        java.lang.Number number16 = defaultStatisticalCategoryDataset10.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset10.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list29 = defaultStatisticalCategoryDataset28.getRowKeys();
        boolean boolean30 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset28);
        boolean boolean31 = defaultStatisticalCategoryDataset10.equals((java.lang.Object) defaultStatisticalCategoryDataset22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener32);
        int int34 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int36 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Number number39 = defaultStatisticalCategoryDataset22.getStdDevValue((java.lang.Comparable) false, (java.lang.Comparable) 100.0d);
        boolean boolean40 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset22 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset22.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset22.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset8.hasListener(eventListener18);
        java.util.List list20 = defaultStatisticalCategoryDataset8.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list22 = defaultStatisticalCategoryDataset21.getRowKeys();
        defaultStatisticalCategoryDataset21.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int28 = defaultStatisticalCategoryDataset21.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset21.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset8.setGroup(datasetGroup30);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset8", obj6.equals(defaultStatisticalCategoryDataset8) ? obj6.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number15 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 0, number15, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj20 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj20", obj13.equals(obj20) ? obj13.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset0.getGroup();
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int13 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int15 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset12.getGroup();
        java.lang.Comparable comparable18 = null;
        java.lang.Number number19 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 1L, comparable18);
        int int20 = defaultStatisticalCategoryDataset12.getColumnCount();
        defaultStatisticalCategoryDataset12.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable27 = null;
        java.lang.Number number28 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 1, comparable27);
        defaultStatisticalCategoryDataset12.add((java.lang.Number) (short) -1, (java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) '#');
        org.jfree.data.Range range35 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        defaultStatisticalCategoryDataset12.add((java.lang.Number) 100.0f, (java.lang.Number) 10.0f, (java.lang.Comparable) 1, (java.lang.Comparable) 0.0d);
        boolean boolean41 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup9 and datasetGroup16", datasetGroup9.equals(datasetGroup16) ? datasetGroup9.hashCode() == datasetGroup16.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        double double25 = defaultStatisticalCategoryDataset12.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset12.getGroup();
        java.lang.Class<?> wildcardClass27 = datasetGroup26.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener19);
        boolean boolean21 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        int int23 = defaultStatisticalCategoryDataset18.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset18.getGroup();
        boolean boolean25 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset15.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset15.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number number11 = defaultStatisticalCategoryDataset3.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        defaultStatisticalCategoryDataset12.validateObject();
        java.util.List list16 = defaultStatisticalCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset12.add((double) ' ', Double.NaN, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) -1);
        boolean boolean25 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        int int26 = defaultStatisticalCategoryDataset12.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset3", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset3) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset3.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        java.lang.Number number26 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) (byte) 1);
        java.lang.Number number29 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) (byte) 10);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset12.hasListener(eventListener30);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list33 = defaultStatisticalCategoryDataset32.getRowKeys();
        int int34 = defaultStatisticalCategoryDataset32.getRowCount();
        boolean boolean35 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset32);
        org.jfree.data.Range range37 = defaultStatisticalCategoryDataset32.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        boolean boolean19 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        java.util.List list20 = defaultStatisticalCategoryDataset13.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        defaultStatisticalCategoryDataset12.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset12.getGroup();
        java.lang.Class<?> wildcardClass26 = datasetGroup25.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj13", obj11.equals(obj13) ? obj11.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '#', (java.lang.Comparable) (-1L));
        java.util.List list21 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double23 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        double double25 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass29 = datasetGroup28.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int18 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int22 = defaultStatisticalCategoryDataset21.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset21.getGroup();
        java.util.List list26 = defaultStatisticalCategoryDataset21.getColumnKeys();
        int int27 = defaultStatisticalCategoryDataset21.getRowCount();
        java.lang.Object obj28 = defaultStatisticalCategoryDataset21.clone();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset21.getGroup();
        int int30 = defaultStatisticalCategoryDataset21.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and defaultStatisticalCategoryDataset21", obj13.equals(defaultStatisticalCategoryDataset21) ? obj13.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        defaultStatisticalCategoryDataset18.validateObject();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset18.hasListener(eventListener22);
        java.lang.Number number26 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        java.lang.Number number31 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10L, (java.lang.Comparable) 1);
        java.lang.Object obj32 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener34 = null;
        boolean boolean35 = defaultStatisticalCategoryDataset33.hasListener(eventListener34);
        java.lang.Number number38 = defaultStatisticalCategoryDataset33.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset33.validateObject();
        org.jfree.data.Range range41 = defaultStatisticalCategoryDataset33.getRangeBounds(true);
        int int43 = defaultStatisticalCategoryDataset33.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener44 = null;
        defaultStatisticalCategoryDataset33.removeChangeListener(datasetChangeListener44);
        java.lang.Object obj46 = defaultStatisticalCategoryDataset33.clone();
        int int48 = defaultStatisticalCategoryDataset33.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.Range range50 = defaultStatisticalCategoryDataset33.getRangeBounds(false);
        int int51 = defaultStatisticalCategoryDataset33.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener52 = null;
        defaultStatisticalCategoryDataset33.removeChangeListener(datasetChangeListener52);
        boolean boolean54 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj32", defaultStatisticalCategoryDataset18.equals(obj32) ? defaultStatisticalCategoryDataset18.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) Double.NaN);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int13 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int15 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset12.getGroup();
        java.util.List list17 = defaultStatisticalCategoryDataset12.getColumnKeys();
        int int18 = defaultStatisticalCategoryDataset12.getRowCount();
        java.lang.Object obj19 = defaultStatisticalCategoryDataset12.clone();
        boolean boolean20 = defaultStatisticalCategoryDataset0.equals(obj19);
        java.lang.Class<?> wildcardClass21 = obj19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset12", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset12) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int7 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int11 = defaultStatisticalCategoryDataset10.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset10.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset10.clone();
        defaultStatisticalCategoryDataset10.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset10.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset10 and obj14", defaultStatisticalCategoryDataset10.equals(obj14) ? defaultStatisticalCategoryDataset10.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number number11 = defaultStatisticalCategoryDataset3.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 10L);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener15);
        int int17 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int18 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset14.hasListener(eventListener19);
        java.util.List list21 = defaultStatisticalCategoryDataset14.getColumnKeys();
        int int22 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.lang.Object obj23 = defaultStatisticalCategoryDataset14.clone();
        boolean boolean24 = defaultStatisticalCategoryDataset3.equals(obj23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset14", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset14) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset11.hasListener(eventListener12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset11.validateObject();
        defaultStatisticalCategoryDataset11.add((java.lang.Number) Double.NaN, (java.lang.Number) (short) 1, (java.lang.Comparable) '4', (java.lang.Comparable) 10);
        java.lang.Object obj23 = defaultStatisticalCategoryDataset11.clone();
        defaultStatisticalCategoryDataset11.add((java.lang.Number) (-1.0f), (java.lang.Number) Double.NaN, (java.lang.Comparable) 100L, (java.lang.Comparable) true);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset11 and obj23", defaultStatisticalCategoryDataset11.equals(obj23) ? defaultStatisticalCategoryDataset11.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.util.List list16 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, (java.lang.Number) 0.0d, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (-1L));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list29 = defaultStatisticalCategoryDataset28.getRowKeys();
        boolean boolean30 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset28);
        java.util.List list31 = defaultStatisticalCategoryDataset22.getRowKeys();
        int int32 = defaultStatisticalCategoryDataset22.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener33);
        org.jfree.data.Range range36 = defaultStatisticalCategoryDataset22.getRangeBounds(true);
        int int37 = defaultStatisticalCategoryDataset22.getRowCount();
        int int38 = defaultStatisticalCategoryDataset22.getRowCount();
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = defaultStatisticalCategoryDataset22.hasListener(eventListener39);
        boolean boolean41 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) boolean40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset22 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset22.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset22.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset3.getGroup();
        java.util.List list10 = defaultStatisticalCategoryDataset3.getColumnKeys();
        int int11 = defaultStatisticalCategoryDataset3.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset12.getRangeBounds(false);
        boolean boolean17 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset3", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset3) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset3.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list15 = defaultStatisticalCategoryDataset14.getRowKeys();
        defaultStatisticalCategoryDataset14.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int21 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.lang.Number number24 = defaultStatisticalCategoryDataset14.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset14.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset14.hasListener(eventListener30);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup32);
        java.util.EventListener eventListener34 = null;
        boolean boolean35 = defaultStatisticalCategoryDataset0.hasListener(eventListener34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup12 and datasetGroup32", datasetGroup12.equals(datasetGroup32) ? datasetGroup12.hashCode() == datasetGroup32.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, (java.lang.Number) (short) 1, (java.lang.Comparable) '4', (java.lang.Comparable) 10);
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Comparable comparable14 = defaultStatisticalCategoryDataset0.getColumnKey(0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset15.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset23.hasListener(eventListener24);
        java.lang.Number number28 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int29 = defaultStatisticalCategoryDataset23.getRowCount();
        double double31 = defaultStatisticalCategoryDataset23.getRangeUpperBound(true);
        boolean boolean33 = defaultStatisticalCategoryDataset23.equals((java.lang.Object) (short) 10);
        double double35 = defaultStatisticalCategoryDataset23.getRangeLowerBound(false);
        java.lang.Number number38 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int39 = defaultStatisticalCategoryDataset23.getRowCount();
        int int40 = defaultStatisticalCategoryDataset23.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset15.setGroup(datasetGroup41);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset15.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset15.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset11.hasListener(eventListener12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset11.validateObject();
        org.jfree.data.Range range19 = defaultStatisticalCategoryDataset11.getRangeBounds(true);
        int int20 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.lang.Number number23 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int25 = defaultStatisticalCategoryDataset11.getRowIndex((java.lang.Comparable) (byte) 100);
        int int27 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) 0L);
        defaultStatisticalCategoryDataset11.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list30 = defaultStatisticalCategoryDataset29.getRowKeys();
        defaultStatisticalCategoryDataset29.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number38 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset29.getGroup();
        defaultStatisticalCategoryDataset11.setGroup(datasetGroup39);
        defaultStatisticalCategoryDataset11.validateObject();
        int int43 = defaultStatisticalCategoryDataset11.getRowIndex((java.lang.Comparable) (byte) 10);
        int int44 = defaultStatisticalCategoryDataset11.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and defaultStatisticalCategoryDataset11", defaultStatisticalCategoryDataset3.equals(defaultStatisticalCategoryDataset11) ? defaultStatisticalCategoryDataset3.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, (java.lang.Number) (short) 1, (java.lang.Comparable) '4', (java.lang.Comparable) 10);
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) -1);
        int int20 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int22 = defaultStatisticalCategoryDataset21.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup25);
        int int28 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset0.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10.0f);
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1, (java.lang.Comparable) '4');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number29 = defaultStatisticalCategoryDataset26.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double31 = defaultStatisticalCategoryDataset26.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int33 = defaultStatisticalCategoryDataset32.getColumnCount();
        int int35 = defaultStatisticalCategoryDataset32.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset32.getGroup();
        defaultStatisticalCategoryDataset26.setGroup(datasetGroup36);
        java.util.List list38 = defaultStatisticalCategoryDataset26.getRowKeys();
        java.util.List list39 = defaultStatisticalCategoryDataset26.getColumnKeys();
        boolean boolean40 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset41 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number44 = defaultStatisticalCategoryDataset41.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int46 = defaultStatisticalCategoryDataset41.getColumnIndex((java.lang.Comparable) (short) -1);
        double double48 = defaultStatisticalCategoryDataset41.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset41.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset41.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        int int59 = defaultStatisticalCategoryDataset41.getColumnCount();
        double double61 = defaultStatisticalCategoryDataset41.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup62 = defaultStatisticalCategoryDataset41.getGroup();
        defaultStatisticalCategoryDataset26.setGroup(datasetGroup62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset32", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset32) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset32.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        int int23 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list16 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Object obj17 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj17", defaultStatisticalCategoryDataset6.equals(obj17) ? defaultStatisticalCategoryDataset6.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset18.validateObject();
        org.jfree.data.Range range26 = defaultStatisticalCategoryDataset18.getRangeBounds(true);
        int int27 = defaultStatisticalCategoryDataset18.getColumnCount();
        java.lang.Number number30 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int32 = defaultStatisticalCategoryDataset18.getRowIndex((java.lang.Comparable) (byte) 100);
        int int34 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) 0L);
        defaultStatisticalCategoryDataset18.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset36 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list37 = defaultStatisticalCategoryDataset36.getRowKeys();
        defaultStatisticalCategoryDataset36.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number45 = defaultStatisticalCategoryDataset36.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup46 = defaultStatisticalCategoryDataset36.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup46);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        defaultStatisticalCategoryDataset13.validateObject();
        double double18 = defaultStatisticalCategoryDataset13.getRangeLowerBound(true);
        java.util.List list19 = defaultStatisticalCategoryDataset13.getColumnKeys();
        int int21 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        defaultStatisticalCategoryDataset22.validateObject();
        double double27 = defaultStatisticalCategoryDataset22.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset28.addChangeListener(datasetChangeListener29);
        int int31 = defaultStatisticalCategoryDataset28.getColumnCount();
        java.lang.Number number34 = defaultStatisticalCategoryDataset28.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset28.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup40);
        org.jfree.data.general.DatasetGroup datasetGroup42 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup42);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        defaultStatisticalCategoryDataset0.add((double) (byte) 0, Double.NaN, (java.lang.Comparable) 'a', (java.lang.Comparable) (byte) -1);
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener15);
        int int17 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.lang.Number number20 = defaultStatisticalCategoryDataset14.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset14.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset14.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number33 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.util.List list34 = defaultStatisticalCategoryDataset14.getColumnKeys();
        int int35 = defaultStatisticalCategoryDataset14.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener36 = null;
        defaultStatisticalCategoryDataset14.removeChangeListener(datasetChangeListener36);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset38 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = defaultStatisticalCategoryDataset38.hasListener(eventListener39);
        java.lang.Number number43 = defaultStatisticalCategoryDataset38.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int44 = defaultStatisticalCategoryDataset38.getRowCount();
        double double46 = defaultStatisticalCategoryDataset38.getRangeUpperBound(true);
        boolean boolean48 = defaultStatisticalCategoryDataset38.equals((java.lang.Object) (short) 10);
        double double50 = defaultStatisticalCategoryDataset38.getRangeLowerBound(false);
        java.lang.Number number53 = defaultStatisticalCategoryDataset38.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int54 = defaultStatisticalCategoryDataset38.getRowCount();
        int int55 = defaultStatisticalCategoryDataset38.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup56 = defaultStatisticalCategoryDataset38.getGroup();
        defaultStatisticalCategoryDataset14.setGroup(datasetGroup56);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and defaultStatisticalCategoryDataset38", defaultStatisticalCategoryDataset14.equals(defaultStatisticalCategoryDataset38) ? defaultStatisticalCategoryDataset14.hashCode() == defaultStatisticalCategoryDataset38.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int5 = defaultStatisticalCategoryDataset4.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset4.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset4.getColumnKeys();
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        java.util.List list18 = defaultStatisticalCategoryDataset13.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset13.getRowCount();
        java.lang.Object obj20 = defaultStatisticalCategoryDataset13.clone();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset13.getGroup();
        int int22 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset13.getGroup();
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj20", defaultStatisticalCategoryDataset4.equals(obj20) ? defaultStatisticalCategoryDataset4.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        java.lang.Object obj24 = defaultStatisticalCategoryDataset12.clone();
        double double26 = defaultStatisticalCategoryDataset12.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj24", defaultStatisticalCategoryDataset18.equals(obj24) ? defaultStatisticalCategoryDataset18.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener18);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number23 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int25 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (short) -1);
        int int27 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int29 = defaultStatisticalCategoryDataset28.getColumnCount();
        int int31 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset20.setGroup(datasetGroup32);
        defaultStatisticalCategoryDataset20.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup35", datasetGroup8.equals(datasetGroup35) ? datasetGroup8.hashCode() == datasetGroup35.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list15 = defaultStatisticalCategoryDataset14.getRowKeys();
        defaultStatisticalCategoryDataset14.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int21 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.lang.Number number24 = defaultStatisticalCategoryDataset14.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset14.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset14.hasListener(eventListener30);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup32);
        java.lang.Number number36 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup12 and datasetGroup32", datasetGroup12.equals(datasetGroup32) ? datasetGroup12.hashCode() == datasetGroup32.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list9 = defaultStatisticalCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener10);
        double double13 = defaultStatisticalCategoryDataset8.getRangeUpperBound(true);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset8.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        defaultStatisticalCategoryDataset15.validateObject();
        java.util.List list19 = defaultStatisticalCategoryDataset15.getRowKeys();
        int int20 = defaultStatisticalCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset15.getGroup();
        boolean boolean22 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        defaultStatisticalCategoryDataset8.add((java.lang.Number) (short) 10, (java.lang.Number) 1, (java.lang.Comparable) 10, (java.lang.Comparable) (short) 10);
        double double29 = defaultStatisticalCategoryDataset8.getRangeLowerBound(false);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        defaultStatisticalCategoryDataset8.add((double) (byte) -1, 100.0d, (java.lang.Comparable) '#', (java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list12 = defaultStatisticalCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener13);
        double double16 = defaultStatisticalCategoryDataset11.getRangeUpperBound(true);
        java.lang.Object obj17 = defaultStatisticalCategoryDataset11.clone();
        java.util.List list18 = defaultStatisticalCategoryDataset11.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset11.getRowCount();
        boolean boolean20 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset11 and obj17", defaultStatisticalCategoryDataset11.equals(obj17) ? defaultStatisticalCategoryDataset11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list16 = defaultStatisticalCategoryDataset15.getRowKeys();
        defaultStatisticalCategoryDataset15.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int22 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number25 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset15.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener31 = null;
        boolean boolean32 = defaultStatisticalCategoryDataset15.hasListener(eventListener31);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        double double36 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup10 and datasetGroup33", datasetGroup10.equals(datasetGroup33) ? datasetGroup10.hashCode() == datasetGroup33.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number8 = defaultStatisticalCategoryDataset5.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double10 = defaultStatisticalCategoryDataset5.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int12 = defaultStatisticalCategoryDataset11.getColumnCount();
        int int14 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset5.setGroup(datasetGroup15);
        java.util.List list17 = defaultStatisticalCategoryDataset5.getRowKeys();
        int int19 = defaultStatisticalCategoryDataset5.getRowIndex((java.lang.Comparable) 'a');
        boolean boolean20 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup15", datasetGroup4.equals(datasetGroup15) ? datasetGroup4.hashCode() == datasetGroup15.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.hasListener(eventListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number15 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double17 = defaultStatisticalCategoryDataset12.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int19 = defaultStatisticalCategoryDataset18.getColumnCount();
        int int21 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup22);
        java.util.List list24 = defaultStatisticalCategoryDataset12.getColumnKeys();
        int int26 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list28 = defaultStatisticalCategoryDataset27.getRowKeys();
        defaultStatisticalCategoryDataset27.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int34 = defaultStatisticalCategoryDataset27.getColumnCount();
        java.lang.Number number37 = defaultStatisticalCategoryDataset27.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset27.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener43 = null;
        boolean boolean44 = defaultStatisticalCategoryDataset27.hasListener(eventListener43);
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup45);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Comparable comparable17 = null;
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable17);
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener23);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset25.addChangeListener(datasetChangeListener26);
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset25.hasListener(eventListener28);
        java.util.List list30 = defaultStatisticalCategoryDataset25.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset25", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset25) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset25.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number14 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double16 = defaultStatisticalCategoryDataset11.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset11.setGroup(datasetGroup21);
        java.util.List list23 = defaultStatisticalCategoryDataset11.getColumnKeys();
        int int25 = defaultStatisticalCategoryDataset11.getRowIndex((java.lang.Comparable) 0);
        int int27 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) 1L);
        double double29 = defaultStatisticalCategoryDataset11.getRangeLowerBound(false);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) double29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset11", obj6.equals(defaultStatisticalCategoryDataset11) ? obj6.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.hasListener(eventListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        defaultStatisticalCategoryDataset16.validateObject();
        java.lang.Number number22 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset16.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset28.hasListener(eventListener29);
        java.lang.Number number33 = defaultStatisticalCategoryDataset28.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list35 = defaultStatisticalCategoryDataset34.getRowKeys();
        boolean boolean36 = defaultStatisticalCategoryDataset28.equals((java.lang.Object) defaultStatisticalCategoryDataset34);
        boolean boolean37 = defaultStatisticalCategoryDataset16.equals((java.lang.Object) defaultStatisticalCategoryDataset28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultStatisticalCategoryDataset28.addChangeListener(datasetChangeListener38);
        java.lang.Number number42 = defaultStatisticalCategoryDataset28.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) (byte) 1);
        java.util.EventListener eventListener43 = null;
        boolean boolean44 = defaultStatisticalCategoryDataset28.hasListener(eventListener43);
        boolean boolean45 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) boolean44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset28 and defaultStatisticalCategoryDataset34", defaultStatisticalCategoryDataset28.equals(defaultStatisticalCategoryDataset34) ? defaultStatisticalCategoryDataset28.hashCode() == defaultStatisticalCategoryDataset34.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        defaultStatisticalCategoryDataset18.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number27 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        defaultStatisticalCategoryDataset0.validateObject();
        int int32 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 0, (java.lang.Number) (short) 100, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset38 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = defaultStatisticalCategoryDataset38.hasListener(eventListener39);
        defaultStatisticalCategoryDataset38.validateObject();
        java.lang.Number number44 = defaultStatisticalCategoryDataset38.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset38.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset46 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number49 = defaultStatisticalCategoryDataset46.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int51 = defaultStatisticalCategoryDataset46.getColumnIndex((java.lang.Comparable) (short) -1);
        int int53 = defaultStatisticalCategoryDataset46.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener54 = null;
        defaultStatisticalCategoryDataset46.removeChangeListener(datasetChangeListener54);
        boolean boolean56 = defaultStatisticalCategoryDataset38.equals((java.lang.Object) defaultStatisticalCategoryDataset46);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener57 = null;
        defaultStatisticalCategoryDataset38.addChangeListener(datasetChangeListener57);
        org.jfree.data.general.DatasetGroup datasetGroup59 = defaultStatisticalCategoryDataset38.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset38 and defaultStatisticalCategoryDataset46", defaultStatisticalCategoryDataset38.equals(defaultStatisticalCategoryDataset46) ? defaultStatisticalCategoryDataset38.hashCode() == defaultStatisticalCategoryDataset46.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset8.getGroup();
        int int20 = defaultStatisticalCategoryDataset8.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset21.hasListener(eventListener22);
        defaultStatisticalCategoryDataset21.validateObject();
        java.util.List list25 = defaultStatisticalCategoryDataset21.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset21.removeChangeListener(datasetChangeListener26);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset21.getGroup();
        java.util.List list29 = defaultStatisticalCategoryDataset21.getRowKeys();
        boolean boolean30 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup19 and datasetGroup28", datasetGroup19.equals(datasetGroup28) ? datasetGroup19.hashCode() == datasetGroup28.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset12.getRowCount();
        java.util.List list25 = defaultStatisticalCategoryDataset12.getColumnKeys();
        int int27 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) '#');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset28.hasListener(eventListener29);
        defaultStatisticalCategoryDataset28.validateObject();
        java.util.List list32 = defaultStatisticalCategoryDataset28.getRowKeys();
        int int33 = defaultStatisticalCategoryDataset28.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset28.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultStatisticalCategoryDataset28.addChangeListener(datasetChangeListener35);
        java.util.List list37 = defaultStatisticalCategoryDataset28.getColumnKeys();
        boolean boolean38 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) list37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        defaultStatisticalCategoryDataset16.validateObject();
        java.lang.Number number22 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj23 = defaultStatisticalCategoryDataset16.clone();
        org.jfree.data.Range range25 = defaultStatisticalCategoryDataset16.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener26);
        defaultStatisticalCategoryDataset16.validateObject();
        java.lang.Number number31 = defaultStatisticalCategoryDataset16.getStdDevValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) true);
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = defaultStatisticalCategoryDataset16.hasListener(eventListener32);
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) boolean33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        defaultStatisticalCategoryDataset9.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset9.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset9.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset21.hasListener(eventListener22);
        java.lang.Number number26 = defaultStatisticalCategoryDataset21.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list28 = defaultStatisticalCategoryDataset27.getRowKeys();
        boolean boolean29 = defaultStatisticalCategoryDataset21.equals((java.lang.Object) defaultStatisticalCategoryDataset27);
        boolean boolean30 = defaultStatisticalCategoryDataset9.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset21.addChangeListener(datasetChangeListener31);
        double double34 = defaultStatisticalCategoryDataset21.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset21 and defaultStatisticalCategoryDataset27", defaultStatisticalCategoryDataset21.equals(defaultStatisticalCategoryDataset27) ? defaultStatisticalCategoryDataset21.hashCode() == defaultStatisticalCategoryDataset27.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener13);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        int int20 = defaultStatisticalCategoryDataset15.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '#', (java.lang.Comparable) (-1L));
        java.util.List list21 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Comparable comparable24 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0f), (java.lang.Number) Double.NaN, comparable24, (java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int28 = defaultStatisticalCategoryDataset27.getColumnCount();
        int int30 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset27.getGroup();
        java.lang.Comparable comparable33 = null;
        java.lang.Number number34 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) 1L, comparable33);
        int int35 = defaultStatisticalCategoryDataset27.getColumnCount();
        defaultStatisticalCategoryDataset27.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable42 = null;
        java.lang.Number number43 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) 1, comparable42);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset44 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int45 = defaultStatisticalCategoryDataset44.getColumnCount();
        int int47 = defaultStatisticalCategoryDataset44.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup48 = defaultStatisticalCategoryDataset44.getGroup();
        defaultStatisticalCategoryDataset27.setGroup(datasetGroup48);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset44", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset44) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset44.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int10);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        defaultStatisticalCategoryDataset15.validateObject();
        java.lang.Number number21 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset15.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number26 = defaultStatisticalCategoryDataset23.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int28 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (short) -1);
        int int30 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset23.removeChangeListener(datasetChangeListener31);
        boolean boolean33 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener34);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and obj14", defaultStatisticalCategoryDataset7.equals(obj14) ? defaultStatisticalCategoryDataset7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        java.lang.Comparable comparable18 = null;
        defaultStatisticalCategoryDataset0.add((double) 0.0f, 100.0d, comparable18, (java.lang.Comparable) 10L);
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) false);
        java.lang.Object obj24 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((double) (byte) -1, (double) 1, (java.lang.Comparable) 1.0f, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj24", obj7.equals(obj24) ? obj7.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 2, (java.lang.Number) (byte) 10, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 2);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        java.lang.Number number30 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int31 = defaultStatisticalCategoryDataset25.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultStatisticalCategoryDataset25.removeChangeListener(datasetChangeListener32);
        java.lang.Number number36 = defaultStatisticalCategoryDataset25.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener37 = null;
        boolean boolean38 = defaultStatisticalCategoryDataset25.hasListener(eventListener37);
        java.util.List list39 = defaultStatisticalCategoryDataset25.getColumnKeys();
        boolean boolean40 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list39);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset41 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number44 = defaultStatisticalCategoryDataset41.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int46 = defaultStatisticalCategoryDataset41.getColumnIndex((java.lang.Comparable) (short) -1);
        double double48 = defaultStatisticalCategoryDataset41.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset41.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset41.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        double double60 = defaultStatisticalCategoryDataset41.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup61 = defaultStatisticalCategoryDataset41.getGroup();
        java.lang.Object obj62 = defaultStatisticalCategoryDataset41.clone();
        org.jfree.data.Range range64 = defaultStatisticalCategoryDataset41.getRangeBounds(true);
        int int65 = defaultStatisticalCategoryDataset41.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup66 = defaultStatisticalCategoryDataset41.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset41 and obj62", defaultStatisticalCategoryDataset41.equals(obj62) ? defaultStatisticalCategoryDataset41.hashCode() == obj62.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list9 = defaultStatisticalCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener10);
        double double13 = defaultStatisticalCategoryDataset8.getRangeUpperBound(true);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset8.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        defaultStatisticalCategoryDataset15.validateObject();
        java.util.List list19 = defaultStatisticalCategoryDataset15.getRowKeys();
        int int20 = defaultStatisticalCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset15.getGroup();
        boolean boolean22 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        defaultStatisticalCategoryDataset8.add((java.lang.Number) (short) 10, (java.lang.Number) 1, (java.lang.Comparable) 10, (java.lang.Comparable) (short) 10);
        double double29 = defaultStatisticalCategoryDataset8.getRangeLowerBound(false);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        int int32 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and obj14", defaultStatisticalCategoryDataset8.equals(obj14) ? defaultStatisticalCategoryDataset8.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list23 = defaultStatisticalCategoryDataset22.getRowKeys();
        defaultStatisticalCategoryDataset22.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number31 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup32);
        java.lang.Number number36 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (-1L));
        int int38 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener39);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset41 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int42 = defaultStatisticalCategoryDataset41.getColumnCount();
        int int44 = defaultStatisticalCategoryDataset41.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset41.getGroup();
        int int47 = defaultStatisticalCategoryDataset41.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Number number50 = defaultStatisticalCategoryDataset41.getMeanValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultStatisticalCategoryDataset41.getGroup();
        boolean boolean52 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) datasetGroup51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset41", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset41) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset41.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj8 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset9.addChangeListener(datasetChangeListener10);
        int int12 = defaultStatisticalCategoryDataset9.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset9.getColumnCount();
        java.util.List list14 = defaultStatisticalCategoryDataset9.getColumnKeys();
        java.lang.Object obj15 = defaultStatisticalCategoryDataset9.clone();
        defaultStatisticalCategoryDataset9.validateObject();
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj15", obj8.equals(obj15) ? obj8.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double19 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        java.lang.Number number25 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset20.validateObject();
        org.jfree.data.Range range28 = defaultStatisticalCategoryDataset20.getRangeBounds(true);
        int int29 = defaultStatisticalCategoryDataset20.getColumnCount();
        java.lang.Number number32 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int34 = defaultStatisticalCategoryDataset20.getRowIndex((java.lang.Comparable) (byte) 100);
        int int36 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        defaultStatisticalCategoryDataset0.add(97.0d, 97.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset26.hasListener(eventListener27);
        java.lang.Number number31 = defaultStatisticalCategoryDataset26.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset26.validateObject();
        org.jfree.data.Range range34 = defaultStatisticalCategoryDataset26.getRangeBounds(true);
        int int35 = defaultStatisticalCategoryDataset26.getColumnCount();
        java.lang.Number number38 = defaultStatisticalCategoryDataset26.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset26.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset26", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset26) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener13);
        int int15 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.util.List list17 = defaultStatisticalCategoryDataset12.getColumnKeys();
        java.lang.Object obj18 = defaultStatisticalCategoryDataset12.clone();
        defaultStatisticalCategoryDataset12.validateObject();
        boolean boolean20 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj18", obj7.equals(obj18) ? obj7.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj14", defaultStatisticalCategoryDataset6.equals(obj14) ? defaultStatisticalCategoryDataset6.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0d), (java.lang.Number) 1L, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int20 = defaultStatisticalCategoryDataset14.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset14.removeChangeListener(datasetChangeListener21);
        java.lang.Number number25 = defaultStatisticalCategoryDataset14.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int27 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list28 = defaultStatisticalCategoryDataset14.getRowKeys();
        java.util.List list29 = defaultStatisticalCategoryDataset14.getColumnKeys();
        defaultStatisticalCategoryDataset14.add((double) (short) 10, 100.0d, (java.lang.Comparable) (short) 10, (java.lang.Comparable) "hi!");
        java.lang.Object obj35 = defaultStatisticalCategoryDataset14.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener36 = null;
        defaultStatisticalCategoryDataset14.removeChangeListener(datasetChangeListener36);
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and obj35", defaultStatisticalCategoryDataset14.equals(obj35) ? defaultStatisticalCategoryDataset14.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        double double20 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int23 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener24);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number29 = defaultStatisticalCategoryDataset26.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double31 = defaultStatisticalCategoryDataset26.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int33 = defaultStatisticalCategoryDataset32.getColumnCount();
        int int35 = defaultStatisticalCategoryDataset32.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset32.getGroup();
        defaultStatisticalCategoryDataset26.setGroup(datasetGroup36);
        java.util.List list38 = defaultStatisticalCategoryDataset26.getRowKeys();
        boolean boolean39 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset26 and defaultStatisticalCategoryDataset32", defaultStatisticalCategoryDataset26.equals(defaultStatisticalCategoryDataset32) ? defaultStatisticalCategoryDataset26.hashCode() == defaultStatisticalCategoryDataset32.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double21 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0f), (java.lang.Number) 2, (java.lang.Comparable) true, (java.lang.Comparable) '4');
        double double28 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.util.List list29 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset30.addChangeListener(datasetChangeListener31);
        java.util.EventListener eventListener33 = null;
        boolean boolean34 = defaultStatisticalCategoryDataset30.hasListener(eventListener33);
        java.lang.Number number37 = defaultStatisticalCategoryDataset30.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) 100);
        java.lang.Number number40 = defaultStatisticalCategoryDataset30.getStdDevValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (short) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener41 = null;
        defaultStatisticalCategoryDataset30.removeChangeListener(datasetChangeListener41);
        int int44 = defaultStatisticalCategoryDataset30.getColumnIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset30.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset30", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset30) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset30.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj11", obj7.equals(obj11) ? obj7.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset6.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener14);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener20);
        boolean boolean22 = defaultStatisticalCategoryDataset16.equals((java.lang.Object) defaultStatisticalCategoryDataset19);
        int int24 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number number27 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list29 = defaultStatisticalCategoryDataset28.getRowKeys();
        defaultStatisticalCategoryDataset28.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number37 = defaultStatisticalCategoryDataset28.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset19.setGroup(datasetGroup38);
        defaultStatisticalCategoryDataset6.setGroup(datasetGroup38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.lang.Number number9 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        defaultStatisticalCategoryDataset3.validateObject();
        defaultStatisticalCategoryDataset3.validateObject();
        double double13 = defaultStatisticalCategoryDataset3.getRangeUpperBound(true);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset3.clone();
        double double16 = defaultStatisticalCategoryDataset3.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj14", defaultStatisticalCategoryDataset0.equals(obj14) ? defaultStatisticalCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) 100L);
        double double23 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        double double27 = defaultStatisticalCategoryDataset24.getRangeLowerBound(false);
        java.util.List list28 = defaultStatisticalCategoryDataset24.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset29.hasListener(eventListener30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset29.validateObject();
        org.jfree.data.Range range37 = defaultStatisticalCategoryDataset29.getRangeBounds(true);
        int int38 = defaultStatisticalCategoryDataset29.getColumnCount();
        java.lang.Number number41 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int43 = defaultStatisticalCategoryDataset29.getRowIndex((java.lang.Comparable) (byte) 100);
        int int45 = defaultStatisticalCategoryDataset29.getColumnIndex((java.lang.Comparable) 0L);
        defaultStatisticalCategoryDataset29.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset47 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list48 = defaultStatisticalCategoryDataset47.getRowKeys();
        defaultStatisticalCategoryDataset47.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number56 = defaultStatisticalCategoryDataset47.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup57 = defaultStatisticalCategoryDataset47.getGroup();
        defaultStatisticalCategoryDataset29.setGroup(datasetGroup57);
        defaultStatisticalCategoryDataset24.setGroup(datasetGroup57);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset24", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset24) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 1);
        int int25 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        int int26 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset27.addChangeListener(datasetChangeListener28);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset30.addChangeListener(datasetChangeListener31);
        boolean boolean33 = defaultStatisticalCategoryDataset27.equals((java.lang.Object) defaultStatisticalCategoryDataset30);
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset30);
        org.jfree.data.Range range36 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset27 and defaultStatisticalCategoryDataset30", defaultStatisticalCategoryDataset27.equals(defaultStatisticalCategoryDataset30) ? defaultStatisticalCategoryDataset27.hashCode() == defaultStatisticalCategoryDataset30.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        defaultStatisticalCategoryDataset16.validateObject();
        java.util.List list20 = defaultStatisticalCategoryDataset16.getRowKeys();
        int int21 = defaultStatisticalCategoryDataset16.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset16.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener23);
        java.util.List list25 = defaultStatisticalCategoryDataset16.getColumnKeys();
        double double27 = defaultStatisticalCategoryDataset16.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and defaultStatisticalCategoryDataset16", obj11.equals(defaultStatisticalCategoryDataset16) ? obj11.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable15 = null;
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1, comparable15);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) -1, (java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) '#');
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int25 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list27 = defaultStatisticalCategoryDataset26.getRowKeys();
        defaultStatisticalCategoryDataset26.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int33 = defaultStatisticalCategoryDataset26.getColumnCount();
        java.lang.Number number36 = defaultStatisticalCategoryDataset26.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double38 = defaultStatisticalCategoryDataset26.getRangeLowerBound(false);
        java.lang.Number number41 = defaultStatisticalCategoryDataset26.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int42 = defaultStatisticalCategoryDataset26.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset26.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup43);
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup45", datasetGroup4.equals(datasetGroup45) ? datasetGroup4.hashCode() == datasetGroup45.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass19 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and obj18", defaultStatisticalCategoryDataset8.equals(obj18) ? defaultStatisticalCategoryDataset8.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.util.List list11 = defaultStatisticalCategoryDataset6.getRowKeys();
        java.lang.Number number14 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0.0d);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset6.hasListener(eventListener15);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list24 = defaultStatisticalCategoryDataset23.getRowKeys();
        boolean boolean25 = defaultStatisticalCategoryDataset17.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        java.util.List list26 = defaultStatisticalCategoryDataset17.getRowKeys();
        int int27 = defaultStatisticalCategoryDataset17.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener28);
        defaultStatisticalCategoryDataset17.add((double) (byte) 100, (double) (short) 10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        java.lang.Number number37 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (-1.0d));
        boolean boolean38 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset8.getGroup();
        int int20 = defaultStatisticalCategoryDataset8.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int22 = defaultStatisticalCategoryDataset21.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset21.removeChangeListener(datasetChangeListener23);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset21.addChangeListener(datasetChangeListener25);
        double double28 = defaultStatisticalCategoryDataset21.getRangeLowerBound(false);
        java.util.List list29 = defaultStatisticalCategoryDataset21.getColumnKeys();
        java.lang.Number number32 = defaultStatisticalCategoryDataset21.getMeanValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (-1L));
        boolean boolean33 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int10);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        java.lang.Number number18 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int19 = defaultStatisticalCategoryDataset13.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset13.removeChangeListener(datasetChangeListener20);
        java.lang.Number number24 = defaultStatisticalCategoryDataset13.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int26 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset13.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        defaultStatisticalCategoryDataset13.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 1);
        int int37 = defaultStatisticalCategoryDataset13.getRowCount();
        int int38 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultStatisticalCategoryDataset13.removeChangeListener(datasetChangeListener39);
        double double42 = defaultStatisticalCategoryDataset13.getRangeLowerBound(true);
        boolean boolean43 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset7.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset7.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) true);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Class<?> wildcardClass19 = list18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj7", defaultStatisticalCategoryDataset0.equals(obj7) ? defaultStatisticalCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj9", obj6.equals(obj9) ? obj6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        defaultStatisticalCategoryDataset0.add((double) (byte) 100, (double) (short) 10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        int int18 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        org.jfree.data.Range range26 = defaultStatisticalCategoryDataset22.getRangeBounds(false);
        defaultStatisticalCategoryDataset22.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset28.hasListener(eventListener29);
        java.lang.Number number33 = defaultStatisticalCategoryDataset28.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int34 = defaultStatisticalCategoryDataset28.getRowCount();
        double double36 = defaultStatisticalCategoryDataset28.getRangeUpperBound(true);
        double double38 = defaultStatisticalCategoryDataset28.getRangeUpperBound(false);
        int int39 = defaultStatisticalCategoryDataset28.getColumnCount();
        double double41 = defaultStatisticalCategoryDataset28.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup42 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup42);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset10.hasListener(eventListener11);
        java.lang.Number number15 = defaultStatisticalCategoryDataset10.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int16 = defaultStatisticalCategoryDataset10.getRowCount();
        double double18 = defaultStatisticalCategoryDataset10.getRangeUpperBound(true);
        java.util.List list19 = defaultStatisticalCategoryDataset10.getRowKeys();
        int int21 = defaultStatisticalCategoryDataset10.getColumnIndex((java.lang.Comparable) 1.0d);
        java.lang.Comparable comparable24 = null;
        defaultStatisticalCategoryDataset10.add((double) 100L, 0.0d, comparable24, (java.lang.Comparable) "");
        java.lang.Object obj27 = defaultStatisticalCategoryDataset10.clone();
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset10.getGroup();
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset10);
        java.util.List list30 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset10 and obj27", defaultStatisticalCategoryDataset10.equals(obj27) ? defaultStatisticalCategoryDataset10.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0d));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset17.validateObject();
        org.jfree.data.Range range25 = defaultStatisticalCategoryDataset17.getRangeBounds(true);
        int int26 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.lang.Number number29 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        java.lang.Number number32 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) 0L, (java.lang.Comparable) 1.0f);
        java.lang.Number number35 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) ' ');
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        defaultStatisticalCategoryDataset0.validateObject();
        double double40 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset41 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener42 = null;
        defaultStatisticalCategoryDataset41.addChangeListener(datasetChangeListener42);
        int int44 = defaultStatisticalCategoryDataset41.getColumnCount();
        java.lang.Number number47 = defaultStatisticalCategoryDataset41.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset41.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset41.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number60 = defaultStatisticalCategoryDataset41.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.util.List list61 = defaultStatisticalCategoryDataset41.getColumnKeys();
        int int62 = defaultStatisticalCategoryDataset41.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener63 = null;
        defaultStatisticalCategoryDataset41.removeChangeListener(datasetChangeListener63);
        boolean boolean65 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset17 and defaultStatisticalCategoryDataset41", defaultStatisticalCategoryDataset17.equals(defaultStatisticalCategoryDataset41) ? defaultStatisticalCategoryDataset17.hashCode() == defaultStatisticalCategoryDataset41.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        java.lang.Number number26 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) '#', (java.lang.Comparable) (byte) 1);
        java.lang.Number number29 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) (byte) 10);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset12.hasListener(eventListener30);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list33 = defaultStatisticalCategoryDataset32.getRowKeys();
        int int34 = defaultStatisticalCategoryDataset32.getRowCount();
        boolean boolean35 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset32);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener36 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset32", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset32) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset32.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener9);
        int int11 = defaultStatisticalCategoryDataset8.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset8.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset8.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset8.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number27 = defaultStatisticalCategoryDataset8.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.util.List list28 = defaultStatisticalCategoryDataset8.getColumnKeys();
        int int29 = defaultStatisticalCategoryDataset8.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener30);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener33 = null;
        boolean boolean34 = defaultStatisticalCategoryDataset32.hasListener(eventListener33);
        java.lang.Number number37 = defaultStatisticalCategoryDataset32.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int38 = defaultStatisticalCategoryDataset32.getRowCount();
        double double40 = defaultStatisticalCategoryDataset32.getRangeUpperBound(true);
        boolean boolean42 = defaultStatisticalCategoryDataset32.equals((java.lang.Object) (short) 10);
        double double44 = defaultStatisticalCategoryDataset32.getRangeLowerBound(false);
        java.lang.Number number47 = defaultStatisticalCategoryDataset32.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int48 = defaultStatisticalCategoryDataset32.getRowCount();
        int int49 = defaultStatisticalCategoryDataset32.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup50 = defaultStatisticalCategoryDataset32.getGroup();
        defaultStatisticalCategoryDataset8.setGroup(datasetGroup50);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset32", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset32) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset32.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) -1, (java.lang.Number) 10L, (java.lang.Comparable) 'a', (java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener23);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset25.addChangeListener(datasetChangeListener26);
        boolean boolean28 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        int int30 = defaultStatisticalCategoryDataset25.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range32 = defaultStatisticalCategoryDataset25.getRangeBounds(false);
        int int34 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset35 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener36 = null;
        boolean boolean37 = defaultStatisticalCategoryDataset35.hasListener(eventListener36);
        java.lang.Number number40 = defaultStatisticalCategoryDataset35.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int41 = defaultStatisticalCategoryDataset35.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener42 = null;
        defaultStatisticalCategoryDataset35.removeChangeListener(datasetChangeListener42);
        java.lang.Number number46 = defaultStatisticalCategoryDataset35.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int48 = defaultStatisticalCategoryDataset35.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset35.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        defaultStatisticalCategoryDataset35.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 1);
        int int59 = defaultStatisticalCategoryDataset35.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset60 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number63 = defaultStatisticalCategoryDataset60.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int65 = defaultStatisticalCategoryDataset60.getColumnIndex((java.lang.Comparable) (short) -1);
        double double67 = defaultStatisticalCategoryDataset60.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset60.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset60.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        double double79 = defaultStatisticalCategoryDataset60.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup80 = defaultStatisticalCategoryDataset60.getGroup();
        defaultStatisticalCategoryDataset35.setGroup(datasetGroup80);
        defaultStatisticalCategoryDataset25.setGroup(datasetGroup80);
        java.lang.Number number85 = defaultStatisticalCategoryDataset25.getStdDevValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 1.0f);
        boolean boolean86 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        int int17 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        defaultStatisticalCategoryDataset18.validateObject();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset18.hasListener(eventListener22);
        java.lang.Number number26 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        java.lang.Number number31 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10L, (java.lang.Comparable) 1);
        java.lang.Object obj32 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list33 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj32", defaultStatisticalCategoryDataset18.equals(obj32) ? defaultStatisticalCategoryDataset18.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number15 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) ' ', (java.lang.Comparable) 0L);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup16);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup6 and datasetGroup16", datasetGroup6.equals(datasetGroup16) ? datasetGroup6.hashCode() == datasetGroup16.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Comparable comparable8 = null;
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue(comparable8, (java.lang.Comparable) true);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        int int15 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj14", obj13.equals(obj14) ? obj13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0d));
        java.lang.Comparable comparable18 = defaultStatisticalCategoryDataset0.getColumnKey((int) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        int int22 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj23 = defaultStatisticalCategoryDataset19.clone();
        defaultStatisticalCategoryDataset19.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset19 and obj23", defaultStatisticalCategoryDataset19.equals(obj23) ? defaultStatisticalCategoryDataset19.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.util.List list20 = defaultStatisticalCategoryDataset17.getColumnKeys();
        java.util.List list21 = defaultStatisticalCategoryDataset17.getColumnKeys();
        java.lang.Number number24 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100);
        int int25 = defaultStatisticalCategoryDataset17.getRowCount();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj16", obj13.equals(obj16) ? obj13.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) true);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list20 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener24);
        int int26 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj28 = defaultStatisticalCategoryDataset0.clone();
        int int29 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj28", obj7.equals(obj28) ? obj7.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number15 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 0, number15, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        java.lang.Object obj19 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Comparable comparable22 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 100, (java.lang.Number) Double.NaN, comparable22, (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj19", obj13.equals(obj19) ? obj13.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 0, (java.lang.Number) 100, (java.lang.Comparable) "hi!", (java.lang.Comparable) 100L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset19.removeChangeListener(datasetChangeListener21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener23);
        double double26 = defaultStatisticalCategoryDataset19.getRangeLowerBound(false);
        java.lang.Object obj27 = defaultStatisticalCategoryDataset19.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset19.removeChangeListener(datasetChangeListener28);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset19", obj7.equals(defaultStatisticalCategoryDataset19) ? obj7.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        int int11 = defaultStatisticalCategoryDataset3.getColumnCount();
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset3.clone();
        java.lang.Object obj15 = defaultStatisticalCategoryDataset3.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj14", defaultStatisticalCategoryDataset0.equals(obj14) ? defaultStatisticalCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list12 = defaultStatisticalCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener13);
        double double16 = defaultStatisticalCategoryDataset11.getRangeUpperBound(true);
        java.lang.Object obj17 = defaultStatisticalCategoryDataset11.clone();
        java.util.List list18 = defaultStatisticalCategoryDataset11.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset11.getRowCount();
        boolean boolean20 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset11 and obj17", defaultStatisticalCategoryDataset11.equals(obj17) ? defaultStatisticalCategoryDataset11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int26 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Number number29 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) false, (java.lang.Comparable) 100.0d);
        java.util.List list30 = defaultStatisticalCategoryDataset12.getRowKeys();
        java.lang.Object obj31 = defaultStatisticalCategoryDataset12.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int33 = defaultStatisticalCategoryDataset32.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultStatisticalCategoryDataset32.removeChangeListener(datasetChangeListener34);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener36 = null;
        defaultStatisticalCategoryDataset32.addChangeListener(datasetChangeListener36);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultStatisticalCategoryDataset32.addChangeListener(datasetChangeListener38);
        java.util.EventListener eventListener40 = null;
        boolean boolean41 = defaultStatisticalCategoryDataset32.hasListener(eventListener40);
        int int43 = defaultStatisticalCategoryDataset32.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset44 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener45 = null;
        boolean boolean46 = defaultStatisticalCategoryDataset44.hasListener(eventListener45);
        java.lang.Number number49 = defaultStatisticalCategoryDataset44.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset44.validateObject();
        org.jfree.data.Range range52 = defaultStatisticalCategoryDataset44.getRangeBounds(true);
        int int53 = defaultStatisticalCategoryDataset44.getColumnCount();
        java.lang.Number number56 = defaultStatisticalCategoryDataset44.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup57 = defaultStatisticalCategoryDataset44.getGroup();
        defaultStatisticalCategoryDataset32.setGroup(datasetGroup57);
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj31", defaultStatisticalCategoryDataset18.equals(obj31) ? defaultStatisticalCategoryDataset18.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) 100L);
        java.lang.Number number24 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) '#');
        int int26 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        java.util.List list27 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list29 = defaultStatisticalCategoryDataset28.getRowKeys();
        defaultStatisticalCategoryDataset28.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int35 = defaultStatisticalCategoryDataset28.getColumnCount();
        java.lang.Number number38 = defaultStatisticalCategoryDataset28.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double40 = defaultStatisticalCategoryDataset28.getRangeLowerBound(false);
        java.lang.Number number43 = defaultStatisticalCategoryDataset28.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        int int44 = defaultStatisticalCategoryDataset28.getRowCount();
        int int45 = defaultStatisticalCategoryDataset28.getColumnCount();
        java.util.EventListener eventListener46 = null;
        boolean boolean47 = defaultStatisticalCategoryDataset28.hasListener(eventListener46);
        org.jfree.data.general.DatasetGroup datasetGroup48 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) true);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset23.hasListener(eventListener24);
        java.lang.Number number28 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int29 = defaultStatisticalCategoryDataset23.getRowCount();
        java.lang.Class<?> wildcardClass30 = defaultStatisticalCategoryDataset23.getClass();
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener33 = null;
        boolean boolean34 = defaultStatisticalCategoryDataset32.hasListener(eventListener33);
        defaultStatisticalCategoryDataset32.validateObject();
        java.util.List list36 = defaultStatisticalCategoryDataset32.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset32.removeChangeListener(datasetChangeListener37);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset39 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int40 = defaultStatisticalCategoryDataset39.getColumnCount();
        int int42 = defaultStatisticalCategoryDataset39.getColumnIndex((java.lang.Comparable) (short) 0);
        boolean boolean43 = defaultStatisticalCategoryDataset32.equals((java.lang.Object) int42);
        int int44 = defaultStatisticalCategoryDataset32.getRowCount();
        int int45 = defaultStatisticalCategoryDataset32.getRowCount();
        defaultStatisticalCategoryDataset32.add((double) ' ', (double) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int51 = defaultStatisticalCategoryDataset32.getRowCount();
        defaultStatisticalCategoryDataset32.add((double) (byte) 0, (double) (short) 10, (java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 1);
        boolean boolean57 = defaultStatisticalCategoryDataset23.equals((java.lang.Object) defaultStatisticalCategoryDataset32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj7", defaultStatisticalCategoryDataset0.equals(obj7) ? defaultStatisticalCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double21 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj22 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and obj22", defaultStatisticalCategoryDataset8.equals(obj22) ? defaultStatisticalCategoryDataset8.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, (java.lang.Number) (short) 1, (java.lang.Comparable) '4', (java.lang.Comparable) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list23 = defaultStatisticalCategoryDataset22.getRowKeys();
        boolean boolean24 = defaultStatisticalCategoryDataset16.equals((java.lang.Object) defaultStatisticalCategoryDataset22);
        java.util.List list25 = defaultStatisticalCategoryDataset16.getRowKeys();
        int int26 = defaultStatisticalCategoryDataset16.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener27);
        defaultStatisticalCategoryDataset16.add((double) (byte) 100, (double) (short) 10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        int int34 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.lang.Number number37 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset16 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset16.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset16.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener5);
        int int7 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.util.List list8 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Number number11 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int13 = defaultStatisticalCategoryDataset4.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        java.lang.Comparable comparable18 = null;
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0d, comparable18);
        java.util.List list20 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj21 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj21", defaultStatisticalCategoryDataset4.equals(obj21) ? defaultStatisticalCategoryDataset4.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double21 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj22 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "", (java.lang.Comparable) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and obj22", defaultStatisticalCategoryDataset8.equals(obj22) ? defaultStatisticalCategoryDataset8.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.lang.Number number13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) Double.NaN, number13, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        defaultStatisticalCategoryDataset18.validateObject();
        java.lang.Number number24 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj25 = defaultStatisticalCategoryDataset18.clone();
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset18.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener28);
        int int31 = defaultStatisticalCategoryDataset18.getRowIndex((java.lang.Comparable) (short) 1);
        int int32 = defaultStatisticalCategoryDataset18.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        defaultStatisticalCategoryDataset17.validateObject();
        java.lang.Number number23 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset17.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        double double30 = defaultStatisticalCategoryDataset17.getRangeLowerBound(false);
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) false);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number36 = defaultStatisticalCategoryDataset33.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double38 = defaultStatisticalCategoryDataset33.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset39 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int40 = defaultStatisticalCategoryDataset39.getColumnCount();
        int int42 = defaultStatisticalCategoryDataset39.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset39.getGroup();
        defaultStatisticalCategoryDataset33.setGroup(datasetGroup43);
        java.util.List list45 = defaultStatisticalCategoryDataset33.getColumnKeys();
        int int47 = defaultStatisticalCategoryDataset33.getRowIndex((java.lang.Comparable) 0);
        defaultStatisticalCategoryDataset33.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup49 = defaultStatisticalCategoryDataset33.getGroup();
        boolean boolean50 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset33", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset33) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset33.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (byte) 1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj20 = defaultStatisticalCategoryDataset0.clone();
        double double22 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj20", defaultStatisticalCategoryDataset6.equals(obj20) ? defaultStatisticalCategoryDataset6.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        int int8 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1), (java.lang.Number) (short) 1, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number19 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double21 = defaultStatisticalCategoryDataset16.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup26);
        java.util.List list28 = defaultStatisticalCategoryDataset16.getColumnKeys();
        int int30 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset16.removeChangeListener(datasetChangeListener31);
        java.util.List list33 = defaultStatisticalCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset16.getGroup();
        java.lang.Number number37 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.util.List list38 = defaultStatisticalCategoryDataset16.getRowKeys();
        boolean boolean39 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup26", datasetGroup4.equals(datasetGroup26) ? datasetGroup4.hashCode() == datasetGroup26.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        defaultStatisticalCategoryDataset17.validateObject();
        java.lang.Number number23 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset17.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        double double30 = defaultStatisticalCategoryDataset17.getRangeLowerBound(false);
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) false);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj33 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and obj33", defaultStatisticalCategoryDataset8.equals(obj33) ? defaultStatisticalCategoryDataset8.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset6.hasListener(eventListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int12 = defaultStatisticalCategoryDataset6.getRowCount();
        double double14 = defaultStatisticalCategoryDataset6.getRangeUpperBound(true);
        boolean boolean16 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) (short) 10);
        double double18 = defaultStatisticalCategoryDataset6.getRangeLowerBound(false);
        java.lang.Number number21 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int22 = defaultStatisticalCategoryDataset6.getRowCount();
        int int23 = defaultStatisticalCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener24);
        int int27 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        double double29 = defaultStatisticalCategoryDataset6.getRangeLowerBound(true);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) double29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and defaultStatisticalCategoryDataset6", obj5.equals(defaultStatisticalCategoryDataset6) ? obj5.hashCode() == defaultStatisticalCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset8.hasListener(eventListener9);
        java.lang.Number number13 = defaultStatisticalCategoryDataset8.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int14 = defaultStatisticalCategoryDataset8.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset8.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int21 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset8.getRangeBounds(true);
        int int25 = defaultStatisticalCategoryDataset8.getRowIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset26.hasListener(eventListener27);
        defaultStatisticalCategoryDataset26.validateObject();
        java.util.List list30 = defaultStatisticalCategoryDataset26.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset26.removeChangeListener(datasetChangeListener31);
        java.util.List list33 = defaultStatisticalCategoryDataset26.getRowKeys();
        boolean boolean34 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        defaultStatisticalCategoryDataset26.add((java.lang.Number) 10.0f, (java.lang.Number) 2, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0d));
        java.lang.Object obj40 = defaultStatisticalCategoryDataset26.clone();
        boolean boolean41 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        java.util.EventListener eventListener42 = null;
        boolean boolean43 = defaultStatisticalCategoryDataset0.hasListener(eventListener42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset26 and obj40", defaultStatisticalCategoryDataset26.equals(obj40) ? defaultStatisticalCategoryDataset26.hashCode() == obj40.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Comparable comparable8 = null;
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue(comparable8, (java.lang.Comparable) true);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj13 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj14", obj13.equals(obj14) ? obj13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int3 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultStatisticalCategoryDataset5.hasListener(eventListener6);
        defaultStatisticalCategoryDataset5.validateObject();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset5.hasListener(eventListener9);
        java.lang.Number number13 = defaultStatisticalCategoryDataset5.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset5.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset5.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup16);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup16", datasetGroup4.equals(datasetGroup16) ? datasetGroup4.hashCode() == datasetGroup16.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list23 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset24.getGroup();
        int int30 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset24.add((java.lang.Number) 0.0f, (java.lang.Number) 2, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 0);
        defaultStatisticalCategoryDataset24.add((java.lang.Number) (short) 10, (java.lang.Number) 10, (java.lang.Comparable) (-1), (java.lang.Comparable) (-1.0d));
        int int41 = defaultStatisticalCategoryDataset24.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset42 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int43 = defaultStatisticalCategoryDataset42.getColumnCount();
        int int45 = defaultStatisticalCategoryDataset42.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range47 = defaultStatisticalCategoryDataset42.getRangeBounds(false);
        defaultStatisticalCategoryDataset42.validateObject();
        boolean boolean49 = defaultStatisticalCategoryDataset24.equals((java.lang.Object) defaultStatisticalCategoryDataset42);
        boolean boolean50 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup22 and datasetGroup28", datasetGroup22.equals(datasetGroup28) ? datasetGroup22.hashCode() == datasetGroup28.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.Range range11 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj12", obj6.equals(obj12) ? obj6.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj8 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Class<?> wildcardClass15 = list14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj8", defaultStatisticalCategoryDataset0.equals(obj8) ? defaultStatisticalCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Comparable comparable13 = null;
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue(comparable13, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number19 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int21 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) -1);
        int int23 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup28);
        int int31 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset16.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener34 = null;
        boolean boolean35 = defaultStatisticalCategoryDataset33.hasListener(eventListener34);
        defaultStatisticalCategoryDataset33.validateObject();
        java.lang.Number number39 = defaultStatisticalCategoryDataset33.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset33.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        double double46 = defaultStatisticalCategoryDataset33.getRangeLowerBound(false);
        boolean boolean47 = defaultStatisticalCategoryDataset16.equals((java.lang.Object) false);
        org.jfree.data.general.DatasetGroup datasetGroup48 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultStatisticalCategoryDataset0.add(0.0d, (double) (-1.0f), (java.lang.Comparable) 10, (java.lang.Comparable) "");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        defaultStatisticalCategoryDataset22.validateObject();
        java.util.List list26 = defaultStatisticalCategoryDataset22.getRowKeys();
        int int27 = defaultStatisticalCategoryDataset22.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset22.validateObject();
        defaultStatisticalCategoryDataset22.add((double) (short) 1, (double) 1, (java.lang.Comparable) "", (java.lang.Comparable) 100L);
        java.lang.Number number37 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) '#');
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup10 and datasetGroup28", datasetGroup10.equals(datasetGroup28) ? datasetGroup10.hashCode() == datasetGroup28.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        java.lang.Comparable comparable16 = null;
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 2, comparable16);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset0.hasListener(eventListener18);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int21 = defaultStatisticalCategoryDataset20.getColumnCount();
        int int23 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset20.getGroup();
        java.util.List list25 = defaultStatisticalCategoryDataset20.getColumnKeys();
        int int26 = defaultStatisticalCategoryDataset20.getRowCount();
        java.lang.Object obj27 = defaultStatisticalCategoryDataset20.clone();
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset20 and obj27", defaultStatisticalCategoryDataset20.equals(obj27) ? defaultStatisticalCategoryDataset20.hashCode() == obj27.hashCode() : true);
    }
}

