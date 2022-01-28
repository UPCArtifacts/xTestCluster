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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        java.util.List list12 = defaultStatisticalCategoryDataset9.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.util.List list17 = defaultStatisticalCategoryDataset13.getColumnKeys();
        java.lang.Number number20 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int22 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean23 = defaultStatisticalCategoryDataset9.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset13.getGroup();
        boolean boolean25 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup24", datasetGroup8.equals(datasetGroup24) ? datasetGroup8.hashCode() == datasetGroup24.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
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
        defaultStatisticalCategoryDataset3.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset11", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset11) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) ' ', (java.lang.Comparable) 0L);
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset6.hasListener(eventListener7);
        java.util.List list9 = defaultStatisticalCategoryDataset6.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset10.addChangeListener(datasetChangeListener11);
        int int13 = defaultStatisticalCategoryDataset10.getColumnCount();
        java.util.List list14 = defaultStatisticalCategoryDataset10.getColumnKeys();
        java.lang.Number number17 = defaultStatisticalCategoryDataset10.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int19 = defaultStatisticalCategoryDataset10.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean20 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) defaultStatisticalCategoryDataset10);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset10.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset10", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset10) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset10.hashCode() : true);
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
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
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
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset0.hasListener(eventListener20);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number25 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double27 = defaultStatisticalCategoryDataset22.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int29 = defaultStatisticalCategoryDataset28.getColumnCount();
        int int31 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup32);
        java.util.List list34 = defaultStatisticalCategoryDataset22.getColumnKeys();
        boolean boolean35 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset22 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset22.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset22.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
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
        int int26 = defaultStatisticalCategoryDataset9.getRowIndex((java.lang.Comparable) (-1L));
        java.util.List list27 = defaultStatisticalCategoryDataset9.getColumnKeys();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset9 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset9.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset9.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        java.util.List list16 = defaultStatisticalCategoryDataset15.getRowKeys();
        defaultStatisticalCategoryDataset15.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int22 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number25 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset15.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener31 = null;
        boolean boolean32 = defaultStatisticalCategoryDataset15.hasListener(eventListener31);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset15.getGroup();
        java.lang.Comparable comparable35 = null;
        java.lang.Number number36 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) (short) 10, comparable35);
        int int37 = defaultStatisticalCategoryDataset15.getRowCount();
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup12 and datasetGroup33", datasetGroup12.equals(datasetGroup33) ? datasetGroup12.hashCode() == datasetGroup33.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset6.hasListener(eventListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset6.validateObject();
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset6.getRangeBounds(true);
        int int16 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset6.removeChangeListener(datasetChangeListener17);
        java.lang.Object obj19 = defaultStatisticalCategoryDataset6.clone();
        int int21 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) 1L);
        defaultStatisticalCategoryDataset6.add((double) (short) -1, (-1.0d), (java.lang.Comparable) (short) 1, (java.lang.Comparable) "");
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj19", defaultStatisticalCategoryDataset6.equals(obj19) ? defaultStatisticalCategoryDataset6.hashCode() == obj19.hashCode() : true);
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
        defaultStatisticalCategoryDataset22.validateObject();
        java.lang.Number number28 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset22.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset22.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj10", defaultStatisticalCategoryDataset4.equals(obj10) ? defaultStatisticalCategoryDataset4.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        java.lang.Number number18 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset13.validateObject();
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset13.getRangeBounds(true);
        int int23 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (byte) 1);
        double double25 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        double double27 = defaultStatisticalCategoryDataset13.getRangeLowerBound(false);
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset10.hasListener(eventListener11);
        defaultStatisticalCategoryDataset10.validateObject();
        java.lang.Number number16 = defaultStatisticalCategoryDataset10.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset10.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number21 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int23 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (short) -1);
        int int25 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset18.removeChangeListener(datasetChangeListener26);
        boolean boolean28 = defaultStatisticalCategoryDataset10.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset10 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset10.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset10.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        java.lang.Number number15 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int17 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) -1);
        int int19 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int21 = defaultStatisticalCategoryDataset20.getColumnCount();
        int int23 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup24);
        defaultStatisticalCategoryDataset12.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup27", datasetGroup4.equals(datasetGroup27) ? datasetGroup4.hashCode() == datasetGroup27.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        int int19 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        java.util.List list23 = defaultStatisticalCategoryDataset20.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset24.addChangeListener(datasetChangeListener25);
        int int27 = defaultStatisticalCategoryDataset24.getColumnCount();
        java.util.List list28 = defaultStatisticalCategoryDataset24.getColumnKeys();
        java.lang.Number number31 = defaultStatisticalCategoryDataset24.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int33 = defaultStatisticalCategoryDataset24.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean34 = defaultStatisticalCategoryDataset20.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        org.jfree.data.Range range36 = defaultStatisticalCategoryDataset20.getRangeBounds(false);
        boolean boolean37 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset23.addChangeListener(datasetChangeListener24);
        int int26 = defaultStatisticalCategoryDataset23.getColumnCount();
        java.util.List list27 = defaultStatisticalCategoryDataset23.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset28.hasListener(eventListener29);
        defaultStatisticalCategoryDataset28.validateObject();
        java.util.List list32 = defaultStatisticalCategoryDataset28.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultStatisticalCategoryDataset28.removeChangeListener(datasetChangeListener33);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset23.setGroup(datasetGroup35);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset23 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset23.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset23.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number8 = defaultStatisticalCategoryDataset5.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double10 = defaultStatisticalCategoryDataset5.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int12 = defaultStatisticalCategoryDataset11.getColumnCount();
        int int14 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset5.setGroup(datasetGroup15);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset5 and defaultStatisticalCategoryDataset11", defaultStatisticalCategoryDataset5.equals(defaultStatisticalCategoryDataset11) ? defaultStatisticalCategoryDataset5.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        double double18 = defaultStatisticalCategoryDataset15.getRangeUpperBound(false);
        double double20 = defaultStatisticalCategoryDataset15.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset15.removeChangeListener(datasetChangeListener21);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        int int19 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        java.lang.Number number25 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset20.validateObject();
        org.jfree.data.Range range28 = defaultStatisticalCategoryDataset20.getRangeBounds(true);
        int int29 = defaultStatisticalCategoryDataset20.getColumnCount();
        java.lang.Number number32 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int34 = defaultStatisticalCategoryDataset20.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list35 = defaultStatisticalCategoryDataset20.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        int int12 = defaultStatisticalCategoryDataset3.getColumnCount();
        java.lang.Object obj13 = defaultStatisticalCategoryDataset3.clone();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset3.hasListener(eventListener14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj13", defaultStatisticalCategoryDataset0.equals(obj13) ? defaultStatisticalCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset7.addChangeListener(datasetChangeListener8);
        int int10 = defaultStatisticalCategoryDataset7.getColumnCount();
        java.util.List list11 = defaultStatisticalCategoryDataset7.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        defaultStatisticalCategoryDataset12.validateObject();
        java.util.List list16 = defaultStatisticalCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset7.setGroup(datasetGroup19);
        defaultStatisticalCategoryDataset3.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset7", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset7) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list17 = defaultStatisticalCategoryDataset16.getRowKeys();
        double double19 = defaultStatisticalCategoryDataset16.getRangeUpperBound(false);
        double double21 = defaultStatisticalCategoryDataset16.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset16.removeChangeListener(datasetChangeListener22);
        java.lang.Comparable comparable24 = null;
        java.lang.Number number26 = defaultStatisticalCategoryDataset16.getStdDevValue(comparable24, (java.lang.Comparable) true);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset16.getGroup();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset7", obj6.equals(defaultStatisticalCategoryDataset7) ? obj6.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list18 = defaultStatisticalCategoryDataset17.getRowKeys();
        double double20 = defaultStatisticalCategoryDataset17.getRangeUpperBound(false);
        double double22 = defaultStatisticalCategoryDataset17.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset17.removeChangeListener(datasetChangeListener23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        java.lang.Number number15 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        double double17 = defaultStatisticalCategoryDataset6.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        boolean boolean21 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        defaultStatisticalCategoryDataset0.add((double) 1, (double) 0, (java.lang.Comparable) 10, (java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        defaultStatisticalCategoryDataset9.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset9.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset9.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number20 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int22 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) -1);
        int int24 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset17.removeChangeListener(datasetChangeListener25);
        boolean boolean27 = defaultStatisticalCategoryDataset9.equals((java.lang.Object) defaultStatisticalCategoryDataset17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset17.getGroup();
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset9 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset9.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset9.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 0.0d);
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj11", obj7.equals(obj11) ? obj7.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        java.util.List list28 = defaultStatisticalCategoryDataset25.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset29.addChangeListener(datasetChangeListener30);
        int int32 = defaultStatisticalCategoryDataset29.getColumnCount();
        java.util.List list33 = defaultStatisticalCategoryDataset29.getColumnKeys();
        java.lang.Number number36 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int38 = defaultStatisticalCategoryDataset29.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean39 = defaultStatisticalCategoryDataset25.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset29.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj24", defaultStatisticalCategoryDataset18.equals(obj24) ? defaultStatisticalCategoryDataset18.hashCode() == obj24.hashCode() : true);
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
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj12", obj7.equals(obj12) ? obj7.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        java.util.List list35 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup10 and datasetGroup33", datasetGroup10.equals(datasetGroup33) ? datasetGroup10.hashCode() == datasetGroup33.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        defaultStatisticalCategoryDataset0.add((double) ' ', (double) 100L, (java.lang.Comparable) 1L, (java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        int int19 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) 10.0f);
        double double21 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        double double23 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) double23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup17", datasetGroup4.equals(datasetGroup17) ? datasetGroup4.hashCode() == datasetGroup17.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset10.hasListener(eventListener11);
        defaultStatisticalCategoryDataset10.validateObject();
        java.lang.Number number16 = defaultStatisticalCategoryDataset10.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset10.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number21 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int23 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (short) -1);
        int int25 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset18.removeChangeListener(datasetChangeListener26);
        boolean boolean28 = defaultStatisticalCategoryDataset10.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener29);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset10", obj6.equals(defaultStatisticalCategoryDataset10) ? obj6.hashCode() == defaultStatisticalCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        int int23 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, 100.0d, (java.lang.Comparable) (short) 10, (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number32 = defaultStatisticalCategoryDataset29.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double34 = defaultStatisticalCategoryDataset29.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset35 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int36 = defaultStatisticalCategoryDataset35.getColumnCount();
        int int38 = defaultStatisticalCategoryDataset35.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset35.getGroup();
        defaultStatisticalCategoryDataset29.setGroup(datasetGroup39);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset29 and defaultStatisticalCategoryDataset35", defaultStatisticalCategoryDataset29.equals(defaultStatisticalCategoryDataset35) ? defaultStatisticalCategoryDataset29.hashCode() == defaultStatisticalCategoryDataset35.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        defaultStatisticalCategoryDataset15.validateObject();
        java.lang.Number number21 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj22 = defaultStatisticalCategoryDataset15.clone();
        org.jfree.data.Range range24 = defaultStatisticalCategoryDataset15.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener25);
        defaultStatisticalCategoryDataset15.validateObject();
        java.lang.Number number30 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double32 = defaultStatisticalCategoryDataset15.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and obj22", defaultStatisticalCategoryDataset15.equals(obj22) ? defaultStatisticalCategoryDataset15.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int15 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int17 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset14.getGroup();
        java.util.List list19 = defaultStatisticalCategoryDataset14.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset14.getRowCount();
        java.lang.Object obj21 = defaultStatisticalCategoryDataset14.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener22);
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        java.lang.Comparable comparable26 = null;
        java.lang.Number number27 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0f), comparable26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and obj21", defaultStatisticalCategoryDataset14.equals(obj21) ? defaultStatisticalCategoryDataset14.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int15 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int17 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset14.getGroup();
        java.util.List list19 = defaultStatisticalCategoryDataset14.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset14.getRowCount();
        java.lang.Object obj21 = defaultStatisticalCategoryDataset14.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener22);
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and obj21", defaultStatisticalCategoryDataset14.equals(obj21) ? defaultStatisticalCategoryDataset14.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        double double24 = defaultStatisticalCategoryDataset19.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int26 = defaultStatisticalCategoryDataset25.getColumnCount();
        int int28 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset19.setGroup(datasetGroup29);
        java.util.List list31 = defaultStatisticalCategoryDataset19.getColumnKeys();
        int int33 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list35 = defaultStatisticalCategoryDataset34.getRowKeys();
        defaultStatisticalCategoryDataset34.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int41 = defaultStatisticalCategoryDataset34.getColumnCount();
        java.lang.Number number44 = defaultStatisticalCategoryDataset34.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset34.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener50 = null;
        boolean boolean51 = defaultStatisticalCategoryDataset34.hasListener(eventListener50);
        org.jfree.data.general.DatasetGroup datasetGroup52 = defaultStatisticalCategoryDataset34.getGroup();
        defaultStatisticalCategoryDataset19.setGroup(datasetGroup52);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int23 = defaultStatisticalCategoryDataset17.getRowCount();
        double double25 = defaultStatisticalCategoryDataset17.getRangeUpperBound(true);
        boolean boolean27 = defaultStatisticalCategoryDataset17.equals((java.lang.Object) (short) 10);
        double double29 = defaultStatisticalCategoryDataset17.getRangeLowerBound(false);
        int int31 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list33 = defaultStatisticalCategoryDataset32.getRowKeys();
        defaultStatisticalCategoryDataset32.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int39 = defaultStatisticalCategoryDataset32.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset32.getGroup();
        defaultStatisticalCategoryDataset17.setGroup(datasetGroup40);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int11 = defaultStatisticalCategoryDataset10.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset10.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int15 = defaultStatisticalCategoryDataset10.getColumnCount();
        defaultStatisticalCategoryDataset10.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number23 = defaultStatisticalCategoryDataset10.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int25 = defaultStatisticalCategoryDataset10.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset10.getGroup();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup26);
        java.lang.Object obj28 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup26", datasetGroup8.equals(datasetGroup26) ? datasetGroup8.hashCode() == datasetGroup26.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset11.hasListener(eventListener12);
        defaultStatisticalCategoryDataset11.validateObject();
        java.lang.Number number17 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj18 = defaultStatisticalCategoryDataset11.clone();
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset11.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener21);
        defaultStatisticalCategoryDataset11.validateObject();
        java.lang.Number number26 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double28 = defaultStatisticalCategoryDataset11.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset11 and obj18", defaultStatisticalCategoryDataset11.equals(obj18) ? defaultStatisticalCategoryDataset11.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list14 = defaultStatisticalCategoryDataset13.getRowKeys();
        double double16 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        double double18 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        int int26 = defaultStatisticalCategoryDataset25.getColumnCount();
        int int28 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset25.getGroup();
        int int31 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.List list32 = defaultStatisticalCategoryDataset25.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultStatisticalCategoryDataset33.addChangeListener(datasetChangeListener34);
        int int36 = defaultStatisticalCategoryDataset33.getColumnCount();
        java.lang.Number number39 = defaultStatisticalCategoryDataset33.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset33.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset33.getGroup();
        defaultStatisticalCategoryDataset25.setGroup(datasetGroup45);
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset25", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset25) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset25.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int31 = defaultStatisticalCategoryDataset30.getColumnCount();
        int int33 = defaultStatisticalCategoryDataset30.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset30.getGroup();
        int int36 = defaultStatisticalCategoryDataset30.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.List list37 = defaultStatisticalCategoryDataset30.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset38 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultStatisticalCategoryDataset38.addChangeListener(datasetChangeListener39);
        int int41 = defaultStatisticalCategoryDataset38.getColumnCount();
        java.lang.Number number44 = defaultStatisticalCategoryDataset38.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset38.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup50 = defaultStatisticalCategoryDataset38.getGroup();
        defaultStatisticalCategoryDataset30.setGroup(datasetGroup50);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset30", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset30) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset30.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        defaultStatisticalCategoryDataset12.validateObject();
        java.lang.Number number18 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj19 = defaultStatisticalCategoryDataset12.clone();
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        defaultStatisticalCategoryDataset12.validateObject();
        java.lang.Number number27 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double29 = defaultStatisticalCategoryDataset12.getRangeUpperBound(true);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) double29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and obj19", defaultStatisticalCategoryDataset12.equals(obj19) ? defaultStatisticalCategoryDataset12.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset0.getRowCount();
        int int22 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset23.addChangeListener(datasetChangeListener24);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset26.addChangeListener(datasetChangeListener27);
        boolean boolean29 = defaultStatisticalCategoryDataset23.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        int int31 = defaultStatisticalCategoryDataset26.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset26.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset26.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset23 and defaultStatisticalCategoryDataset26", defaultStatisticalCategoryDataset23.equals(defaultStatisticalCategoryDataset26) ? defaultStatisticalCategoryDataset23.hashCode() == defaultStatisticalCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        int int12 = defaultStatisticalCategoryDataset3.getColumnCount();
        java.lang.Object obj13 = defaultStatisticalCategoryDataset3.clone();
        double double15 = defaultStatisticalCategoryDataset3.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj13", defaultStatisticalCategoryDataset0.equals(obj13) ? defaultStatisticalCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Comparable comparable13 = null;
        int int14 = defaultStatisticalCategoryDataset0.getColumnIndex(comparable13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj12", obj7.equals(obj12) ? obj7.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        defaultStatisticalCategoryDataset13.validateObject();
        java.lang.Number number19 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj20 = defaultStatisticalCategoryDataset13.clone();
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset13.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        java.lang.Number number28 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double30 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        int int31 = defaultStatisticalCategoryDataset13.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        int int12 = defaultStatisticalCategoryDataset3.getColumnCount();
        java.lang.Object obj13 = defaultStatisticalCategoryDataset3.clone();
        int int15 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj13", defaultStatisticalCategoryDataset0.equals(obj13) ? defaultStatisticalCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list9 = defaultStatisticalCategoryDataset8.getRowKeys();
        double double11 = defaultStatisticalCategoryDataset8.getRangeUpperBound(false);
        double double13 = defaultStatisticalCategoryDataset8.getRangeUpperBound(true);
        int int14 = defaultStatisticalCategoryDataset8.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset8.getGroup();
        boolean boolean16 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup6 and datasetGroup15", datasetGroup6.equals(datasetGroup15) ? datasetGroup6.hashCode() == datasetGroup15.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        java.lang.Number number20 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int22 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) -1);
        int int24 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int26 = defaultStatisticalCategoryDataset25.getColumnCount();
        int int28 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset17.setGroup(datasetGroup29);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj16", obj13.equals(obj16) ? obj13.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        defaultStatisticalCategoryDataset18.validateObject();
        java.lang.Number number24 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset18.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number29 = defaultStatisticalCategoryDataset26.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int31 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) (short) -1);
        int int33 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultStatisticalCategoryDataset26.removeChangeListener(datasetChangeListener34);
        boolean boolean36 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset26.addChangeListener(datasetChangeListener37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset26.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.Range range12 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double18 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        int int22 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup23);
        java.util.List list25 = defaultStatisticalCategoryDataset13.getColumnKeys();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
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
        java.lang.Object obj28 = defaultStatisticalCategoryDataset12.clone();
        int int30 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj28", defaultStatisticalCategoryDataset18.equals(obj28) ? defaultStatisticalCategoryDataset18.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset12.hasListener(eventListener25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj24", defaultStatisticalCategoryDataset18.equals(obj24) ? defaultStatisticalCategoryDataset18.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        java.lang.Number number24 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset19.validateObject();
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset19.getRangeBounds(true);
        int int29 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Number number32 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset19", obj7.equals(defaultStatisticalCategoryDataset19) ? obj7.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        java.lang.Number number26 = defaultStatisticalCategoryDataset23.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double28 = defaultStatisticalCategoryDataset23.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int30 = defaultStatisticalCategoryDataset29.getColumnCount();
        int int32 = defaultStatisticalCategoryDataset29.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset29.getGroup();
        defaultStatisticalCategoryDataset23.setGroup(datasetGroup33);
        java.lang.Number number36 = null;
        defaultStatisticalCategoryDataset23.add((java.lang.Number) Double.NaN, number36, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        java.util.List list40 = defaultStatisticalCategoryDataset23.getColumnKeys();
        int int42 = defaultStatisticalCategoryDataset23.getRowIndex((java.lang.Comparable) ' ');
        boolean boolean43 = defaultStatisticalCategoryDataset11.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset29", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset29) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset29.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        defaultStatisticalCategoryDataset12.validateObject();
        java.lang.Number number18 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener19);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list22 = defaultStatisticalCategoryDataset21.getRowKeys();
        double double24 = defaultStatisticalCategoryDataset21.getRangeUpperBound(false);
        double double26 = defaultStatisticalCategoryDataset21.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset21.removeChangeListener(datasetChangeListener27);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup29);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number24 = defaultStatisticalCategoryDataset21.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int26 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) -1);
        int int28 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int30 = defaultStatisticalCategoryDataset29.getColumnCount();
        int int32 = defaultStatisticalCategoryDataset29.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset29.getGroup();
        defaultStatisticalCategoryDataset21.setGroup(datasetGroup33);
        defaultStatisticalCategoryDataset21.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset21 and defaultStatisticalCategoryDataset29", defaultStatisticalCategoryDataset21.equals(defaultStatisticalCategoryDataset29) ? defaultStatisticalCategoryDataset21.hashCode() == defaultStatisticalCategoryDataset29.hashCode() : true);
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
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj14", obj7.equals(obj14) ? obj7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj10", defaultStatisticalCategoryDataset4.equals(obj10) ? defaultStatisticalCategoryDataset4.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        defaultStatisticalCategoryDataset4.validateObject();
        defaultStatisticalCategoryDataset4.add((java.lang.Number) 100.0f, (java.lang.Number) 100L, (java.lang.Comparable) "hi!", (java.lang.Comparable) ' ');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list22 = defaultStatisticalCategoryDataset21.getRowKeys();
        double double24 = defaultStatisticalCategoryDataset21.getRangeUpperBound(false);
        double double26 = defaultStatisticalCategoryDataset21.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset21.removeChangeListener(datasetChangeListener27);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset4.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list6 = defaultStatisticalCategoryDataset5.getRowKeys();
        double double8 = defaultStatisticalCategoryDataset5.getRangeUpperBound(false);
        double double10 = defaultStatisticalCategoryDataset5.getRangeUpperBound(true);
        int int11 = defaultStatisticalCategoryDataset5.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset5.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup14", datasetGroup4.equals(datasetGroup14) ? datasetGroup4.hashCode() == datasetGroup14.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        java.lang.Object obj28 = defaultStatisticalCategoryDataset12.clone();
        int int29 = defaultStatisticalCategoryDataset12.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj28", defaultStatisticalCategoryDataset18.equals(obj28) ? defaultStatisticalCategoryDataset18.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) (short) 0, (java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list13 = defaultStatisticalCategoryDataset12.getRowKeys();
        defaultStatisticalCategoryDataset12.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int19 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number22 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset12.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset12.hasListener(eventListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset12.getGroup();
        java.lang.Comparable comparable32 = null;
        java.lang.Number number33 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 10, comparable32);
        defaultStatisticalCategoryDataset12.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup11 and datasetGroup39", datasetGroup11.equals(datasetGroup39) ? datasetGroup11.hashCode() == datasetGroup39.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        java.lang.Number number23 = defaultStatisticalCategoryDataset19.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int24 = defaultStatisticalCategoryDataset19.getColumnCount();
        defaultStatisticalCategoryDataset19.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number32 = defaultStatisticalCategoryDataset19.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int33 = defaultStatisticalCategoryDataset19.getColumnCount();
        java.lang.Number number36 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) '4', (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset8.setGroup(datasetGroup37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number17 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int19 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int20 = defaultStatisticalCategoryDataset14.getColumnCount();
        defaultStatisticalCategoryDataset14.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset26.hasListener(eventListener27);
        java.lang.Number number31 = defaultStatisticalCategoryDataset26.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset26.validateObject();
        org.jfree.data.Range range34 = defaultStatisticalCategoryDataset26.getRangeBounds(true);
        int int35 = defaultStatisticalCategoryDataset26.getColumnCount();
        java.lang.Number number38 = defaultStatisticalCategoryDataset26.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int40 = defaultStatisticalCategoryDataset26.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list41 = defaultStatisticalCategoryDataset26.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup42 = defaultStatisticalCategoryDataset26.getGroup();
        defaultStatisticalCategoryDataset14.setGroup(datasetGroup42);
        defaultStatisticalCategoryDataset6.setGroup(datasetGroup42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset26", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset26) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) 10, comparable13, (java.lang.Comparable) '#');
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 100);
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1), (java.lang.Comparable) 1.0f);
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
        int int37 = defaultStatisticalCategoryDataset22.getRowCount();
        int int38 = defaultStatisticalCategoryDataset22.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset22 and defaultStatisticalCategoryDataset26", defaultStatisticalCategoryDataset22.equals(defaultStatisticalCategoryDataset26) ? defaultStatisticalCategoryDataset22.hashCode() == defaultStatisticalCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        java.lang.Object obj22 = defaultStatisticalCategoryDataset12.clone();
        int int24 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj22", defaultStatisticalCategoryDataset18.equals(obj22) ? defaultStatisticalCategoryDataset18.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset0.hasListener(eventListener11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list14 = defaultStatisticalCategoryDataset13.getRowKeys();
        double double16 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        double double18 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        java.lang.Object obj19 = defaultStatisticalCategoryDataset13.clone();
        double double21 = defaultStatisticalCategoryDataset13.getRangeLowerBound(true);
        boolean boolean22 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and obj19", defaultStatisticalCategoryDataset13.equals(obj19) ? defaultStatisticalCategoryDataset13.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list13 = defaultStatisticalCategoryDataset12.getRowKeys();
        defaultStatisticalCategoryDataset12.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int19 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number22 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset12.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset12.hasListener(eventListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset12.getGroup();
        java.lang.Comparable comparable32 = null;
        java.lang.Number number33 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 10, comparable32);
        int int34 = defaultStatisticalCategoryDataset12.getRowCount();
        java.util.List list35 = defaultStatisticalCategoryDataset12.getColumnKeys();
        int int37 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener38);
        boolean boolean40 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup30", datasetGroup4.equals(datasetGroup30) ? datasetGroup4.hashCode() == datasetGroup30.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list20 = defaultStatisticalCategoryDataset19.getRowKeys();
        double double22 = defaultStatisticalCategoryDataset19.getRangeUpperBound(false);
        double double24 = defaultStatisticalCategoryDataset19.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset19.removeChangeListener(datasetChangeListener25);
        java.lang.Number number29 = defaultStatisticalCategoryDataset19.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        java.util.List list30 = defaultStatisticalCategoryDataset19.getRowKeys();
        org.jfree.data.Range range32 = defaultStatisticalCategoryDataset19.getRangeBounds(false);
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "", (java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener15);
        int int17 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.util.List list18 = defaultStatisticalCategoryDataset14.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        defaultStatisticalCategoryDataset19.validateObject();
        java.util.List list23 = defaultStatisticalCategoryDataset19.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset19.removeChangeListener(datasetChangeListener24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset14.setGroup(datasetGroup26);
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset14", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset14) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals(obj16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int24 = defaultStatisticalCategoryDataset18.getRowCount();
        double double26 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        boolean boolean28 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) (short) 10);
        double double30 = defaultStatisticalCategoryDataset18.getRangeLowerBound(false);
        java.lang.Number number33 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number36 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list37 = defaultStatisticalCategoryDataset18.getColumnKeys();
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        int int40 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int23 = defaultStatisticalCategoryDataset17.getRowCount();
        double double25 = defaultStatisticalCategoryDataset17.getRangeUpperBound(true);
        boolean boolean27 = defaultStatisticalCategoryDataset17.equals((java.lang.Object) (short) 10);
        double double29 = defaultStatisticalCategoryDataset17.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number33 = defaultStatisticalCategoryDataset30.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int35 = defaultStatisticalCategoryDataset30.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int36 = defaultStatisticalCategoryDataset30.getColumnCount();
        java.lang.Comparable comparable38 = null;
        java.lang.Number number39 = defaultStatisticalCategoryDataset30.getMeanValue((java.lang.Comparable) 1.0d, comparable38);
        java.util.EventListener eventListener40 = null;
        boolean boolean41 = defaultStatisticalCategoryDataset30.hasListener(eventListener40);
        defaultStatisticalCategoryDataset30.validateObject();
        boolean boolean43 = defaultStatisticalCategoryDataset17.equals((java.lang.Object) defaultStatisticalCategoryDataset30);
        java.lang.Number number46 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultStatisticalCategoryDataset17.getGroup();
        boolean boolean48 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list10 = defaultStatisticalCategoryDataset9.getRowKeys();
        defaultStatisticalCategoryDataset9.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number18 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset9.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup19);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number24 = defaultStatisticalCategoryDataset21.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int26 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) -1);
        double double28 = defaultStatisticalCategoryDataset21.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset21.removeChangeListener(datasetChangeListener29);
        int int32 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list34 = defaultStatisticalCategoryDataset33.getRowKeys();
        defaultStatisticalCategoryDataset33.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int40 = defaultStatisticalCategoryDataset33.getColumnCount();
        java.lang.Number number43 = defaultStatisticalCategoryDataset33.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener44 = null;
        defaultStatisticalCategoryDataset33.addChangeListener(datasetChangeListener44);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset46 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number49 = defaultStatisticalCategoryDataset46.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int51 = defaultStatisticalCategoryDataset46.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int52 = defaultStatisticalCategoryDataset46.getColumnCount();
        java.lang.Comparable comparable54 = null;
        java.lang.Number number55 = defaultStatisticalCategoryDataset46.getMeanValue((java.lang.Comparable) 1.0d, comparable54);
        java.util.EventListener eventListener56 = null;
        boolean boolean57 = defaultStatisticalCategoryDataset46.hasListener(eventListener56);
        defaultStatisticalCategoryDataset46.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup59 = defaultStatisticalCategoryDataset46.getGroup();
        defaultStatisticalCategoryDataset33.setGroup(datasetGroup59);
        defaultStatisticalCategoryDataset21.setGroup(datasetGroup59);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup19", datasetGroup4.equals(datasetGroup19) ? datasetGroup4.hashCode() == datasetGroup19.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        java.lang.Object obj11 = defaultStatisticalCategoryDataset3.clone();
        double double13 = defaultStatisticalCategoryDataset3.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj11", defaultStatisticalCategoryDataset0.equals(obj11) ? defaultStatisticalCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Comparable comparable17 = null;
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue(comparable17, (java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj16", obj7.equals(obj16) ? obj7.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj14", obj7.equals(obj14) ? obj7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list6 = defaultStatisticalCategoryDataset5.getRowKeys();
        double double8 = defaultStatisticalCategoryDataset5.getRangeUpperBound(false);
        double double10 = defaultStatisticalCategoryDataset5.getRangeUpperBound(true);
        int int11 = defaultStatisticalCategoryDataset5.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset5.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup12", datasetGroup4.equals(datasetGroup12) ? datasetGroup4.hashCode() == datasetGroup12.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        java.lang.Object obj25 = defaultStatisticalCategoryDataset12.clone();
        int int27 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj25", defaultStatisticalCategoryDataset18.equals(obj25) ? defaultStatisticalCategoryDataset18.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals(obj16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int24 = defaultStatisticalCategoryDataset18.getRowCount();
        double double26 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        boolean boolean28 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) (short) 10);
        double double30 = defaultStatisticalCategoryDataset18.getRangeLowerBound(false);
        java.lang.Number number33 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number36 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list37 = defaultStatisticalCategoryDataset18.getColumnKeys();
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        java.util.List list39 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int21 = defaultStatisticalCategoryDataset15.getRowCount();
        double double23 = defaultStatisticalCategoryDataset15.getRangeUpperBound(true);
        boolean boolean25 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) (short) 10);
        double double27 = defaultStatisticalCategoryDataset15.getRangeLowerBound(false);
        java.lang.Number number30 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number33 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list34 = defaultStatisticalCategoryDataset15.getColumnKeys();
        int int35 = defaultStatisticalCategoryDataset15.getRowCount();
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset15", obj7.equals(defaultStatisticalCategoryDataset15) ? obj7.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        java.lang.Number number15 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int17 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int19 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset16.getGroup();
        int int22 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.List list23 = defaultStatisticalCategoryDataset16.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset24.addChangeListener(datasetChangeListener25);
        int int27 = defaultStatisticalCategoryDataset24.getColumnCount();
        java.lang.Number number30 = defaultStatisticalCategoryDataset24.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset24.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup36);
        defaultStatisticalCategoryDataset6.setGroup(datasetGroup36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals(obj16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int24 = defaultStatisticalCategoryDataset18.getRowCount();
        double double26 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        boolean boolean28 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) (short) 10);
        double double30 = defaultStatisticalCategoryDataset18.getRangeLowerBound(false);
        java.lang.Number number33 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number36 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list37 = defaultStatisticalCategoryDataset18.getColumnKeys();
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        java.lang.Number number41 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 0.0d);
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj7", defaultStatisticalCategoryDataset0.equals(obj7) ? defaultStatisticalCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset17.getGroup();
        java.lang.Comparable comparable23 = null;
        java.lang.Number number24 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) 1L, comparable23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        java.lang.Object obj25 = defaultStatisticalCategoryDataset12.clone();
        int int27 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj25", defaultStatisticalCategoryDataset18.equals(obj25) ? defaultStatisticalCategoryDataset18.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        double double16 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj14", obj7.equals(obj14) ? obj7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        java.util.List list24 = defaultStatisticalCategoryDataset18.getColumnKeys();
        boolean boolean25 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass10 = datasetGroup9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int22 = defaultStatisticalCategoryDataset16.getRowCount();
        double double24 = defaultStatisticalCategoryDataset16.getRangeUpperBound(true);
        boolean boolean26 = defaultStatisticalCategoryDataset16.equals((java.lang.Object) (short) 10);
        double double28 = defaultStatisticalCategoryDataset16.getRangeLowerBound(false);
        int int30 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list32 = defaultStatisticalCategoryDataset31.getRowKeys();
        defaultStatisticalCategoryDataset31.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int38 = defaultStatisticalCategoryDataset31.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset31.getGroup();
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup39);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj15 and defaultStatisticalCategoryDataset16", obj15.equals(defaultStatisticalCategoryDataset16) ? obj15.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list20 = defaultStatisticalCategoryDataset19.getRowKeys();
        defaultStatisticalCategoryDataset19.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int26 = defaultStatisticalCategoryDataset19.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset19.getGroup();
        int int29 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset19.validateObject();
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset19);
        java.lang.Comparable comparable33 = defaultStatisticalCategoryDataset19.getColumnKey(0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset34.hasListener(eventListener35);
        java.lang.Number number39 = defaultStatisticalCategoryDataset34.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset34.validateObject();
        org.jfree.data.Range range42 = defaultStatisticalCategoryDataset34.getRangeBounds(true);
        int int43 = defaultStatisticalCategoryDataset34.getColumnCount();
        java.lang.Number number46 = defaultStatisticalCategoryDataset34.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int48 = defaultStatisticalCategoryDataset34.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.Range range50 = defaultStatisticalCategoryDataset34.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener51 = null;
        defaultStatisticalCategoryDataset34.addChangeListener(datasetChangeListener51);
        org.jfree.data.general.DatasetGroup datasetGroup53 = defaultStatisticalCategoryDataset34.getGroup();
        defaultStatisticalCategoryDataset19.setGroup(datasetGroup53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset34", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset34) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset34.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int2 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number6 = defaultStatisticalCategoryDataset3.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int8 = defaultStatisticalCategoryDataset3.getColumnIndex((java.lang.Comparable) (short) -1);
        int int10 = defaultStatisticalCategoryDataset3.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int12 = defaultStatisticalCategoryDataset11.getColumnCount();
        int int14 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset3.setGroup(datasetGroup15);
        defaultStatisticalCategoryDataset3.validateObject();
        java.util.List list18 = defaultStatisticalCategoryDataset3.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset3.getValue((java.lang.Comparable) 1, (java.lang.Comparable) '#');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener24);
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and defaultStatisticalCategoryDataset11", defaultStatisticalCategoryDataset3.equals(defaultStatisticalCategoryDataset11) ? defaultStatisticalCategoryDataset3.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        java.lang.Object obj22 = defaultStatisticalCategoryDataset12.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj22", defaultStatisticalCategoryDataset18.equals(obj22) ? defaultStatisticalCategoryDataset18.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
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
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset14", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset14) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        int int15 = defaultStatisticalCategoryDataset0.getRowCount();
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int23 = defaultStatisticalCategoryDataset17.getRowCount();
        double double25 = defaultStatisticalCategoryDataset17.getRangeUpperBound(true);
        boolean boolean27 = defaultStatisticalCategoryDataset17.equals((java.lang.Object) (short) 10);
        double double29 = defaultStatisticalCategoryDataset17.getRangeLowerBound(false);
        java.lang.Number number32 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int33 = defaultStatisticalCategoryDataset17.getRowCount();
        int int35 = defaultStatisticalCategoryDataset17.getRowIndex((java.lang.Comparable) (-1));
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals(obj16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int24 = defaultStatisticalCategoryDataset18.getRowCount();
        double double26 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        boolean boolean28 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) (short) 10);
        double double30 = defaultStatisticalCategoryDataset18.getRangeLowerBound(false);
        java.lang.Number number33 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number36 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list37 = defaultStatisticalCategoryDataset18.getColumnKeys();
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        int int39 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        java.lang.Object obj22 = defaultStatisticalCategoryDataset12.clone();
        java.util.List list23 = defaultStatisticalCategoryDataset12.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj22", defaultStatisticalCategoryDataset18.equals(obj22) ? defaultStatisticalCategoryDataset18.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj16", obj7.equals(obj16) ? obj7.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset0.clone();
        int int17 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj16", obj7.equals(obj16) ? obj7.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        java.lang.Object obj11 = defaultStatisticalCategoryDataset3.clone();
        defaultStatisticalCategoryDataset3.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj11", defaultStatisticalCategoryDataset0.equals(obj11) ? defaultStatisticalCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj10", defaultStatisticalCategoryDataset4.equals(obj10) ? defaultStatisticalCategoryDataset4.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 3, (java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list22 = defaultStatisticalCategoryDataset21.getRowKeys();
        boolean boolean23 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset21.hasListener(eventListener24);
        java.util.List list26 = defaultStatisticalCategoryDataset21.getRowKeys();
        int int27 = defaultStatisticalCategoryDataset21.getColumnCount();
        java.lang.Number number30 = defaultStatisticalCategoryDataset21.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset21.getGroup();
        java.util.List list32 = defaultStatisticalCategoryDataset21.getRowKeys();
        int int33 = defaultStatisticalCategoryDataset21.getColumnCount();
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset15.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset15.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
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
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset14", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset14) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        java.lang.Number number24 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 2);
        defaultStatisticalCategoryDataset0.validateObject();
        int int27 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int29 = defaultStatisticalCategoryDataset28.getColumnCount();
        int int31 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset28.getGroup();
        java.lang.Number number35 = defaultStatisticalCategoryDataset28.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int37 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup38", datasetGroup4.equals(datasetGroup38) ? datasetGroup4.hashCode() == datasetGroup38.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int11 = defaultStatisticalCategoryDataset10.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset10.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int15 = defaultStatisticalCategoryDataset10.getColumnCount();
        defaultStatisticalCategoryDataset10.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number23 = defaultStatisticalCategoryDataset10.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int25 = defaultStatisticalCategoryDataset10.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset10.getGroup();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup26);
        defaultStatisticalCategoryDataset0.add(0.0d, 1.0d, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup26", datasetGroup8.equals(datasetGroup26) ? datasetGroup8.hashCode() == datasetGroup26.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup26);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset28.hasListener(eventListener29);
        defaultStatisticalCategoryDataset28.validateObject();
        java.lang.Number number34 = defaultStatisticalCategoryDataset28.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj35 = defaultStatisticalCategoryDataset28.clone();
        org.jfree.data.Range range37 = defaultStatisticalCategoryDataset28.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultStatisticalCategoryDataset28.addChangeListener(datasetChangeListener38);
        defaultStatisticalCategoryDataset28.validateObject();
        java.lang.Number number43 = defaultStatisticalCategoryDataset28.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double45 = defaultStatisticalCategoryDataset28.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup46 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number10 = defaultStatisticalCategoryDataset7.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int12 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int13 = defaultStatisticalCategoryDataset7.getColumnCount();
        defaultStatisticalCategoryDataset7.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        java.lang.Number number24 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset19.validateObject();
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset19.getRangeBounds(true);
        int int28 = defaultStatisticalCategoryDataset19.getColumnCount();
        java.lang.Number number31 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int33 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list34 = defaultStatisticalCategoryDataset19.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset7.setGroup(datasetGroup35);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup35);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) (byte) -1, (java.lang.Comparable) '4', (java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup35", datasetGroup4.equals(datasetGroup35) ? datasetGroup4.hashCode() == datasetGroup35.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list24 = defaultStatisticalCategoryDataset23.getRowKeys();
        boolean boolean25 = defaultStatisticalCategoryDataset17.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset23.hasListener(eventListener26);
        java.util.List list28 = defaultStatisticalCategoryDataset23.getRowKeys();
        int int29 = defaultStatisticalCategoryDataset23.getColumnCount();
        java.lang.Number number32 = defaultStatisticalCategoryDataset23.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        defaultStatisticalCategoryDataset13.validateObject();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset13.hasListener(eventListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener21);
        int int24 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) (-1));
        int int26 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) 1.0f);
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset13", obj6.equals(defaultStatisticalCategoryDataset13) ? obj6.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 100);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset10.addChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        boolean boolean16 = defaultStatisticalCategoryDataset10.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        int int18 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset10 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset10.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset10.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int15 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int17 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset14.getGroup();
        java.util.List list19 = defaultStatisticalCategoryDataset14.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset14.getRowCount();
        java.lang.Object obj21 = defaultStatisticalCategoryDataset14.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener22);
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener25);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number30 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int32 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int33 = defaultStatisticalCategoryDataset27.getColumnCount();
        java.lang.Comparable comparable35 = null;
        java.lang.Number number36 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) 1.0d, comparable35);
        int int38 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset39 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list40 = defaultStatisticalCategoryDataset39.getRowKeys();
        defaultStatisticalCategoryDataset39.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int46 = defaultStatisticalCategoryDataset39.getColumnCount();
        java.lang.Number number49 = defaultStatisticalCategoryDataset39.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset39.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener55 = null;
        boolean boolean56 = defaultStatisticalCategoryDataset39.hasListener(eventListener55);
        org.jfree.data.general.DatasetGroup datasetGroup57 = defaultStatisticalCategoryDataset39.getGroup();
        defaultStatisticalCategoryDataset27.setGroup(datasetGroup57);
        defaultStatisticalCategoryDataset14.setGroup(datasetGroup57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj21 and defaultStatisticalCategoryDataset27", obj21.equals(defaultStatisticalCategoryDataset27) ? obj21.hashCode() == defaultStatisticalCategoryDataset27.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset12.hasListener(eventListener28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener30);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener33 = null;
        boolean boolean34 = defaultStatisticalCategoryDataset32.hasListener(eventListener33);
        java.lang.Number number37 = defaultStatisticalCategoryDataset32.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset32.validateObject();
        org.jfree.data.Range range40 = defaultStatisticalCategoryDataset32.getRangeBounds(true);
        int int41 = defaultStatisticalCategoryDataset32.getColumnCount();
        java.lang.Number number44 = defaultStatisticalCategoryDataset32.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        double double46 = defaultStatisticalCategoryDataset32.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset47 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number50 = defaultStatisticalCategoryDataset47.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultStatisticalCategoryDataset47.getGroup();
        defaultStatisticalCategoryDataset32.setGroup(datasetGroup51);
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset32", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset32) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset32.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset17.validateObject();
        org.jfree.data.Range range25 = defaultStatisticalCategoryDataset17.getRangeBounds(true);
        int int26 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.lang.Number number29 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset17.getGroup();
        java.lang.Object obj31 = defaultStatisticalCategoryDataset17.clone();
        int int33 = defaultStatisticalCategoryDataset17.getRowIndex((java.lang.Comparable) 0L);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup10 and datasetGroup33", datasetGroup10.equals(datasetGroup33) ? datasetGroup10.hashCode() == datasetGroup33.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) (short) 0, (java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) ' ', (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1L));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset17.getGroup();
        java.util.List list22 = defaultStatisticalCategoryDataset17.getColumnKeys();
        int int23 = defaultStatisticalCategoryDataset17.getRowCount();
        java.lang.Object obj24 = defaultStatisticalCategoryDataset17.clone();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset17.getGroup();
        java.util.List list26 = defaultStatisticalCategoryDataset17.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener27);
        java.lang.Number number31 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup11 and datasetGroup32", datasetGroup11.equals(datasetGroup32) ? datasetGroup11.hashCode() == datasetGroup32.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number20 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double22 = defaultStatisticalCategoryDataset17.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int24 = defaultStatisticalCategoryDataset23.getColumnCount();
        int int26 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset17.setGroup(datasetGroup27);
        int int30 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset17.add(1.0d, (double) 10.0f, (java.lang.Comparable) 2, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset17.getGroup();
        boolean boolean37 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) defaultStatisticalCategoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        java.lang.Object obj22 = defaultStatisticalCategoryDataset12.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset23.addChangeListener(datasetChangeListener24);
        int int26 = defaultStatisticalCategoryDataset23.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset23.getColumnCount();
        java.util.List list28 = defaultStatisticalCategoryDataset23.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj22", defaultStatisticalCategoryDataset18.equals(obj22) ? defaultStatisticalCategoryDataset18.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.util.List list17 = defaultStatisticalCategoryDataset13.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        defaultStatisticalCategoryDataset18.validateObject();
        java.util.List list22 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset18.removeChangeListener(datasetChangeListener23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup25);
        java.util.List list27 = defaultStatisticalCategoryDataset13.getRowKeys();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener20);
        boolean boolean22 = defaultStatisticalCategoryDataset16.equals((java.lang.Object) defaultStatisticalCategoryDataset19);
        java.lang.Number number25 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset19.hasListener(eventListener26);
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset19.hasListener(eventListener28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener30);
        boolean boolean32 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and defaultStatisticalCategoryDataset16", obj13.equals(defaultStatisticalCategoryDataset16) ? obj13.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset24.hasListener(eventListener25);
        defaultStatisticalCategoryDataset24.validateObject();
        double double29 = defaultStatisticalCategoryDataset24.getRangeLowerBound(true);
        int int31 = defaultStatisticalCategoryDataset24.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset24", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset24) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 'a', (double) (byte) 100, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 0.0f);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        defaultStatisticalCategoryDataset13.validateObject();
        java.lang.Number number19 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset13.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        java.lang.Number number30 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list32 = defaultStatisticalCategoryDataset31.getRowKeys();
        boolean boolean33 = defaultStatisticalCategoryDataset25.equals((java.lang.Object) defaultStatisticalCategoryDataset31);
        boolean boolean34 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultStatisticalCategoryDataset25.addChangeListener(datasetChangeListener35);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset25.removeChangeListener(datasetChangeListener37);
        int int40 = defaultStatisticalCategoryDataset25.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset25 and defaultStatisticalCategoryDataset31", defaultStatisticalCategoryDataset25.equals(defaultStatisticalCategoryDataset31) ? defaultStatisticalCategoryDataset25.hashCode() == defaultStatisticalCategoryDataset31.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) Double.NaN);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener18);
        boolean boolean20 = defaultStatisticalCategoryDataset14.equals((java.lang.Object) defaultStatisticalCategoryDataset17);
        int int22 = defaultStatisticalCategoryDataset17.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset17.getGroup();
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset14", obj6.equals(defaultStatisticalCategoryDataset14) ? obj6.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        java.util.List list27 = defaultStatisticalCategoryDataset13.getColumnKeys();
        java.lang.Object obj28 = defaultStatisticalCategoryDataset13.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj28", defaultStatisticalCategoryDataset0.equals(obj28) ? defaultStatisticalCategoryDataset0.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        defaultStatisticalCategoryDataset0.add((double) 'a', (double) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Comparable comparable20 = null;
        defaultStatisticalCategoryDataset0.add((double) '#', (double) 1L, comparable20, (java.lang.Comparable) (short) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener23);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset25.addChangeListener(datasetChangeListener26);
        int int28 = defaultStatisticalCategoryDataset25.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int30 = defaultStatisticalCategoryDataset29.getColumnCount();
        int int32 = defaultStatisticalCategoryDataset29.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset29.getGroup();
        java.util.List list34 = defaultStatisticalCategoryDataset29.getColumnKeys();
        boolean boolean35 = defaultStatisticalCategoryDataset25.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and defaultStatisticalCategoryDataset25", defaultStatisticalCategoryDataset7.equals(defaultStatisticalCategoryDataset25) ? defaultStatisticalCategoryDataset7.hashCode() == defaultStatisticalCategoryDataset25.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset12.validateObject();
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        int int21 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number24 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int26 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list27 = defaultStatisticalCategoryDataset12.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number33 = defaultStatisticalCategoryDataset30.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double35 = defaultStatisticalCategoryDataset30.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset36 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int37 = defaultStatisticalCategoryDataset36.getColumnCount();
        int int39 = defaultStatisticalCategoryDataset36.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset36.getGroup();
        defaultStatisticalCategoryDataset30.setGroup(datasetGroup40);
        int int43 = defaultStatisticalCategoryDataset30.getColumnIndex((java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset30.add(1.0d, (double) 10.0f, (java.lang.Comparable) 2, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup49 = defaultStatisticalCategoryDataset30.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset36", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset36) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset36.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        int int13 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) '#');
        int int14 = defaultStatisticalCategoryDataset3.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset15.validateObject();
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset15.getRangeBounds(true);
        int int25 = defaultStatisticalCategoryDataset15.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean26 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) int25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.util.List list15 = defaultStatisticalCategoryDataset12.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        int int19 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.util.List list20 = defaultStatisticalCategoryDataset16.getColumnKeys();
        java.lang.Number number23 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int25 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean26 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        int int27 = defaultStatisticalCategoryDataset12.getRowCount();
        int int28 = defaultStatisticalCategoryDataset12.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.util.List list17 = defaultStatisticalCategoryDataset13.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        defaultStatisticalCategoryDataset18.validateObject();
        java.util.List list22 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset18.removeChangeListener(datasetChangeListener23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup25);
        java.util.List list27 = defaultStatisticalCategoryDataset13.getRowKeys();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        double double30 = defaultStatisticalCategoryDataset13.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        java.util.List list27 = defaultStatisticalCategoryDataset13.getColumnKeys();
        java.lang.Object obj28 = defaultStatisticalCategoryDataset13.clone();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset13.hasListener(eventListener29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj28", defaultStatisticalCategoryDataset0.equals(obj28) ? defaultStatisticalCategoryDataset0.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable20 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, comparable20);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 100, (java.lang.Comparable) 100, (java.lang.Comparable) (-1L));
        int int32 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list34 = defaultStatisticalCategoryDataset33.getRowKeys();
        defaultStatisticalCategoryDataset33.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int40 = defaultStatisticalCategoryDataset33.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset33.getGroup();
        int int43 = defaultStatisticalCategoryDataset33.getRowIndex((java.lang.Comparable) (short) 0);
        int int44 = defaultStatisticalCategoryDataset33.getColumnCount();
        java.lang.Class<?> wildcardClass45 = defaultStatisticalCategoryDataset33.getClass();
        boolean boolean46 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) wildcardClass45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup18 and datasetGroup41", datasetGroup18.equals(datasetGroup41) ? datasetGroup18.hashCode() == datasetGroup41.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 'a');
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener23);
        int int25 = defaultStatisticalCategoryDataset22.getColumnCount();
        java.util.List list26 = defaultStatisticalCategoryDataset22.getColumnKeys();
        java.lang.Number number29 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int31 = defaultStatisticalCategoryDataset22.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list32 = defaultStatisticalCategoryDataset22.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultStatisticalCategoryDataset33.addChangeListener(datasetChangeListener34);
        int int36 = defaultStatisticalCategoryDataset33.getColumnCount();
        java.util.List list37 = defaultStatisticalCategoryDataset33.getColumnKeys();
        java.lang.Number number40 = defaultStatisticalCategoryDataset33.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int42 = defaultStatisticalCategoryDataset33.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list43 = defaultStatisticalCategoryDataset33.getColumnKeys();
        boolean boolean44 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset33);
        int int45 = defaultStatisticalCategoryDataset33.getColumnCount();
        boolean boolean46 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultStatisticalCategoryDataset0.add((double) 1.0f, (double) (byte) 10, (java.lang.Comparable) 10, (java.lang.Comparable) 0.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list13 = defaultStatisticalCategoryDataset12.getRowKeys();
        defaultStatisticalCategoryDataset12.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int19 = defaultStatisticalCategoryDataset12.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset12.getGroup();
        int int22 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number number25 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) "");
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup20", datasetGroup4.equals(datasetGroup20) ? datasetGroup4.hashCode() == datasetGroup20.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int15 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int17 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset14.getGroup();
        java.util.List list19 = defaultStatisticalCategoryDataset14.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset14.getRowCount();
        java.lang.Object obj21 = defaultStatisticalCategoryDataset14.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener22);
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        java.lang.Object obj25 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and obj21", defaultStatisticalCategoryDataset14.equals(obj21) ? defaultStatisticalCategoryDataset14.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list18 = defaultStatisticalCategoryDataset17.getRowKeys();
        double double20 = defaultStatisticalCategoryDataset17.getRangeUpperBound(false);
        double double22 = defaultStatisticalCategoryDataset17.getRangeUpperBound(true);
        java.lang.Object obj23 = defaultStatisticalCategoryDataset17.clone();
        double double25 = defaultStatisticalCategoryDataset17.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset17 and obj23", defaultStatisticalCategoryDataset17.equals(obj23) ? defaultStatisticalCategoryDataset17.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) '4', (java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset17.getGroup();
        java.util.List list22 = defaultStatisticalCategoryDataset17.getColumnKeys();
        boolean boolean23 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) defaultStatisticalCategoryDataset17);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup21", datasetGroup4.equals(datasetGroup21) ? datasetGroup4.hashCode() == datasetGroup21.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        java.lang.Number number17 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0.0f);
        int int19 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener21);
        int int23 = defaultStatisticalCategoryDataset20.getColumnCount();
        java.util.List list24 = defaultStatisticalCategoryDataset20.getColumnKeys();
        java.lang.Number number27 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset20.getGroup();
        int int29 = defaultStatisticalCategoryDataset20.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset20.getGroup();
        int int31 = defaultStatisticalCategoryDataset20.getRowCount();
        boolean boolean32 = defaultStatisticalCategoryDataset4.equals((java.lang.Object) int31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        double double9 = defaultStatisticalCategoryDataset6.getRangeUpperBound(false);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset6.hasListener(eventListener10);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset6.hasListener(eventListener12);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) eventListener12);
        java.lang.Object obj15 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list16 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj15", defaultStatisticalCategoryDataset6.equals(obj15) ? defaultStatisticalCategoryDataset6.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener18);
        int int20 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int21 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.util.List list22 = defaultStatisticalCategoryDataset17.getColumnKeys();
        java.lang.Object obj23 = defaultStatisticalCategoryDataset17.clone();
        java.lang.Number number26 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset17 and obj23", defaultStatisticalCategoryDataset17.equals(obj23) ? defaultStatisticalCategoryDataset17.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.Range range12 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double18 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        int int22 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup23);
        java.util.List list25 = defaultStatisticalCategoryDataset13.getColumnKeys();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int28 = defaultStatisticalCategoryDataset27.getColumnCount();
        int int30 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset27.getGroup();
        java.util.List list32 = defaultStatisticalCategoryDataset27.getColumnKeys();
        int int33 = defaultStatisticalCategoryDataset27.getRowCount();
        java.lang.Object obj34 = defaultStatisticalCategoryDataset27.clone();
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset27.getGroup();
        java.util.List list36 = defaultStatisticalCategoryDataset27.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset27.addChangeListener(datasetChangeListener37);
        java.lang.Number number41 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup42 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        int int11 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset4.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset4.addChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        defaultStatisticalCategoryDataset17.validateObject();
        java.lang.Number number23 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset17.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset29.hasListener(eventListener30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset35 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list36 = defaultStatisticalCategoryDataset35.getRowKeys();
        boolean boolean37 = defaultStatisticalCategoryDataset29.equals((java.lang.Object) defaultStatisticalCategoryDataset35);
        boolean boolean38 = defaultStatisticalCategoryDataset17.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultStatisticalCategoryDataset29.addChangeListener(datasetChangeListener39);
        defaultStatisticalCategoryDataset29.validateObject();
        org.jfree.data.Range range43 = defaultStatisticalCategoryDataset29.getRangeBounds(true);
        defaultStatisticalCategoryDataset29.add((java.lang.Number) (short) 10, (java.lang.Number) 10, (java.lang.Comparable) (-1), (java.lang.Comparable) (-1.0d));
        boolean boolean49 = defaultStatisticalCategoryDataset4.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset35", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset35) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset35.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset8.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        defaultStatisticalCategoryDataset22.validateObject();
        java.lang.Number number28 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset22.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number33 = defaultStatisticalCategoryDataset30.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int35 = defaultStatisticalCategoryDataset30.getColumnIndex((java.lang.Comparable) (short) -1);
        int int37 = defaultStatisticalCategoryDataset30.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultStatisticalCategoryDataset30.removeChangeListener(datasetChangeListener38);
        boolean boolean40 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset30);
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset30.getGroup();
        defaultStatisticalCategoryDataset30.validateObject();
        defaultStatisticalCategoryDataset30.add((java.lang.Number) 0.0f, (java.lang.Number) 2, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 0);
        java.lang.Number number50 = defaultStatisticalCategoryDataset30.getStdDevValue((java.lang.Comparable) 97.0d, (java.lang.Comparable) 100L);
        boolean boolean51 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) 97.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj4 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        java.util.List list27 = defaultStatisticalCategoryDataset13.getColumnKeys();
        java.lang.Object obj28 = defaultStatisticalCategoryDataset13.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset13.removeChangeListener(datasetChangeListener29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj28", defaultStatisticalCategoryDataset0.equals(obj28) ? defaultStatisticalCategoryDataset0.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) true);
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int19 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number23 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double25 = defaultStatisticalCategoryDataset20.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int27 = defaultStatisticalCategoryDataset26.getColumnCount();
        int int29 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset26.getGroup();
        defaultStatisticalCategoryDataset20.setGroup(datasetGroup30);
        int int33 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset20.add(1.0d, (double) 10.0f, (java.lang.Comparable) 2, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup12 and datasetGroup39", datasetGroup12.equals(datasetGroup39) ? datasetGroup12.hashCode() == datasetGroup39.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        int int16 = defaultStatisticalCategoryDataset7.getRowIndex((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.Range range4 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 2, (java.lang.Comparable) true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset10.addChangeListener(datasetChangeListener11);
        int int13 = defaultStatisticalCategoryDataset10.getColumnCount();
        int int14 = defaultStatisticalCategoryDataset10.getColumnCount();
        java.util.List list15 = defaultStatisticalCategoryDataset10.getColumnKeys();
        java.lang.Object obj16 = defaultStatisticalCategoryDataset10.clone();
        java.lang.Number number19 = defaultStatisticalCategoryDataset10.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset10.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset10 and obj16", defaultStatisticalCategoryDataset10.equals(obj16) ? defaultStatisticalCategoryDataset10.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        java.lang.Class<?> wildcardClass20 = datasetGroup19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1L, (java.lang.Number) (-1L), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 10.0f);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.hasListener(eventListener12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list21 = defaultStatisticalCategoryDataset20.getRowKeys();
        boolean boolean22 = defaultStatisticalCategoryDataset14.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        int int23 = defaultStatisticalCategoryDataset20.getColumnCount();
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset0.hasListener(eventListener25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset14.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset14.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener13);
        int int15 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.util.List list16 = defaultStatisticalCategoryDataset12.getColumnKeys();
        java.lang.Number number19 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int21 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 10.0d);
        defaultStatisticalCategoryDataset12.add((double) (short) -1, (double) 10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 'a');
        java.lang.Object obj27 = defaultStatisticalCategoryDataset12.clone();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals(obj27);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and obj27", defaultStatisticalCategoryDataset12.equals(obj27) ? defaultStatisticalCategoryDataset12.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener13);
        int int15 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.util.List list16 = defaultStatisticalCategoryDataset12.getColumnKeys();
        java.lang.Number number19 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int21 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 10.0d);
        defaultStatisticalCategoryDataset12.add((double) (short) -1, (double) 10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 'a');
        java.lang.Object obj27 = defaultStatisticalCategoryDataset12.clone();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals(obj27);
        java.lang.Number number31 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and obj27", defaultStatisticalCategoryDataset12.equals(obj27) ? defaultStatisticalCategoryDataset12.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        int int15 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.util.List list16 = defaultStatisticalCategoryDataset11.getColumnKeys();
        java.lang.Object obj17 = defaultStatisticalCategoryDataset11.clone();
        java.lang.Object obj18 = defaultStatisticalCategoryDataset11.clone();
        boolean boolean19 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj17 and obj18", obj17.equals(obj18) ? obj17.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        defaultStatisticalCategoryDataset15.validateObject();
        java.lang.Number number21 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset15.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset27.hasListener(eventListener28);
        java.lang.Number number32 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list34 = defaultStatisticalCategoryDataset33.getRowKeys();
        boolean boolean35 = defaultStatisticalCategoryDataset27.equals((java.lang.Object) defaultStatisticalCategoryDataset33);
        boolean boolean36 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) defaultStatisticalCategoryDataset27);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset27.addChangeListener(datasetChangeListener37);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultStatisticalCategoryDataset27.removeChangeListener(datasetChangeListener39);
        int int42 = defaultStatisticalCategoryDataset27.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset27", obj7.equals(defaultStatisticalCategoryDataset27) ? obj7.hashCode() == defaultStatisticalCategoryDataset27.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        defaultStatisticalCategoryDataset6.validateObject();
        int int16 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int18 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset6.getGroup();
        java.lang.Class<?> wildcardClass20 = datasetGroup19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset6", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset6) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number19 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double21 = defaultStatisticalCategoryDataset16.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup26);
        java.lang.Number number29 = null;
        defaultStatisticalCategoryDataset16.add((java.lang.Number) Double.NaN, number29, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        int int33 = defaultStatisticalCategoryDataset16.getColumnCount();
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset22", obj7.equals(defaultStatisticalCategoryDataset22) ? obj7.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset9.validateObject();
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset9.getRangeBounds(true);
        int int19 = defaultStatisticalCategoryDataset9.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset9.removeChangeListener(datasetChangeListener20);
        java.lang.Object obj22 = defaultStatisticalCategoryDataset9.clone();
        java.lang.Class<?> wildcardClass23 = defaultStatisticalCategoryDataset9.getClass();
        boolean boolean24 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) defaultStatisticalCategoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj22", defaultStatisticalCategoryDataset0.equals(obj22) ? defaultStatisticalCategoryDataset0.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
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
        int int12 = defaultStatisticalCategoryDataset3.getColumnCount();
        java.lang.Object obj13 = defaultStatisticalCategoryDataset3.clone();
        double double15 = defaultStatisticalCategoryDataset3.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj13", defaultStatisticalCategoryDataset0.equals(obj13) ? defaultStatisticalCategoryDataset0.hashCode() == obj13.hashCode() : true);
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
        java.lang.Number number9 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset3.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list12 = defaultStatisticalCategoryDataset11.getRowKeys();
        defaultStatisticalCategoryDataset11.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int18 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset11.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset11.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset11.hasListener(eventListener27);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset3.setGroup(datasetGroup29);
        double double32 = defaultStatisticalCategoryDataset3.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup10 and datasetGroup29", datasetGroup10.equals(datasetGroup29) ? datasetGroup10.hashCode() == datasetGroup29.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number24 = defaultStatisticalCategoryDataset21.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double26 = defaultStatisticalCategoryDataset21.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int28 = defaultStatisticalCategoryDataset27.getColumnCount();
        int int30 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset21.setGroup(datasetGroup31);
        java.lang.Number number34 = null;
        defaultStatisticalCategoryDataset21.add((java.lang.Number) Double.NaN, number34, (java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        java.lang.Number number40 = defaultStatisticalCategoryDataset21.getMeanValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) '#');
        boolean boolean41 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset27", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset27) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset27.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 10);
        java.lang.Class<?> wildcardClass22 = defaultStatisticalCategoryDataset15.getClass();
        boolean boolean23 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        int int24 = defaultStatisticalCategoryDataset15.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj14", defaultStatisticalCategoryDataset0.equals(obj14) ? defaultStatisticalCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj10", defaultStatisticalCategoryDataset4.equals(obj10) ? defaultStatisticalCategoryDataset4.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0L, (java.lang.Number) (short) 1, (java.lang.Comparable) 10L, (java.lang.Comparable) (short) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number15 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double17 = defaultStatisticalCategoryDataset12.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int19 = defaultStatisticalCategoryDataset18.getColumnCount();
        int int21 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup22);
        java.util.List list24 = defaultStatisticalCategoryDataset12.getRowKeys();
        java.util.List list25 = defaultStatisticalCategoryDataset12.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        java.lang.Number number26 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (byte) 1);
        int int28 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list29 = defaultStatisticalCategoryDataset12.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener31 = null;
        boolean boolean32 = defaultStatisticalCategoryDataset30.hasListener(eventListener31);
        java.lang.Number number35 = defaultStatisticalCategoryDataset30.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int36 = defaultStatisticalCategoryDataset30.getRowCount();
        double double38 = defaultStatisticalCategoryDataset30.getRangeUpperBound(true);
        java.util.List list39 = defaultStatisticalCategoryDataset30.getRowKeys();
        java.lang.Number number42 = defaultStatisticalCategoryDataset30.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener43 = null;
        defaultStatisticalCategoryDataset30.removeChangeListener(datasetChangeListener43);
        java.lang.Number number47 = defaultStatisticalCategoryDataset30.getValue((java.lang.Comparable) 4, (java.lang.Comparable) (short) 1);
        boolean boolean48 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset30);
        java.lang.Number number51 = defaultStatisticalCategoryDataset30.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset21.addChangeListener(datasetChangeListener22);
        int int24 = defaultStatisticalCategoryDataset21.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset21.getColumnCount();
        java.util.List list26 = defaultStatisticalCategoryDataset21.getColumnKeys();
        java.lang.Object obj27 = defaultStatisticalCategoryDataset21.clone();
        java.lang.Number number30 = defaultStatisticalCategoryDataset21.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int31 = defaultStatisticalCategoryDataset21.getColumnCount();
        java.lang.Number number34 = defaultStatisticalCategoryDataset21.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset21.validateObject();
        java.util.List list36 = defaultStatisticalCategoryDataset21.getColumnKeys();
        java.util.List list37 = defaultStatisticalCategoryDataset21.getColumnKeys();
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number14 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int16 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) -1);
        int int18 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        int int22 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset11.setGroup(datasetGroup23);
        int int26 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) 0);
        java.util.List list27 = defaultStatisticalCategoryDataset11.getRowKeys();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset11", obj7.equals(defaultStatisticalCategoryDataset11) ? obj7.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int23 = defaultStatisticalCategoryDataset17.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset17.removeChangeListener(datasetChangeListener24);
        java.lang.Number number28 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int30 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.Range range32 = defaultStatisticalCategoryDataset17.getRangeBounds(true);
        int int34 = defaultStatisticalCategoryDataset17.getRowIndex((java.lang.Comparable) (short) 100);
        boolean boolean35 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj4 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset6.hasListener(eventListener7);
        defaultStatisticalCategoryDataset6.validateObject();
        java.lang.Number number12 = defaultStatisticalCategoryDataset6.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset6.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset6.validateObject();
        boolean boolean19 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int18 = defaultStatisticalCategoryDataset12.getRowCount();
        double double20 = defaultStatisticalCategoryDataset12.getRangeUpperBound(true);
        boolean boolean22 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) (short) 10);
        double double24 = defaultStatisticalCategoryDataset12.getRangeLowerBound(false);
        java.lang.Number number27 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number30 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list31 = defaultStatisticalCategoryDataset12.getColumnKeys();
        boolean boolean32 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) list31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset12", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset12) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        java.util.List list19 = defaultStatisticalCategoryDataset16.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener21);
        int int23 = defaultStatisticalCategoryDataset20.getColumnCount();
        java.util.List list24 = defaultStatisticalCategoryDataset20.getColumnKeys();
        java.lang.Number number27 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int29 = defaultStatisticalCategoryDataset20.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean30 = defaultStatisticalCategoryDataset16.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        int int31 = defaultStatisticalCategoryDataset16.getRowCount();
        int int32 = defaultStatisticalCategoryDataset16.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset16.getGroup();
        int int34 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.lang.Object obj35 = defaultStatisticalCategoryDataset16.clone();
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals(obj35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset16 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset16.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset16.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        double double11 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        defaultStatisticalCategoryDataset12.validateObject();
        java.lang.Number number18 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset12.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset24.hasListener(eventListener25);
        java.lang.Number number29 = defaultStatisticalCategoryDataset24.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list31 = defaultStatisticalCategoryDataset30.getRowKeys();
        boolean boolean32 = defaultStatisticalCategoryDataset24.equals((java.lang.Object) defaultStatisticalCategoryDataset30);
        boolean boolean33 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultStatisticalCategoryDataset24.addChangeListener(datasetChangeListener34);
        int int36 = defaultStatisticalCategoryDataset24.getColumnCount();
        int int37 = defaultStatisticalCategoryDataset24.getRowCount();
        java.lang.Number number40 = defaultStatisticalCategoryDataset24.getStdDevValue((java.lang.Comparable) 1L, (java.lang.Comparable) 1L);
        boolean boolean41 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) number40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset24 and defaultStatisticalCategoryDataset30", defaultStatisticalCategoryDataset24.equals(defaultStatisticalCategoryDataset30) ? defaultStatisticalCategoryDataset24.hashCode() == defaultStatisticalCategoryDataset30.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        defaultStatisticalCategoryDataset9.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset9.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset9.clone();
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset9.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset9.addChangeListener(datasetChangeListener19);
        defaultStatisticalCategoryDataset9.validateObject();
        java.lang.Number number24 = defaultStatisticalCategoryDataset9.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double26 = defaultStatisticalCategoryDataset9.getRangeUpperBound(true);
        int int27 = defaultStatisticalCategoryDataset9.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset9.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset9 and obj16", defaultStatisticalCategoryDataset9.equals(obj16) ? defaultStatisticalCategoryDataset9.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset2 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number5 = defaultStatisticalCategoryDataset2.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double7 = defaultStatisticalCategoryDataset2.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset2.setGroup(datasetGroup12);
        int int15 = defaultStatisticalCategoryDataset2.getColumnIndex((java.lang.Comparable) '#');
        int int16 = defaultStatisticalCategoryDataset2.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset2.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset2 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset2.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset2.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass15 = datasetGroup14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset6", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset6) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.Range range12 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double18 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        int int22 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup23);
        java.util.List list25 = defaultStatisticalCategoryDataset13.getColumnKeys();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        java.lang.Object obj27 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        java.lang.Number number15 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        double double17 = defaultStatisticalCategoryDataset6.getRangeUpperBound(false);
        java.lang.Object obj18 = defaultStatisticalCategoryDataset6.clone();
        int int20 = defaultStatisticalCategoryDataset6.getRowIndex((java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj18", defaultStatisticalCategoryDataset0.equals(obj18) ? defaultStatisticalCategoryDataset0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        java.lang.Class<?> wildcardClass15 = defaultStatisticalCategoryDataset7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        java.util.List list13 = defaultStatisticalCategoryDataset8.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset8.getRowCount();
        java.lang.Object obj15 = defaultStatisticalCategoryDataset8.clone();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset8.getGroup();
        java.util.List list17 = defaultStatisticalCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener18);
        double double21 = defaultStatisticalCategoryDataset8.getRangeLowerBound(false);
        boolean boolean22 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) double21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup6 and datasetGroup12", datasetGroup6.equals(datasetGroup12) ? datasetGroup6.hashCode() == datasetGroup12.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1L));
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener19);
        boolean boolean21 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        int int23 = defaultStatisticalCategoryDataset18.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset18.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset15.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset15.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        java.lang.Number number26 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (byte) 1);
        int int28 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list29 = defaultStatisticalCategoryDataset12.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number33 = defaultStatisticalCategoryDataset30.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double35 = defaultStatisticalCategoryDataset30.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset36 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int37 = defaultStatisticalCategoryDataset36.getColumnCount();
        int int39 = defaultStatisticalCategoryDataset36.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset36.getGroup();
        defaultStatisticalCategoryDataset30.setGroup(datasetGroup40);
        java.util.List list42 = defaultStatisticalCategoryDataset30.getColumnKeys();
        int int44 = defaultStatisticalCategoryDataset30.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset45 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list46 = defaultStatisticalCategoryDataset45.getRowKeys();
        defaultStatisticalCategoryDataset45.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int52 = defaultStatisticalCategoryDataset45.getColumnCount();
        java.lang.Number number55 = defaultStatisticalCategoryDataset45.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset45.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener61 = null;
        boolean boolean62 = defaultStatisticalCategoryDataset45.hasListener(eventListener61);
        org.jfree.data.general.DatasetGroup datasetGroup63 = defaultStatisticalCategoryDataset45.getGroup();
        defaultStatisticalCategoryDataset30.setGroup(datasetGroup63);
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset30", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset30) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset30.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list19 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset0.getRowCount();
        int int22 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        int int23 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset24.getGroup();
        java.lang.Comparable comparable30 = null;
        java.lang.Number number31 = defaultStatisticalCategoryDataset24.getMeanValue((java.lang.Comparable) 1L, comparable30);
        defaultStatisticalCategoryDataset24.add((double) ' ', (double) 100L, (java.lang.Comparable) 1L, (java.lang.Comparable) 'a');
        int int38 = defaultStatisticalCategoryDataset24.getRowIndex((java.lang.Comparable) 'a');
        java.util.List list39 = defaultStatisticalCategoryDataset24.getRowKeys();
        boolean boolean40 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list39);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset41 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number44 = defaultStatisticalCategoryDataset41.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int46 = defaultStatisticalCategoryDataset41.getColumnIndex((java.lang.Comparable) (short) -1);
        int int48 = defaultStatisticalCategoryDataset41.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset49 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int50 = defaultStatisticalCategoryDataset49.getColumnCount();
        int int52 = defaultStatisticalCategoryDataset49.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup53 = defaultStatisticalCategoryDataset49.getGroup();
        defaultStatisticalCategoryDataset41.setGroup(datasetGroup53);
        defaultStatisticalCategoryDataset41.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup56 = defaultStatisticalCategoryDataset41.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup28 and datasetGroup56", datasetGroup28.equals(datasetGroup56) ? datasetGroup28.hashCode() == datasetGroup56.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable13 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) 10, comparable13, (java.lang.Comparable) '#');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        int int19 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.util.List list21 = defaultStatisticalCategoryDataset16.getColumnKeys();
        java.lang.Object obj22 = defaultStatisticalCategoryDataset16.clone();
        java.lang.Number number25 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset16 and obj22", defaultStatisticalCategoryDataset16.equals(obj22) ? defaultStatisticalCategoryDataset16.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
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
        java.lang.Number number29 = defaultStatisticalCategoryDataset20.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset14.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset14.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range5 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset6.hasListener(eventListener7);
        defaultStatisticalCategoryDataset6.validateObject();
        java.lang.Number number12 = defaultStatisticalCategoryDataset6.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset6.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list25 = defaultStatisticalCategoryDataset24.getRowKeys();
        boolean boolean26 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        boolean boolean27 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener28);
        java.lang.Number number32 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (byte) 1);
        int int34 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset24", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset24) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        double double15 = defaultStatisticalCategoryDataset6.getRangeUpperBound(true);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset6.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) (-1.0d));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset21.hasListener(eventListener22);
        java.lang.Number number26 = defaultStatisticalCategoryDataset21.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int27 = defaultStatisticalCategoryDataset21.getRowCount();
        double double29 = defaultStatisticalCategoryDataset21.getRangeUpperBound(true);
        java.util.List list30 = defaultStatisticalCategoryDataset21.getRowKeys();
        java.lang.Number number33 = defaultStatisticalCategoryDataset21.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.lang.Comparable comparable35 = null;
        java.lang.Number number36 = defaultStatisticalCategoryDataset21.getStdDevValue((java.lang.Comparable) 1.0d, comparable35);
        int int37 = defaultStatisticalCategoryDataset21.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset38 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = defaultStatisticalCategoryDataset38.hasListener(eventListener39);
        defaultStatisticalCategoryDataset38.validateObject();
        java.util.List list42 = defaultStatisticalCategoryDataset38.getRowKeys();
        int int44 = defaultStatisticalCategoryDataset38.getRowIndex((java.lang.Comparable) (short) 0);
        double double46 = defaultStatisticalCategoryDataset38.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset38.add((java.lang.Number) (short) 100, (java.lang.Number) Double.NaN, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 97.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset52 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener53 = null;
        boolean boolean54 = defaultStatisticalCategoryDataset52.hasListener(eventListener53);
        java.lang.Number number57 = defaultStatisticalCategoryDataset52.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int58 = defaultStatisticalCategoryDataset52.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener59 = null;
        defaultStatisticalCategoryDataset52.removeChangeListener(datasetChangeListener59);
        java.lang.Number number63 = defaultStatisticalCategoryDataset52.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int65 = defaultStatisticalCategoryDataset52.getColumnIndex((java.lang.Comparable) 1.0f);
        double double67 = defaultStatisticalCategoryDataset52.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup68 = defaultStatisticalCategoryDataset52.getGroup();
        defaultStatisticalCategoryDataset38.setGroup(datasetGroup68);
        defaultStatisticalCategoryDataset21.setGroup(datasetGroup68);
        defaultStatisticalCategoryDataset6.setGroup(datasetGroup68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        java.util.List list18 = defaultStatisticalCategoryDataset13.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset13.getRowCount();
        java.lang.Object obj20 = defaultStatisticalCategoryDataset13.clone();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset13.getGroup();
        java.util.List list22 = defaultStatisticalCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and obj20", defaultStatisticalCategoryDataset13.equals(obj20) ? defaultStatisticalCategoryDataset13.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.lang.Number number17 = defaultStatisticalCategoryDataset11.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset11.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset11.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number30 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number33 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.lang.Number number36 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (-1L));
        boolean boolean37 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultStatisticalCategoryDataset11.removeChangeListener(datasetChangeListener38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
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
        java.lang.Object obj16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals(obj16);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        java.lang.Number number24 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int25 = defaultStatisticalCategoryDataset19.getRowCount();
        double double27 = defaultStatisticalCategoryDataset19.getRangeUpperBound(true);
        boolean boolean29 = defaultStatisticalCategoryDataset19.equals((java.lang.Object) (short) 10);
        double double31 = defaultStatisticalCategoryDataset19.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number35 = defaultStatisticalCategoryDataset32.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int37 = defaultStatisticalCategoryDataset32.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int38 = defaultStatisticalCategoryDataset32.getColumnCount();
        java.lang.Comparable comparable40 = null;
        java.lang.Number number41 = defaultStatisticalCategoryDataset32.getMeanValue((java.lang.Comparable) 1.0d, comparable40);
        java.util.EventListener eventListener42 = null;
        boolean boolean43 = defaultStatisticalCategoryDataset32.hasListener(eventListener42);
        defaultStatisticalCategoryDataset32.validateObject();
        boolean boolean45 = defaultStatisticalCategoryDataset19.equals((java.lang.Object) defaultStatisticalCategoryDataset32);
        java.lang.Number number48 = defaultStatisticalCategoryDataset19.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup49 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
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
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int21 = defaultStatisticalCategoryDataset15.getRowCount();
        double double23 = defaultStatisticalCategoryDataset15.getRangeUpperBound(true);
        java.util.List list24 = defaultStatisticalCategoryDataset15.getRowKeys();
        java.lang.Number number27 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.lang.Comparable comparable29 = null;
        java.lang.Number number30 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) 1.0d, comparable29);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int32 = defaultStatisticalCategoryDataset31.getColumnCount();
        int int34 = defaultStatisticalCategoryDataset31.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset31.getGroup();
        java.util.List list36 = defaultStatisticalCategoryDataset31.getColumnKeys();
        int int37 = defaultStatisticalCategoryDataset31.getRowCount();
        defaultStatisticalCategoryDataset31.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Number number45 = defaultStatisticalCategoryDataset31.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 1);
        int int46 = defaultStatisticalCategoryDataset31.getColumnCount();
        boolean boolean47 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) defaultStatisticalCategoryDataset31);
        boolean boolean48 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and defaultStatisticalCategoryDataset15", obj14.equals(defaultStatisticalCategoryDataset15) ? obj14.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
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
        java.lang.Number number27 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) 4, (java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj24", defaultStatisticalCategoryDataset18.equals(obj24) ? defaultStatisticalCategoryDataset18.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int17 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int19 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset16.getGroup();
        java.lang.Comparable comparable22 = null;
        java.lang.Number number23 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) 1L, comparable22);
        int int24 = defaultStatisticalCategoryDataset16.getColumnCount();
        defaultStatisticalCategoryDataset16.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable31 = null;
        java.lang.Number number32 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) 1, comparable31);
        defaultStatisticalCategoryDataset16.add((java.lang.Number) (short) -1, (java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) '#');
        java.lang.Number number40 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 2);
        defaultStatisticalCategoryDataset16.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener42 = null;
        defaultStatisticalCategoryDataset16.removeChangeListener(datasetChangeListener42);
        java.util.List list44 = defaultStatisticalCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset16.getGroup();
        boolean boolean46 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup45", datasetGroup8.equals(datasetGroup45) ? datasetGroup8.hashCode() == datasetGroup45.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0.0f);
        int int17 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        double double21 = defaultStatisticalCategoryDataset18.getRangeUpperBound(false);
        double double23 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        int int24 = defaultStatisticalCategoryDataset18.getColumnCount();
        java.lang.Number number27 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 10.0d);
        java.lang.Number number30 = defaultStatisticalCategoryDataset18.getStdDevValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultStatisticalCategoryDataset31.addChangeListener(datasetChangeListener32);
        int int34 = defaultStatisticalCategoryDataset31.getColumnCount();
        java.lang.Number number37 = defaultStatisticalCategoryDataset31.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset31.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset31.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup43);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset18", obj7.equals(defaultStatisticalCategoryDataset18) ? obj7.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
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
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 100);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        double double16 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj14", obj6.equals(obj14) ? obj6.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        int int12 = defaultStatisticalCategoryDataset3.getColumnCount();
        int int14 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) 0.0d);
        java.lang.Number number17 = defaultStatisticalCategoryDataset3.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        double double19 = defaultStatisticalCategoryDataset3.getRangeLowerBound(true);
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset3.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener23);
        int int25 = defaultStatisticalCategoryDataset22.getColumnCount();
        java.util.List list26 = defaultStatisticalCategoryDataset22.getColumnKeys();
        java.lang.Number number29 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset22.getGroup();
        int int31 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int33 = defaultStatisticalCategoryDataset22.getRowIndex((java.lang.Comparable) true);
        boolean boolean34 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset0.add(0.0d, 1.0d, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset27.hasListener(eventListener28);
        defaultStatisticalCategoryDataset27.validateObject();
        java.lang.Number number33 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultStatisticalCategoryDataset27.removeChangeListener(datasetChangeListener34);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset36 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list37 = defaultStatisticalCategoryDataset36.getRowKeys();
        double double39 = defaultStatisticalCategoryDataset36.getRangeUpperBound(false);
        double double41 = defaultStatisticalCategoryDataset36.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener42 = null;
        defaultStatisticalCategoryDataset36.removeChangeListener(datasetChangeListener42);
        org.jfree.data.general.DatasetGroup datasetGroup44 = defaultStatisticalCategoryDataset36.getGroup();
        defaultStatisticalCategoryDataset27.setGroup(datasetGroup44);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset27 and defaultStatisticalCategoryDataset36", defaultStatisticalCategoryDataset27.equals(defaultStatisticalCategoryDataset36) ? defaultStatisticalCategoryDataset27.hashCode() == defaultStatisticalCategoryDataset36.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double13 = defaultStatisticalCategoryDataset8.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int15 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int17 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset8.setGroup(datasetGroup18);
        java.util.List list20 = defaultStatisticalCategoryDataset8.getRowKeys();
        double double22 = defaultStatisticalCategoryDataset8.getRangeLowerBound(true);
        double double24 = defaultStatisticalCategoryDataset8.getRangeLowerBound(true);
        java.util.List list25 = defaultStatisticalCategoryDataset8.getRowKeys();
        java.lang.Number number28 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 100);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset14", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset14) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.util.List list17 = defaultStatisticalCategoryDataset13.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        defaultStatisticalCategoryDataset18.validateObject();
        java.util.List list22 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset18.removeChangeListener(datasetChangeListener23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup25);
        java.util.List list27 = defaultStatisticalCategoryDataset13.getRowKeys();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list30 = defaultStatisticalCategoryDataset29.getRowKeys();
        double double32 = defaultStatisticalCategoryDataset29.getRangeUpperBound(false);
        double double34 = defaultStatisticalCategoryDataset29.getRangeUpperBound(true);
        int int35 = defaultStatisticalCategoryDataset29.getColumnCount();
        java.lang.Number number38 = defaultStatisticalCategoryDataset29.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 10.0d);
        java.lang.Number number41 = defaultStatisticalCategoryDataset29.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup42 = defaultStatisticalCategoryDataset29.getGroup();
        boolean boolean43 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener26);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset28.hasListener(eventListener29);
        defaultStatisticalCategoryDataset28.validateObject();
        java.lang.Number number34 = defaultStatisticalCategoryDataset28.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset28.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
        int int12 = defaultStatisticalCategoryDataset3.getColumnCount();
        java.lang.Object obj13 = defaultStatisticalCategoryDataset3.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int20 = defaultStatisticalCategoryDataset14.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset14.removeChangeListener(datasetChangeListener21);
        java.lang.Number number25 = defaultStatisticalCategoryDataset14.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int27 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset14.add((double) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        java.lang.Number number35 = defaultStatisticalCategoryDataset14.getStdDevValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) -1);
        defaultStatisticalCategoryDataset14.add((java.lang.Number) 10.0f, (java.lang.Number) (byte) 1, (java.lang.Comparable) ' ', (java.lang.Comparable) "hi!");
        double double42 = defaultStatisticalCategoryDataset14.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset14.add((double) 10.0f, (double) 1L, (java.lang.Comparable) 0.0f, (java.lang.Comparable) true);
        boolean boolean48 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj13", defaultStatisticalCategoryDataset0.equals(obj13) ? defaultStatisticalCategoryDataset0.hashCode() == obj13.hashCode() : true);
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
        defaultStatisticalCategoryDataset12.validateObject();
        java.lang.Object obj25 = defaultStatisticalCategoryDataset12.clone();
        int int26 = defaultStatisticalCategoryDataset12.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj25", defaultStatisticalCategoryDataset18.equals(obj25) ? defaultStatisticalCategoryDataset18.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.util.List list17 = defaultStatisticalCategoryDataset13.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        defaultStatisticalCategoryDataset18.validateObject();
        java.util.List list22 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset18.removeChangeListener(datasetChangeListener23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup25);
        java.util.List list27 = defaultStatisticalCategoryDataset13.getRowKeys();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        int int29 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean20 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset18.hasListener(eventListener21);
        java.util.List list23 = defaultStatisticalCategoryDataset18.getRowKeys();
        int int24 = defaultStatisticalCategoryDataset18.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset18.getRowCount();
        double double27 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        java.lang.Object obj28 = defaultStatisticalCategoryDataset18.clone();
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals(obj28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Comparable comparable11 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) 10.0f, (java.lang.Comparable) 10L, comparable11);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int17 = defaultStatisticalCategoryDataset16.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset16.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener20);
        int int22 = defaultStatisticalCategoryDataset16.getRowCount();
        java.util.List list23 = defaultStatisticalCategoryDataset16.getColumnKeys();
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset3.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset3.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
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
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset3.hasListener(eventListener12);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset3.clone();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset3.hasListener(eventListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj14", defaultStatisticalCategoryDataset0.equals(obj14) ? defaultStatisticalCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        defaultStatisticalCategoryDataset6.validateObject();
        int int16 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Number number19 = defaultStatisticalCategoryDataset6.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list21 = defaultStatisticalCategoryDataset20.getRowKeys();
        defaultStatisticalCategoryDataset20.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int27 = defaultStatisticalCategoryDataset20.getColumnCount();
        java.lang.Number number30 = defaultStatisticalCategoryDataset20.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset20.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener36 = null;
        boolean boolean37 = defaultStatisticalCategoryDataset20.hasListener(eventListener36);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset20.getGroup();
        java.lang.Comparable comparable40 = null;
        java.lang.Number number41 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (short) 10, comparable40);
        int int42 = defaultStatisticalCategoryDataset20.getRowCount();
        java.util.List list43 = defaultStatisticalCategoryDataset20.getColumnKeys();
        boolean boolean44 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        defaultStatisticalCategoryDataset20.add((java.lang.Number) 100, (java.lang.Number) 0.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset6", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset6) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        double double23 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 1);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        defaultStatisticalCategoryDataset16.validateObject();
        java.lang.Number number22 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj23 = defaultStatisticalCategoryDataset16.clone();
        org.jfree.data.Range range25 = defaultStatisticalCategoryDataset16.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener26);
        int int28 = defaultStatisticalCategoryDataset16.getRowCount();
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset16 and obj23", defaultStatisticalCategoryDataset16.equals(obj23) ? defaultStatisticalCategoryDataset16.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        int int19 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        java.lang.Comparable comparable22 = null;
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 10L, comparable22, (java.lang.Comparable) '#');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        java.lang.Number number30 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset25.validateObject();
        org.jfree.data.Range range33 = defaultStatisticalCategoryDataset25.getRangeBounds(true);
        int int34 = defaultStatisticalCategoryDataset25.getColumnCount();
        java.lang.Number number37 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        double double39 = defaultStatisticalCategoryDataset25.getRangeUpperBound(true);
        java.lang.Number number42 = defaultStatisticalCategoryDataset25.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 1.0f);
        boolean boolean43 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) number42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset25", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset25) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset25.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
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
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex(comparable13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number21 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int23 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int24 = defaultStatisticalCategoryDataset18.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int26 = defaultStatisticalCategoryDataset25.getColumnCount();
        int int28 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup29);
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset25", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset25) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset25.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset6.hasListener(eventListener7);
        defaultStatisticalCategoryDataset6.validateObject();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset6.hasListener(eventListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener14);
        int int17 = defaultStatisticalCategoryDataset6.getRowIndex((java.lang.Comparable) (-1));
        int int19 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) ' ');
        int int20 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Number number23 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        defaultStatisticalCategoryDataset6.add((double) 10L, (double) (byte) 0, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 0);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        org.jfree.data.Range range31 = defaultStatisticalCategoryDataset6.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int33 = defaultStatisticalCategoryDataset32.getColumnCount();
        java.lang.Number number36 = defaultStatisticalCategoryDataset32.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int37 = defaultStatisticalCategoryDataset32.getColumnCount();
        int int39 = defaultStatisticalCategoryDataset32.getColumnIndex((java.lang.Comparable) "");
        java.lang.Number number42 = defaultStatisticalCategoryDataset32.getStdDevValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset32.getGroup();
        defaultStatisticalCategoryDataset6.setGroup(datasetGroup43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset32", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset32) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset32.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1L, (java.lang.Number) (-1L), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 10.0f);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.hasListener(eventListener12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list21 = defaultStatisticalCategoryDataset20.getRowKeys();
        boolean boolean22 = defaultStatisticalCategoryDataset14.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        int int23 = defaultStatisticalCategoryDataset20.getColumnCount();
        boolean boolean24 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number28 = defaultStatisticalCategoryDataset25.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int30 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) (short) -1);
        int int32 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int34 = defaultStatisticalCategoryDataset33.getColumnCount();
        int int36 = defaultStatisticalCategoryDataset33.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultStatisticalCategoryDataset33.getGroup();
        defaultStatisticalCategoryDataset25.setGroup(datasetGroup37);
        int int40 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener41 = null;
        defaultStatisticalCategoryDataset25.addChangeListener(datasetChangeListener41);
        defaultStatisticalCategoryDataset25.validateObject();
        java.lang.Object obj44 = defaultStatisticalCategoryDataset25.clone();
        boolean boolean45 = defaultStatisticalCategoryDataset20.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and defaultStatisticalCategoryDataset33", defaultStatisticalCategoryDataset14.equals(defaultStatisticalCategoryDataset33) ? defaultStatisticalCategoryDataset14.hashCode() == defaultStatisticalCategoryDataset33.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        boolean boolean19 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        java.util.List list20 = defaultStatisticalCategoryDataset13.getColumnKeys();
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset13.getRangeBounds(true);
        double double24 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        boolean boolean25 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) double24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj12", obj7.equals(obj12) ? obj7.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Class<?> wildcardClass16 = list15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
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
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '#', (java.lang.Comparable) '#');
        int int23 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset24.getGroup();
        java.util.List list29 = defaultStatisticalCategoryDataset24.getColumnKeys();
        int int30 = defaultStatisticalCategoryDataset24.getRowCount();
        java.lang.Object obj31 = defaultStatisticalCategoryDataset24.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultStatisticalCategoryDataset24.addChangeListener(datasetChangeListener32);
        java.lang.Comparable comparable35 = null;
        java.lang.Number number36 = defaultStatisticalCategoryDataset24.getValue((java.lang.Comparable) (short) 10, comparable35);
        java.lang.Number number39 = defaultStatisticalCategoryDataset24.getValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset24", obj7.equals(defaultStatisticalCategoryDataset24) ? obj7.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        defaultStatisticalCategoryDataset0.add((double) 'a', (double) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 1);
        int int21 = defaultStatisticalCategoryDataset0.getRowCount();
        double double23 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list25 = defaultStatisticalCategoryDataset24.getRowKeys();
        double double27 = defaultStatisticalCategoryDataset24.getRangeUpperBound(false);
        double double29 = defaultStatisticalCategoryDataset24.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset24.removeChangeListener(datasetChangeListener30);
        java.lang.Comparable comparable32 = null;
        java.lang.Number number34 = defaultStatisticalCategoryDataset24.getStdDevValue(comparable32, (java.lang.Comparable) true);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and defaultStatisticalCategoryDataset24", defaultStatisticalCategoryDataset7.equals(defaultStatisticalCategoryDataset24) ? defaultStatisticalCategoryDataset7.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        int int23 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) Double.NaN);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number30 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int32 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int33 = defaultStatisticalCategoryDataset27.getColumnCount();
        java.lang.Comparable comparable35 = null;
        java.lang.Number number36 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) 1.0d, comparable35);
        java.util.EventListener eventListener37 = null;
        boolean boolean38 = defaultStatisticalCategoryDataset27.hasListener(eventListener37);
        defaultStatisticalCategoryDataset27.validateObject();
        java.util.EventListener eventListener40 = null;
        boolean boolean41 = defaultStatisticalCategoryDataset27.hasListener(eventListener40);
        java.util.List list42 = defaultStatisticalCategoryDataset27.getColumnKeys();
        int int43 = defaultStatisticalCategoryDataset27.getRowCount();
        boolean boolean44 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset27);
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset11 and defaultStatisticalCategoryDataset27", defaultStatisticalCategoryDataset11.equals(defaultStatisticalCategoryDataset27) ? defaultStatisticalCategoryDataset11.hashCode() == defaultStatisticalCategoryDataset27.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset0.clone();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset0.hasListener(eventListener11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj10", obj7.equals(obj10) ? obj7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((double) 4, (double) (byte) 100, (java.lang.Comparable) '#', (java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener9);
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass13 = datasetGroup12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj11", defaultStatisticalCategoryDataset0.equals(obj11) ? defaultStatisticalCategoryDataset0.hashCode() == obj11.hashCode() : true);
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
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) -1, (java.lang.Number) 10L, (java.lang.Comparable) 'a', (java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int19 = defaultStatisticalCategoryDataset18.getColumnCount();
        int int21 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj22 = defaultStatisticalCategoryDataset18.clone();
        java.lang.Number number25 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 100.0f);
        java.lang.Number number28 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (byte) -1);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int17 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int19 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset16.getGroup();
        java.util.List list21 = defaultStatisticalCategoryDataset16.getColumnKeys();
        int int22 = defaultStatisticalCategoryDataset16.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number26 = defaultStatisticalCategoryDataset23.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int28 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int29 = defaultStatisticalCategoryDataset23.getColumnCount();
        defaultStatisticalCategoryDataset23.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset35 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener36 = null;
        boolean boolean37 = defaultStatisticalCategoryDataset35.hasListener(eventListener36);
        java.lang.Number number40 = defaultStatisticalCategoryDataset35.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset35.validateObject();
        org.jfree.data.Range range43 = defaultStatisticalCategoryDataset35.getRangeBounds(true);
        int int44 = defaultStatisticalCategoryDataset35.getColumnCount();
        java.lang.Number number47 = defaultStatisticalCategoryDataset35.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int49 = defaultStatisticalCategoryDataset35.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list50 = defaultStatisticalCategoryDataset35.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultStatisticalCategoryDataset35.getGroup();
        defaultStatisticalCategoryDataset23.setGroup(datasetGroup51);
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup51);
        boolean boolean54 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup20 and datasetGroup51", datasetGroup20.equals(datasetGroup51) ? datasetGroup20.hashCode() == datasetGroup51.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener9);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset11.hasListener(eventListener12);
        defaultStatisticalCategoryDataset11.validateObject();
        java.util.List list15 = defaultStatisticalCategoryDataset11.getRowKeys();
        int int16 = defaultStatisticalCategoryDataset11.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup17);
        java.lang.Class<?> wildcardClass19 = datasetGroup17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset11", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset11) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int10 = defaultStatisticalCategoryDataset9.getColumnCount();
        java.lang.Number number13 = defaultStatisticalCategoryDataset9.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset9.hasListener(eventListener14);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset9.clone();
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset9);
        double double19 = defaultStatisticalCategoryDataset9.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj16", defaultStatisticalCategoryDataset0.equals(obj16) ? defaultStatisticalCategoryDataset0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset24.hasListener(eventListener25);
        java.util.List list27 = defaultStatisticalCategoryDataset24.getColumnKeys();
        java.util.List list28 = defaultStatisticalCategoryDataset24.getColumnKeys();
        defaultStatisticalCategoryDataset24.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset24", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset24) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number33 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj35 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number38 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and obj35", defaultStatisticalCategoryDataset13.equals(obj35) ? defaultStatisticalCategoryDataset13.hashCode() == obj35.hashCode() : true);
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
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset8.getGroup();
        java.lang.Class<?> wildcardClass22 = datasetGroup21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset3.hasListener(eventListener12);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset3.clone();
        int int16 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj14", defaultStatisticalCategoryDataset0.equals(obj14) ? defaultStatisticalCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset6", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset6) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        java.lang.Comparable comparable11 = null;
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 0L, (java.lang.Comparable) '4', comparable11);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) 1, (java.lang.Comparable) 97.0d, (java.lang.Comparable) 1L);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number22 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double24 = defaultStatisticalCategoryDataset19.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int26 = defaultStatisticalCategoryDataset25.getColumnCount();
        int int28 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset19.setGroup(datasetGroup29);
        java.util.List list31 = defaultStatisticalCategoryDataset19.getColumnKeys();
        int int33 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup34", datasetGroup4.equals(datasetGroup34) ? datasetGroup4.hashCode() == datasetGroup34.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset10.hasListener(eventListener11);
        java.util.List list13 = defaultStatisticalCategoryDataset10.getColumnKeys();
        java.lang.Number number16 = defaultStatisticalCategoryDataset10.getStdDevValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset10.addChangeListener(datasetChangeListener17);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list20 = defaultStatisticalCategoryDataset19.getRowKeys();
        double double22 = defaultStatisticalCategoryDataset19.getRangeUpperBound(false);
        double double24 = defaultStatisticalCategoryDataset19.getRangeUpperBound(true);
        int int25 = defaultStatisticalCategoryDataset19.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset10.setGroup(datasetGroup26);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset10 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset10.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset10.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int11 = defaultStatisticalCategoryDataset10.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset10.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int15 = defaultStatisticalCategoryDataset10.getColumnCount();
        defaultStatisticalCategoryDataset10.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number23 = defaultStatisticalCategoryDataset10.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int25 = defaultStatisticalCategoryDataset10.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset10.getGroup();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup26);
        java.util.List list28 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup26", datasetGroup8.equals(datasetGroup26) ? datasetGroup8.hashCode() == datasetGroup26.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (byte) 10);
        double double22 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list24 = defaultStatisticalCategoryDataset23.getRowKeys();
        defaultStatisticalCategoryDataset23.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number32 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.lang.Comparable comparable34 = null;
        java.lang.Number number35 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) 0, comparable34);
        boolean boolean37 = defaultStatisticalCategoryDataset23.equals((java.lang.Object) (short) 1);
        int int39 = defaultStatisticalCategoryDataset23.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number number42 = defaultStatisticalCategoryDataset23.getValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset43 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list44 = defaultStatisticalCategoryDataset43.getRowKeys();
        double double46 = defaultStatisticalCategoryDataset43.getRangeUpperBound(false);
        double double48 = defaultStatisticalCategoryDataset43.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener49 = null;
        defaultStatisticalCategoryDataset43.removeChangeListener(datasetChangeListener49);
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultStatisticalCategoryDataset43.getGroup();
        defaultStatisticalCategoryDataset23.setGroup(datasetGroup51);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset43", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset43) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset43.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset0.hasListener(eventListener15);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number20 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int22 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) -1);
        int int24 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int26 = defaultStatisticalCategoryDataset25.getColumnCount();
        int int28 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset17.setGroup(datasetGroup29);
        defaultStatisticalCategoryDataset17.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset17.getGroup();
        int int34 = defaultStatisticalCategoryDataset17.getRowIndex((java.lang.Comparable) (-1L));
        boolean boolean35 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10.0f);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset15.validateObject();
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset15.getRangeBounds(true);
        int int24 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number27 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset15.getGroup();
        java.lang.Object obj29 = defaultStatisticalCategoryDataset15.clone();
        int int31 = defaultStatisticalCategoryDataset15.getRowIndex((java.lang.Comparable) 0L);
        boolean boolean32 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and defaultStatisticalCategoryDataset15", obj9.equals(defaultStatisticalCategoryDataset15) ? obj9.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        java.util.List list18 = defaultStatisticalCategoryDataset13.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset13.getRowCount();
        int int21 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list23 = defaultStatisticalCategoryDataset22.getRowKeys();
        defaultStatisticalCategoryDataset22.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number31 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup32);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup32);
        java.lang.Comparable comparable35 = null;
        java.lang.Number number37 = defaultStatisticalCategoryDataset0.getStdDevValue(comparable35, (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup17 and datasetGroup32", datasetGroup17.equals(datasetGroup32) ? datasetGroup17.hashCode() == datasetGroup32.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
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
        int int15 = defaultStatisticalCategoryDataset0.getRowCount();
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset0.getGroup();
        int int18 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj19 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list21 = defaultStatisticalCategoryDataset20.getRowKeys();
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset20.getRangeBounds(true);
        int int25 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int27 = defaultStatisticalCategoryDataset26.getColumnCount();
        int int29 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset26.getGroup();
        java.lang.Number number33 = defaultStatisticalCategoryDataset26.getStdDevValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (short) 1);
        boolean boolean34 = defaultStatisticalCategoryDataset20.equals((java.lang.Object) (short) 1);
        boolean boolean35 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj19", defaultStatisticalCategoryDataset4.equals(obj19) ? defaultStatisticalCategoryDataset4.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset3.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        defaultStatisticalCategoryDataset12.validateObject();
        double double17 = defaultStatisticalCategoryDataset12.getRangeLowerBound(true);
        int int19 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset3.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset12", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset12) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup11", datasetGroup8.equals(datasetGroup11) ? datasetGroup8.hashCode() == datasetGroup11.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.lang.Number number17 = defaultStatisticalCategoryDataset11.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset11.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset11.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number30 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number33 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.lang.Number number36 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (-1L));
        boolean boolean37 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset38 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int39 = defaultStatisticalCategoryDataset38.getColumnCount();
        java.lang.Number number42 = defaultStatisticalCategoryDataset38.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener43 = null;
        defaultStatisticalCategoryDataset38.addChangeListener(datasetChangeListener43);
        boolean boolean45 = defaultStatisticalCategoryDataset11.equals((java.lang.Object) datasetChangeListener43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        defaultStatisticalCategoryDataset0.add(0.0d, 0.0d, (java.lang.Comparable) 10.0f, (java.lang.Comparable) Double.NaN);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        int int22 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset19.getGroup();
        java.util.List list24 = defaultStatisticalCategoryDataset19.getColumnKeys();
        int int25 = defaultStatisticalCategoryDataset19.getRowCount();
        java.lang.Object obj26 = defaultStatisticalCategoryDataset19.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener27);
        java.lang.Comparable comparable30 = null;
        java.lang.Number number31 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) (short) 10, comparable30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup35", datasetGroup8.equals(datasetGroup35) ? datasetGroup8.hashCode() == datasetGroup35.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list6 = defaultStatisticalCategoryDataset5.getRowKeys();
        double double8 = defaultStatisticalCategoryDataset5.getRangeUpperBound(false);
        double double10 = defaultStatisticalCategoryDataset5.getRangeUpperBound(true);
        int int11 = defaultStatisticalCategoryDataset5.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset5.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup12", datasetGroup4.equals(datasetGroup12) ? datasetGroup4.hashCode() == datasetGroup12.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset13.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int29 = defaultStatisticalCategoryDataset28.getColumnCount();
        int int31 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset28.getGroup();
        int int34 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset28.add((java.lang.Number) (short) 0, (java.lang.Number) 2, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0L);
        boolean boolean40 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) defaultStatisticalCategoryDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup27 and datasetGroup32", datasetGroup27.equals(datasetGroup32) ? datasetGroup27.hashCode() == datasetGroup32.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int19 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj20 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number23 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 'a', (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj20", defaultStatisticalCategoryDataset4.equals(obj20) ? defaultStatisticalCategoryDataset4.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((double) (byte) 1, (double) 'a', (java.lang.Comparable) 10L, (java.lang.Comparable) 10.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset22.validateObject();
        org.jfree.data.Range range30 = defaultStatisticalCategoryDataset22.getRangeBounds(true);
        int int32 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (byte) 1);
        double double34 = defaultStatisticalCategoryDataset22.getRangeUpperBound(false);
        double double36 = defaultStatisticalCategoryDataset22.getRangeLowerBound(false);
        java.lang.Comparable comparable37 = null;
        int int38 = defaultStatisticalCategoryDataset22.getRowIndex(comparable37);
        boolean boolean39 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) comparable37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
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
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 10);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int21 = defaultStatisticalCategoryDataset20.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset20.removeChangeListener(datasetChangeListener22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener26);
        int int28 = defaultStatisticalCategoryDataset20.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset20.removeChangeListener(datasetChangeListener29);
        int int32 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset20", obj7.equals(defaultStatisticalCategoryDataset20) ? obj7.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        double double9 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 97.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number15 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int17 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) -1);
        int int19 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int21 = defaultStatisticalCategoryDataset20.getColumnCount();
        int int23 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup24);
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int13 = defaultStatisticalCategoryDataset12.getColumnCount();
        int int15 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset12.getGroup();
        java.lang.Comparable comparable18 = null;
        java.lang.Number number19 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 1L, comparable18);
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset12.hasListener(eventListener20);
        boolean boolean22 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) boolean21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and defaultStatisticalCategoryDataset12", defaultStatisticalCategoryDataset3.equals(defaultStatisticalCategoryDataset12) ? defaultStatisticalCategoryDataset3.hashCode() == defaultStatisticalCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        int int19 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        java.lang.Comparable comparable22 = null;
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 10L, comparable22, (java.lang.Comparable) '#');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        defaultStatisticalCategoryDataset25.validateObject();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset25.hasListener(eventListener29);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset25.addChangeListener(datasetChangeListener31);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultStatisticalCategoryDataset25.addChangeListener(datasetChangeListener33);
        int int36 = defaultStatisticalCategoryDataset25.getRowIndex((java.lang.Comparable) (-1));
        int int38 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) ' ');
        int int39 = defaultStatisticalCategoryDataset25.getColumnCount();
        java.lang.Number number42 = defaultStatisticalCategoryDataset25.getStdDevValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.util.EventListener eventListener43 = null;
        boolean boolean44 = defaultStatisticalCategoryDataset25.hasListener(eventListener43);
        java.util.EventListener eventListener45 = null;
        boolean boolean46 = defaultStatisticalCategoryDataset25.hasListener(eventListener45);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset47 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int48 = defaultStatisticalCategoryDataset47.getColumnCount();
        int int50 = defaultStatisticalCategoryDataset47.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultStatisticalCategoryDataset47.getGroup();
        java.util.List list52 = defaultStatisticalCategoryDataset47.getColumnKeys();
        int int53 = defaultStatisticalCategoryDataset47.getRowCount();
        boolean boolean55 = defaultStatisticalCategoryDataset47.equals((java.lang.Object) "");
        org.jfree.data.general.DatasetGroup datasetGroup56 = defaultStatisticalCategoryDataset47.getGroup();
        defaultStatisticalCategoryDataset25.setGroup(datasetGroup56);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset25", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset25) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset25.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.lang.Number number17 = defaultStatisticalCategoryDataset11.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset11.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset11.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number30 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number33 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.lang.Number number36 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (-1L));
        boolean boolean37 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        java.lang.Number number40 = defaultStatisticalCategoryDataset11.getStdDevValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj10", obj7.equals(obj10) ? obj7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 100);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj14", obj6.equals(obj14) ? obj6.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 97.0d, (java.lang.Comparable) "");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number25 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int27 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) -1);
        double double29 = defaultStatisticalCategoryDataset22.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset22.removeChangeListener(datasetChangeListener30);
        int int33 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list35 = defaultStatisticalCategoryDataset34.getRowKeys();
        defaultStatisticalCategoryDataset34.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int41 = defaultStatisticalCategoryDataset34.getColumnCount();
        java.lang.Number number44 = defaultStatisticalCategoryDataset34.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener45 = null;
        defaultStatisticalCategoryDataset34.addChangeListener(datasetChangeListener45);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset47 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number50 = defaultStatisticalCategoryDataset47.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int52 = defaultStatisticalCategoryDataset47.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int53 = defaultStatisticalCategoryDataset47.getColumnCount();
        java.lang.Comparable comparable55 = null;
        java.lang.Number number56 = defaultStatisticalCategoryDataset47.getMeanValue((java.lang.Comparable) 1.0d, comparable55);
        java.util.EventListener eventListener57 = null;
        boolean boolean58 = defaultStatisticalCategoryDataset47.hasListener(eventListener57);
        defaultStatisticalCategoryDataset47.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup60 = defaultStatisticalCategoryDataset47.getGroup();
        defaultStatisticalCategoryDataset34.setGroup(datasetGroup60);
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup60);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset22 and defaultStatisticalCategoryDataset47", defaultStatisticalCategoryDataset22.equals(defaultStatisticalCategoryDataset47) ? defaultStatisticalCategoryDataset22.hashCode() == defaultStatisticalCategoryDataset47.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        java.util.List list16 = defaultStatisticalCategoryDataset13.getColumnKeys();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset13.hasListener(eventListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset13.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset13", obj6.equals(defaultStatisticalCategoryDataset13) ? obj6.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        defaultStatisticalCategoryDataset9.validateObject();
        java.util.List list13 = defaultStatisticalCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset9.removeChangeListener(datasetChangeListener14);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int17 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int19 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) 0);
        boolean boolean20 = defaultStatisticalCategoryDataset9.equals((java.lang.Object) int19);
        defaultStatisticalCategoryDataset9.add((double) 'a', (double) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list28 = defaultStatisticalCategoryDataset27.getRowKeys();
        defaultStatisticalCategoryDataset27.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number36 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.lang.Comparable comparable38 = null;
        java.lang.Number number39 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) 0, comparable38);
        boolean boolean41 = defaultStatisticalCategoryDataset27.equals((java.lang.Object) (short) 1);
        int int43 = defaultStatisticalCategoryDataset27.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number number46 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset47 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list48 = defaultStatisticalCategoryDataset47.getRowKeys();
        double double50 = defaultStatisticalCategoryDataset47.getRangeUpperBound(false);
        double double52 = defaultStatisticalCategoryDataset47.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener53 = null;
        defaultStatisticalCategoryDataset47.removeChangeListener(datasetChangeListener53);
        org.jfree.data.general.DatasetGroup datasetGroup55 = defaultStatisticalCategoryDataset47.getGroup();
        defaultStatisticalCategoryDataset27.setGroup(datasetGroup55);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset16 and defaultStatisticalCategoryDataset47", defaultStatisticalCategoryDataset16.equals(defaultStatisticalCategoryDataset47) ? defaultStatisticalCategoryDataset16.hashCode() == defaultStatisticalCategoryDataset47.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((double) (byte) 1, (double) 'a', (java.lang.Comparable) 10L, (java.lang.Comparable) 10.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        defaultStatisticalCategoryDataset22.validateObject();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset22.hasListener(eventListener26);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener30);
        int int33 = defaultStatisticalCategoryDataset22.getRowIndex((java.lang.Comparable) (-1));
        int int35 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        int int12 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset6.removeChangeListener(datasetChangeListener13);
        boolean boolean15 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset16.validateObject();
        org.jfree.data.Range range24 = defaultStatisticalCategoryDataset16.getRangeBounds(true);
        int int26 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Number number29 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 1, (java.lang.Number) 3, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj10", obj7.equals(obj10) ? obj7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
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
        java.lang.Number number26 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (byte) 1);
        int int28 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset12.hasListener(eventListener29);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int32 = defaultStatisticalCategoryDataset31.getColumnCount();
        int int34 = defaultStatisticalCategoryDataset31.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset31.getGroup();
        java.util.List list36 = defaultStatisticalCategoryDataset31.getColumnKeys();
        int int37 = defaultStatisticalCategoryDataset31.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset38 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number41 = defaultStatisticalCategoryDataset38.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int43 = defaultStatisticalCategoryDataset38.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int44 = defaultStatisticalCategoryDataset38.getColumnCount();
        defaultStatisticalCategoryDataset38.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset50 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener51 = null;
        boolean boolean52 = defaultStatisticalCategoryDataset50.hasListener(eventListener51);
        java.lang.Number number55 = defaultStatisticalCategoryDataset50.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset50.validateObject();
        org.jfree.data.Range range58 = defaultStatisticalCategoryDataset50.getRangeBounds(true);
        int int59 = defaultStatisticalCategoryDataset50.getColumnCount();
        java.lang.Number number62 = defaultStatisticalCategoryDataset50.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int64 = defaultStatisticalCategoryDataset50.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list65 = defaultStatisticalCategoryDataset50.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup66 = defaultStatisticalCategoryDataset50.getGroup();
        defaultStatisticalCategoryDataset38.setGroup(datasetGroup66);
        defaultStatisticalCategoryDataset31.setGroup(datasetGroup66);
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset31", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset31) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset31.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int21 = defaultStatisticalCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset15.removeChangeListener(datasetChangeListener22);
        java.lang.Number number26 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int27 = defaultStatisticalCategoryDataset15.getColumnCount();
        int int28 = defaultStatisticalCategoryDataset15.getRowCount();
        boolean boolean29 = defaultStatisticalCategoryDataset7.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        int int15 = defaultStatisticalCategoryDataset0.getRowCount();
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset0.getGroup();
        int int18 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        java.lang.Number number24 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int25 = defaultStatisticalCategoryDataset19.getRowCount();
        double double27 = defaultStatisticalCategoryDataset19.getRangeUpperBound(true);
        boolean boolean29 = defaultStatisticalCategoryDataset19.equals((java.lang.Object) (short) 10);
        double double31 = defaultStatisticalCategoryDataset19.getRangeLowerBound(false);
        java.lang.Number number34 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        double double36 = defaultStatisticalCategoryDataset19.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener37);
        int int40 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) "hi!");
        java.lang.Object obj41 = defaultStatisticalCategoryDataset19.clone();
        double double43 = defaultStatisticalCategoryDataset19.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener44 = null;
        defaultStatisticalCategoryDataset19.removeChangeListener(datasetChangeListener44);
        boolean boolean46 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        java.lang.Class<?> wildcardClass15 = list14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset6", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset6) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        int int11 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        defaultStatisticalCategoryDataset13.validateObject();
        java.lang.Number number19 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset13.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        java.lang.Number number30 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list32 = defaultStatisticalCategoryDataset31.getRowKeys();
        boolean boolean33 = defaultStatisticalCategoryDataset25.equals((java.lang.Object) defaultStatisticalCategoryDataset31);
        boolean boolean34 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultStatisticalCategoryDataset25.addChangeListener(datasetChangeListener35);
        defaultStatisticalCategoryDataset25.validateObject();
        java.lang.Object obj38 = defaultStatisticalCategoryDataset25.clone();
        boolean boolean39 = defaultStatisticalCategoryDataset0.equals(obj38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset25 and defaultStatisticalCategoryDataset31", defaultStatisticalCategoryDataset25.equals(defaultStatisticalCategoryDataset31) ? defaultStatisticalCategoryDataset25.hashCode() == defaultStatisticalCategoryDataset31.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list13 = defaultStatisticalCategoryDataset12.getRowKeys();
        defaultStatisticalCategoryDataset12.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int19 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number22 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener23);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number28 = defaultStatisticalCategoryDataset25.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int30 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int31 = defaultStatisticalCategoryDataset25.getColumnCount();
        java.lang.Comparable comparable33 = null;
        java.lang.Number number34 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) 1.0d, comparable33);
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset25.hasListener(eventListener35);
        defaultStatisticalCategoryDataset25.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup38);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup38);
        org.jfree.data.Range range42 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset43 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number46 = defaultStatisticalCategoryDataset43.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int48 = defaultStatisticalCategoryDataset43.getColumnIndex((java.lang.Comparable) (short) -1);
        int int50 = defaultStatisticalCategoryDataset43.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset51 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int52 = defaultStatisticalCategoryDataset51.getColumnCount();
        int int54 = defaultStatisticalCategoryDataset51.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup55 = defaultStatisticalCategoryDataset51.getGroup();
        defaultStatisticalCategoryDataset43.setGroup(datasetGroup55);
        defaultStatisticalCategoryDataset43.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup58 = defaultStatisticalCategoryDataset43.getGroup();
        int int60 = defaultStatisticalCategoryDataset43.getRowIndex((java.lang.Comparable) (-1L));
        java.util.List list61 = defaultStatisticalCategoryDataset43.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup62 = defaultStatisticalCategoryDataset43.getGroup();
        java.lang.Number number65 = defaultStatisticalCategoryDataset43.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 0);
        java.util.List list66 = defaultStatisticalCategoryDataset43.getColumnKeys();
        boolean boolean67 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset25 and defaultStatisticalCategoryDataset51", defaultStatisticalCategoryDataset25.equals(defaultStatisticalCategoryDataset51) ? defaultStatisticalCategoryDataset25.hashCode() == defaultStatisticalCategoryDataset51.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
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
        int int23 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) Double.NaN);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number30 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int32 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int33 = defaultStatisticalCategoryDataset27.getColumnCount();
        java.lang.Comparable comparable35 = null;
        java.lang.Number number36 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) 1.0d, comparable35);
        java.util.EventListener eventListener37 = null;
        boolean boolean38 = defaultStatisticalCategoryDataset27.hasListener(eventListener37);
        defaultStatisticalCategoryDataset27.validateObject();
        java.util.EventListener eventListener40 = null;
        boolean boolean41 = defaultStatisticalCategoryDataset27.hasListener(eventListener40);
        java.util.List list42 = defaultStatisticalCategoryDataset27.getColumnKeys();
        int int43 = defaultStatisticalCategoryDataset27.getRowCount();
        boolean boolean44 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset27);
        java.lang.Comparable comparable48 = null;
        defaultStatisticalCategoryDataset27.add(4.0d, 32.0d, (java.lang.Comparable) (short) 1, comparable48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset11", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset11) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
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
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj14", obj7.equals(obj14) ? obj7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals(obj16);
        int int19 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list21 = defaultStatisticalCategoryDataset20.getRowKeys();
        java.lang.Number number24 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 10);
        int int25 = defaultStatisticalCategoryDataset20.getRowCount();
        java.lang.Number number28 = defaultStatisticalCategoryDataset20.getStdDevValue((java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
        java.lang.Number number31 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) 1L, (java.lang.Comparable) 97.0d);
        java.util.List list32 = defaultStatisticalCategoryDataset20.getRowKeys();
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
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
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj14", obj13.equals(obj14) ? obj13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultStatisticalCategoryDataset16.removeChangeListener(datasetChangeListener34);
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
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
        int int11 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset4.getStdDevValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 100);
        int int16 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj17 = defaultStatisticalCategoryDataset4.clone();
        double double19 = defaultStatisticalCategoryDataset4.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj17", defaultStatisticalCategoryDataset0.equals(obj17) ? defaultStatisticalCategoryDataset0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        defaultStatisticalCategoryDataset18.validateObject();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset18.hasListener(eventListener22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener26);
        int int29 = defaultStatisticalCategoryDataset18.getRowIndex((java.lang.Comparable) (-1));
        int int31 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) ' ');
        int int32 = defaultStatisticalCategoryDataset18.getColumnCount();
        java.lang.Number number35 = defaultStatisticalCategoryDataset18.getStdDevValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.util.EventListener eventListener36 = null;
        boolean boolean37 = defaultStatisticalCategoryDataset18.hasListener(eventListener36);
        java.util.EventListener eventListener38 = null;
        boolean boolean39 = defaultStatisticalCategoryDataset18.hasListener(eventListener38);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset40 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int41 = defaultStatisticalCategoryDataset40.getColumnCount();
        int int43 = defaultStatisticalCategoryDataset40.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup44 = defaultStatisticalCategoryDataset40.getGroup();
        java.util.List list45 = defaultStatisticalCategoryDataset40.getColumnKeys();
        int int46 = defaultStatisticalCategoryDataset40.getRowCount();
        boolean boolean48 = defaultStatisticalCategoryDataset40.equals((java.lang.Object) "");
        org.jfree.data.general.DatasetGroup datasetGroup49 = defaultStatisticalCategoryDataset40.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup49);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 2, (java.lang.Comparable) 4);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset11.hasListener(eventListener12);
        defaultStatisticalCategoryDataset11.validateObject();
        java.lang.Number number17 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj18 = defaultStatisticalCategoryDataset11.clone();
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset11.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener21);
        defaultStatisticalCategoryDataset11.validateObject();
        java.lang.Number number26 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double28 = defaultStatisticalCategoryDataset11.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset11 and obj18", defaultStatisticalCategoryDataset11.equals(obj18) ? defaultStatisticalCategoryDataset11.hashCode() == obj18.hashCode() : true);
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
        java.lang.Number number24 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 4, (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj2 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range4 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int6 = defaultStatisticalCategoryDataset5.getColumnCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset5.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int10 = defaultStatisticalCategoryDataset5.getColumnCount();
        defaultStatisticalCategoryDataset5.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number18 = defaultStatisticalCategoryDataset5.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int20 = defaultStatisticalCategoryDataset5.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset5.getGroup();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset5.hasListener(eventListener22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset5.removeChangeListener(datasetChangeListener24);
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and defaultStatisticalCategoryDataset5", obj2.equals(defaultStatisticalCategoryDataset5) ? obj2.hashCode() == defaultStatisticalCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj4 = defaultStatisticalCategoryDataset0.clone();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj9", obj4.equals(obj9) ? obj4.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int10 = defaultStatisticalCategoryDataset9.getColumnCount();
        java.lang.Number number13 = defaultStatisticalCategoryDataset9.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset9.hasListener(eventListener14);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset9.clone();
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset9);
        org.jfree.data.Range range19 = defaultStatisticalCategoryDataset9.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj16", defaultStatisticalCategoryDataset0.equals(obj16) ? defaultStatisticalCategoryDataset0.hashCode() == obj16.hashCode() : true);
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int11 = defaultStatisticalCategoryDataset10.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset10.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset10.getGroup();
        java.util.List list15 = defaultStatisticalCategoryDataset10.getColumnKeys();
        int int16 = defaultStatisticalCategoryDataset10.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number20 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int22 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int23 = defaultStatisticalCategoryDataset17.getColumnCount();
        defaultStatisticalCategoryDataset17.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset29.hasListener(eventListener30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset29.validateObject();
        org.jfree.data.Range range37 = defaultStatisticalCategoryDataset29.getRangeBounds(true);
        int int38 = defaultStatisticalCategoryDataset29.getColumnCount();
        java.lang.Number number41 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int43 = defaultStatisticalCategoryDataset29.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list44 = defaultStatisticalCategoryDataset29.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset29.getGroup();
        defaultStatisticalCategoryDataset17.setGroup(datasetGroup45);
        defaultStatisticalCategoryDataset10.setGroup(datasetGroup45);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup7 and datasetGroup14", datasetGroup7.equals(datasetGroup14) ? datasetGroup7.hashCode() == datasetGroup14.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list11 = defaultStatisticalCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset10.addChangeListener(datasetChangeListener12);
        double double15 = defaultStatisticalCategoryDataset10.getRangeUpperBound(true);
        java.lang.Class<?> wildcardClass16 = defaultStatisticalCategoryDataset10.getClass();
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) wildcardClass16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0f);
        double double22 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset23.addChangeListener(datasetChangeListener24);
        int int26 = defaultStatisticalCategoryDataset23.getColumnCount();
        java.lang.Number number29 = defaultStatisticalCategoryDataset23.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset23.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset23.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int41 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range43 = defaultStatisticalCategoryDataset23.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup44 = defaultStatisticalCategoryDataset23.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset45 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list46 = defaultStatisticalCategoryDataset45.getRowKeys();
        defaultStatisticalCategoryDataset45.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int52 = defaultStatisticalCategoryDataset45.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup53 = defaultStatisticalCategoryDataset45.getGroup();
        defaultStatisticalCategoryDataset23.setGroup(datasetGroup53);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup7 and datasetGroup44", datasetGroup7.equals(datasetGroup44) ? datasetGroup7.hashCode() == datasetGroup44.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        int int19 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj20 = defaultStatisticalCategoryDataset0.clone();
        double double22 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj20", defaultStatisticalCategoryDataset4.equals(obj20) ? defaultStatisticalCategoryDataset4.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
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
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10, (java.lang.Comparable) '#');
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and obj18", defaultStatisticalCategoryDataset7.equals(obj18) ? defaultStatisticalCategoryDataset7.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset0.add(0.0d, 1.0d, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset0.getGroup();
        int int28 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int30 = defaultStatisticalCategoryDataset29.getColumnCount();
        int int32 = defaultStatisticalCategoryDataset29.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset29.getGroup();
        java.lang.Comparable comparable35 = null;
        java.lang.Number number36 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) 1L, comparable35);
        int int37 = defaultStatisticalCategoryDataset29.getColumnCount();
        defaultStatisticalCategoryDataset29.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable44 = null;
        java.lang.Number number45 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) 1, comparable44);
        defaultStatisticalCategoryDataset29.add((java.lang.Number) (short) -1, (java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) '#');
        java.util.List list51 = defaultStatisticalCategoryDataset29.getColumnKeys();
        int int52 = defaultStatisticalCategoryDataset29.getColumnCount();
        java.lang.Comparable comparable54 = defaultStatisticalCategoryDataset29.getColumnKey((int) (byte) 0);
        boolean boolean55 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup27 and datasetGroup33", datasetGroup27.equals(datasetGroup33) ? datasetGroup27.hashCode() == datasetGroup33.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
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
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset0.hasListener(eventListener35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup10 and datasetGroup33", datasetGroup10.equals(datasetGroup33) ? datasetGroup10.hashCode() == datasetGroup33.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset17.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener21);
        int int23 = defaultStatisticalCategoryDataset17.getRowCount();
        org.jfree.data.Range range25 = defaultStatisticalCategoryDataset17.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener26);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset28.hasListener(eventListener29);
        defaultStatisticalCategoryDataset28.validateObject();
        java.util.List list32 = defaultStatisticalCategoryDataset28.getRowKeys();
        int int33 = defaultStatisticalCategoryDataset28.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset17.setGroup(datasetGroup34);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0d);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset10.hasListener(eventListener11);
        java.lang.Number number15 = defaultStatisticalCategoryDataset10.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int16 = defaultStatisticalCategoryDataset10.getRowCount();
        double double18 = defaultStatisticalCategoryDataset10.getRangeUpperBound(true);
        boolean boolean20 = defaultStatisticalCategoryDataset10.equals((java.lang.Object) (short) 10);
        double double22 = defaultStatisticalCategoryDataset10.getRangeLowerBound(false);
        java.lang.Number number25 = defaultStatisticalCategoryDataset10.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        int int26 = defaultStatisticalCategoryDataset10.getRowCount();
        int int27 = defaultStatisticalCategoryDataset10.getColumnCount();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and defaultStatisticalCategoryDataset10", obj9.equals(defaultStatisticalCategoryDataset10) ? obj9.hashCode() == defaultStatisticalCategoryDataset10.hashCode() : true);
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
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        java.util.List list27 = defaultStatisticalCategoryDataset13.getColumnKeys();
        double double29 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number33 = defaultStatisticalCategoryDataset30.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int35 = defaultStatisticalCategoryDataset30.getColumnIndex((java.lang.Comparable) (short) -1);
        double double37 = defaultStatisticalCategoryDataset30.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultStatisticalCategoryDataset30.removeChangeListener(datasetChangeListener38);
        int int41 = defaultStatisticalCategoryDataset30.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener42 = null;
        defaultStatisticalCategoryDataset30.removeChangeListener(datasetChangeListener42);
        boolean boolean44 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) datasetChangeListener42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset30", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset30) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset30.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable20 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, comparable20);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj28 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset29.hasListener(eventListener30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int35 = defaultStatisticalCategoryDataset29.getRowCount();
        double double37 = defaultStatisticalCategoryDataset29.getRangeUpperBound(true);
        boolean boolean39 = defaultStatisticalCategoryDataset29.equals((java.lang.Object) (short) 10);
        double double41 = defaultStatisticalCategoryDataset29.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset42 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number45 = defaultStatisticalCategoryDataset42.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int47 = defaultStatisticalCategoryDataset42.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int48 = defaultStatisticalCategoryDataset42.getColumnCount();
        java.lang.Comparable comparable50 = null;
        java.lang.Number number51 = defaultStatisticalCategoryDataset42.getMeanValue((java.lang.Comparable) 1.0d, comparable50);
        java.util.EventListener eventListener52 = null;
        boolean boolean53 = defaultStatisticalCategoryDataset42.hasListener(eventListener52);
        defaultStatisticalCategoryDataset42.validateObject();
        boolean boolean55 = defaultStatisticalCategoryDataset29.equals((java.lang.Object) defaultStatisticalCategoryDataset42);
        double double57 = defaultStatisticalCategoryDataset29.getRangeUpperBound(false);
        java.util.List list58 = defaultStatisticalCategoryDataset29.getRowKeys();
        boolean boolean59 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        int int61 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset29 and defaultStatisticalCategoryDataset42", defaultStatisticalCategoryDataset29.equals(defaultStatisticalCategoryDataset42) ? defaultStatisticalCategoryDataset29.hashCode() == defaultStatisticalCategoryDataset42.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
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
        int int11 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset4.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int16 = defaultStatisticalCategoryDataset15.getColumnCount();
        int int18 = defaultStatisticalCategoryDataset15.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset15.getGroup();
        int int21 = defaultStatisticalCategoryDataset15.getRowIndex((java.lang.Comparable) 10.0f);
        double double23 = defaultStatisticalCategoryDataset15.getRangeUpperBound(false);
        java.lang.Comparable comparable25 = null;
        java.lang.Number number26 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) '4', comparable25);
        java.lang.Class<?> wildcardClass27 = defaultStatisticalCategoryDataset15.getClass();
        boolean boolean28 = defaultStatisticalCategoryDataset4.equals((java.lang.Object) wildcardClass27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((double) 1.0f, Double.NaN, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 10);
        java.lang.Comparable comparable19 = defaultStatisticalCategoryDataset0.getRowKey(0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        defaultStatisticalCategoryDataset20.validateObject();
        double double25 = defaultStatisticalCategoryDataset20.getRangeLowerBound(true);
        int int27 = defaultStatisticalCategoryDataset20.getRowIndex((java.lang.Comparable) (byte) 100);
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        java.lang.Number number18 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int19 = defaultStatisticalCategoryDataset13.getRowCount();
        double double21 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        boolean boolean23 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) (short) 10);
        double double25 = defaultStatisticalCategoryDataset13.getRangeLowerBound(false);
        java.lang.Number number28 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.util.List list29 = defaultStatisticalCategoryDataset13.getRowKeys();
        double double31 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        java.lang.Object obj34 = defaultStatisticalCategoryDataset0.clone();
        int int36 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and obj34", defaultStatisticalCategoryDataset13.equals(obj34) ? defaultStatisticalCategoryDataset13.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
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
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10, (java.lang.Comparable) '#');
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset7", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset7) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
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
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass18 = datasetGroup17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset4", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset4) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range7 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, (java.lang.Comparable) '4', (java.lang.Comparable) '#');
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int15 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int17 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset14.getGroup();
        java.util.List list19 = defaultStatisticalCategoryDataset14.getColumnKeys();
        int int20 = defaultStatisticalCategoryDataset14.getRowCount();
        java.lang.Object obj21 = defaultStatisticalCategoryDataset14.clone();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset14.getGroup();
        java.util.List list23 = defaultStatisticalCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener24);
        defaultStatisticalCategoryDataset14.validateObject();
        java.util.List list27 = defaultStatisticalCategoryDataset14.getRowKeys();
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset14.hasListener(eventListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and obj21", defaultStatisticalCategoryDataset14.equals(obj21) ? defaultStatisticalCategoryDataset14.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 1);
        int int15 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 2, (java.lang.Comparable) ' ');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        java.lang.Number number24 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset19.validateObject();
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset19.getRangeBounds(true);
        int int29 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset19.removeChangeListener(datasetChangeListener30);
        java.lang.Object obj32 = defaultStatisticalCategoryDataset19.clone();
        int int34 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) 1L);
        java.lang.Number number36 = null;
        defaultStatisticalCategoryDataset19.add((java.lang.Number) 10.0d, number36, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int41 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) 0L);
        java.lang.Object obj42 = defaultStatisticalCategoryDataset19.clone();
        boolean boolean43 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj32 and obj42", obj32.equals(obj42) ? obj32.hashCode() == obj42.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int21 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) false);
        double double23 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener24);
        double double27 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj28 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range30 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj28", obj7.equals(obj28) ? obj7.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        java.lang.Number number29 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number33 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset34.hasListener(eventListener35);
        java.lang.Number number39 = defaultStatisticalCategoryDataset34.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int40 = defaultStatisticalCategoryDataset34.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener41 = null;
        defaultStatisticalCategoryDataset34.removeChangeListener(datasetChangeListener41);
        java.lang.Number number45 = defaultStatisticalCategoryDataset34.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int47 = defaultStatisticalCategoryDataset34.getColumnIndex((java.lang.Comparable) 1.0f);
        double double49 = defaultStatisticalCategoryDataset34.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup50 = defaultStatisticalCategoryDataset34.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset34", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset34) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset34.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj14 = defaultStatisticalCategoryDataset0.clone();
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        double double18 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.add((double) (byte) 100, (double) 100, (java.lang.Comparable) true, (java.lang.Comparable) Double.NaN);
        java.lang.Object obj24 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list25 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj24", obj14.equals(obj24) ? obj14.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
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
        java.lang.Object obj22 = defaultStatisticalCategoryDataset12.clone();
        int int24 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj22", defaultStatisticalCategoryDataset18.equals(obj22) ? defaultStatisticalCategoryDataset18.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        java.lang.Number number18 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int19 = defaultStatisticalCategoryDataset13.getRowCount();
        double double21 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        boolean boolean23 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) (short) 10);
        double double25 = defaultStatisticalCategoryDataset13.getRangeLowerBound(false);
        java.lang.Number number28 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.util.List list29 = defaultStatisticalCategoryDataset13.getRowKeys();
        double double31 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset13.validateObject();
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset34.hasListener(eventListener35);
        java.lang.Number number39 = defaultStatisticalCategoryDataset34.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int40 = defaultStatisticalCategoryDataset34.getRowCount();
        double double42 = defaultStatisticalCategoryDataset34.getRangeUpperBound(true);
        boolean boolean44 = defaultStatisticalCategoryDataset34.equals((java.lang.Object) (short) 10);
        double double46 = defaultStatisticalCategoryDataset34.getRangeLowerBound(false);
        java.lang.Number number49 = defaultStatisticalCategoryDataset34.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number52 = defaultStatisticalCategoryDataset34.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list53 = defaultStatisticalCategoryDataset34.getColumnKeys();
        int int54 = defaultStatisticalCategoryDataset34.getRowCount();
        int int56 = defaultStatisticalCategoryDataset34.getColumnIndex((java.lang.Comparable) (short) 10);
        int int57 = defaultStatisticalCategoryDataset34.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset58 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int59 = defaultStatisticalCategoryDataset58.getColumnCount();
        int int61 = defaultStatisticalCategoryDataset58.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup62 = defaultStatisticalCategoryDataset58.getGroup();
        java.lang.Comparable comparable64 = null;
        java.lang.Number number65 = defaultStatisticalCategoryDataset58.getMeanValue((java.lang.Comparable) 1L, comparable64);
        defaultStatisticalCategoryDataset58.add((double) ' ', (double) 100L, (java.lang.Comparable) 1L, (java.lang.Comparable) 'a');
        int int72 = defaultStatisticalCategoryDataset58.getRowIndex((java.lang.Comparable) 'a');
        java.util.List list73 = defaultStatisticalCategoryDataset58.getRowKeys();
        boolean boolean74 = defaultStatisticalCategoryDataset34.equals((java.lang.Object) list73);
        boolean boolean75 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) boolean74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset34", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset34) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset34.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        java.util.List list9 = defaultStatisticalCategoryDataset3.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list11 = defaultStatisticalCategoryDataset10.getRowKeys();
        double double13 = defaultStatisticalCategoryDataset10.getRangeUpperBound(false);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset10.hasListener(eventListener14);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        defaultStatisticalCategoryDataset16.validateObject();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset16.hasListener(eventListener20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener24);
        int int27 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) (-1));
        int int29 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) ' ');
        int int30 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.lang.Number number33 = defaultStatisticalCategoryDataset16.getStdDevValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        defaultStatisticalCategoryDataset16.add((double) 10L, (double) (byte) 0, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 0);
        boolean boolean39 = defaultStatisticalCategoryDataset10.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        java.lang.Comparable comparable40 = null;
        java.lang.Number number42 = defaultStatisticalCategoryDataset10.getMeanValue(comparable40, (java.lang.Comparable) 0.0d);
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset10.getGroup();
        defaultStatisticalCategoryDataset3.setGroup(datasetGroup43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset10", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset10) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset0.hasListener(eventListener8);
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int18 = defaultStatisticalCategoryDataset12.getRowCount();
        double double20 = defaultStatisticalCategoryDataset12.getRangeUpperBound(true);
        boolean boolean22 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) (short) 10);
        double double24 = defaultStatisticalCategoryDataset12.getRangeLowerBound(false);
        java.lang.Number number27 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.util.List list28 = defaultStatisticalCategoryDataset12.getRowKeys();
        double double30 = defaultStatisticalCategoryDataset12.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list32 = defaultStatisticalCategoryDataset31.getRowKeys();
        defaultStatisticalCategoryDataset31.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int38 = defaultStatisticalCategoryDataset31.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset31.getGroup();
        int int41 = defaultStatisticalCategoryDataset31.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset31.validateObject();
        boolean boolean43 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset31);
        int int45 = defaultStatisticalCategoryDataset31.getColumnIndex((java.lang.Comparable) 0);
        boolean boolean46 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup39", datasetGroup4.equals(datasetGroup39) ? datasetGroup4.hashCode() == datasetGroup39.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int13 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int14 = defaultStatisticalCategoryDataset8.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset8.getGroup();
        boolean boolean16 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset8);
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list20 = defaultStatisticalCategoryDataset19.getRowKeys();
        double double22 = defaultStatisticalCategoryDataset19.getRangeUpperBound(false);
        double double24 = defaultStatisticalCategoryDataset19.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset19.removeChangeListener(datasetChangeListener25);
        double double28 = defaultStatisticalCategoryDataset19.getRangeLowerBound(false);
        java.lang.Object obj29 = defaultStatisticalCategoryDataset19.clone();
        java.util.List list30 = defaultStatisticalCategoryDataset19.getColumnKeys();
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and obj29", defaultStatisticalCategoryDataset8.equals(obj29) ? defaultStatisticalCategoryDataset8.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) Double.NaN);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list16 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int23 = defaultStatisticalCategoryDataset17.getRowCount();
        double double25 = defaultStatisticalCategoryDataset17.getRangeUpperBound(true);
        java.lang.Object obj26 = defaultStatisticalCategoryDataset17.clone();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj26", obj6.equals(obj26) ? obj6.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
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
        defaultStatisticalCategoryDataset0.add((double) 'a', (double) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 1);
        double double22 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range24 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        defaultStatisticalCategoryDataset25.validateObject();
        java.lang.Number number31 = defaultStatisticalCategoryDataset25.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset25.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number36 = defaultStatisticalCategoryDataset33.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int38 = defaultStatisticalCategoryDataset33.getColumnIndex((java.lang.Comparable) (short) -1);
        int int40 = defaultStatisticalCategoryDataset33.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener41 = null;
        defaultStatisticalCategoryDataset33.removeChangeListener(datasetChangeListener41);
        boolean boolean43 = defaultStatisticalCategoryDataset25.equals((java.lang.Object) defaultStatisticalCategoryDataset33);
        defaultStatisticalCategoryDataset25.add((java.lang.Number) (short) 1, (java.lang.Number) 10.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener49 = null;
        defaultStatisticalCategoryDataset25.removeChangeListener(datasetChangeListener49);
        java.util.List list51 = defaultStatisticalCategoryDataset25.getColumnKeys();
        java.util.EventListener eventListener52 = null;
        boolean boolean53 = defaultStatisticalCategoryDataset25.hasListener(eventListener52);
        java.lang.Number number56 = defaultStatisticalCategoryDataset25.getValue((java.lang.Comparable) 0, (java.lang.Comparable) 'a');
        defaultStatisticalCategoryDataset25.add(0.0d, (double) 100L, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (-1));
        boolean boolean62 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and defaultStatisticalCategoryDataset33", defaultStatisticalCategoryDataset7.equals(defaultStatisticalCategoryDataset33) ? defaultStatisticalCategoryDataset7.hashCode() == defaultStatisticalCategoryDataset33.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Comparable comparable8 = null;
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue(comparable8, (java.lang.Comparable) true);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        defaultStatisticalCategoryDataset13.validateObject();
        java.lang.Number number19 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj20 = defaultStatisticalCategoryDataset13.clone();
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset13.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener23);
        int int26 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) 100.0f);
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        int int29 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and obj20", defaultStatisticalCategoryDataset13.equals(obj20) ? defaultStatisticalCategoryDataset13.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number24 = null;
        defaultStatisticalCategoryDataset0.add(number24, (java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 32.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset29.hasListener(eventListener30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset35 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list36 = defaultStatisticalCategoryDataset35.getRowKeys();
        boolean boolean37 = defaultStatisticalCategoryDataset29.equals((java.lang.Object) defaultStatisticalCategoryDataset35);
        java.util.List list38 = defaultStatisticalCategoryDataset29.getRowKeys();
        org.jfree.data.Range range40 = defaultStatisticalCategoryDataset29.getRangeBounds(true);
        java.util.List list41 = defaultStatisticalCategoryDataset29.getRowKeys();
        boolean boolean42 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset35", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset35) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset35.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        int int23 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj26 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset11", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset11) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj7", defaultStatisticalCategoryDataset0.equals(obj7) ? defaultStatisticalCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int11 = defaultStatisticalCategoryDataset10.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset10.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int15 = defaultStatisticalCategoryDataset10.getColumnCount();
        defaultStatisticalCategoryDataset10.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number23 = defaultStatisticalCategoryDataset10.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int25 = defaultStatisticalCategoryDataset10.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset10.getGroup();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup26);
        java.lang.Number number30 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup26", datasetGroup8.equals(datasetGroup26) ? datasetGroup8.hashCode() == datasetGroup26.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable20 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, comparable20);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj28 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset29.hasListener(eventListener30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int35 = defaultStatisticalCategoryDataset29.getRowCount();
        double double37 = defaultStatisticalCategoryDataset29.getRangeUpperBound(true);
        boolean boolean39 = defaultStatisticalCategoryDataset29.equals((java.lang.Object) (short) 10);
        double double41 = defaultStatisticalCategoryDataset29.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset42 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number45 = defaultStatisticalCategoryDataset42.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int47 = defaultStatisticalCategoryDataset42.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int48 = defaultStatisticalCategoryDataset42.getColumnCount();
        java.lang.Comparable comparable50 = null;
        java.lang.Number number51 = defaultStatisticalCategoryDataset42.getMeanValue((java.lang.Comparable) 1.0d, comparable50);
        java.util.EventListener eventListener52 = null;
        boolean boolean53 = defaultStatisticalCategoryDataset42.hasListener(eventListener52);
        defaultStatisticalCategoryDataset42.validateObject();
        boolean boolean55 = defaultStatisticalCategoryDataset29.equals((java.lang.Object) defaultStatisticalCategoryDataset42);
        double double57 = defaultStatisticalCategoryDataset29.getRangeUpperBound(false);
        java.util.List list58 = defaultStatisticalCategoryDataset29.getRowKeys();
        boolean boolean59 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        java.util.EventListener eventListener60 = null;
        boolean boolean61 = defaultStatisticalCategoryDataset0.hasListener(eventListener60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset29 and defaultStatisticalCategoryDataset42", defaultStatisticalCategoryDataset29.equals(defaultStatisticalCategoryDataset42) ? defaultStatisticalCategoryDataset29.hashCode() == defaultStatisticalCategoryDataset42.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.lang.Comparable comparable11 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, comparable11);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 1);
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list21 = defaultStatisticalCategoryDataset20.getRowKeys();
        double double23 = defaultStatisticalCategoryDataset20.getRangeUpperBound(false);
        double double25 = defaultStatisticalCategoryDataset20.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset20.removeChangeListener(datasetChangeListener26);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        java.lang.Comparable comparable31 = null;
        java.lang.Number number32 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1L, comparable31);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener34 = null;
        boolean boolean35 = defaultStatisticalCategoryDataset33.hasListener(eventListener34);
        defaultStatisticalCategoryDataset33.validateObject();
        java.util.List list37 = defaultStatisticalCategoryDataset33.getRowKeys();
        int int38 = defaultStatisticalCategoryDataset33.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset33.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultStatisticalCategoryDataset33.addChangeListener(datasetChangeListener40);
        defaultStatisticalCategoryDataset33.validateObject();
        boolean boolean43 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup28 and datasetGroup39", datasetGroup28.equals(datasetGroup39) ? datasetGroup28.hashCode() == datasetGroup39.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
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
        int int23 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) Double.NaN);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number30 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int32 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int33 = defaultStatisticalCategoryDataset27.getColumnCount();
        java.lang.Comparable comparable35 = null;
        java.lang.Number number36 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) 1.0d, comparable35);
        java.util.EventListener eventListener37 = null;
        boolean boolean38 = defaultStatisticalCategoryDataset27.hasListener(eventListener37);
        defaultStatisticalCategoryDataset27.validateObject();
        java.util.EventListener eventListener40 = null;
        boolean boolean41 = defaultStatisticalCategoryDataset27.hasListener(eventListener40);
        java.util.List list42 = defaultStatisticalCategoryDataset27.getColumnKeys();
        int int43 = defaultStatisticalCategoryDataset27.getRowCount();
        boolean boolean44 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset27);
        org.jfree.data.Range range46 = defaultStatisticalCategoryDataset27.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset11", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset11) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
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
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj4 = defaultStatisticalCategoryDataset0.clone();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj9", obj4.equals(obj9) ? obj4.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1, (java.lang.Comparable) (short) -1);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        java.util.List list18 = defaultStatisticalCategoryDataset13.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset13.getRowCount();
        java.lang.Object obj20 = defaultStatisticalCategoryDataset13.clone();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset3.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset3.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int16 = defaultStatisticalCategoryDataset15.getColumnCount();
        int int18 = defaultStatisticalCategoryDataset15.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset15.getGroup();
        java.util.List list20 = defaultStatisticalCategoryDataset15.getColumnKeys();
        int int21 = defaultStatisticalCategoryDataset15.getRowCount();
        java.lang.Object obj22 = defaultStatisticalCategoryDataset15.clone();
        java.lang.Number number25 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset15.validateObject();
        java.util.List list27 = defaultStatisticalCategoryDataset15.getColumnKeys();
        java.lang.Number number30 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) 3, (java.lang.Comparable) 3);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultStatisticalCategoryDataset31.addChangeListener(datasetChangeListener32);
        int int34 = defaultStatisticalCategoryDataset31.getColumnCount();
        java.lang.Number number37 = defaultStatisticalCategoryDataset31.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset31.add((double) (-1), (double) 1L, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset31.getGroup();
        defaultStatisticalCategoryDataset15.setGroup(datasetGroup43);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and obj22", defaultStatisticalCategoryDataset15.equals(obj22) ? defaultStatisticalCategoryDataset15.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener13);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int16 = defaultStatisticalCategoryDataset15.getColumnCount();
        int int18 = defaultStatisticalCategoryDataset15.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset15.getGroup();
        int int21 = defaultStatisticalCategoryDataset15.getRowIndex((java.lang.Comparable) 10.0f);
        double double23 = defaultStatisticalCategoryDataset15.getRangeUpperBound(false);
        java.lang.Comparable comparable25 = null;
        java.lang.Number number26 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) '4', comparable25);
        java.util.List list27 = defaultStatisticalCategoryDataset15.getColumnKeys();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset3.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset3.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset11.hasListener(eventListener12);
        defaultStatisticalCategoryDataset11.validateObject();
        java.lang.Number number17 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset11.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset23.hasListener(eventListener24);
        java.lang.Number number28 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list30 = defaultStatisticalCategoryDataset29.getRowKeys();
        boolean boolean31 = defaultStatisticalCategoryDataset23.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        boolean boolean32 = defaultStatisticalCategoryDataset11.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        java.util.List list33 = defaultStatisticalCategoryDataset23.getRowKeys();
        java.lang.Object obj34 = null;
        boolean boolean35 = defaultStatisticalCategoryDataset23.equals(obj34);
        org.jfree.data.Range range37 = defaultStatisticalCategoryDataset23.getRangeBounds(false);
        java.lang.Number number40 = defaultStatisticalCategoryDataset23.getStdDevValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 100);
        double double42 = defaultStatisticalCategoryDataset23.getRangeUpperBound(false);
        boolean boolean43 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) double42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset23 and defaultStatisticalCategoryDataset29", defaultStatisticalCategoryDataset23.equals(defaultStatisticalCategoryDataset29) ? defaultStatisticalCategoryDataset23.hashCode() == defaultStatisticalCategoryDataset29.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0f), (java.lang.Number) (short) 0, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1.0f);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset18.getRangeBounds(true);
        java.util.List list22 = defaultStatisticalCategoryDataset18.getRowKeys();
        boolean boolean23 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        java.lang.Object obj24 = defaultStatisticalCategoryDataset18.clone();
        java.lang.Object obj25 = defaultStatisticalCategoryDataset18.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and obj24", defaultStatisticalCategoryDataset3.equals(obj24) ? defaultStatisticalCategoryDataset3.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
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
        java.lang.Object obj21 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number25 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double27 = defaultStatisticalCategoryDataset22.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int29 = defaultStatisticalCategoryDataset28.getColumnCount();
        int int31 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup32);
        java.util.List list34 = defaultStatisticalCategoryDataset22.getColumnKeys();
        java.lang.Number number37 = defaultStatisticalCategoryDataset22.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number40 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 2);
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj21", obj13.equals(obj21) ? obj13.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset0.hasListener(eventListener11);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset18.getRangeBounds(true);
        int int23 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) 100.0d);
        int int24 = defaultStatisticalCategoryDataset18.getRowCount();
        java.lang.Number number27 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) false, (java.lang.Comparable) ' ');
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        java.lang.Number number32 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 2, (java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup28", datasetGroup8.equals(datasetGroup28) ? datasetGroup8.hashCode() == datasetGroup28.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0d), (java.lang.Number) (short) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 100);
        int int18 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        defaultStatisticalCategoryDataset20.validateObject();
        java.lang.Number number26 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset20.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number31 = defaultStatisticalCategoryDataset28.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int33 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) (short) -1);
        int int35 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener36 = null;
        defaultStatisticalCategoryDataset28.removeChangeListener(datasetChangeListener36);
        boolean boolean38 = defaultStatisticalCategoryDataset20.equals((java.lang.Object) defaultStatisticalCategoryDataset28);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset20 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset20.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset20.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list13 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int22 = defaultStatisticalCategoryDataset16.getRowCount();
        double double24 = defaultStatisticalCategoryDataset16.getRangeUpperBound(true);
        boolean boolean26 = defaultStatisticalCategoryDataset16.equals((java.lang.Object) (short) 10);
        double double28 = defaultStatisticalCategoryDataset16.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number32 = defaultStatisticalCategoryDataset29.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int34 = defaultStatisticalCategoryDataset29.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int35 = defaultStatisticalCategoryDataset29.getColumnCount();
        java.lang.Comparable comparable37 = null;
        java.lang.Number number38 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) 1.0d, comparable37);
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = defaultStatisticalCategoryDataset29.hasListener(eventListener39);
        defaultStatisticalCategoryDataset29.validateObject();
        boolean boolean42 = defaultStatisticalCategoryDataset16.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        java.lang.Number number45 = defaultStatisticalCategoryDataset16.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup46 = defaultStatisticalCategoryDataset16.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener47 = null;
        defaultStatisticalCategoryDataset16.removeChangeListener(datasetChangeListener47);
        java.lang.Number number51 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (short) 10);
        boolean boolean52 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup46", datasetGroup4.equals(datasetGroup46) ? datasetGroup4.hashCode() == datasetGroup46.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        boolean boolean14 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number18 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int20 = defaultStatisticalCategoryDataset15.getColumnIndex((java.lang.Comparable) (short) -1);
        double double22 = defaultStatisticalCategoryDataset15.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset15.removeChangeListener(datasetChangeListener23);
        int int26 = defaultStatisticalCategoryDataset15.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list28 = defaultStatisticalCategoryDataset27.getRowKeys();
        defaultStatisticalCategoryDataset27.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int34 = defaultStatisticalCategoryDataset27.getColumnCount();
        java.lang.Number number37 = defaultStatisticalCategoryDataset27.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultStatisticalCategoryDataset27.addChangeListener(datasetChangeListener38);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset40 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number43 = defaultStatisticalCategoryDataset40.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int45 = defaultStatisticalCategoryDataset40.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int46 = defaultStatisticalCategoryDataset40.getColumnCount();
        java.lang.Comparable comparable48 = null;
        java.lang.Number number49 = defaultStatisticalCategoryDataset40.getMeanValue((java.lang.Comparable) 1.0d, comparable48);
        java.util.EventListener eventListener50 = null;
        boolean boolean51 = defaultStatisticalCategoryDataset40.hasListener(eventListener50);
        defaultStatisticalCategoryDataset40.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup53 = defaultStatisticalCategoryDataset40.getGroup();
        defaultStatisticalCategoryDataset27.setGroup(datasetGroup53);
        defaultStatisticalCategoryDataset15.setGroup(datasetGroup53);
        boolean boolean56 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and defaultStatisticalCategoryDataset40", defaultStatisticalCategoryDataset15.equals(defaultStatisticalCategoryDataset40) ? defaultStatisticalCategoryDataset15.hashCode() == defaultStatisticalCategoryDataset40.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int17 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int19 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset16.getGroup();
        int int22 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) 10.0f);
        double double24 = defaultStatisticalCategoryDataset16.getRangeUpperBound(false);
        java.lang.Comparable comparable26 = null;
        java.lang.Number number27 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) '4', comparable26);
        java.util.List list28 = defaultStatisticalCategoryDataset16.getColumnKeys();
        int int30 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) 1);
        java.lang.Number number33 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (-1L));
        double double35 = defaultStatisticalCategoryDataset16.getRangeUpperBound(false);
        int int36 = defaultStatisticalCategoryDataset16.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset37 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener38 = null;
        boolean boolean39 = defaultStatisticalCategoryDataset37.hasListener(eventListener38);
        java.util.List list40 = defaultStatisticalCategoryDataset37.getColumnKeys();
        java.util.EventListener eventListener41 = null;
        boolean boolean42 = defaultStatisticalCategoryDataset37.hasListener(eventListener41);
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset37.getGroup();
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup43);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset16 and defaultStatisticalCategoryDataset37", defaultStatisticalCategoryDataset16.equals(defaultStatisticalCategoryDataset37) ? defaultStatisticalCategoryDataset16.hashCode() == defaultStatisticalCategoryDataset37.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
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
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj16", obj13.equals(obj16) ? obj13.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals(obj16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int24 = defaultStatisticalCategoryDataset18.getRowCount();
        double double26 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        boolean boolean28 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) (short) 10);
        double double30 = defaultStatisticalCategoryDataset18.getRangeLowerBound(false);
        java.lang.Number number33 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        java.lang.Number number36 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
        java.util.List list37 = defaultStatisticalCategoryDataset18.getColumnKeys();
        boolean boolean38 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = defaultStatisticalCategoryDataset0.hasListener(eventListener39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
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
        int int11 = defaultStatisticalCategoryDataset4.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset4.getStdDevValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 100);
        int int16 = defaultStatisticalCategoryDataset4.getColumnIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        defaultStatisticalCategoryDataset17.validateObject();
        java.lang.Number number23 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset17.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset4.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable10 = null;
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '4', comparable10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (-1L));
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int20 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset21.hasListener(eventListener22);
        java.util.List list24 = defaultStatisticalCategoryDataset21.getColumnKeys();
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset21.hasListener(eventListener25);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        java.lang.Comparable comparable31 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 10, (java.lang.Number) (-1.0d), comparable31, (java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup27", datasetGroup4.equals(datasetGroup27) ? datasetGroup4.hashCode() == datasetGroup27.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int18 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Comparable comparable21 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) 1.0d, comparable21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset13.hasListener(eventListener23);
        defaultStatisticalCategoryDataset13.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup26);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset28.hasListener(eventListener29);
        java.lang.Number number33 = defaultStatisticalCategoryDataset28.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int34 = defaultStatisticalCategoryDataset28.getRowCount();
        double double36 = defaultStatisticalCategoryDataset28.getRangeUpperBound(true);
        boolean boolean38 = defaultStatisticalCategoryDataset28.equals((java.lang.Object) (short) 10);
        double double40 = defaultStatisticalCategoryDataset28.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset41 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number44 = defaultStatisticalCategoryDataset41.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int46 = defaultStatisticalCategoryDataset41.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int47 = defaultStatisticalCategoryDataset41.getColumnCount();
        java.lang.Comparable comparable49 = null;
        java.lang.Number number50 = defaultStatisticalCategoryDataset41.getMeanValue((java.lang.Comparable) 1.0d, comparable49);
        java.util.EventListener eventListener51 = null;
        boolean boolean52 = defaultStatisticalCategoryDataset41.hasListener(eventListener51);
        defaultStatisticalCategoryDataset41.validateObject();
        boolean boolean54 = defaultStatisticalCategoryDataset28.equals((java.lang.Object) defaultStatisticalCategoryDataset41);
        java.lang.Number number57 = defaultStatisticalCategoryDataset28.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup58 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset0.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable20 = null;
        java.lang.Number number21 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, comparable20);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj28 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset29.hasListener(eventListener30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int35 = defaultStatisticalCategoryDataset29.getRowCount();
        double double37 = defaultStatisticalCategoryDataset29.getRangeUpperBound(true);
        boolean boolean39 = defaultStatisticalCategoryDataset29.equals((java.lang.Object) (short) 10);
        double double41 = defaultStatisticalCategoryDataset29.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset42 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number45 = defaultStatisticalCategoryDataset42.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int47 = defaultStatisticalCategoryDataset42.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int48 = defaultStatisticalCategoryDataset42.getColumnCount();
        java.lang.Comparable comparable50 = null;
        java.lang.Number number51 = defaultStatisticalCategoryDataset42.getMeanValue((java.lang.Comparable) 1.0d, comparable50);
        java.util.EventListener eventListener52 = null;
        boolean boolean53 = defaultStatisticalCategoryDataset42.hasListener(eventListener52);
        defaultStatisticalCategoryDataset42.validateObject();
        boolean boolean55 = defaultStatisticalCategoryDataset29.equals((java.lang.Object) defaultStatisticalCategoryDataset42);
        double double57 = defaultStatisticalCategoryDataset29.getRangeUpperBound(false);
        java.util.List list58 = defaultStatisticalCategoryDataset29.getRowKeys();
        boolean boolean59 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        int int61 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset29 and defaultStatisticalCategoryDataset42", defaultStatisticalCategoryDataset29.equals(defaultStatisticalCategoryDataset42) ? defaultStatisticalCategoryDataset29.hashCode() == defaultStatisticalCategoryDataset42.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        defaultStatisticalCategoryDataset6.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int13 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Number number16 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset6.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset6.hasListener(eventListener22);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        int int27 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int29 = defaultStatisticalCategoryDataset28.getColumnCount();
        java.lang.Number number32 = defaultStatisticalCategoryDataset28.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int33 = defaultStatisticalCategoryDataset28.getColumnCount();
        defaultStatisticalCategoryDataset28.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number41 = defaultStatisticalCategoryDataset28.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int43 = defaultStatisticalCategoryDataset28.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup44 = defaultStatisticalCategoryDataset28.getGroup();
        java.util.EventListener eventListener45 = null;
        boolean boolean46 = defaultStatisticalCategoryDataset28.hasListener(eventListener45);
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup24 and datasetGroup47", datasetGroup24.equals(datasetGroup47) ? datasetGroup24.hashCode() == datasetGroup47.hashCode() : true);
    }
}

